package interfaceGrafica;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class QuadroEmpacotador extends JPanel{
	
	public MiniEmpacotador[] Empac;
	
	QuadroEmpacotador(){
		this.setBackground(Color.GRAY);
		this.setLayout(new GridLayout());
		this.setBounds(0,PainelAnimaQuadro.PAINEL_ALTURA/2,PainelAnimaQuadro.PAINEL_LARGURA, PainelAnimaQuadro.PAINEL_ALTURA/2);
		instanciaEmpacotadores();
	}
	
	public void instanciaEmpacotadores() {
		Empac = new MiniEmpacotador[PainelEmpacotador.numeroDeOperarios];
		for(int i = 0; i < PainelEmpacotador.numeroDeOperarios; i++) {
			Empac[i] = new MiniEmpacotador(PainelEmpacotador.listaOperarios[i], PainelEmpacotador.listaTempos[i]);
			this.add(Empac[i]);
		}
	}
}
