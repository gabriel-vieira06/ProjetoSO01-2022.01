package programaPrincipal;

import java.awt.Color;
import javax.swing.JFrame;

public class GUI extends JFrame{

	GUI(){
		this.setTitle("Projeto SO - Problema Trem de Carga");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(420,420);
		this.setVisible(true);
		this.getContentPane().setBackground(new Color(0,0,0));
	}
	
}
