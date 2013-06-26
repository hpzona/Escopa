package dominioProblema;

import java.util.ArrayList;
import java.util.List;

public class Mesa {

    protected Slot slotCartaMesa;
    protected List<Carta> baralho;
    protected Carta mortoLocal;
    protected Carta mortoRemoto;
    protected Jogador jogadorLocal;
    protected Jogador jogadorRemoto;
    protected boolean isPartidaEmAndamento;
    protected int quantidadeCartasBaralho;

    public Mesa() {
    }

    public void limparMesa() {
        if(!slotCartaMesa.isSlotSelecionado()){
            slotCartaMesa = null;
        }
    }

    /**
     *
     * @param nome
     * @param tipo
     */
    public void criarJogador(String nome, int tipo) {
        if (tipo == 0) {
            jogadorLocal = new Jogador(nome, tipo);
        } else {
            jogadorRemoto = new Jogador(nome, tipo);
        }
    }

    /**
     *
     * @param primeiro
     */
    public void definirOPrimeiro(int primeiro) {
        if(primeiro == 0){
            //jogadorLocal é o primeiro
        }else{
            //jogadorRemoto é o primeiro
        }
    }

    public void distribuirCartasMesa() {
        int cartaBaralho = 0;
        if (slotCartaMesa.slotCartasMesaVazio()) {
            slotCartaMesa = new Slot();
            if (getQuantidadeCartasBaralho() > 6) {

                List<Carta> cartasSlot = new ArrayList<>(6);
                for (int i = 0; i < 6; i++) {
                    cartaBaralho = (int) (1 + (Math.random() * getQuantidadeCartasBaralho()));
                    cartasSlot.add(baralho.get(cartaBaralho));
                    baralho.remove(cartaBaralho);
                }
                setQuantidadeCartasBaralho(-6);
                slotCartaMesa.setCarta(cartasSlot);
            }
        }
    }

    public void distribuirCartasJogador() throws Exception {
        int cartaBaralho = 0;
        if (getQuantidadeCartasBaralho() > 6) {
            for (int i = 0; i < 3; i++) {
                cartaBaralho = (int) (1 + (Math.random() * getQuantidadeCartasBaralho()));
                jogadorLocal.setCarta(baralho.get(cartaBaralho));
                baralho.remove(cartaBaralho);
            }
            setQuantidadeCartasBaralho(-3);
            for (int i = 0; i < 3; i++) {
                cartaBaralho = (int) (1 + (Math.random() * getQuantidadeCartasBaralho()));
                jogadorRemoto.setCarta(baralho.get(cartaBaralho));
                baralho.remove(cartaBaralho);
            }
            setQuantidadeCartasBaralho(-3);
        } else {
            throw new Exception("Baralho Insuficiente");
        }
    }

    public void montarBaralho() {
        baralho = new ArrayList<>(44);
        quantidadeCartasBaralho = 44;
        for (int i = 0; i < 11; i++) {

            baralho.add(new Carta(i, "Ouros"));
            baralho.add(new Carta(i, "Paus"));
            baralho.add(new Carta(i, "Copas"));
            baralho.add(new Carta(i, "Espadas"));
        }


    }

    public boolean avaliarFimDoBaralho() { //troquei para boolean, me corrijam se eu estiver errado
        if(getQuantidadeCartasBaralho() == 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean avaliarFimCartasMao(int tipo) { //troquei para boolean, me corrijam se eu estiver errado
        if(tipo == 0){
        if(jogadorLocal.getQuantidadeCartasMao() == 0){
            return true;
        }else{
            return false;
        }
        }else{
         if(jogadorRemoto.getQuantidadeCartasMao() == 0){
           return true;
       }else{
           return false;
       }
        }
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