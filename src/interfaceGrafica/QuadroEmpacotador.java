package interfaceGrafica;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.Timer;

public class QuadroEmpacotador extends JPanel{

	Timer timer;
	int y = 0;
	int yVelocidade = 110/PainelTrem.T1.tempoDeViagem;
	
	QuadroEmpacotador(){
		this.setBackground(Color.GRAY);
		this.setBounds(0,PainelAnimaQuadro.PAINEL_ALTURA/2,PainelAnimaQuadro.PAINEL_LARGURA, PainelAnimaQuadro.PAINEL_ALTURA/2);
	}
	
}
