package dominioProblema;

import br.ufsc.inf.leobr.cliente.Jogada;


public class Slot implements Jogada{

	protected Carta carta; 
	protected boolean slotSelecionado;

	public Carta getCarta() {
		return carta;
	}

        public Slot() {
            
            }
        
        

	/**
	 * 
	 * @param carta
	 */
	public void setCarta(Carta carta) {
		this.carta = carta;
	}

	public boolean isSlotSelecionado() {
		return this.slotSelecionado;
	}

	
}