package dominioProblema;

import br.ufsc.inf.leobr.cliente.Jogada;
import java.util.List;

public class JogadaEscopa implements Jogada {

    protected List<Carta> jogada;

    public JogadaEscopa() {
    }

    /**
     *
     * @param carta
     */
    public void JogadaEscopa(List<Carta> jogada) {
        this.jogada = jogada;
    }

    public List<Carta> getCartas() {
        return jogada;
    }

    public void setCartas(List<Carta> jogada) {
        this.jogada = jogada;
    }

}