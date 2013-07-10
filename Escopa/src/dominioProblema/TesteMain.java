/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dominioProblema;

import interfaceGrafica.AtorJogador;
import interfaceGrafica.PainelPrincipal;

/**
 *
 * @author Willian
 */
public class TesteMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PainelPrincipal p = new PainelPrincipal();
        AtorJogador a = new AtorJogador(p);
    }
}
