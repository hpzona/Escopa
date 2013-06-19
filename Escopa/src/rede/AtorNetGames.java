package rede;

public class AtorNetGames implements OuvidorProxy {

	protected boolean minhaVez;
	private AtorJogador atorJogador;

	protected void desconectar() {
		throw new UnsupportedOperationException();
	}

	protected void conectar() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nome
	 * @param ipServidor
	 */
	protected void conectarRede(string nome, string ipServidor) {
		throw new UnsupportedOperationException();
	}

	protected void iniciarPartidaRede() {
		throw new UnsupportedOperationException();
	}

	public AtorNetGames() {
		throw new UnsupportedOperationException();
	}

	public void setMinhaVez() {
		throw new UnsupportedOperationException();
	}

	public boolean isMinhaVez() {
		return this.minhaVez;
	}

	public string obtemNomeAdversario() {
		throw new UnsupportedOperationException();
	}

}