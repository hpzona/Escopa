package dominioProblema;

import br.ufsc.inf.leobr.cliente.Jogada;
import java.util.ArrayList;
import java.util.List;

public class Jogador implements Jogada {

    protected List<Carta> mao;
    protected List<Carta> morto;
    protected String nome;
    protected int pontuacao;
    protected boolean vezDeJogar;
    protected boolean vencedor;
    protected int id;
    protected int qntEscovas;

    public Jogador(String nome, int id) {
        this.nome = nome;
        mao = new ArrayList<>();
        this.id = id;
        morto = new ArrayList();
        qntEscovas = 0;
    }

    public Jogador(String nome) {
        this.nome = nome;
        mao = new ArrayList<>();
        morto = new ArrayList();
        vezDeJogar = false;
        qntEscovas = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Carta> getMorto() {
        return morto;
    }

    public void setMorto(List<Carta> morto) {
        this.morto = morto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPontuacao() {
        return this.pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao += pontuacao;
    }

    public List<Carta> getMao() {
        return mao;
    }

    public void setMao(List<Carta> mao) {
        this.mao = mao;
    }

    public boolean isVezDeJogar() {
        return this.vezDeJogar;
    }

    public void setVezDeJogar(boolean valor) {
        this.vezDeJogar = valor;
    }

    public boolean isVencedor() {
        return vencedor;
    }

    public void setVencedor(boolean vencedor) {
        this.vencedor = vencedor;

    }

    public int getQntEscovas() {
        return qntEscovas;
    }

    public void setQntEscovas(int qntEscovas) {
        this.qntEscovas += qntEscovas;
    }
}