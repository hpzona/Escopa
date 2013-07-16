package rede;

import br.ufsc.inf.leobr.cliente.Jogada;
import br.ufsc.inf.leobr.cliente.OuvidorProxy;
import br.ufsc.inf.leobr.cliente.Proxy;
import br.ufsc.inf.leobr.cliente.exception.ArquivoMultiplayerException;
import br.ufsc.inf.leobr.cliente.exception.JahConectadoException;
import br.ufsc.inf.leobr.cliente.exception.NaoConectadoException;
import br.ufsc.inf.leobr.cliente.exception.NaoJogandoException;
import br.ufsc.inf.leobr.cliente.exception.NaoPossivelConectarException;
import dominioProblema.Jogador;
import interfaceGrafica.AtorJogador;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AtorNetGames implements OuvidorProxy {

    protected boolean minhaVez;
    private AtorJogador atorJogador;
    private Proxy proxy;

    public AtorNetGames(AtorJogador atorJogador) {
        this.atorJogador = atorJogador;
        this.proxy = proxy.getInstance();
        proxy.addOuvinte(this);
    }

    public void conectarRede(String nome, String servidor) {
        try {
            proxy.conectar(servidor, nome);
        } catch (JahConectadoException e) {
            JOptionPane.showMessageDialog(atorJogador, e.getMessage());
        } catch (NaoPossivelConectarException e) {
            JOptionPane.showMessageDialog(atorJogador, "Erro: "
                    + e.getMessage());
        } catch (ArquivoMultiplayerException e) {
            JOptionPane.showMessageDialog(atorJogador, "Erro: "
                    + e.getMessage());
        }
    }

    public void desconectar() {
        try {
            proxy.desconectar();
        } catch (NaoConectadoException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(atorJogador, "Erro: "
                    + e.getMessage());
        }
    }

    public void iniciarPartidaRede() {
        try {
            proxy.iniciarPartida(2);
        } catch (NaoConectadoException e) {
           JOptionPane.showMessageDialog(atorJogador, "Erro: "
                    + e.getMessage());
        }
    }

    @Override
    public void iniciarNovaPartida(Integer posicao) {
        if (posicao == 1) {
            setMinhaVez(true);
        } else if (posicao == 2) {
            setMinhaVez(false);
        }
    }

    public void enviarJogadaRede(Jogada jogada) {
        try {
            proxy.enviaJogada(jogada);
            setMinhaVez(false);
        } catch (NaoJogandoException e) {
            JOptionPane.showMessageDialog(atorJogador, "Erro: "
                    + e.getMessage());
        }
    }

    @Override
    public void receberJogada(Jogada jogada) {
        atorJogador.receberJogada(jogada);
        setMinhaVez(true);
    }

    public List<Jogador> getJogadores() {
        List<Jogador> jogadores = new ArrayList<Jogador>();

        for (int i = 1; i < 3; i++) {
            Jogador j;
            j = new Jogador(proxy.obterNomeAdversario(i), i);
            jogadores.add(j);
        }
        return jogadores;
    }

    @Override
    public void finalizarPartidaComErro(String message) {
        JOptionPane.showMessageDialog(atorJogador, message);
    }

    @Override
    public void tratarConexaoPerdida() {
        JOptionPane
                .showMessageDialog(atorJogador,
                "A conexão com o servidor foi perdida, por favor tente novamente mais tarde.");
    }

    @Override
    public void tratarPartidaNaoIniciada(String message) {
        JOptionPane.showMessageDialog(atorJogador,
                "A partida não pode ser iniciada devido ao seguinte erro: "
                + message);
    }

    @Override
    public void receberMensagem(String msg) {
        JOptionPane.showMessageDialog(atorJogador,
                "Mensagem recebida do servidor:" + msg);
    }

    public void setMinhaVez(boolean minhaVez) {
        this.minhaVez = minhaVez;
    }

    public boolean isMinhaVez() {
        return this.minhaVez;
    }
}