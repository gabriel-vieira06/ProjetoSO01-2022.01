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
	
	static Image trem = new ImageIcon("./sprite_train/train1_indo.png").getImage();
	static Image bgTrem = new ImageIcon("city2.png").getImage();
	public static CaixasBar progressCaixas = new CaixasBar();
	
	static int x = 0;
	static int xVelocidade = 1;
	int indo = 0;
	boolean flag = false;
	
	void TrainAnimationIndo(){
		if (indo == 0) {
			trem = new ImageIcon("./sprite_train/train1_indo.png").getImage();
			indo++;
		}else if (indo == 1) {
			trem = new ImageIcon("./sprite_train/train2_indo.png").getImage();
			indo++;
		}else if (indo == 2) {
			trem = new ImageIcon("./sprite_train/train3_indo.png").getImage();
			indo++;
		}else {
			trem = new ImageIcon("./sprite_train/train4_indo.png").getImage();
			indo = 0;
		}
	}
	
	void TrainAnimationVoltando(){
		if (indo == 0) {
			trem = new ImageIcon("./sprite_train/train1_voltando.png").getImage();
			indo++;
		}else if (indo == 1) {
			trem = new ImageIcon("./sprite_train/train2_voltando.png").getImage();
			indo++;
		}else if (indo == 2) {
			trem = new ImageIcon("./sprite_train/train3_voltando.png").getImage();
			indo++;
		}else {
			trem = new ImageIcon("./sprite_train/train4_voltando.png").getImage();
			indo = 0;
		}
	}
	
	void TrainAnimation(){
		if (flag == false) TrainAnimationIndo();
		else TrainAnimationVoltando();
	}
	
	QuadroTrem(){
		this.setLayout(new BorderLayout());
		this.setBounds(0,0,PainelAnimaQuadro.PAINEL_LARGURA, PainelAnimaQuadro.PAINEL_ALTURA/2);
		this.add(progressCaixas, BorderLayout.SOUTH, Integer.valueOf(2));
	}
	
	public void paint(Graphics g) {
		
		super.paint(g);
		
		Graphics2D g2D = (Graphics2D) g;
		TrainAnimation();
		g2D.drawImage(bgTrem, 0, -20, null);
		g2D.drawImage(trem, x, 210, null);
	}
	
	public void cycle() {
		if(x>=PainelAnimaQuadro.PAINEL_LARGURA - trem.getWidth(null)) {
			flag = true;
			//trem = new ImageIcon("./sprite_train/train1_voltando.png").getImage();
			xVelocidade = xVelocidade * -1;
		}else if(x<0) {
			flag = false;
			//trem = new ImageIcon("./sprite_train/train1_indo.png").getImage();
			xVelocidade = xVelocidade * -1;
		}
		x += xVelocidade;
	}
}
