package dominioProblema;

import java.util.ArrayList;
import java.util.List;

public class Slot {

	protected List<Carta> cartas; // troquei para cartas, me corrijam se eu estiver errado
	protected boolean slotSelecionado;

	public List<Carta> getCarta() {
		return cartas;
	}

        public Slot() {
            cartas = new ArrayList<>(6);
            
            }
        
        

	/**
	 * 
	 * @param carta
	 */
	public void setCarta(List<Carta> cartas) {
		this.cartas = cartas;
	}

	public boolean isSlotSelecionado() {
		return this.slotSelecionado;
	}

	/**
	 * 
	 * @param slot
	 */
	public void setSlotSelecionado(Slot slot) {
		throw new UnsupportedOperationException();
	}
        
        public boolean slotCartasMesaVazio(){
            
            if(cartas.isEmpty()){
                return true;
            }else{
                return false;
            }
        }

}