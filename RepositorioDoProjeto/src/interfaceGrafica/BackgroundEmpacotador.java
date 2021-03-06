package interfaceGrafica;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;

public class BackgroundEmpacotador extends JLayeredPane{

	Image bgImageInferior = new ImageIcon(getClass().getResource("/assets/esteira.png")).getImage();
	Image bgImageSuperior = new ImageIcon(getClass().getResource("/assets/esteira.png")).getImage();
	
	public static QuadroEmpacotador quadroEmpacotador = new QuadroEmpacotador();
	
	BackgroundEmpacotador(){
		this.setOpaque(true);
		this.add(quadroEmpacotador, Integer.valueOf(1));
		this.setBackground(Color.gray);
		this.setBounds(0,PainelAnimaQuadro.PAINEL_ALTURA/2,PainelAnimaQuadro.PAINEL_LARGURA, PainelAnimaQuadro.PAINEL_ALTURA/2);
		this.setLayout(null);
		this.setVisible(true);
	}
	
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
		
		g.drawImage(bgImageInferior, 0, 325, null);
		g.drawImage(bgImageSuperior, 0, 0, null);
	}
}
