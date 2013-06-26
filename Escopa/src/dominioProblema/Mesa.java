package dominioProblema;

public class Mesa {

	protected Slot slotCartaMesa;
	protected Carta baralho;
	protected Carta mortoLocal;
	protected Carta mortoRemoto;
	protected Jogador jogadorLocal;
	protected Jogador jogadorRemoto;
	protected boolean isPartidaEmAndamento;
	protected int quantidadeCartasBaralho;

	public Mesa() {
		throw new UnsupportedOperationException();
	}

	public void limparMesa() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nome
	 * @param tipo
	 */
	public void criarJogador(String nome, int tipo) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param primeiro
	 */
	public void definirOPrimeiro(int primeiro) {
		throw new UnsupportedOperationException();
	}

	public void distribuirCartasMesa() {
		throw new UnsupportedOperationException();
	}

	public void distribuirCartasJogador() {
		throw new UnsupportedOperationException();
	}

	public void avaliarFimDoBaralho() {
		throw new UnsupportedOperationException();
	}

	public void avaliarFimCartasMao() {
		throw new UnsupportedOperationException();
	}

	public void avaliarVencedor() {
		throw new UnsupportedOperationException();
	}

	public int getQuantidadeCartasBaralho() {
		return this.quantidadeCartasBaralho;
	}

	/**
	 * 
	 * @param quantidade
	 */
	public void setQuantidadeCartasBaralho(int quantidade) {
		this.quantidadeCartasBaralho = quantidade;
	}

	public Jogador getJogadorLocal() {
		return this.jogadorLocal;
	}

	public Jogador getJogadorRemoto() {
		return this.jogadorRemoto;
	}

	public void terminarPartidaEmAndamento() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param carta
	 */
	public void setCartaMortoLocal(Carta carta) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param carta
	 */
	public void setCartaMortoRemoto(Carta carta) {
		throw new UnsupportedOperationException();
	}

	public void exibirNovoEstado() {
		throw new UnsupportedOperationException();
	}

	public void receberJogada() {
		throw new UnsupportedOperationException();
	}

	public void fazerJogada() {
		throw new UnsupportedOperationException();
	}

	public void inserirJogada() {
		throw new UnsupportedOperationException();
	}

}