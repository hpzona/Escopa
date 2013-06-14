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
public class Jogador {
    
    private List<Carta> mao;
    private List<Slot> slotCartaJogador;
    private int tipo;
    private int pontuacao;
    private boolean vezDeJogar;
    private int quantidadeCartasMao;
    private boolean vencedor;

    public List<Carta> getMao() {
        return mao;
    }

    public void setMao(List<Carta> mao) {
        this.mao = mao;
    }

    public List<Slot> getSlotCartaJogador() {
        return slotCartaJogador;
    }

    public void setSlotCartaJogador(List<Slot> slotCartaJogador) {
        this.slotCartaJogador = slotCartaJogador;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public boolean isVezDeJogar() {
        return vezDeJogar;
    }

    public void setVezDeJogar(boolean vezDeJogar) {
        this.vezDeJogar = vezDeJogar;
    }

    public int getQuantidadeCartasMao() {
        return quantidadeCartasMao;
    }

    public void setQuantidadeCartasMao(int quantidadeCartasMao) {
        this.quantidadeCartasMao = quantidadeCartasMao;
    }

    public boolean isVencedor() {
        return vencedor;
    }

    public void setVencedor(boolean vencedor) {
        this.vencedor = vencedor;
    }
    
}
