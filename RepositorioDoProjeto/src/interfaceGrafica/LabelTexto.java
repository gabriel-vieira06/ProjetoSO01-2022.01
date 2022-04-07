package interfaceGrafica;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class LabelTexto extends JLabel{

	LabelTexto(String texto){
		this.setText(texto);
		this.setFont(new Font("Arial", Font.BOLD, 16));
		this.setForeground(Color.WHITE);
	}
	
}
