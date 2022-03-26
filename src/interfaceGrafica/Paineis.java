package interfaceGrafica;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class Paineis{

	public static JPanel painelVermelho = new JPanel();
	public static JPanel painelAzul = new JPanel();
	
	Paineis(){
				
		painelVermelho.setBackground(new Color(255, 0, 0));
		painelVermelho.setLayout(new GridLayout());
		painelVermelho.add(new PainelEmpacotador());
		painelVermelho.setBorder(BorderFactory.createLineBorder(Color.GREEN,3));
		
		painelAzul.setBackground(new Color(0,0,255));
		painelAzul.setLayout(new GridLayout());
		painelAzul.add(new PainelTrem());
		painelAzul.setBorder(BorderFactory.createLineBorder(Color.YELLOW,3));
		
	}
	
	
	
}
