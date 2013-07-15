package dominioProblema;

import br.ufsc.inf.leobr.cliente.Jogada;
import java.util.ArrayList;
import java.util.List;

public class Jogador implements Jogada {

    protected List<Carta> mao;
    protected List<Carta> morto;
    protected String nome;
    /**
     * Identifica se � jogador local ou remoto
     */
    protected int pontuacao;
    protected boolean vezDeJogar;
    protected int quantidadeCartasMao;
    protected boolean vencedor;
    protected JogadaEscopa jogada;
    protected int id;
    protected boolean maoVazia;
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

//    public int informarTipo() throws Exception {
//        if (tipo == null) {
//            throw new Exception("Jogador não criado");
//        }
//        return tipo;
//    }
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

    public List<Carta> getMao() {
        return mao;
    }

    public void setMao(List<Carta> mao) {
        this.mao = mao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao += pontuacao;
    }

    public boolean isVezDeJogar() {
        return this.vezDeJogar;
    }

    /**
     *
     * @param valor
     */
    public void setVezDeJogar(boolean valor) {
        this.vezDeJogar = valor;
    }

    public int getQuantidadeCartasMao() {
        return this.quantidadeCartasMao;
    }

    /**
     *
     * @param quantidade
     */
    public void setQuantidadeCartasMao(int quantidade) {
        this.quantidadeCartasMao += quantidade;
    }

    public void setVencedor(boolean vencedor) {
        this.vencedor = vencedor;
        
    }

    public void adicionarCartaMao(Carta carta) throws Exception {

        if (this.mao.size() < 3) {
            this.mao.add(carta);
        } else {
            throw new Exception("Jogador ja com 3 cartas na mão");
        }
    }

    public boolean isMaoVazia() {
        return maoVazia;
    }

    public void setMaoVazia(boolean maoVazia) {
        this.maoVazia = maoVazia;
    }

    public JogadaEscopa getJogada() {
        return jogada;
    }

    public void setJogada(JogadaEscopa jogada) {
        this.jogada = jogada;
    }

    public void receberAguarde() {
        throw new UnsupportedOperationException();
    }
    
        public int getQntEscovas() {
        return qntEscovas;
    }

    public void setQntEscovas(int qntEscovas) {
        this.qntEscovas += qntEscovas;
    }
    
    public boolean isVencedor(){
        return vencedor;
    }

    public void habilitar() {
    }

    public void desabilitar() {
    }

    public void reiniciar() {
    }
}