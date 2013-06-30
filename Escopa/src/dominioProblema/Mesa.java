package dominioProblema;

import java.util.ArrayList;
import java.util.List;

public class Mesa {

    protected List<Slot> slotCartaMesa;
    protected List<Carta> baralho;
    protected List<Carta> mortoLocal;
    protected List<Carta> mortoRemoto;
    protected Jogador jogadorLocal;
    protected Jogador jogadorRemoto;
    protected boolean partidaEmAndamento;
    protected int quantidadeCartasBaralho;

    public Mesa() {
    }

    public void limparMesa() {
            slotCartaMesa = null;
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
    public Jogador definirOPrimeiro(int primeiro) {
        if (primeiro == 0) {
            return jogadorLocal;
        } else {
            return jogadorRemoto;
        }
    }

    public void distribuirCartasMesa() {
        int cartaBaralho;
        slotCartaMesa = new ArrayList<>(6);

        for (int i = 0; i < 6; i++) {
            cartaBaralho = (int) (1 + (Math.random() * getQuantidadeCartasBaralho()));
            Slot slot = new Slot();
            slot.setCarta(baralho.get(cartaBaralho));
            slotCartaMesa.add(slot);
            baralho.remove(cartaBaralho);
        }
        setQuantidadeCartasBaralho(-6);
    }

    public void distribuirCartasJogador() throws Exception {
        int cartaBaralho = 0;
        if (getQuantidadeCartasBaralho() > 6) {
            if (avaliarFimCartasMao(0)) {
                for (int i = 0; i < 3; i++) {
                    cartaBaralho = (int) (1 + (Math.random() * getQuantidadeCartasBaralho()));
                    jogadorLocal.adicionarCartaMao(baralho.get(cartaBaralho));
                    baralho.remove(cartaBaralho);
                }
                setQuantidadeCartasBaralho(-3);
            }
            if (avaliarFimCartasMao(1)) {
                for (int i = 0; i < 3; i++) {
                    cartaBaralho = (int) (1 + (Math.random() * getQuantidadeCartasBaralho()));
                    jogadorRemoto.adicionarCartaMao(baralho.get(cartaBaralho));
                    baralho.remove(cartaBaralho);
                }
                setQuantidadeCartasBaralho(-3);
            }
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
        if (getQuantidadeCartasBaralho() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean avaliarFimCartasMao(int tipo) { //troquei para boolean, me corrijam se eu estiver errado
        if (tipo == 0) {
            if (jogadorLocal.getQuantidadeCartasMao() == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            if (jogadorRemoto.getQuantidadeCartasMao() == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public void avaliarVencedor() {

        if (jogadorLocal.getPontuacao() > jogadorRemoto.getPontuacao()) {
            //jgador local é o vencedor
        } else {
            //jgador remoto é o vencedor
        }

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

    public void terminarPartidaEmAndamento() { // Esse método fica aqui msm?
        if (baralho.isEmpty()) {
            if (isPartidaEmAndamento()) {
                //partida encerrada
            }
        }

    }

    /**
     *
     * @param carta
     */
    public void setCartaMortoLocal(List<Carta> carta) {
        this.mortoLocal = carta;
    }

    /**
     *
     * @param carta
     */
    public void setCartaMortoRemoto(List<Carta> carta) {
        this.mortoRemoto = carta;
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

    public void tratarJogada() {
        int interecao = jogadorLocal.getJogada().jogada.size();
        int ponto = 0;
        int quinze = 0;
        for (int i = 0; i < interecao; i++) {
            
            for(int j = 0; j < 6; j++){
                if(slotCartaMesa.get(j).getCarta() != null && slotCartaMesa.get(j).isSlotSelecionado()){
                    quinze = jogadorLocal.getJogada().jogada.get(i).getValor() + slotCartaMesa.get(j).getCarta().getValor();
                }
            }
                if(quinze == 15){
                    
                    jogadorLocal.setPontuacao(ponto++;);
                }
        }


    }

    public void inserirJogada() {
    }

    public boolean isPartidaEmAndamento() {
        return partidaEmAndamento;
    }

    public void setPartidaEmAndamento(boolean partidaEmAndamento) {
        this.partidaEmAndamento = partidaEmAndamento;
    }
}