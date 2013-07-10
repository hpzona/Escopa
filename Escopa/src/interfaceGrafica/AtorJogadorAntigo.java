package interfaceGrafica;

import br.ufsc.inf.leobr.cliente.Jogada;
import dominioProblema.Carta;
import dominioProblema.JogadaEscopa;
import dominioProblema.Mesa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import rede.AtorNetGames;

public class AtorJogadorAntigo {

    protected PainelPrincipal painelPrincipal; //MODIFICADO
//    protected JPanel painelConexao;
    protected Mesa mesa;
    protected JLabel slot;
    protected AtorNetGames atorNetGames;
    String nome;

    public AtorJogadorAntigo(PainelPrincipal painel) { //PAINEL VEM DO MAIN
        atorNetGames = new AtorNetGames(this);
        
        painelPrincipal = painel;
        //painelPrincipal.addConectarButtonListener(new ConexaoListener());
        painelPrincipal.setVisible(true);
       // painelPrincipal.setLocationRelativeTo(null);
        
//        painelConexao = new JPanel();
//        JButton conectar = new JButton("conectar");
//        JButton desconectar = new JButton("desconectar");
//        ConexaoListener conexao = new ConexaoListener();
//        conectar.addActionListener(conexao);
//        desconectar.addActionListener(conexao);
//        painelPrincipal.add(painelConexao);
        
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

            boolean tratou = AtorJogadorAntigo.this.efetuarJogadaEmRede(mesa.getJogador().getJogada());
            if (tratou) {
            } else {
                JOptionPane.showMessageDialog(null, "NAO EH SUA VEZ");
            }

        }
    }
    
     public class ConexaoListener implements ActionListener {
         

        @Override
        public void actionPerformed(ActionEvent e) {

          if(e.getSource() instanceof JMenuItem ){
              JMenuItem botao = (JMenuItem)e.getSource();
                switch (botao.getText()) {
                    case "Conectar":
                        JOptionPane.showMessageDialog(null, "CONECTADO"); //TESTE DE BOTAO
                        botao.setText("Desconectar");
                        AtorJogadorAntigo.this.atorNetGames.iniciarPartidaRede();
                        break;
                    case "Desconectar":
                        JOptionPane.showMessageDialog(null, "DESCONECTADO"); //TESTE DE BOTAO
                        botao.setText("Conectar");
                        AtorJogadorAntigo.this.atorNetGames.desconectar();
                        break;
                }
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