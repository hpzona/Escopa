package interfaceGrafica;

import br.ufsc.inf.leobr.cliente.Jogada;
import dominioProblema.Carta;
import dominioProblema.JogadaEscopa;
import dominioProblema.Mesa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import rede.AtorNetGames;

public class AtorJogador {

    protected PainelPrincipal painelPrincipal; //MODIFICADO
    protected Mesa mesa;
    protected JLabel slot;
    protected AtorNetGames atorNetGames;
    protected JMenuBar jMenuBar;
    String nome;

    public AtorJogador(PainelPrincipal painel) { //PAINEL VEM DO MAIN
        atorNetGames = new AtorNetGames(this);
        
        painelPrincipal = painel;
        painelPrincipal.setVisible(true);
        painelPrincipal.setLocationRelativeTo(null);
        
        
    }

    public void inicializar() {
        atorNetGames.conectarRede(nome, "localhost");
    }

    /**
     *
     * @param iniciarComoSolicitante
     */
    public void iniciarPartidaEmRede(boolean comecarJogando) {
        Mesa mesa = new Mesa();

        String nomeOutroParticipante = atorNetGames.obtemNomeAdversario();

        if (comecarJogando) {
            mesa.criarJogador(this.nome);
            mesa.criarJogador(nomeOutroParticipante);
        } else {
            mesa.criarJogador(nomeOutroParticipante);
            mesa.criarJogador(this.nome);
        }
    }

    public class FazerJogadaButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            boolean tratou = AtorJogador.this.efetuarJogadaEmRede(mesa.getJogador().getJogada());
            if (tratou) {
            } else {
                JOptionPane.showMessageDialog(null, "NAO EH SUA VEZ");
            }

        }
    }

    /**
     *
     * @param cartasSelecionadas
     */
    public boolean efetuarJogadaEmRede(JogadaEscopa cartasSelecionadas) {


        if (atorNetGames.isMinhaVez()) {
            boolean jogadaEfetuada = mesa.tratarJogada(cartasSelecionadas);

            if (jogadaEfetuada) {
                //IGU

                atorNetGames.enviarJogadaRede(mesa.informarJogada());
                return jogadaEfetuada;
            } else {
                JOptionPane.showMessageDialog(null, "ERRO NA JOGADA");
            }
            return jogadaEfetuada;
        }
        return false;

    }

    public void receberJogada(JogadaEscopa cartasSelecionadas) {
        mesa.tratarJogada(cartasSelecionadas);
        //IGU

    }

    public void exibirEstado() {
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param codigo
     */
    public void notificarIrregularidade(int codigo) {
        throw new UnsupportedOperationException();
    }

    public void selecionaCarta() {
        throw new UnsupportedOperationException();
    }

    public void terminarPartidaEmAndamento() {
        throw new UnsupportedOperationException();
    }

    public JPanel getJContentPane() {
        return null;
    }
}