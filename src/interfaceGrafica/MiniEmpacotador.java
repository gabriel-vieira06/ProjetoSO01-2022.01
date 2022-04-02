package interfaceGrafica;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import KentHipos.Kensoft;

public class MiniEmpacotador extends JPanel{
	
	JLabel desenho = new JLabel(new ImageIcon("empacotador-sprite.png"));
	
	static int y = 240;
	static LabelTexto nome;
	int tempo;
	
	public MiniEmpacotador(String id, int tempo){
		this.setLayout(new BorderLayout());
		this.add(nome = new LabelTexto(id), BorderLayout.SOUTH);
		nome.setHorizontalAlignment(JLabel.CENTER);
		desenho.setVerticalAlignment(JLabel.TOP);
		this.setBackground(null);
		this.add(desenho);
		this.tempo = tempo;
	}
	
	public void animation() {
		Kensoft animate = new Kensoft();
		animate.jLabelYDown(0, y, tempo, 1, desenho);
		animate.jLabelYUp(y, 0, tempo, 1, desenho);
	}
	
	
}
