package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class QuadroTrem extends JLayeredPane{
	
	static Image trem = new ImageIcon("train-sprite.png").getImage();
	static Image bgTrem = new ImageIcon("city.png").getImage();
	public static CaixasBar progressCaixas = new CaixasBar();
	
	static int x = 0;
	static int xVelocidade = 1;
	
	QuadroTrem(){
		this.setLayout(new BorderLayout());
		this.setBounds(0,0,PainelAnimaQuadro.PAINEL_LARGURA, PainelAnimaQuadro.PAINEL_ALTURA/2);
		this.add(progressCaixas, BorderLayout.SOUTH, Integer.valueOf(2));
	}
	
	public void paint(Graphics g) {
		
		super.paint(g);
		
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.drawImage(bgTrem, 0, -20, null);
		g2D.drawImage(trem, x, 210, null);
	}
	
	public static void cycle() {
		if(x>=PainelAnimaQuadro.PAINEL_LARGURA - trem.getWidth(null)) {
			trem = new ImageIcon("train-sprite2.png").getImage();
			xVelocidade = xVelocidade * -1;
		}else if(x<0) {
			trem = new ImageIcon("train-sprite.png").getImage();
			xVelocidade = xVelocidade * -1;
		}
		x += xVelocidade;
	}
}
