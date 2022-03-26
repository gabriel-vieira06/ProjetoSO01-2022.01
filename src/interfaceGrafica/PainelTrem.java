package interfaceGrafica;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PainelTrem extends JPanel implements ActionListener {	

	JButton tremButton = new JButton("Concluir");
	JTextField tempoTrem = new JTextField();
	JTextField cargaTrem = new JTextField();
	
	PainelTrem(){

		tempoTrem.setPreferredSize(new Dimension(30,30));
		tempoTrem.setHorizontalAlignment(JTextField.CENTER);
		
		cargaTrem.setPreferredSize(new Dimension(30,30));
		cargaTrem.setHorizontalAlignment(JTextField.CENTER);

		tremButton.setPreferredSize(new Dimension(100,30));
		tremButton.addActionListener(this);
		tremButton.setFont(new Font("Arial", Font.BOLD, 16));
		
		this.setLayout(new FlowLayout(FlowLayout.CENTER,22,5));
		this.setBackground(null);
		this.add(new JLabel(new ImageIcon("train.png")));
		this.add(new LabelTexto("Digite o tempo de viagem:"));
		this.add(tempoTrem);
		this.add(new LabelTexto("Digite a carga do trem:"));
		this.add(cargaTrem);
		this.add(tremButton);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==tremButton) {
			System.out.println(tempoTrem.getText());
			System.out.println(cargaTrem.getText());
		};
	}
	
}
