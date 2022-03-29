package interfaceGrafica;

import java.awt.Dimension;
import java.awt.Image;

import javax.swing.JPanel;

public class PainelAnimaQuadro extends JPanel{

	final int PAINEL_LARGURA = 700;
	final int PAINEL_ALTURA = 500;
	Image trem;
	Image empacotador;
	Image backgroundImage;
	int xVelocidade;
	int yVelocidade;
	int eixoX = 0;
	int eixoY = 0;
	
	PainelAnimaQuadro(){
		this.setPreferredSize(new Dimension(PAINEL_LARGURA, PAINEL_ALTURA));
		
	}
	
}
