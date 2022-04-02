package interfaceGrafica;

import java.awt.Dimension;
import javax.swing.JPanel;

public class PainelAnimaQuadro extends JPanel{

	final static int PAINEL_LARGURA = 1000 + QuadroTrem.trem.getWidth(null);
	final static int PAINEL_ALTURA = 700;
	
	public static QuadroTrem quadroTrem = new QuadroTrem();
	public static QuadroEmpacotador quadroEmpacotador = new QuadroEmpacotador();
	
	PainelAnimaQuadro(){
		this.setPreferredSize(new Dimension(PAINEL_LARGURA, PAINEL_ALTURA));
		this.setLayout(null);
		this.add(quadroTrem);
		this.add(quadroEmpacotador);
	}

}