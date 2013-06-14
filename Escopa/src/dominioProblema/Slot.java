package dominioProblema;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Murilo
 */
public class Slot {
    
    private Carta carta;
    private boolean slotSelecionado;

    public Carta getCarta() {
        return carta;
    }

    public void setCarta(Carta carta) {
        this.carta = carta;
    }

    public boolean isSlotSelecionado() {
        return slotSelecionado;
    }

    public void setSlotSelecionado(boolean slotSelecionado) {
        this.slotSelecionado = slotSelecionado;
    }
    
}
