package dominioProblema;

import java.util.ArrayList;
import java.util.List;

public class Jogador {

	protected List<Carta> mao;
	protected List<Slot> slotCartaJogador;
        protected String nome;
	/**
	 * Identifica se � jogador local ou remoto
	 */
	protected Integer tipo;
	protected int pontuacao;
	protected boolean vezDeJogar;
	protected int quantidadeCartasMao;
	protected boolean vencedor;

    public Jogador(String nome, Integer tipo) {
        
        this.nome = nome;
        this.tipo = tipo;
        mao = new ArrayList<>(3);
    }
        
        

	public int informarTipo() throws Exception {
            if(tipo == null){
                throw new Exception("Jogador não criado");
            }
		return tipo;
	}

	public int getPontuacao() {
		return this.pontuacao;
	}

	public void setPontuacao() {
		throw new UnsupportedOperationException();
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
		this.quantidadeCartasMao = quantidade;
	}

	public void setVencedor() {
		throw new UnsupportedOperationException();
	}

	public void adicionarCartaMao(Carta carta) throws Exception{
            
            if(this.mao.size() < 3){
                this.mao.add(carta);
            }else{
                throw new Exception("Jogador ja com 3 cartas na mão");
            }
        }
	

	public void receberAguarde() {
		throw new UnsupportedOperationException();
	}

}