package interfaceGrafica;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LabelTrem extends JLabel implements ActionListener {	// <---

	JButton tremButton = new JButton("Concluir");
	JTextField tempoTrem = new JTextField();
	JTextField cargaTrem = new JTextField();
	JLabel teste = new JLabel("testando");
	
	LabelTrem(){
		
		ImageIcon tremLabelIcon = new ImageIcon("train.png");

		tempoTrem.setBounds(100,300,300,30);
		tempoTrem.setHorizontalAlignment(JTextField.CENTER);
		
		cargaTrem.setBounds(100,400,300,30);
		cargaTrem.setHorizontalAlignment(JTextField.CENTER);

		tremButton.setBounds(200,570,100,40);
		tremButton.addActionListener(this);
		tremButton.setFont(new Font("Arial", Font.BOLD, 16));
		this.setText("Digite o tempo de viagem:");
		this.setIcon(tremLabelIcon);
		this.setHorizontalTextPosition(JLabel.CENTER);
		this.setForeground(Color.WHITE);
		this.setVerticalTextPosition(JLabel.BOTTOM);
		this.setFont(new Font("Arial", Font.BOLD, 16));
		this.setHorizontalAlignment(JLabel.CENTER);
		this.setVerticalAlignment(JLabel.TOP);
		this.add(tempoTrem);
		this.add(cargaTrem);
		this.add(tremButton);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==tremButton) System.out.println("Corinthiass");
	}
	
}
