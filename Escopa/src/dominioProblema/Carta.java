package dominioProblema;

import br.ufsc.inf.leobr.cliente.Jogada;
import javax.swing.ImageIcon;

public class Carta implements Jogada {

    protected int numero;
    protected String naipe;
    protected ImageIcon imagem;
    protected int valor;

    public Carta(int numero, String naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getNaipe() {
        return this.naipe;
    }

    public int getValor() {
        return this.valor;
    }
}