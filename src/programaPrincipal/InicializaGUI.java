package programaPrincipal;

import interfaceGrafica.AnimaQuadro;
import interfaceGrafica.GUI;

public class InicializaGUI {

	public static GUI form;
	
	InicializaGUI(){

		new AnimaQuadro();
		form = new GUI();
	}
	
}
