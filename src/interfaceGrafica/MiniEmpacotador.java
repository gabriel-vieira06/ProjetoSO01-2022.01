package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MiniEmpacotador extends JPanel{

	static Image empac = new ImageIcon("empacotador-sprite.png").getImage(); // Width = 65px
	
	static int y = PainelAnimaQuadro.PAINEL_ALTURA/2;
	int x = 0;
	static int yVelocidade = 1;
	int indice;
	static LabelTexto nome;
	
	public MiniEmpacotador(String id){
		this.setLayout(new BorderLayout());
		this.add(nome = new LabelTexto(id), BorderLayout.SOUTH);
		this.setBackground(null);
	}
	
	public void paint(Graphics g) {
		
		super.paint(g);
		
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.drawImage(empac, 10, y, null);
	}

	public static void cycle() {
		
		if(y>=(PainelAnimaQuadro.PAINEL_ALTURA/2) - empac.getHeight(null) - nome.getHeight()) {
			empac = new ImageIcon("empacotador-sprite2.png").getImage();
			yVelocidade = yVelocidade * -1;
		}else if(y<0) {
			empac = new ImageIcon("empacotador-sprite.png").getImage();
			yVelocidade = yVelocidade * -1;
		}
		y += yVelocidade;
	}
	
}
