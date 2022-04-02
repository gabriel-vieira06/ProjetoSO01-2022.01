package interfaceGrafica;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class QuadroEmpacotador extends JPanel{
	
	public MiniEmpacotador[] Empac;
	
	QuadroEmpacotador(){
		instanciaEmpacotadores();
		this.setBackground(null);
		this.setLayout(new GridLayout());
		this.setBounds(0,25,1153, 300);
		
	}
	
	public void instanciaEmpacotadores() {
		Empac = new MiniEmpacotador[PainelEmpacotador.numeroDeOperarios];
		for(int i = 0; i < PainelEmpacotador.numeroDeOperarios; i++) {
			Empac[i] = new MiniEmpacotador(PainelEmpacotador.listaOperarios[i], PainelEmpacotador.listaTempos[i]);
			this.add(Empac[i]);
		}
	}
}
