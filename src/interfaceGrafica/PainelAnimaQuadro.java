package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelAnimaQuadro extends JPanel{

	final static int PAINEL_LARGURA = 1000 + QuadroTrem.trem.getWidth(null);
	final static int PAINEL_ALTURA = 700;
	
	JLabel esteiraSuperior = new JLabel(new ImageIcon("esteira.png"));
	JLabel esteiraInferior = new JLabel(new ImageIcon("esteira.png"));
	
	public static QuadroTrem quadroTrem = new QuadroTrem();
	public static BackgroundEmpacotador backgroundEmpac = new BackgroundEmpacotador();
	
	PainelAnimaQuadro(){
		this.setPreferredSize(new Dimension(PAINEL_LARGURA, PAINEL_ALTURA));
		this.setLayout(new BorderLayout());
		this.add(quadroTrem);
		this.add(backgroundEmpac);
		this.add(esteiraSuperior);
		this.add(esteiraInferior);
		esteiraSuperior.setLocation(0,350);
		esteiraInferior.setLocation(0,700);
	}

}