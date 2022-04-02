package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class QuadroTrem extends JPanel{
	
	static Image trem = new ImageIcon("train-sprite.png").getImage();
	public static CaixasBar progressCaixas = new CaixasBar();
	
	static int x = 0;
	static int xVelocidade = 1;
	
	QuadroTrem(){
		this.setLayout(new BorderLayout());
		this.setBackground(Color.black);
		this.setBounds(0,0,PainelAnimaQuadro.PAINEL_LARGURA, PainelAnimaQuadro.PAINEL_ALTURA/2);
		this.add(progressCaixas, BorderLayout.SOUTH);
	}
	
	public void paint(Graphics g) {
		
		super.paint(g);
		
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.drawImage(trem, x, 10, null);
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
