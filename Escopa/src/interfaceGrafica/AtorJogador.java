package interfaceGrafica;

import br.ufsc.inf.leobr.cliente.Jogada;
import dominioProblema.Carta;
import dominioProblema.JogadaEscopa;
import dominioProblema.Jogador;
import dominioProblema.Mesa;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import rede.AtorNetGames;

public class AtorJogador extends javax.swing.JFrame {

    protected JLabel maoClicado;
    protected ArrayList<JLabel> mesaClicado;
    protected ArrayList<JLabel> labelsMesa;
    protected ArrayList<JLabel> labelsMao;
    protected JPanel jPainel;
    protected Mesa mesa;
    protected Jogador jogadorAtual;
    protected JLabel slot;
    protected AtorNetGames atorNetGames;
    protected String nome;
    protected boolean conectado;

    public AtorJogador() {
        initComponents();
        conectado = false;
        jPainel = null;
        jIniciarButton.setEnabled(false);


        atorNetGames = new AtorNetGames(this);
        maoClicado = null;
        mesaClicado = new ArrayList();

        //MouseListeners da Mao
        jMao1.addMouseListener(this.eventoClickMao(jMao1));
        jMao2.addMouseListener(this.eventoClickMao(jMao2));
        jMao3.addMouseListener(this.eventoClickMao(jMao3));

        //MouseListener da Mesa
        jMesa1.addMouseListener(this.eventoClickMesa(jMesa1));
        jMesa2.addMouseListener(this.eventoClickMesa(jMesa2));
        jMesa3.addMouseListener(this.eventoClickMesa(jMesa3));
        jMesa4.addMouseListener(this.eventoClickMesa(jMesa4));
        jMesa5.addMouseListener(this.eventoClickMesa(jMesa5));
        jMesa6.addMouseListener(this.eventoClickMesa(jMesa6));
        jMesa7.addMouseListener(this.eventoClickMesa(jMesa7));
        jMesa8.addMouseListener(this.eventoClickMesa(jMesa8));
        jMesa9.addMouseListener(this.eventoClickMesa(jMesa9));
        jMesa10.addMouseListener(this.eventoClickMesa(jMesa10));
        jMesa11.addMouseListener(this.eventoClickMesa(jMesa11));
        jMesa12.addMouseListener(this.eventoClickMesa(jMesa12));

        //MouseListener do Descarte/FazerJogada
        jDescarte.addMouseListener(this.listenerJogada());

    }

    private void criarJogadorAtual(String nome) {
        jogadorAtual = new Jogador(nome);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jAviso = new javax.swing.JLabel();
        jNome = new javax.swing.JLabel();
        jNomeAdv = new javax.swing.JLabel();
        jPontuacao = new javax.swing.JLabel();
        jEscovasAdv = new javax.swing.JLabel();
        jPontuacaoAdv = new javax.swing.JLabel();
        jEscovas = new javax.swing.JLabel();
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
        jMesa9 = new javax.swing.JLabel();
        jMesa10 = new javax.swing.JLabel();
        jMesa11 = new javax.swing.JLabel();
        jMesa12 = new javax.swing.JLabel();
        jDescarte = new javax.swing.JLabel();
        jBaralho = new javax.swing.JLabel();
        jMortoAdv = new javax.swing.JLabel();
        jMorto = new javax.swing.JLabel();
        jFundo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jConectarButton = new javax.swing.JMenuItem();
        jIniciarButton = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(810, 547));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jAviso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jAviso.setForeground(new java.awt.Color(204, 204, 204));
        jAviso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jAviso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(135, 136, 32), 2));
        getContentPane().add(jAviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 280, 30));

        jNome.setForeground(new java.awt.Color(255, 255, 255));
        jNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jNome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 90, 30));

        jNomeAdv.setForeground(new java.awt.Color(255, 255, 255));
        jNomeAdv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jNomeAdv.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jNomeAdv, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 90, 30));

        jPontuacao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPontuacao.setForeground(new java.awt.Color(204, 204, 204));
        jPontuacao.setText("Pontuação: ");
        getContentPane().add(jPontuacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 90, 20));

        jEscovasAdv.setForeground(new java.awt.Color(204, 204, 204));
        jEscovasAdv.setText("Escovas:");
        getContentPane().add(jEscovasAdv, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 90, 20));

        jPontuacaoAdv.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPontuacaoAdv.setForeground(new java.awt.Color(204, 204, 204));
        jPontuacaoAdv.setText("Pontuação: ");
        getContentPane().add(jPontuacaoAdv, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 90, 20));

        jEscovas.setForeground(new java.awt.Color(204, 204, 204));
        jEscovas.setText("Escovas:");
        getContentPane().add(jEscovas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 90, 20));

        jMao1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMao1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jMao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 80, 100));

        jMao2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMao2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jMao2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 80, 100));

        jMao3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMao3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jMao3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 80, 100));

        jMesa1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMesa1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jMesa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 80, 100));

        jMesa2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMesa2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jMesa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 140, 80, 100));

        jMesa3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMesa3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jMesa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 80, 100));

        jMesa4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMesa4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jMesa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 140, 80, 100));

        jMesa5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMesa5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jMesa5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 80, 100));

        jMesa6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMesa6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jMesa6, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 140, 80, 100));

        jMesa7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMesa7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jMesa7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 80, 100));

        jMesa8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMesa8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jMesa8, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 260, 80, 100));

        jMesa9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMesa9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jMesa9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 80, 100));

        jMesa10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMesa10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jMesa10, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 260, 80, 100));

        jMesa11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMesa11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jMesa11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 80, 100));

        jMesa12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMesa12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jMesa12, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 260, 80, 100));

        jDescarte.setBackground(new java.awt.Color(135, 136, 32));
        jDescarte.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jDescarte.setForeground(new java.awt.Color(204, 204, 204));
        jDescarte.setText("  FAZER JOGADA / DESCARTAR");
        jDescarte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        getContentPane().add(jDescarte, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 180, 30));

        jBaralho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jBaralho, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 200, 80, 100));

        jMortoAdv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jMortoAdv, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 111, 80, 100));

        jMorto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jMorto, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 286, 80, 100));

        jFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mesa.png"))); // NOI18N
        getContentPane().add(jFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 500));

        jMenu1.setText("Jogo");

        jConectarButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jConectarButton.setText("Conectar");
        jConectarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConectarButtonActionPerformed(evt);
            }
        });
        jMenu1.add(jConectarButton);

        jIniciarButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jIniciarButton.setText("Iniciar Partida");
        jIniciarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIniciarButtonActionPerformed(evt);
            }
        });
        jMenu1.add(jIniciarButton);
        jMenu1.add(jSeparator1);

        jSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jSair.setText("Sair");
        jSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSairActionPerformed(evt);
            }
        });
        jMenu1.add(jSair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void conectar() {
        PainelConectar p = new PainelConectar(this, true);
        p.setVisible(true);
        if (p.isConfirmouPedidoConexao()) {
            nome = p.getTextField();
            String servidor = p.getServidor();
            atorNetGames.conectarRede(nome, servidor);
            criarJogadorAtual(nome);
            conectado = true;
        }
    }

    private void desconectar() {
        AtorJogador.this.atorNetGames.desconectar();
        jIniciarButton.setEnabled(false);
        conectado = false;
    }

    private void iniciarPartida() {
        atorNetGames.iniciarPartidaRede();
        List<Jogador> jogadores = atorNetGames.getJogadores();

        if (jogadores.size() == 2) {
            mesa.setJogadores(jogadores);
            this.iniciarRodada();
        }
    }

    private void iniciarRodada() {
        mesa.montarBaralho();
        mesa.distribuirCartasMesa();
        mesa.distribuirCartasJogador();
        mesa.setStatus(Mesa.StatusMesa.INICIAR_RODADA);
        jogadorAtual.setVezDeJogar(true);
        atorNetGames.enviarJogadaRede(mesa);
        jogadorAtual.setVezDeJogar(false);
        setJogadorAtualIniciarPartida(mesa);
        exibirEstado();
        exibirPontuacao();
        atualizarCartasJogadorAtual(jogadorAtual);
        jNome.setText(nome);
        jNomeAdv.setText(mesa.getJogadores().get(1).getNome());
    }

    private void enviarJogada(Jogada jogada) {
        jogadorAtual.setVezDeJogar(true);
        atorNetGames.enviarJogadaRede(jogada);
    }

    public void receberJogada(Jogada jogada) {

        boolean statusIniciarRodada;
        boolean statusMaosVazias;
        boolean statusIniciaNovaRodada;
        boolean statusFimPartida;

        mesa = (Mesa) jogada;
        jogadorAtual.setVezDeJogar(false);
        setJogadorAtualIniciarPartida(mesa);
        exibirEstado();
        exibirPontuacao();
        if (mesa.verificarFimDoBaralho() && mesa.verificarFimCartasNaMao()) {
            mesa.verificarVencedor();
        }

        statusIniciarRodada = mesa.getStatus().equals(Mesa.StatusMesa.INICIAR_RODADA);
        statusMaosVazias = mesa.getStatus().equals(Mesa.StatusMesa.MAOS_VAZIA);

        if (statusIniciarRodada || statusMaosVazias) {
            atualizarCartasJogadorAtual(jogadorAtual);
            mesa.setStatus(Mesa.StatusMesa.INICIAR_JOGADA);
            mesa.getJogadores().get(0).setVezDeJogar(true);
        }
        statusIniciaNovaRodada = mesa.getStatus().equals(Mesa.StatusMesa.INICIAR_NOVA_RODADA);
        if (statusIniciaNovaRodada) {
            if (statusIniciaNovaRodada) {
                limparMorto();
                if (jogadorAtual.getId() == 1) {
                    this.iniciarRodada();
                    PainelAviso mostrar = new PainelAviso(this, true, "FIM DA RODADA", "" + jogadorAtual.getPontuacao());
                    mostrar.setVisible(true);
                } else {
                    mesa.setStatus(Mesa.StatusMesa.INICIAR_JOGADA);
                    PainelAviso mostrar = new PainelAviso(this, true, "FIM DA RODADA", "" + jogadorAtual.getPontuacao());
                    mostrar.setVisible(true);
                }
            }
        }

        statusFimPartida = mesa.getStatus().equals(Mesa.StatusMesa.FIM_PARTIDA);
        if (statusFimPartida) {
            String seuResultado;
            if (jogadorAtual.isVencedor()) {
                seuResultado = "VENCEU";
            } else {
                seuResultado = "PERDEU";
            }
            PainelAviso mostrar = new PainelAviso(this, true, "FIM DE JOGO, VOCÊ " + seuResultado, "" + jogadorAtual.getPontuacao());
            mostrar.setVisible(true);
            exibirPontuacao();
            jConectarButton.setText("Conectar");
            jIniciarButton.setEnabled(false);
            conectado = false;
        }
    }

    private void limparMorto() {
        jogadorAtual.getMorto().clear();
        mesa.getJogadores().get(0).getMorto().clear();
        mesa.getJogadores().get(1).getMorto().clear();
        jMortoAdv.setIcon(null);
        jMorto.setIcon(null);
    }

    private void exibirEstado() {

        labelsMesa = new ArrayList();
        labelsMesa.add(jMesa1);
        labelsMesa.add(jMesa2);
        labelsMesa.add(jMesa3);
        labelsMesa.add(jMesa4);
        labelsMesa.add(jMesa5);
        labelsMesa.add(jMesa6);
        labelsMesa.add(jMesa7);
        labelsMesa.add(jMesa8);
        labelsMesa.add(jMesa9);
        labelsMesa.add(jMesa10);
        labelsMesa.add(jMesa11);
        labelsMesa.add(jMesa12);

        if (jNome.getText().equalsIgnoreCase("") || jNomeAdv.getText().equalsIgnoreCase("")) {
            jNome.setText(nome);
            jNomeAdv.setText(mesa.getJogadores().get(0).getNome());
        }
        if (mesa.getStatus().equals(Mesa.StatusMesa.MESA_CHEIA)) {
            for (int i = 0; i < 12; i++) {

                labelsMesa.get(i).setIcon(null);
                mesa.setStatus(Mesa.StatusMesa.INICIAR_JOGADA);
            }
        } else {
            ArrayList<String> cartasMesa = mesa.getCartaMesa_toString();



            for (int i = 0; i < 12; i++) {
                labelsMesa.get(i).setBorder(new LineBorder(new java.awt.Color(135, 136, 32), 2, true));
                if (i < cartasMesa.size()) {
                    labelsMesa.get(i).setIcon(new ImageIcon(getClass().getResource("/imagens/imagensCartas/" + cartasMesa.get(i) + ".png")));
                } else {
                    labelsMesa.get(i).setIcon(null);
                }
            }
        }
        if (!mesa.getBaralho().isEmpty()) {
            jBaralho.setIcon(new ImageIcon(getClass().getResource("/imagens/imagensCartas/fundo.png")));
        } else {
            jBaralho.setIcon(null);
        }

        if (!jogadorAtual.getMorto().isEmpty()) {
            jMorto.setIcon(new ImageIcon(getClass().getResource("/imagens/imagensCartas/fundo.png")));
        } else {
            jMorto.setIcon(null);
        }

        if (jogadorAtual == mesa.getJogadores().get(0)) {
            if (!mesa.getJogadores().get(1).getMorto().isEmpty()) {
                jMortoAdv.setIcon(new ImageIcon(getClass().getResource("/imagens/imagensCartas/fundo.png")));
            } else {
                jMortoAdv.setIcon(null);
            }
        } else {
            if (!mesa.getJogadores().get(0).getMorto().isEmpty()) {
                jMortoAdv.setIcon(new ImageIcon(getClass().getResource("/imagens/imagensCartas/fundo.png")));
            } else {
                jMortoAdv.setIcon(null);
            }
        }

        if (jogadorAtual.isVezDeJogar()) {
            jAviso.setText("SUA VEZ DE JOGAR");
        } else {
            jAviso.setText("VEZ DO ADVERSARIO");
        }
        jIniciarButton.setEnabled(false);
    }

    private void exibirPontuacao() {
        Jogador jogador = null;
        Jogador jogador2 = null;

        for (Jogador jog : mesa.getJogadores()) {
            if (jog.getNome().equals(jogadorAtual.getNome())) {
                jogador = jog;
            } else {
                jogador2 = jog;
            }
        }
        jPontuacao.setText("Pontuação: " + jogador.getPontuacao());
        jPontuacaoAdv.setText("Pontuação: " + jogador2.getPontuacao());

        jEscovas.setText("Escovas: " + jogador.getQntEscovas());
        jEscovasAdv.setText("Escovas: " + jogador2.getQntEscovas());
    }

    private void atualizarCartasJogadorAtual(Jogador joga) {
        labelsMao = new ArrayList<>();
        labelsMao.add(jMao1);
        labelsMao.add(jMao2);
        labelsMao.add(jMao3);

        List<String> cartasMao = mesa.getCartaMao_toString(joga);

        if (cartasMao.size() > 0) {
            for (int i = 0; i < cartasMao.size(); i++) {
                labelsMao.get(i).setIcon(new ImageIcon(getClass().getResource("/imagens/imagensCartas/" + cartasMao.get(i) + ".png")));
            }
        }

    }

    private void setJogadorAtualIniciarPartida(Mesa mesa) {
        for (Jogador jog : mesa.getJogadores()) {
            if (jog.getNome().equals(jogadorAtual.getNome())) {
                jogadorAtual = jog;
                if (mesa.getStatus().equals(Mesa.StatusMesa.INICIAR_RODADA)) {
                    mesa.getJogadores().get(1).setVezDeJogar(true);
                }
            }
        }
    }

    public void fazerJogada() {
        if (atorNetGames.isMinhaVez()) {
            if (maoClicado != null) {
                boolean valida = false;
                if (!mesaClicado.isEmpty()) {
                    //AQUI TRATA A JOGADA
                    maoClicado.setBorder(new LineBorder(new java.awt.Color(135, 136, 32), 2, true));

                    int indexMao = getIndexMaoClicado();
                    ArrayList<Integer> indexMesa = getIndexMesaClicado();

                    JogadaEscopa jogada = new JogadaEscopa();
                    ArrayList<Carta> cartasDaJogada = new ArrayList();

                    cartasDaJogada.add(jogadorAtual.getMao().get(indexMao));

                    for (Integer i : indexMesa) {
                        cartasDaJogada.add(mesa.getCarta(i));
                    }

                    jogada.setCartas(cartasDaJogada);
                    jogada.setExecutante(jogadorAtual);

                    valida = mesa.tratarJogada(jogada);
                }

                if (!valida) {
                    //AQUI DESCARTA A CARTA

                    maoClicado.setBorder(new LineBorder(new java.awt.Color(135, 136, 32), 2, true));

                    int livre = mesa.nextPosicaoLivre();
                    mesa.addCartaMesa(jogadorAtual.getMao().get(getIndexMaoClicado()));

                    jogadorAtual.getMao().remove(getIndexMaoClicado());


                    JLabel pos = labelsMesa.get(livre);
                    pos.setIcon(maoClicado.getIcon());

                    if (mesa.getCartasMesa().size() == 12) {
                        mesa.setStatus(Mesa.StatusMesa.MESA_CHEIA);
                        mesa.limparMesa();
                    }
                }
                mesa.verificarFimCartasNaMao();
                maoClicado.setIcon(null);
                maoClicado = null;
                mesaClicado.clear();
                enviarJogada(mesa);
                receberJogada(mesa);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Aguarde sua Vez");
        }
    }
    
    private ArrayList<Integer> getIndexMesaClicado() {
        ArrayList<Integer> index = new ArrayList();

        for (JLabel m : mesaClicado) {
            for (int i = 0; i < this.labelsMesa.size(); i++) {
                if (m == labelsMesa.get(i)) {
                    index.add(i);
                }
            }
        }

        return index;

    }

    private int getIndexMaoClicado() {
        int index = -1;
        if (maoClicado == jMao1) {
            return 0;
        }
        int qnt = jogadorAtual.getMao().size();

        switch (qnt) {
            case 3:
                if (maoClicado == jMao2) {
                    index = 1;
                } else {
                    if (maoClicado == jMao3) {
                        index = 2;
                    }
                }
                break;

            case 2:
                if (maoClicado == jMao2) {
                    if (jMao1.getIcon() == null) {
                        index = 0;
                    } else {
                        index = 1;
                    }
                } else {
                    if (maoClicado == jMao3) {
                        index = 1;
                    }
                }
                break;


            case 1:
                if (maoClicado == jMao2) {
                    index = 0;
                } else {
                    if (maoClicado == jMao3) {
                        index = 0;
                    }
                }
                break;
        }

        return index;
    }

    private void addConectarButtonListener(ActionListener evt) {
        jConectarButton.addActionListener(evt);
    }
    //TODOS OS LISTENERS

    public final java.awt.event.MouseAdapter eventoClickMao(final JLabel clicado) {
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

    public final java.awt.event.MouseAdapter eventoClickMesa(final JLabel clicado) {
        return new java.awt.event.MouseAdapter() {
            @Override
        public void mouseClicked(java.awt.event.MouseEvent e) {
                if (atorNetGames.isMinhaVez()) {
                    boolean remover = false;
                    if (clicado.getIcon() != null) {
                        //Verifica se a carta já havia sido selecionada
                        if (mesaClicado.indexOf(clicado) >= 0) {
                            clicado.setBorder(new LineBorder(new java.awt.Color(135, 136, 32), 2, true));
                            remover = true;
                            mesaClicado.remove(clicado);
                        }
                        if (!remover) {
                            mesaClicado.add(clicado);
                            clicado.setBorder(new LineBorder(Color.red, 2, true));
                        }

                    }
                }
            }
        };
    }

    public final java.awt.event.MouseAdapter listenerJogada() {
        return new java.awt.event.MouseAdapter() {
            @Override
        public void mouseEntered(java.awt.event.MouseEvent e) {
                jDescarte.setOpaque(true);
                jDescarte.setBorder(new LineBorder(new java.awt.Color(204, 204, 204), 2, false));
            }

            @Override
        public void mouseExited(java.awt.event.MouseEvent e) {
                jDescarte.setOpaque(false);
                jDescarte.setBorder(new LineBorder(new java.awt.Color(204, 204, 204), 2, false));
            }

            @Override
        public void mouseClicked(java.awt.event.MouseEvent e) {
                fazerJogada();
            }
        };
    }

    private void jIniciarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIniciarButtonActionPerformed
        iniciarPartida();
    }//GEN-LAST:event_jIniciarButtonActionPerformed

    private void temp(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temp
    }//GEN-LAST:event_temp

    private void jConectarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConectarButtonActionPerformed
        if (evt.getSource() instanceof JMenuItem) {
            JMenuItem botao = (JMenuItem) evt.getSource();
            switch (botao.getText()) {
                case "Conectar":
                    conectar();
                    if (conectado) {
                        botao.setText("Desconectar");
                        jIniciarButton.setEnabled(true);
                        mesa = new Mesa();
                    }
                    break;
                case "Desconectar":
                    botao.setText("Conectar");
                    desconectar();
                    break;
            }
        }
    }//GEN-LAST:event_jConectarButtonActionPerformed

    private void jSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSairActionPerformed
        if (conectado) {
            AtorJogador.this.atorNetGames.desconectar();
        }
        System.exit(0);    // TODO add your handling code here:
    }//GEN-LAST:event_jSairActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAviso;
    private javax.swing.JLabel jBaralho;
    private javax.swing.JMenuItem jConectarButton;
    private javax.swing.JLabel jDescarte;
    private javax.swing.JLabel jEscovas;
    private javax.swing.JLabel jEscovasAdv;
    private javax.swing.JLabel jFundo;
    private javax.swing.JMenuItem jIniciarButton;
    private javax.swing.JLabel jMao1;
    private javax.swing.JLabel jMao2;
    private javax.swing.JLabel jMao3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel jMesa1;
    private javax.swing.JLabel jMesa10;
    private javax.swing.JLabel jMesa11;
    private javax.swing.JLabel jMesa12;
    private javax.swing.JLabel jMesa2;
    private javax.swing.JLabel jMesa3;
    private javax.swing.JLabel jMesa4;
    private javax.swing.JLabel jMesa5;
    private javax.swing.JLabel jMesa6;
    private javax.swing.JLabel jMesa7;
    private javax.swing.JLabel jMesa8;
    private javax.swing.JLabel jMesa9;
    private javax.swing.JLabel jMorto;
    private javax.swing.JLabel jMortoAdv;
    private javax.swing.JLabel jNome;
    private javax.swing.JLabel jNomeAdv;
    private javax.swing.JLabel jPontuacao;
    private javax.swing.JLabel jPontuacaoAdv;
    private javax.swing.JMenuItem jSair;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
