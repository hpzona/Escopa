package dominioProblema;

import java.util.List;

public class JogadaEscopa {

    protected List<Carta> jogada;
    protected Jogador executante;

    public void JogadaEscopa(List<Carta> jogada) {
        this.jogada = jogada;
    }

    public Jogador getExecutante() {
        return executante;
    }

    public void setExecutante(Jogador executante) {
        this.executante = executante;
    }

    public List<Carta> getCartas() {
        return jogada;
    }

    public void setCartas(List<Carta> jogada) {
        this.jogada = jogada;
    }
}