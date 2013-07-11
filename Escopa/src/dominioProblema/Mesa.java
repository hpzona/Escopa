package dominioProblema;

import br.ufsc.inf.leobr.cliente.Jogada;
import java.util.ArrayList;
import java.util.List;

public class Mesa {

    protected ArrayList<Slot> slotCartaMesa;
    protected List<Carta> baralho;
    protected List<Carta> morto;
    protected Jogador jogador;
    protected boolean partidaEmAndamento;
    protected int quantidadeCartasBaralho;

    public Mesa() {
        baralho = new ArrayList();
    }

    public void limparMesa() {
        slotCartaMesa = null;
    }

    /**
     *
     * @param nome
     * @param tipo
     */
    public void criarJogador(String nome) {
        jogador = new Jogador(nome);
    }

    /**
     *
     * @param primeiro
     */
//    public Jogador definirOPrimeiro(int primeiro) {
//        if (primeiro == 0) {
//            return jogadorLocal;
//        } else {
//            return jogadorRemoto;
//        }
//    }
    public void distribuirCartasMesa() {
        int cartaBaralho;
        slotCartaMesa = new ArrayList();

        for (int i = 0; i < 4; i++) {
            cartaBaralho = (int) (1 + (Math.random() * getQuantidadeCartasBaralho()));
            Slot slot = new Slot();
            slot.setCarta(baralho.get(cartaBaralho));
            slotCartaMesa.add(slot); // vai adicionando os 4 slots da mesa
            baralho.remove(cartaBaralho);
        }
        setQuantidadeCartasBaralho(-4);
    }

    public void distribuirCartasJogador() throws Exception {
        int cartaBaralho = 0;
        if (getQuantidadeCartasBaralho() > 6) { // caso tenha cartas suficientes para distribuir para os 2 jogadores
            if (avaliarFimCartasMao()) { // verifica se realmente eles estão sem nenhuma carta na mão
                for (int i = 0; i < 3; i++) {
                    cartaBaralho = (int) (1 + (Math.random() * getQuantidadeCartasBaralho())); // pega uma carta aleatoria do baralho
                    jogador.adicionarCartaMao(baralho.get(cartaBaralho)); // adiciona na mao do jogador
                    baralho.remove(cartaBaralho); // remove essa carta do baralho
                }
                setQuantidadeCartasBaralho(-3);
            }
        } else {
            throw new Exception("Baralho Insuficiente");
        }
    }

    public void montarBaralho() {
        quantidadeCartasBaralho = 44;
        for (int i = 0; i < 11; i++) {

            baralho.add(new Carta(i, "Ouros"));
            baralho.add(new Carta(i, "Paus"));
            baralho.add(new Carta(i, "Copas"));
            baralho.add(new Carta(i, "Espadas"));
        }

        

    }

    public boolean avaliarFimDoBaralho() { //troquei para boolean, me corrijam se eu estiver errado
        if (getQuantidadeCartasBaralho() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean avaliarFimCartasMao() { //troquei para boolean, me corrijam se eu estiver errado
        if (jogador.getQuantidadeCartasMao() == 0) {
            return true;
        } else {
            return false;
        }

    }

    public void avaliarVencedor() {
//        if (jogadorLocal.getPontuacao() > jogadorRemoto.getPontuacao()) {
//            //jgador local é o vencedor
//        } else {
//            //jgador remoto é o vencedor
//        }
    }

    public int getQuantidadeCartasBaralho() {
        return this.quantidadeCartasBaralho;
    }

    /**
     *
     * @param quantidade
     */
    public void setQuantidadeCartasBaralho(int quantidade) {
        this.quantidadeCartasBaralho = quantidade;
    }

    public Jogador getJogador() {
        return this.jogador;
    }

    public void terminarPartidaEmAndamento() { // Esse método fica aqui msm?
        if (baralho.isEmpty()) {
            if (isPartidaEmAndamento()) {
                //partida encerrada
            }
        }

    }

    public ArrayList<String> getCartaMesa() {
        ArrayList<String> cartas = new ArrayList();
        for (Slot i : slotCartaMesa) {
            cartas.add(i.getCarta().getValor() + "_" + i.getCarta().getNaipe());
        }
        return cartas;
    }

    public ArrayList<String> getCartaMao() {
        ArrayList<String> cartas = new ArrayList();
        
        for (int i = 0; i < jogador.getQuantidadeCartasMao(); i++) {
            cartas.add(jogador.getMao().get(i).getNumero() + "_" + jogador.getMao().get(i).getNaipe());
        }
        return cartas;
    }

    /**
     *
     * @param carta
     */
    public void setCartaMorto(List<Carta> carta) {
        this.morto = carta;
    }

    /**
     *
     * @param carta
     */
    public void exibirNovoEstado() {
        throw new UnsupportedOperationException();
    }

    public void receberJogada(Jogada jogada) {
    }

    public void fazerJogada() {
        throw new UnsupportedOperationException();
    }

    public boolean tratarJogada(JogadaEscopa jogada) {

        int interecao = jogada.getCartas().size();
        boolean retorno = false;
        int ponto = 0;
        int quinze = 0;


        for (int i = 0; i < interecao; i++) {


            for (int j = 0; j < 6; j++) {


                if (slotCartaMesa.get(j).getCarta() != null && slotCartaMesa.get(j).isSlotSelecionado()) {//se tiver uma carta e ela for selecionada
                    quinze = jogada.getCartas().get(i).getValor() + slotCartaMesa.get(j).getCarta().getValor(); //faz a soma, com a primeira carta selecionada, e assim em diante
                }


                if (quinze == 15) {

                    List<Slot> cartasDaMesa;
                    cartasDaMesa = slotCartaMesa.subList(0, j);  //recolho as cartas selecionadas, caso tenha feito 15 pontos


                    for (int k = 0; k < cartasDaMesa.size(); k++) {

                        morto.add(slotCartaMesa.get(k).getCarta());
                    }


                    morto.add(jogada.getCartas().get(0));//pegando a carta que ele selecionou para fazer a combinação

                    if (cartasDaMesa.size() == 6) {//escova 
                        jogador.setPontuacao(ponto++);
                    }

                }

            }
            retorno = true;

        }

        return retorno;



    }

    public Jogada informarJogada() {
        return jogador.getJogada();
    }

    public boolean isPartidaEmAndamento() {
        return partidaEmAndamento;
    }

    public void setPartidaEmAndamento(boolean partidaEmAndamento) {
        this.partidaEmAndamento = partidaEmAndamento;
    }
}