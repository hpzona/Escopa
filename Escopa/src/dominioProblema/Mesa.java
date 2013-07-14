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

        INICAR_PARTIDA, INICIAR_RODADA, MESA_CHEIA, MAOS_VAZIA;
    }

    public ArrayList<Carta> getCartasMesa() {
        return cartasMesa;
    }

    public void setCartasMesa(ArrayList<Carta> cartasMesa) {
        this.cartasMesa = cartasMesa;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public void limparMesa() {
        baralho.addAll(cartasMesa);
        setQuantidadeCartasBaralho(8);
        Collections.shuffle(baralho);
        cartasMesa.removeAll(cartasMesa);
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

    public void distribuirCartasJogador(Jogador jogador) {

        List<Carta> listaDeCartasJogador = new ArrayList<>();



        for (int i = 0; i < jogadores.size(); i++) {
            if (jogadores.get(i).getNome().equals(jogador.getNome())) {
                for (int j = 0; j < 3; j++) {
                    listaDeCartasJogador.add(baralho.get(getQuantidadeCartasBaralho() - 1));

                    baralho.remove(getQuantidadeCartasBaralho() - 1);
                    setQuantidadeCartasBaralho(-1);

                }
            }
        }
        jogador.setMao(listaDeCartasJogador);
    }

    public void montarBaralho() {
        setQuantidadeCartasBaralho(40);
        for (int i = 1; i < 11; i++) {

            baralho.add(new Carta(i, "Ouros"));
            baralho.add(new Carta(i, "Paus"));
            baralho.add(new Carta(i, "Copas"));
            baralho.add(new Carta(i, "Espadas"));
        }
        Collections.shuffle(baralho);
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

            if (avaliarFimDoBaralho()) {
                calcularPontuacoes();
            }

            return true;

        }

        //caso jogada nao seja valida
        return false;
    }

    public void calcularPontuacoes() {
        int todos7 = 0;
        int todos6 = 0;
        int todos5 = 0;
        int todos4 = 0;
        int todos3 = 0;
        int todos2 = 0;
        int todosAses = 0;
        boolean seteOuros = false;
        boolean maioriaCartas = false;

        for (Jogador jog : getJogadores()) {

            int quantidadeCartas = jog.getMorto().size();
            if (quantidadeCartas > 20) {
                maioriaCartas = true;
            }


            for (Carta carta : jog.getMorto()) {
                if (carta.getNumero() == 7) {
                    todos7++;
                }
                if (carta.getNumero() == 6) {
                    todos6++;
                }
                if (carta.getNumero() == 5) {
                    todos5++;
                }
                if (carta.getNumero() == 4) {
                    todos4++;
                }
                if (carta.getNumero() == 3) {
                    todos3++;
                }
                if (carta.getNumero() == 2) {
                    todos2++;
                }
                if (carta.getNumero() == 1) {
                    todosAses++;
                }
                if (carta.getNumero() == 7 && carta.getNaipe().equals("Ouros")) {
                    seteOuros = true;
                    jog.setPontuacao(1);
                }
            }



            if (todos7 == 4) {
                jog.setPontuacao(11);
            }
            if (todos7 > 2) {
                jog.setPontuacao(3);
                todos7 = 0;
            }
            if (todos6 == 4) {
                jog.setPontuacao(8);
                todos6 = 0;
            }
            if (todosAses == 4) {
                jog.setPontuacao(6);
                todosAses = 0;
            }
            if (todos5 == 4) {
                jog.setPontuacao(5);
                todos5 = 0;
            }
            if (todos4 == 4) {
                jog.setPontuacao(4);
                todos4 = 0;
            }
            if (todos3 == 4) {
                jog.setPontuacao(3);
                todos3 = 0;
            }
            if (todos2 == 4) {
                jog.setPontuacao(2);
                todos2 = 0;
            }
            if (maioriaCartas) {
                jog.setPontuacao(1);
                maioriaCartas = false;
            }
            if (seteOuros) {
                jog.setPontuacao(1);
                seteOuros = false;
            }


            System.out.println(jog.getPontuacao());

        }

    }

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
        setPartidaEmAndamento(true);
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


        for (int i = 0; i < jogadores.size(); i++) {

            Jogador joga = jogadores.get(i);
            int valorAtual = posicoes[i];
            List<Carta> listaDeCartasPorJogador = new ArrayList<Carta>();

            for (int b = ultimoValor; b < posicoes[i]; b++) {
                if (getQuantidadeCartasBaralho() > 0) {

                    listaDeCartasPorJogador.add(baralho.get(getQuantidadeCartasBaralho() - 1));
                    baralho.remove(getQuantidadeCartasBaralho() - 1);
                    setQuantidadeCartasBaralho(-1);
                } else {
                }
                System.out.print("Acabou baralho");
            }


            joga.setMao(listaDeCartasPorJogador);
            joga.setMaoVazia(false);
            ultimoValor = valorAtual;
        }

    }

    public void verificarMaoVazia() {
        int cont = 0;
        boolean distribuirCartas = false;
        for (Jogador jog : getJogadores()) {
            if (jog.getMao().isEmpty()) {
                cont++;
            }
        }
        if (cont == 2) {
            distribuirCartas = true;
        }



        if (distribuirCartas == true) {

            distribuirCartasJogadores();
            setStatus(Mesa.StatusMesa.MAOS_VAZIA);
        }


    }
}