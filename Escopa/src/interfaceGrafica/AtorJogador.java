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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import rede.AtorNetGames;

public class AtorJogador {

    protected PainelPrincipal painelPrincipal; //MODIFICADO
//    protected JPanel painelConexao;
    protected Mesa mesa;
    protected JLabel slot;
    protected AtorNetGames atorNetGames;
    String nome;

    public AtorJogador(PainelPrincipal painel) { //PAINEL VEM DO MAIN
        atorNetGames = new AtorNetGames(this);
        
        painelPrincipal = painel;
        painelPrincipal.setVisible(true);
        painelPrincipal.setLocationRelativeTo(null);
        
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

            boolean tratou = AtorJogador.this.efetuarJogadaEmRede(mesa.getJogador().getJogada());
            if (tratou) {
            } else {
                JOptionPane.showMessageDialog(null, "NAO EH SUA VEZ");
            }

        }
    }
    
     public class ConexaoListener implements ActionListener {
         

        @Override
        public void actionPerformed(ActionEvent e) {

          if(e.getSource() instanceof JButton ){//coloquei jbutton, mas pode ser qualquer q seja o componente q a gente colocou
              JButton botao = (JButton)e.getSource();
              if(botao.getText().equals("conectar")){
                  AtorJogador.this.atorNetGames.iniciarPartidaRede();
              }else if(botao.getText().equals("desconectar")){
                  AtorJogador.this.atorNetGames.desconectar();
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