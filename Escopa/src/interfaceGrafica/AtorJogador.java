
package interfaceGrafica;
import dominioProblema.Carta;
import dominioProblema.Mesa;
import rede.AtorNetGames;

public class AtorJogador {

	protected JPanel jContentPane;
	protected Mesa mesa;
	protected JLabel slot;
	protected AtorNetGames atorNetGames;
	protected JMenuBar jMenuBar;

	public AtorJogador() {
		throw new UnsupportedOperationException();
	}

	public void inicializar() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param iniciarComoSolicitante
	 */
	public void iniciarPartidaEmRede(boolean iniciarComoSolicitante) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param cartasSelecionadas
	 */
	public void efetuarJogadaEmRede(Carta cartasSelecionadas) {
		
            
            
	}

	public void exibirEstado() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param codigo
	 */
	public void notificarIrregularidade(int codigo) {
		throw new UnsupportedOperationException();
	}

	public void selecionaCarta() {
		throw new UnsupportedOperationException();
	}

	public void terminarPartidaEmAndamento() {
		throw new UnsupportedOperationException();
	}
        
        public JPanel getJContentPane(){
          return null;  
        }

}