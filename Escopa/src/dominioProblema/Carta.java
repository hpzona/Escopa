package dominioProblema;

import javax.swing.ImageIcon;

public class Carta {

	protected int numero;
	protected String naipe;
	protected ImageIcon imagem;
	protected int valor;

	public Carta(int numero, String naipe) {
            this.numero = numero;
            this.naipe = naipe;
	}

	/**
	 * 
	 * @param numero
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * 
	 * @param naipe
	 */
	public void setNaipe(String naipe) {
		this.naipe = naipe;
	}

	public void setImagem() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param valor
	 */
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