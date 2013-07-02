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

    public AtorNetGames(boolean minhaVez, AtorJogador atorJogador, Mesa mesa) {
        this.minhaVez = minhaVez;
        this.atorJogador = atorJogador;
        this.proxy = proxy.getInstance();
        proxy.addOuvinte(this);
        this.mesa = mesa;
        
    }

    protected void desconectar() {
        try {
            proxy.desconectar();
        } catch (NaoConectadoException ex) {
            Logger.getLogger(AtorNetGames.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    protected void conectarRede(String nome, String servidor) {
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

    public void enviarJogadaRede() {
        JogadaEscopa jogada = new JogadaEscopa();
        try {
            proxy.enviaJogada(jogada);
        } catch (NaoJogandoException ex) {
            Logger.getLogger(AtorNetGames.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    protected void iniciarPartidaRede() {
        try {
            proxy.iniciarPartida(2);
        } catch (NaoConectadoException ex) {
            Logger.getLogger(AtorNetGames.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public AtorNetGames() {
        throw new UnsupportedOperationException();
    }

    public void setMinhaVez() {
        throw new UnsupportedOperationException();
    }

    public boolean isMinhaVez() {
        return this.minhaVez;
    }

    public String obtemNomeAdversario() {
        throw new UnsupportedOperationException();
    }
    

    @Override
    public void finalizarPartidaComErro(String message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void receberMensagem(String message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public void tratarConexaoPerdida() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tratarPartidaNaoIniciada(String message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void receberJogada(Jogada jogada) {
        JogadaEscopa jogadaRecebida = (JogadaEscopa)jogada;
        mesa.receberJogada(jogadaRecebida);
    }

    @Override
    public void iniciarNovaPartida(Integer posicao) {
        atorJogador.iniciarPartidaEmRede(minhaVez);
    }


    
    

}