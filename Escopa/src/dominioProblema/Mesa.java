package dominioProblema;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Murilo
 */
public class Mesa {
    
    private List<Slot> slots;
    private List<Carta> baralho;
    private List<Carta> mortoLocal;
    private List<Carta> mortoRemoto;
    private Jogador jogadorLocal;
    private Jogador jogadorRemoto;
    private boolean partidaEmAndamento;
    private int quantidadeCartasBaralho;

    public Mesa() {
        slots = new ArrayList<Slot>(18);
    }
    
    

    public List<Slot> getSlots() {
        return slots;
    }

    public void setSlots(List<Slot> slots) {
        this.slots = slots;
    }

    public List<Carta> getBaralho() {
        return baralho;
    }

    public void setBaralho(List<Carta> baralho) {
        this.baralho = baralho;
    }

    public List<Carta> getMortoLocal() {
        return mortoLocal;
    }

    public void setMortoLocal(List<Carta> mortoLocal) {
        this.mortoLocal = mortoLocal;
    }

    public List<Carta> getMortoRemoto() {
        return mortoRemoto;
    }

    public void setMortoRemoto(List<Carta> mortoRemoto) {
        this.mortoRemoto = mortoRemoto;
    }

    public Jogador getJogadorLocal() {
        return jogadorLocal;
    }

    public void setJogadorLocal(Jogador jogadorLocal) {
        this.jogadorLocal = jogadorLocal;
    }

    public Jogador getJogadorRemoto() {
        return jogadorRemoto;
    }

    public void setJogadorRemoto(Jogador jogadorRemoto) {
        this.jogadorRemoto = jogadorRemoto;
    }

    public boolean isPartidaEmAndamento() {
        return partidaEmAndamento;
    }

    public void setPartidaEmAndamento(boolean partidaEmAndamento) {
        this.partidaEmAndamento = partidaEmAndamento;
    }

    public int getQuantidadeCartasBaralho() {
        return quantidadeCartasBaralho;
    }

    public void setQuantidadeCartasBaralho(int quantidadeCartasBaralho) {
        this.quantidadeCartasBaralho = quantidadeCartasBaralho;
    }
    
    
    
    
}
