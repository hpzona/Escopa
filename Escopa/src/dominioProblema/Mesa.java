package dominioProblema;

import br.ufsc.inf.leobr.cliente.Jogada;
import java.util.ArrayList;
import java.util.List;

public class Mesa {

    protected List<Slot> slotCartaMesa;
    protected List<Carta> baralho;
    protected List<Carta> mortoLocal;
    protected List<Carta> mortoRemoto;
    protected Jogador jogadorLocal;
    protected Jogador jogadorRemoto;
    protected boolean partidaEmAndamento;
    protected int quantidadeCartasBaralho;

    public Mesa() {
    }

    public void limparMesa() {
        slotCartaMesa = null;
    }

    /**
     *
     * @param nome
     * @param tipo
     */
    public void criarJogador(String nome, int tipo) {
        if (tipo == 0) {
            jogadorLocal = new Jogador(nome, tipo);
        } else {
            jogadorRemoto = new Jogador(nome, tipo);
        }
    }

    /**
     *
     * @param primeiro
     */
    public Jogador definirOPrimeiro(int primeiro) {
        if (primeiro == 0) {
            return jogadorLocal;
        } else {
            return jogadorRemoto;
        }
    }

    public void distribuirCartasMesa() {
        int cartaBaralho;
        slotCartaMesa = new ArrayList<>(6);

        for (int i = 0; i < 6; i++) {
            cartaBaralho = (int) (1 + (Math.random() * getQuantidadeCartasBaralho()));
            Slot slot = new Slot(); 
            slot.setCarta(baralho.get(cartaBaralho));
            slotCartaMesa.add(slot); // vai adicionando os 6 slots da mesa
            baralho.remove(cartaBaralho);
        }
        setQuantidadeCartasBaralho(-6);
    }

    public void distribuirCartasJogador() throws Exception {
        int cartaBaralho = 0;
        if (getQuantidadeCartasBaralho() > 6) { // caso tenha cartas suficientes para distribuir para os 2 jogadores
            if (avaliarFimCartasMao(0)) { // verifica se realmente eles estão sem nenhuma carta na mão
                for (int i = 0; i < 3; i++) {
                    cartaBaralho = (int) (1 + (Math.random() * getQuantidadeCartasBaralho())); // pega uma carta aleatoria do baralho
                    jogadorLocal.adicionarCartaMao(baralho.get(cartaBaralho)); // adiciona na mao do jogador
                    baralho.remove(cartaBaralho); // remove essa carta do baralho
                }
                setQuantidadeCartasBaralho(-3);
            }
            if (avaliarFimCartasMao(1)) {
                for (int i = 0; i < 3; i++) {
                    cartaBaralho = (int) (1 + (Math.random() * getQuantidadeCartasBaralho()));
                    jogadorRemoto.adicionarCartaMao(baralho.get(cartaBaralho));
                    baralho.remove(cartaBaralho);
                }
                setQuantidadeCartasBaralho(-3);
            }
        } else {
            throw new Exception("Baralho Insuficiente");
        }
    }

    public void montarBaralho() {
        baralho = new ArrayList<>(44);
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

    public boolean avaliarFimCartasMao(int tipo) { //troquei para boolean, me corrijam se eu estiver errado
        if (tipo == 0) {
            if (jogadorLocal.getQuantidadeCartasMao() == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            if (jogadorRemoto.getQuantidadeCartasMao() == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public void avaliarVencedor() {

        if (jogadorLocal.getPontuacao() > jogadorRemoto.getPontuacao()) {
            //jgador local é o vencedor
        } else {
            //jgador remoto é o vencedor
        }

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

    public Jogador getJogadorLocal() {
        return this.jogadorLocal;
    }

    public Jogador getJogadorRemoto() {
        return this.jogadorRemoto;
    }

    public void terminarPartidaEmAndamento() { // Esse método fica aqui msm?
        if (baralho.isEmpty()) {
            if (isPartidaEmAndamento()) {
                //partida encerrada
            }
        }

    }

    /**
     *
     * @param carta
     */
    public void setCartaMortoLocal(List<Carta> carta) {
        this.mortoLocal = carta;
    }

    /**
     *
     * @param carta
     */
    public void setCartaMortoRemoto(List<Carta> carta) {
        this.mortoRemoto = carta;
    }

    public void exibirNovoEstado() {
        throw new UnsupportedOperationException();
    }

    public void receberJogada(Jogada jogada) {
        throw new UnsupportedOperationException();
    }

    public void fazerJogada() {
        throw new UnsupportedOperationException();
    }

    public void tratarJogada() {
        
        int ponto = 0;
        int quinze = 0;

            for (int j = 0; j < 6; j++) {
                if (slotCartaMesa.get(j).getCarta() != null && slotCartaMesa.get(j).isSlotSelecionado()) {//se tiver uma carta e ela for selecionada
                    quinze = jogadorLocal.getJogada().getCarta().getValor() + slotCartaMesa.get(j).getCarta().getValor(); //faz a soma, com a primeira carta selecionada, e assim em diante
                }
                if (quinze == 15) { 
                    List<Slot> cartasDaMesa;
                    cartasDaMesa = slotCartaMesa.subList(0, j);  //recolho as cartas selecionadas, caso tenha feito 15 pontos
                    for (int k = 0; k < cartasDaMesa.size(); k++) {

                        mortoLocal.add(slotCartaMesa.get(k).getCarta());
                    }
                        mortoLocal.add(jogadorLocal.getJogada().getCarta());//pegando a carta que ele selecionou para fazer a combinação
                    
                    if(cartasDaMesa.size() == 6){//escova 
                        jogadorLocal.setPontuacao(ponto++);
                    }
                }

            }



    }

    public void inserirJogada() {
    }

    public boolean isPartidaEmAndamento() {
        return partidaEmAndamento;
    }

    public void setPartidaEmAndamento(boolean partidaEmAndamento) {
        this.partidaEmAndamento = partidaEmAndamento;
    }
}