package interfaceGrafica;

public class PainelAviso extends javax.swing.JDialog {

    public PainelAviso(java.awt.Frame parent, boolean modal, String titulo, String pontos) {
        super(parent, modal);        
        initComponents();
        
                
        jTitulo.setText(titulo);
        jPontos.setText(pontos);
        
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTitulo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPontos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jTitulo.setForeground(new java.awt.Color(0, 102, 51));
        jTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTitulo.setText("TITULO");
        getContentPane().add(jTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 500, 50));

        jButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton1.setText("►");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 188, 45, 45));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SUA PONTUAÇÃO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 480, 30));

        jPontos.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jPontos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPontos.setText("0");
        getContentPane().add(jPontos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 480, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/painelFinal.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jPontos;
    private javax.swing.JLabel jTitulo;
    // End of variables declaration//GEN-END:variables
}
