package interfaceGrafica;

import java.awt.Color;

import javax.swing.JPanel;

public class QuadroEmpacotador extends JPanel{

	QuadroEmpacotador(){
		this.setBackground(Color.GRAY);
		this.setBounds(0,PainelAnimaQuadro.PAINEL_ALTURA/2,PainelAnimaQuadro.PAINEL_LARGURA, PainelAnimaQuadro.PAINEL_ALTURA/2);
	}
	
}
