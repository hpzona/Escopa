package dominioProblema;

import java.util.List;

public class JogadaEscopa implements Jogada {

    protected Carta jogada;

    public JogadaEscopa() {
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param carta
     */
    public void JogadaEscopa(Carta jogada) {
        this.jogada = jogada;
    }

    public Carta getCarta() {
        return jogada;
    }

    public void setJogada(Carta jogada) {
        this.jogada = jogada;
    }

}