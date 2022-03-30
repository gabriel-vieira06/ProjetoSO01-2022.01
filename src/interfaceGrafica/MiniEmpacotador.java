package interfaceGrafica;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MiniEmpacotador extends JPanel{

	static Image empac = new ImageIcon("empacotador-sprite.png").getImage(); // Width = 65px
	
	static int y = 0;
	int x = 0;
	static int yVelocidade = 1;
	
	MiniEmpacotador(){

	}
	
	public void paint(Graphics g) {
		
		super.paint(g);
		
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.drawImage(empac, x, y, null);
	}

	public static void cycle() {
		if(y>=(PainelAnimaQuadro.PAINEL_ALTURA/2)-empac.getHeight(null)) {
			empac = new ImageIcon("empacotador-sprite2.png").getImage();
			yVelocidade = yVelocidade * -1;
		}else if(y<0) {
			empac = new ImageIcon("empacotador-sprite.png").getImage();
			yVelocidade = yVelocidade * -1;
		}
		y += yVelocidade;
	}
	
}
