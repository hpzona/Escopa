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
import java.util.logging.Level;
import java.util.logging.Logger;
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
    protected JPanel jPainel = null;
    protected Mesa mesa;
    protected Jogador jogadorAtual;
    protected JLabel slot;
    protected AtorNetGames atorNetGames;
    protected int quantidadeMao = 6;
    protected int quantidadeExcluir;
    String nome;

    public void criarJogadorAtual(String nome) {
        jogadorAtual = new Jogador(nome);
        jogadorAtual.setQuantidadeCartasMao(6);

    }

    public AtorJogador() {
        initComponents();

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
        jDescarte.addMouseListener(this.eventoDescartar());

        /* //TESTES
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
         */

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jAviso = new javax.swing.JLabel();
        jNome = new javax.swing.JLabel();
        jNomeAdv = new javax.swing.JLabel();
        jPontuacao = new javax.swing.JLabel();
        jPontuacaoAdv = new javax.swing.JLabel();
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
        jMenu2 = new javax.swing.JMenu();

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
        jNome.setText("  ");
        jNome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 90, 30));

        jNomeAdv.setForeground(new java.awt.Color(255, 255, 255));
        jNomeAdv.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jNomeAdv, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 90, 30));

        jPontuacao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPontuacao.setForeground(new java.awt.Color(204, 204, 204));
        jPontuacao.setText("Pontuação: ");
        getContentPane().add(jPontuacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 90, 20));

        jPontuacaoAdv.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPontuacaoAdv.setForeground(new java.awt.Color(204, 204, 204));
        jPontuacaoAdv.setText("Pontuação: ");
        getContentPane().add(jPontuacaoAdv, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 90, 20));

        jMao1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jMao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 80, 100));

        jMao2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jMao2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 80, 100));

        jMao3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jMao3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 80, 100));

        jMesa1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jMesa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 80, 100));

        jMesa2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jMesa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 140, 80, 100));

        jMesa3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jMesa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 80, 100));

        jMesa4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jMesa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 140, 80, 100));

        jMesa5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jMesa5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 80, 100));

        jMesa6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jMesa6, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 140, 80, 100));

        jMesa7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jMesa7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 80, 100));

        jMesa8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jMesa8, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 260, 80, 100));

        jMesa9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jMesa9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 80, 100));

        jMesa10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jMesa10, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 260, 80, 100));

        jMesa11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jMesa11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 80, 100));

        jMesa12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 136, 32), 2, true));
        getContentPane().add(jMesa12, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 260, 80, 100));

        jDescarte.setBackground(new java.awt.Color(135, 136, 32));
        jDescarte.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jDescarte.setForeground(new java.awt.Color(204, 204, 204));
        jDescarte.setText("  FAZER JOGADA / DESCARTAR");
        jDescarte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        getContentPane().add(jDescarte, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 180, 30));
        getContentPane().add(jBaralho, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 80, 100));
        getContentPane().add(jMortoAdv, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, 80, 100));
        getContentPane().add(jMorto, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 290, 80, 100));

        jFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mesa.png"))); // NOI18N
        getContentPane().add(jFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 500));

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
        };
    }

    public final java.awt.event.MouseAdapter eventoDescartar() {
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

                        mesa.verificarMaoVazia();
                        mesa.verificarVencedor();
                        maoClicado.setIcon(null);
                        maoClicado = null;
                        mesaClicado.clear();
                        efetuarJogada(mesa);
                        receberJogada(mesa);


                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Aguarde sua Vez");
                }
            }
        };

    }

    public ArrayList<Integer> getIndexMesaClicado() {
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

    public int getIndexMaoClicado() {
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

    public void addConectarButtonListener(ActionListener evt) {
        jConectarButton.addActionListener(evt);
    }

    private JPanel iniciarPainel() {
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
        labelsMesa.add(jMesa9);
        labelsMesa.add(jMesa10);
        labelsMesa.add(jMesa11);
        labelsMesa.add(jMesa12);

        //Add Labels na Mao
        labelsMao = new ArrayList();
        labelsMao.add(jMao1);
        labelsMao.add(jMao2);
        labelsMao.add(jMao3);


        //Add os Listener no Labels
        jMao1.addMouseListener(this.eventoClickMao(jMao1));
        jMao2.addMouseListener(this.eventoClickMao(jMao2));
        jMao3.addMouseListener(this.eventoClickMao(jMao3));
        jDescarte.addMouseListener(this.eventoDescartar());

        for (JLabel mao : labelsMao) {
            jPainel.add(mao);
        }

        for (JLabel mes : labelsMesa) {
            jPainel.add(mes);
        }

        return jPainel;
    }

    public void inicializar() {
        PainelConectar p = new PainelConectar(this, true);
        p.setVisible(true);
        nome = p.getTextField();
        String servidor = p.getServidor();
        atorNetGames.conectarRede(nome, servidor);
        criarJogadorAtual(nome);
        iniciarPartida();
    }

    public void iniciarPartida() {

        atorNetGames.iniciarPartidaRede();

        List<Jogador> jogadores = atorNetGames.getJogadores();

        if (jogadores.size() == 2) {
            mesa.setJogadores(jogadores);
            this.iniciarNovaPartida();
        }

    }

    public void iniciarNovaPartida() {

        mesa.iniciarMao();
        mesa.setStatus(Mesa.StatusMesa.INICAR_PARTIDA);
        this.efetuarJogada(mesa);
        this.receberJogada(mesa);
        jNome.setText(nome);
        jNomeAdv.setText(mesa.getJogadores().get(1).getNome());




    }

    public void efetuarJogada(Jogada jogada) {

        jogadorAtual.setVezDeJogar(true);
        atorNetGames.enviarJogadaRede(jogada);


    }

    protected void setJogadorAtualIniciarPartida(Mesa mesa) {
        for (Jogador jog : mesa.getJogadores()) {
            if (jog.getNome().equals(jogadorAtual.getNome())) {
                jogadorAtual = jog;

                if (mesa.getStatus().equals(Mesa.StatusMesa.INICAR_PARTIDA)) {

                    mesa.getJogadores().get(1).setVezDeJogar(true);
                } else {
                }

            }

        }
    }

    public void receberJogada(Jogada jogada) {

       
        if (jogada instanceof Mesa) {

            this.mesa = (Mesa) jogada;

            jogadorAtual.setVezDeJogar(false);

            this.setJogadorAtualIniciarPartida(mesa);

            exibirEstado();
            
            exibirPontuacao();


            if (mesa.getStatus().equals(Mesa.StatusMesa.INICAR_PARTIDA) || mesa.getStatus().equals(Mesa.StatusMesa.MAOS_VAZIA)) { // se eu nao coloco essa condição, ele fica atualizando a mão qdo eu descarto a carta, com dados falsos

                atualizaCartasJogadorAtual(jogadorAtual);
                mesa.setStatus(Mesa.StatusMesa.INICIAR_RODADA);
                mesa.getJogadores().get(0).setVezDeJogar(true);
            }

        }
         if(mesa.getStatus().equals(Mesa.StatusMesa.INICIAR_NOVA_RODADA)){
             JOptionPane.showMessageDialog(null, "Terminou a rodada, nenhum vencedor");
             this.iniciarNovaPartida();
         }

    }

    private void atualizaCartasJogadorAtual(Jogador joga) {

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

    public void exibirEstado() {

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
                mesa.setStatus(Mesa.StatusMesa.INICIAR_RODADA);
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
        }

        if (jogadorAtual.isVezDeJogar()) {
            jAviso.setText("SUA VEZ DE JOGAR");
        } else {
            jAviso.setText("VEZ DO ADVERSARIO");
        }

//        for (int i = 0; i < cartasMao.size(); i++) {
//            labelsMao.get(i).setIcon(new ImageIcon(getClass().getResource("/imagens/imagensCartas/" + cartasMao.get(i) + ".png")));
//        }


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

    private void exibirPontuacao() {
        Jogador jogador = null;
        Jogador jogador2 = null;
        
          for (Jogador jog : mesa.getJogadores()) {
            if (jog.getNome().equals(jogadorAtual.getNome())) {
                jogador = jog;
            }else{
                jogador2 = jog;
            }
        }
        jPontuacao.setText("Pontuação: " + jogador.getPontuacao());
        jPontuacaoAdv.setText("Pontuação: " + jogador2.getPontuacao());

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
        if (evt.getSource() instanceof JMenuItem) {
            JMenuItem botao = (JMenuItem) evt.getSource();
            switch (botao.getText()) {
                case "Conectar":
                    botao.setText("Desconectar");
                    mesa = new Mesa();
                    inicializar();
                    break;
                case "Desconectar":
                    JOptionPane.showMessageDialog(null, "DESCONECTADO"); //TESTE DE BOTAO
                    botao.setText("Conectar");
                    AtorJogador.this.atorNetGames.desconectar();
                    break;
            }
        }
    }//GEN-LAST:event_jConectarButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAviso;
    private javax.swing.JLabel jBaralho;
    private javax.swing.JMenuItem jConectarButton;
    private javax.swing.JLabel jDescarte;
    private javax.swing.JLabel jFundo;
    private javax.swing.JLabel jMao1;
    private javax.swing.JLabel jMao2;
    private javax.swing.JLabel jMao3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
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
    // End of variables declaration//GEN-END:variables
}
