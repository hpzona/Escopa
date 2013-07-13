package dominioProblema;

import br.ufsc.inf.leobr.cliente.Jogada;
import interfaceGrafica.AtorJogador;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Mesa implements Jogada {

    private List<Jogador> jogadores;
    protected ArrayList<Carta> cartasMesa;
    protected List<Carta> baralho;
    protected Jogador jogador;
    protected AtorJogador ator;
    protected boolean partidaEmAndamento;
    protected int quantidadeCartasBaralho;
    private StatusMesa status;

    public Mesa() {
        baralho = new ArrayList();
    }

    public enum StatusMesa {

        INICAR_PARTIDA, INICIAR_RODADA;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public void limparMesa() {
        cartasMesa = null;
    }

    /**
     *
     * @param nome
     * @param tipo
     */
    public void criarJogador(String nome) {
        jogador = new Jogador(nome);
        try {
            distribuirCartasJogador(jogador);
        } catch (Exception ex) {
            Logger.getLogger(Mesa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//    public Jogador definirOPrimeiro(int primeiro) {
//        if (primeiro == 0) {
//            return jogadorLocal;
//        } else {
//            return jogadorRemoto;
//        }
//    }
//    public void posicionarJogadores(boolean minhaposicao, String nomeAdv, String nome) {
//
//        Jogador local = new Jogador(nome);
//        Jogador remoto = new Jogador(nomeAdv);
//
//        if (minhaposicao == true) {
//            this.jogadores.add(local);
//            this.jogadores.add(remoto);
//        } else {
//            this.jogadores.add(remoto);
//            this.jogadores.add(local);
//        }
//
//
//    }
    public void distribuirCartasMesa() {
        int cartaBaralho;
        cartasMesa = new ArrayList();

        for (int i = 0; i < 4; i++) {
            cartaBaralho = (int) (getQuantidadeCartasBaralho() - 1);
            cartasMesa.add(baralho.get(cartaBaralho)); // vai adicionando os 4 slots da mesa
            baralho.remove(cartaBaralho);
            setQuantidadeCartasBaralho(-1);
        }

    }

    public void distribuirCartasJogador(Jogador jogador) throws Exception {
        int cartaBaralho = 0;
        if (getQuantidadeCartasBaralho() > 6) { // caso tenha cartas suficientes para distribuir para os 2 jogadores
//            if (avaliarFimCartasMao()) { // verifica se realmente eles estão sem nenhuma carta na mão

            for (int i = 0; i < 3; i++) {
                cartaBaralho = (int) (getQuantidadeCartasBaralho() - 1);
                jogador.adicionarCartaMao(baralho.get(cartaBaralho)); // adiciona na mao do jogador
                jogador.setQuantidadeCartasMao(1);
                baralho.remove(cartaBaralho); // remove essa carta do baralho
                setQuantidadeCartasBaralho(-1);
            }

//                for (int j = 0; j < 3; j++) {
//                    cartaBaralho = (int) (getQuantidadeCartasBaralho() - 1); // pega uma carta aleatoria do baralho
//                    jogadores.get(1).adicionarCartaMao(baralho.get(cartaBaralho)); // adiciona na mao do jogador
//                    jogadores.get(1).setQuantidadeCartasMao(1);
//                    jogadores.get(1).setVezDeJogar(false);
//                    baralho.remove(cartaBaralho); // remove essa carta do baralho
//                    setQuantidadeCartasBaralho(-1);
//
//
//                    ///////////////////////////////
//                }
//            }
        } else {
            throw new Exception("Baralho Insuficiente");
        }
    }

    public void montarBaralho() {
        setQuantidadeCartasBaralho(44);
        for (int i = 0; i < 11; i++) {

            baralho.add(new Carta(i, "Ouros"));
            baralho.add(new Carta(i, "Paus"));
            baralho.add(new Carta(i, "Copas"));
            baralho.add(new Carta(i, "Espadas"));
        }
    }

    public Carta getCarta(int index) {
        Carta c = null;
        c = cartasMesa.get(index);
        return c;
    }

    public ArrayList<String> getCartaMesa_toString() {
        ArrayList<String> cartas = new ArrayList();
        for (Carta i : cartasMesa) {
            cartas.add(i.getNumero() + "_" + i.getNaipe());
        }
        return cartas;
    }

    public ArrayList<String> getCartaMao_toString(Jogador jogador) {
        ArrayList<String> cartas = new ArrayList();
        for (int i = 0; i < jogador.getMao().size(); i++) {
            cartas.add(jogador.getMao().get(i).getNumero() + "_" + jogador.getMao().get(i).getNaipe());
        }
        return cartas;
    }

    public void addCartaMesa(Carta carta) {
        cartasMesa.add(carta);

    }

    public int nextPosicaoLivre() {
        int pos = cartasMesa.size();
        return pos;
    }

    public boolean avaliarFimDoBaralho() { //troquei para boolean, me corrijam se eu estiver errado
        if (getQuantidadeCartasBaralho() == 0) {
            return true;
        } else {
            return false;
        }
    }

//    public boolean avaliarFimCartasMao() { //troquei para boolean, me corrijam se eu estiver errado
//        if (jogador.getQuantidadeCartasMao() == 0) {
//            return true;
//        } else {
//            return false;
//        }
//
//    }
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
        this.quantidadeCartasBaralho += quantidade;
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
        int pontuacao = 0;
        Jogador executante = jogada.getExecutante();


        for (int i = 0; i < interecao; i++) {
            pontuacao += jogada.getCartas().get(i).getNumero();

        }

        if (pontuacao == 15) {
            //jogada valida
            executante.getMorto().add(jogada.getCartas().get(0)); //carta da mao
            executante.getMao().remove(jogada.getCartas().get(0));
            for (int j = 1; j < interecao; j++) {
                executante.getMorto().add(jogada.getCartas().get(j));
                cartasMesa.remove(jogada.getCartas().get(j));
            }
            return true;

        }

        //caso jogada nao seja valida
        return false;
    }


    /*public Jogada informarJogada() {
     return jogador.getJogada();
     }*/
    public boolean isPartidaEmAndamento() {
        return partidaEmAndamento;
    }

    public void setPartidaEmAndamento(boolean partidaEmAndamento) {
        this.partidaEmAndamento = partidaEmAndamento;
    }

    public List<Carta> getBaralho() {
        return baralho;
    }

    public void setBaralho(List<Carta> baralho) {
        this.baralho = baralho;
    }

    public void iniciarMao() {
        this.montarBaralho();
        this.distribuirCartasMesa();
        this.distribuirCartasJogadores();
    }

    public StatusMesa getStatus() {
        return status;
    }

    public void setStatus(StatusMesa status) {
        this.status = status;
    }

    public void distribuirCartasJogadores() {
        int ultimoValor = 0;

        int[] posicoes = {3, 6};


        Collections.shuffle(baralho);
        for (int i = 0; i < jogadores.size(); i++) {

            Jogador joga = jogadores.get(i);
            int valorAtual = posicoes[i];
            List<Carta> listaDeCartasPorJogador = new ArrayList<Carta>();


            for (int b = ultimoValor; b < posicoes[i]; b++) {

                listaDeCartasPorJogador.add(baralho.get(getQuantidadeCartasBaralho() - 1));
                baralho.remove(getQuantidadeCartasBaralho() - 1);
                setQuantidadeCartasBaralho(-1);

            }
            joga.setMao(listaDeCartasPorJogador);
            ultimoValor = valorAtual;
        }

    }
}