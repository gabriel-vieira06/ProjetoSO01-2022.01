package interfaceGrafica;

import java.awt.Dimension;
import javax.swing.JPanel;

public class PainelAnimaQuadro extends JPanel{

	final static int PAINEL_LARGURA = 1000 + QuadroTrem.trem.getWidth(null);
	final static int PAINEL_ALTURA = 500;
	
	public static QuadroTrem quadroTrem;
	public static QuadroEmpacotador quadroEmpacotador;
	
	PainelAnimaQuadro(){
		this.setPreferredSize(new Dimension(PAINEL_LARGURA, PAINEL_ALTURA));
		this.setLayout(null);
		this.add(quadroTrem = new QuadroTrem());
		this.add(quadroEmpacotador = new QuadroEmpacotador());
	}

}