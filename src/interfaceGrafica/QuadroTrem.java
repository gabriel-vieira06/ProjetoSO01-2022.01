package interfaceGrafica;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class QuadroTrem extends JPanel implements ActionListener{
	
	Image trem = new ImageIcon("train-sprite-test.png").getImage(); // 153 px
	Timer timer;
	
	int x = 0;
	int xVelocidade = 110/PainelTrem.T1.tempoDeViagem;
	
	QuadroTrem(){
		this.setBackground(Color.black);
		this.setBounds(0,0,PainelAnimaQuadro.PAINEL_LARGURA, PainelAnimaQuadro.PAINEL_ALTURA/2);
		timer = new Timer(120,this);
		timer.start();
	}
	
	public void paint(Graphics g) {
		
		super.paint(g);
		
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.drawImage(trem, x, 0, null);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(PainelTrem.T1.partiu) {
			if(x>=PainelAnimaQuadro.PAINEL_LARGURA-trem.getWidth(null)) {
				trem = new ImageIcon("train-sprite-test2.png").getImage();
				xVelocidade = xVelocidade * -1;
			}else if(x<0) {
				trem = new ImageIcon("train-sprite-test.png").getImage();
				xVelocidade = xVelocidade * -1;
			}
			x += xVelocidade;
			repaint();
		}
	}
	
}
