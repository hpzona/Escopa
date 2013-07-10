package interfaceGrafica;

import dominioProblema.JogadaEscopa;
import dominioProblema.Mesa;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import rede.AtorNetGames;

public class AtorJogador extends javax.swing.JFrame {

    protected JLabel maoClicado;
    protected ArrayList<JLabel> labelsMesa;
    protected ArrayList<JLabel> labelsMao;
    protected JPanel jPainel = null;
    protected Mesa mesa;
    protected JLabel slot;
    protected AtorNetGames atorNetGames;
    String nome;

    public AtorJogador() {
        initComponents();
        
        atorNetGames = new AtorNetGames(this);
        maoClicado = null;

        //TESTES
        String cart = "1_Ouro";
        jMao1.setIcon(new ImageIcon(getClass().getResource("/imagens/imagensCartas/" + cart + ".png")));

        //será um metodo 
        boolean temCarta = true;
        //QUANDO BARALHO TEM CARTA
        if (temCarta) {
            jBaralho.setIcon(new ImageIcon(getClass().getResource("/imagens/imagensCartas/fundo.png")));
        }

        //QUANDO MORTO TIVER CARTAS
        jMortoAdv.setIcon(new ImageIcon(getClass().getResource("/imagens/imagensCartas/fundo.png")));
        jMorto.setIcon(new ImageIcon(getClass().getResource("/imagens/imagensCartas/fundo.png")));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMao1 = new javax.swing.JLabel();
        jMao2 = new javax.swing.JLabel();
        jMao3 = new javax.swing.JLabel();
        jMesa1 = new javax.swing.JLabel();
        jMesa2 = new javax.swing.JLabel();
        jMesa3 = new javax.swing.JLabel();
        jMesa4 = new javax.swing.JLabel();
        jMesa5 = new javax.swing.JLabel();
        jMesa6 = new javax.swing.JLabel();
        jMesa7 = new javax.swing.JLabel();
        jMesa8 = new javax.swing.JLabel();
        jDescarte = new javax.swing.JLabel();
        jBaralho = new javax.swing.JLabel();
        jMortoAdv = new javax.swing.JLabel();
        jMorto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jConectarButton = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(810, 547));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMao1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jMao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 80, 100));

        jMao2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jMao2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 80, 100));

        jMao3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jMao3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 80, 100));

        jMesa1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jMesa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 80, 100));

        jMesa2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jMesa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 80, 100));

        jMesa3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jMesa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 80, 100));

        jMesa4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jMesa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 80, 100));

        jMesa5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jMesa5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 80, 100));

        jMesa6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jMesa6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 80, 100));

        jMesa7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jMesa7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 80, 100));

        jMesa8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jMesa8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 80, 100));

        jDescarte.setBackground(new java.awt.Color(255, 255, 255));
        jDescarte.setForeground(new java.awt.Color(255, 255, 255));
        jDescarte.setText("   DESCARTAR");
        jDescarte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        getContentPane().add(jDescarte, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 450, 90, 30));
        getContentPane().add(jBaralho, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 80, 100));
        getContentPane().add(jMortoAdv, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, 80, 100));
        getContentPane().add(jMorto, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 290, 80, 100));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 500));

        jMenu1.setText("Arquivo");

        jConectarButton.setText("Conectar");
        jConectarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConectarButtonActionPerformed(evt);
            }
        });
        jMenu1.add(jConectarButton);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sair");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public java.awt.event.MouseAdapter eventoClick(final JLabel clicado) {
        return new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                if (clicado.getIcon() != null) {
                    if (maoClicado != null) {
                        maoClicado.setBorder(new LineBorder(new java.awt.Color(135, 136, 32), 2, true));
                    }
                    maoClicado = clicado;
                    maoClicado.setBorder(new LineBorder(Color.red, 2, true));
                }
            }
        };
    }

    public java.awt.event.MouseAdapter eventoDescartar() {
        return new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                if (maoClicado != null) {
                    maoClicado.setBorder(new LineBorder(new java.awt.Color(135, 136, 32), 2, true));

                    //PEDIR A PROXIMA POSIÇÃO LIVRE
                    String livre = "1";
                    //

                    JLabel pos = labelsMesa.get(Integer.parseInt(livre) - 1);
                    pos.setIcon(maoClicado.getIcon());
                    maoClicado.setIcon(null);
                    maoClicado = null;

                }
            }
        };
    }

    public void addConectarButtonListener(ActionListener evt) {
        jConectarButton.addActionListener(evt);
    }

    private JPanel getJPainel() {
        jPainel = new PainelPrincipal();
        jPainel.setLayout(null);
        
        //Add Labels na Mesa
        labelsMesa = new ArrayList();
        labelsMesa.add(jMesa1);
        labelsMesa.add(jMesa2);
        labelsMesa.add(jMesa3);
        labelsMesa.add(jMesa4);
        labelsMesa.add(jMesa5);
        labelsMesa.add(jMesa6);
        labelsMesa.add(jMesa7);
        labelsMesa.add(jMesa8);

        //Add Labels na Mao
        labelsMao = new ArrayList();
        labelsMao.add(jMao1);
        labelsMao.add(jMao2);
        labelsMao.add(jMao3);


        //Add os Listener no Labels
        jMao1.addMouseListener(this.eventoClick(jMao1));
        jMao2.addMouseListener(this.eventoClick(jMao2));
        jMao3.addMouseListener(this.eventoClick(jMao3));
        jDescarte.addMouseListener(this.eventoDescartar());

        for (JLabel mao : labelsMao) {
            jPainel.add(mao);
        }
        
        for (JLabel mesa : labelsMesa){
            jPainel.add(mesa);
        }

        return jPainel;
    }
    
    
    public void inicializar() {
        atorNetGames.conectarRede(nome, "venus.inf.ufsc.br");
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

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JOptionPane.showMessageDialog(this, "Botao clicado");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void temp(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temp
    }//GEN-LAST:event_temp

    private void jConectarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConectarButtonActionPerformed
        if(evt.getSource() instanceof JMenuItem ){
              JMenuItem botao = (JMenuItem)evt.getSource();
                switch (botao.getText()) {
                    case "Conectar":
                        JOptionPane.showMessageDialog(null, "CONECTADO"); //TESTE DE BOTAO
                        botao.setText("Desconectar");
                        inicializar();
                        break;
                    case "Desconectar":
                        JOptionPane.showMessageDialog(null, "DESCONECTADO"); //TESTE DE BOTAO
                        botao.setText("Conectar");
                        inicializar();
                        break;
                }
          }
    }//GEN-LAST:event_jConectarButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jBaralho;
    private javax.swing.JMenuItem jConectarButton;
    private javax.swing.JLabel jDescarte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jMao1;
    private javax.swing.JLabel jMao2;
    private javax.swing.JLabel jMao3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel jMesa1;
    private javax.swing.JLabel jMesa2;
    private javax.swing.JLabel jMesa3;
    private javax.swing.JLabel jMesa4;
    private javax.swing.JLabel jMesa5;
    private javax.swing.JLabel jMesa6;
    private javax.swing.JLabel jMesa7;
    private javax.swing.JLabel jMesa8;
    private javax.swing.JLabel jMorto;
    private javax.swing.JLabel jMortoAdv;
    // End of variables declaration//GEN-END:variables
}
