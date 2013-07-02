package dominioProblema;

import br.ufsc.inf.leobr.cliente.Jogada;

public class JogadaEscopa implements Jogada {

    protected Carta jogada;

    public JogadaEscopa() {
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