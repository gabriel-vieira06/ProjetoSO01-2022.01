package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Paineis{

	public static JPanel painelVermelho = new JPanel();
	public static JPanel painelAzul = new JPanel();
	
	Paineis(){
				
		painelVermelho.setBackground(new Color(0, 128, 0));
		//painelVermelho.setBounds(0,0,400,400);
		painelVermelho.setLayout(new BorderLayout());
		painelVermelho.add(new LabelEmpacotador());
		painelVermelho.setBorder(BorderFactory.createLineBorder(Color.GREEN,3));
		
		painelAzul.setBackground(new Color(51,51,51));
		//painelAzul.setBounds(400,0,200,200);
		painelAzul.setLayout(new BorderLayout());
		painelAzul.add(new LabelTrem());
		painelAzul.setBorder(BorderFactory.createLineBorder(Color.YELLOW,3));
		
	}
	
	
	
}
