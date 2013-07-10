package rede;

import br.ufsc.inf.leobr.cliente.Jogada;
import br.ufsc.inf.leobr.cliente.OuvidorProxy;
import br.ufsc.inf.leobr.cliente.Proxy;
import br.ufsc.inf.leobr.cliente.exception.ArquivoMultiplayerException;
import br.ufsc.inf.leobr.cliente.exception.JahConectadoException;
import br.ufsc.inf.leobr.cliente.exception.NaoConectadoException;
import br.ufsc.inf.leobr.cliente.exception.NaoJogandoException;
import br.ufsc.inf.leobr.cliente.exception.NaoPossivelConectarException;
import dominioProblema.JogadaEscopa;
import dominioProblema.Mesa;
import interfaceGrafica.AtorJogador;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AtorNetGames implements OuvidorProxy {

    protected boolean minhaVez;
    private AtorJogador atorJogador;
    private Mesa mesa;
    private Proxy proxy;

    public AtorNetGames(AtorJogador atorJogador) {
//        this.minhaVez = minhaVez;
        this.atorJogador = atorJogador;
        this.proxy = proxy.getInstance();
        proxy.addOuvinte(this);
//        this.mesa = mesa;

    }

    public void desconectar() {
        try {
            proxy.desconectar();
        } catch (NaoConectadoException ex) {
            Logger.getLogger(AtorNetGames.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void conectarRede(String nome, String servidor) {
        try {
            proxy.conectar(servidor, nome);
        } catch (JahConectadoException ex) {
            Logger.getLogger(AtorNetGames.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NaoPossivelConectarException ex) {
            Logger.getLogger(AtorNetGames.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ArquivoMultiplayerException ex) {
            Logger.getLogger(AtorNetGames.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param nome
     * @param ipServidor
     */
    public void enviarJogadaRede(Jogada jogada) {
        try {
            proxy.enviaJogada(jogada);
            minhaVez = false;
        } catch (NaoJogandoException ex) {
            Logger.getLogger(AtorNetGames.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void receberJogada(Jogada jogada) {
        JogadaEscopa jogadaRecebida = (JogadaEscopa) jogada;
        atorJogador.receberJogada(jogadaRecebida);
        minhaVez = true;
    }

    public void iniciarPartidaRede() {
        try {
            proxy.iniciarPartida(2);
        } catch (NaoConectadoException ex) {
            Logger.getLogger(AtorNetGames.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void iniciarNovaPartida(Integer posicao) {
        if (posicao == 1) {
            minhaVez = true;
        } else if (posicao == 2) {
            minhaVez = false;
        }

        atorJogador.iniciarPartidaEmRede(minhaVez);
    }

    public AtorNetGames() {
    }

    public void setMinhaVez() {
    }

    public boolean isMinhaVez() {
        return this.minhaVez;
    }

    public String obtemNomeAdversario() {
        String nome = "";

        if (minhaVez) {
            nome = proxy.obterNomeAdversario(2);
        } else {
            nome = proxy.obterNomeAdversario(1);
        }

        return nome;
    }

    @Override
    public void finalizarPartidaComErro(String message) {
    }

    @Override
    public void receberMensagem(String message) {
    }

    @Override
    public void tratarConexaoPerdida() {
    }

    @Override
    public void tratarPartidaNaoIniciada(String message) {
    }
}