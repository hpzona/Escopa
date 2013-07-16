/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dominioProblema;

import interfaceGrafica.AtorJogador;
import interfaceGrafica.PainelPrincipal;
import javax.swing.JFrame;


public class Escopa {

	public static void main(String args[]){
		AtorJogador janela;
		janela = new AtorJogador();
		janela.setLocationRelativeTo(null);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
}
