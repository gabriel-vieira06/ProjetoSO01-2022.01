package interfaceGrafica;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

public class QuadroEmpacotador extends JPanel{
	
	public ArrayList<MiniEmpacotador> empac;
	public int i;
	
	QuadroEmpacotador(){
		instanciaEmpacotadores();
		this.setBackground(null);
		this.setLayout(new GridLayout());
		this.setBounds(0,25,1153, 300);
		
	}
	
	public void instanciaEmpacotadores() {
		empac = new ArrayList<MiniEmpacotador>(PainelEmpacotador.numeroDeOperarios);
		for(i = 0; i < PainelEmpacotador.numeroDeOperarios; i++) {
			empac.add(new MiniEmpacotador(PainelEmpacotador.listaOperarios[i], PainelEmpacotador.listaTempos[i]));
			this.add(empac.get(i));
		}
	}
}
