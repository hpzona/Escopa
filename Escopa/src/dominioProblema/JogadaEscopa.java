package dominioProblema;

import br.ufsc.inf.leobr.cliente.Jogada;
import java.util.List;

public class JogadaEscopa implements Jogada {

    protected List<Carta> jogada;
    protected int quantidadeParaExcluir;

    public int getQuantidadeParaExcluir() {
        return quantidadeParaExcluir;
    }

    public void setQuantidadeParaExcluir(int quantidadeParaExcluir) {
        this.quantidadeParaExcluir = quantidadeParaExcluir;
    }

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