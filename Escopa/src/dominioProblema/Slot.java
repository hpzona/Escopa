public class Slot {

	protected Carta carta;
	protected boolean slotSelecionado;

	public Carta getCarta() {
		return this.carta;
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

	/**
	 * 
	 * @param slot
	 */
	public void setSlotSelecionado(Slot slot) {
		throw new UnsupportedOperationException();
	}

}