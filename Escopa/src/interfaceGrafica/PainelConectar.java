package interfaceGrafica;

import javax.swing.JOptionPane;

public class PainelConectar extends javax.swing.JDialog {

    private boolean confirmouPedidoConexao;

    public PainelConectar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jNome = new javax.swing.JTextField();
        jServidor = new javax.swing.JTextField();
        jConectarButton = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText("Insira o seu nome:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 120, 20));

        jNome.setForeground(new java.awt.Color(0, 102, 51));
        getContentPane().add(jNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 220, 30));

        jServidor.setBackground(new java.awt.Color(204, 204, 204));
        jServidor.setForeground(new java.awt.Color(0, 102, 51));
        jServidor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jServidor.setText("venus.inf.ufsc.br");
        getContentPane().add(jServidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 270, -1));

        jConectarButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jConectarButton.setForeground(new java.awt.Color(0, 153, 51));
        jConectarButton.setText("►");
        jConectarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConectarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(jConectarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 50, 30));

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/painel.png"))); // NOI18N
        getContentPane().add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jConectarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConectarButtonActionPerformed
        if (!jNome.getText().equalsIgnoreCase("")) {
            setConfirmouPedidoConexao(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Você deve escolher um nome de usuário", "Erro", JOptionPane.ERROR_MESSAGE, null);
            setConfirmouPedidoConexao(false);
        }

    }//GEN-LAST:event_jConectarButtonActionPerformed

    public String getTextField() {
        return jNome.getText();
    }

    public String getServidor() {
        return jServidor.getText();
    }

    public boolean isConfirmouPedidoConexao() {
        return confirmouPedidoConexao;
    }

    private void setConfirmouPedidoConexao(boolean conectar) {
        this.confirmouPedidoConexao = conectar;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fundo;
    private javax.swing.JButton jConectarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jNome;
    private javax.swing.JTextField jServidor;
    // End of variables declaration//GEN-END:variables
}
