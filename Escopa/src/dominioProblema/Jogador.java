package dominioProblema;

public class Jogador {

	protected Carta mao;
	protected Slot slotCartaJogador;
	/**
	 * Identifica se � jogador local ou remoto
	 */
	protected int tipo;
	protected int pontuacao;
	protected boolean vezDeJogar;
	protected int quantidadeCartasMao;
	protected boolean vencedor;

	public int informarTipo() {
		throw new UnsupportedOperationException();
	}

	public int getPontuacao() {
		return this.pontuacao;
	}

	public void setPontuacao() {
		throw new UnsupportedOperationException();
	}

	public boolean isVezDeJogar() {
		return this.vezDeJogar;
	}

	/**
	 * 
	 * @param valor
	 */
	public void setVezDeJogar(boolean valor) {
		this.vezDeJogar = valor;
	}

	public int getQuantidadeCartasMao() {
		return this.quantidadeCartasMao;
	}

	/**
	 * 
	 * @param quantidade
	 */
	public void setQuantidadeCartasMao(int quantidade) {
		this.quantidadeCartasMao = quantidade;
	}

	public void setVencedor() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param carta
	 */
	public void setCarta(Carta carta) {
		throw new UnsupportedOperationException();
	}

	public void receberAguarde() {
		throw new UnsupportedOperationException();
	}

}