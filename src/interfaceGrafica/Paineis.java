package interfaceGrafica;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class Paineis{

	public static JPanel painelEsquerdo = new JPanel();
	public static JPanel painelDireito = new JPanel();
	
	Paineis(){
				
		painelEsquerdo.setBackground(new Color(0x7f7d9c));
		painelEsquerdo.setLayout(new GridLayout());
		painelEsquerdo.add(new PainelEmpacotador());
		painelEsquerdo.setBorder(BorderFactory.createLineBorder(Color.GREEN,3));
		
		painelDireito.setBackground(new Color(0x7f7d9c));
		painelDireito.setLayout(new GridLayout());
		painelDireito.add(new PainelTrem());
		painelDireito.setBorder(BorderFactory.createLineBorder(Color.YELLOW,3));
		
	}
	
	
	
}
