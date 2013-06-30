package rede;

import interfaceGrafica.AtorJogador;
import dominioProblema.Jogada;

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
	protected void conectarRede(String nome, String ipServidor) {
		throw new UnsupportedOperationException();
	}
        
        public void enviarJogadaRede(){
            
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

	public String obtemNomeAdversario() {
		throw new UnsupportedOperationException();
	}

    @Override
    public void iniciarNovaPartida(int posicao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void finalizarPartidaComErro(String message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void receberMensagem(String message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void receberJogada(Jogada jogada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tratarConexaoPerdida() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tratarPartidaNaoIniciada(String message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}