package interfaceGrafica;

import java.awt.Dimension;
import javax.swing.JPanel;

public class PainelAnimaQuadro extends JPanel{

	final static int PAINEL_LARGURA = 1050;
	final static int PAINEL_ALTURA = 500;
	
	PainelAnimaQuadro(){
		this.setPreferredSize(new Dimension(PAINEL_LARGURA, PAINEL_ALTURA));
		this.setLayout(null);
		this.add(new QuadroTrem());
		this.add(new QuadroEmpacotador());
	}

}