package interfaceGrafica;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class Paineis{

	public static JPanel painelEsquerdo = new JPanel();
	public static JPanel painelDireitoSuperior = new JPanel();
	public static JPanel painelDireitoInferior = new JPanel();
	
	static PainelStart inicializa = new PainelStart();
	
	Paineis(){
				
		painelEsquerdo.setBackground(new Color(0x7f7d9c));
		painelEsquerdo.setBounds(0,0,375,1000);
		painelEsquerdo.setLayout(new GridLayout());
		painelEsquerdo.add(new PainelEmpacotador());
		
		painelDireitoSuperior.setBackground(new Color(0x7f7d9c));
		painelDireitoSuperior.setBounds(375,0,375,500);
		painelDireitoSuperior.setLayout(new GridLayout());
		painelDireitoSuperior.add(new PainelTrem());

		painelDireitoInferior.setBackground(new Color(0x7f7d9c));
		painelDireitoInferior.setBounds(375,500,375,500);
		painelDireitoInferior.setLayout(new GridLayout());
		painelDireitoInferior.add(inicializa);
		
	}
	
	
	
}
