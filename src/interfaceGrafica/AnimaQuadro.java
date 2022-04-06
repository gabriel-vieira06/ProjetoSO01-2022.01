package interfaceGrafica;

import javax.swing.JFrame;

public class AnimaQuadro extends JFrame{

	PainelAnimaQuadro painelAnimado;
	
	public AnimaQuadro(){
		
		painelAnimado = new PainelAnimaQuadro();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(painelAnimado);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setTitle("Projeto SO - Animação Trem de Carga");
		this.setResizable(false);
		this.setVisible(true);
	}
	
}
