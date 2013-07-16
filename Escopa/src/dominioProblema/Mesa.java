package dominioProblema;

import br.ufsc.inf.leobr.cliente.Jogada;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mesa implements Jogada {

    private List<Jogador> jogadores;
    protected ArrayList<Carta> cartasMesa;
    protected List<Carta> baralho;
    protected boolean partidaEmAndamento;
    protected StatusMesa status;

    public Mesa() {
    }

    public enum StatusMesa {

        INICIAR_PARTIDA, INICIAR_JOGADA, MESA_CHEIA, MAOS_VAZIA, INICIAR_NOVA_RODADA, FIM_PARTIDA;
    }

    public void iniciarMao() {
        this.montarBaralho();
        this.distribuirCartasMesa();
        this.distribuirCartasJogador();
        setPartidaEmAndamento(true);
    }

    public void montarBaralho() {
        baralho = new ArrayList();
        for (int i = 1; i < 11; i++) {

            baralho.add(new Carta(i, "Ouros"));
            baralho.add(new Carta(i, "Paus"));
            baralho.add(new Carta(i, "Copas"));
            baralho.add(new Carta(i, "Espadas"));
        }
        Collections.shuffle(baralho);
    }

    public void distribuirCartasMesa() {
        int cartaBaralho;
        cartasMesa = new ArrayList();

        for (int i = 0; i < 4; i++) {
            cartaBaralho = (int) (baralho.size() - 1);
            cartasMesa.add(baralho.get(cartaBaralho)); // vai adicionando os 4 slots da mesa
            baralho.remove(cartaBaralho);
        }
    }

    public void distribuirCartasJogador() {
        int ultimoValor = 0;
        int[] posicoes = {3, 6};

        for (int i = 0; i < jogadores.size(); i++) {
            Jogador joga = jogadores.get(i);
            int valorAtual = posicoes[i];
            List<Carta> listaDeCartasPorJogador = new ArrayList<Carta>();

            for (int b = ultimoValor; b < posicoes[i]; b++) {
                if (baralho.size() > 0) {
                    listaDeCartasPorJogador.add(baralho.get(baralho.size() - 1));
                    baralho.remove(baralho.size() - 1);
                } else {
                    System.out.print("Acabou baralho");
                }
            }
            joga.setMao(listaDeCartasPorJogador);
            ultimoValor = valorAtual;
        }
    }

    public boolean tratarJogada(JogadaEscopa jogada) {
        int interacao = jogada.getCartas().size();
        int pontuacao = 0;
        Jogador executante = jogada.getExecutante();

        for (int i = 0; i < interacao; i++) {
            pontuacao += jogada.getCartas().get(i).getNumero();
        }

        if (pontuacao == 15) { //jogada valida
            executante.getMorto().add(jogada.getCartas().get(0)); //carta da mao
            executante.getMao().remove(jogada.getCartas().get(0));
            for (int j = 1; j < interacao; j++) {
                executante.getMorto().add(jogada.getCartas().get(j));
                cartasMesa.remove(jogada.getCartas().get(j));
            }
            if (cartasMesa.isEmpty()) {
                executante.setQntEscovas(1);
            }
            return true;
        }
        //caso jogada nao seja valida
        return false;
    }

    public boolean verificarFimCartasNaMao() {
        int cont = 0;
        for (Jogador jog : getJogadores()) {
            if (jog.getMao().isEmpty()) {
                cont++;
            }
        }
        if (cont == 2) {
            distribuirCartasJogador();
            setStatus(Mesa.StatusMesa.MAOS_VAZIA);
            return true;
        } else {
            return false;
        }
    }

    public boolean verificarFimDoBaralho() {
        if (baralho.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void verificarVencedor() {
        if (verificarFimDoBaralho() && verificarFimCartasNaMao()) {
            calcularPontuacoes();
            if (getJogadores().get(0).getPontuacao() > getJogadores().get(1).getPontuacao() && getJogadores().get(0).getPontuacao() >= 21) {
                getJogadores().get(0).setVencedor(true);
                setStatus(Mesa.StatusMesa.FIM_PARTIDA);
            } else if (getJogadores().get(0).getPontuacao() < getJogadores().get(1).getPontuacao() && getJogadores().get(1).getPontuacao() >= 21) {
                getJogadores().get(1).setVencedor(true);
                setStatus(Mesa.StatusMesa.FIM_PARTIDA);
            } else {
                setStatus(Mesa.StatusMesa.INICIAR_NOVA_RODADA);
                getJogadores().get(1).setQntEscovas(0);
                getJogadores().get(0).setQntEscovas(0);
            }
        }
    }

    public void calcularPontuacoes() {
        int todos7 = 0;
        int todos6 = 0;
        int todos5 = 0;
        int todos4 = 0;
        int todos3 = 0;
        int todos2 = 0;
        int todosAses = 0;
        int cartasOuro = 0;
        boolean maioriaOuros = false;
        boolean seteOuros = false;
        boolean maioria7 = false;

        if (getJogadores().get(0).getMorto().size() > getJogadores().get(1).getMorto().size()) {
            getJogadores().get(0).setPontuacao(1);
        } else if (getJogadores().get(0).getMorto().size() < getJogadores().get(1).getMorto().size()) {
            getJogadores().get(1).setPontuacao(1);
        }

        for (Jogador jog : getJogadores()) {

            for (Carta carta : jog.getMorto()) {
                switch (carta.getNumero()) {
                    case 7:
                        todos7++;
                        break;
                    case 6:
                        todos6++;
                        break;
                    case 5:
                        todos5++;
                        break;
                    case 4:
                        todos4++;
                        break;
                    case 3:
                        todos3++;
                        break;
                    case 2:
                        todos2++;
                        break;
                    case 1:
                        todosAses++;
                        break;
                }
                if (carta.getNumero() == 7 && carta.getNaipe().equals("Ouros")) {
                    seteOuros = true;
                }
                if (carta.getNaipe().equals("Ouros")) {
                    cartasOuro++;
                }
            }

            if (cartasOuro == 10) {
                jog.setPontuacao(2);
                maioriaOuros = true;
                cartasOuro = 0;
            }
            if (cartasOuro > 5) {
                maioriaOuros = true;
                cartasOuro = 0;
            } else {
                cartasOuro = 0;
            }
            if (maioriaOuros) {
                jog.setPontuacao(1);
                maioriaOuros = false;
            }
            if (todos7 == 4) {
                jog.setPontuacao(14);
                maioria7 = true;
                todos7 = 0;
            }
            if (todos7 == 3) {
                maioria7 = true;
                todos7 = 0;
            } else {
                todos7 = 0;
            }
            if (maioria7) { //maioria dos 7
                jog.setPontuacao(1);
                maioria7 = false;
            }
            if (todos6 == 4) {
                jog.setPontuacao(8);
                todos6 = 0;
            } else {
                todos6 = 0;
            }
            if (todosAses == 4) {
                jog.setPontuacao(6);
                todosAses = 0;
            } else {
                todosAses = 0;
            }
            if (todos5 == 4) {
                jog.setPontuacao(5);
                todos5 = 0;
            } else {
                todos5 = 0;
            }
            if (todos4 == 4) {
                jog.setPontuacao(4);
                todos4 = 0;
            } else {
                todos4 = 0;
            }
            if (todos3 == 4) {
                jog.setPontuacao(3);
                todos3 = 0;
            } else {
                todos3 = 0;
            }
            if (todos2 == 4) {
                jog.setPontuacao(2);
                todos2 = 0;
            } else {
                todos2 = 0;
            }
            if (seteOuros) {
                jog.setPontuacao(1);
                seteOuros = false;
            }
            if (jog.getMorto().size() < 10) {
                jog.setPontuacao(2);
            }

            jog.setPontuacao(jog.getQntEscovas());
        }
    }

    public void limparMesa() {
        baralho.addAll(cartasMesa);
        Collections.shuffle(baralho);
        cartasMesa.removeAll(cartasMesa);
    }

    public Mesa.StatusMesa getStatus() {
        return status;
    }

    public void setStatus(Mesa.StatusMesa status) {
        this.status = status;
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
}