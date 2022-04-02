package interfaceGrafica;

import javax.swing.JFrame;

public class GUI extends JFrame{
	
	public GUI(){
		
		new Paineis();
		
		this.setResizable(false);
		this.setTitle("Projeto SO - Problema Trem de Carga");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(750,650);
		this.setLayout(null);
		this.add(Paineis.painelEsquerdo);
		this.add(Paineis.painelDireitoSuperior);
		this.add(Paineis.painelDireitoInferior);
		this.setVisible(true);
	}

}
