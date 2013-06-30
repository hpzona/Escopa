package dominioProblema;

import java.util.List;

public class JogadaEscopa implements Jogada {

    protected List<Carta> jogada;

    public JogadaEscopa() {
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param carta
     */
    public void JogadaEscopa(List<Carta> jogada) {
        this.jogada = jogada;
    }

    public List<Carta> getJogada() {
        return jogada;
    }

    public void setJogada(List<Carta> jogada) {
        this.jogada = jogada;
    }
}