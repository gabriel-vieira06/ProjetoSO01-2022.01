package interfaceGrafica;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;

public class GUI extends JFrame{
	
	public GUI(){
		
		new Paineis();
		
		this.setTitle("Projeto SO - Problema Trem de Carga");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.getContentPane().setBackground(new Color(255,255,255));
		this.setSize(1000,500);
		this.setLayout(new GridLayout());
		this.add(Paineis.painelVermelho);
		this.add(Paineis.painelAzul);
	}

}
