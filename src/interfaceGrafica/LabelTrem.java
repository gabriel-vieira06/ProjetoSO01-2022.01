package interfaceGrafica;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class LabelTrem extends JLabel implements ActionListener {

	JButton tremButton = new JButton();
	
	LabelTrem(){
		
		ImageIcon tremLabelIcon = new ImageIcon("train.png");

		tremButton.setBounds(200,200,100,50);
		tremButton.addActionListener(this);
		
		this.setText("Digite o tempo de viagem:");
		this.setIcon(tremLabelIcon);
		this.setHorizontalTextPosition(JLabel.CENTER);
		this.setVerticalTextPosition(JLabel.BOTTOM);
		this.setFont(new Font("Arial", Font.BOLD, 16));
		this.setHorizontalAlignment(JLabel.CENTER);
		this.setVerticalAlignment(JLabel.CENTER);
		this.add(tremButton);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==tremButton) System.out.println("Corinthiass");
	}
	
}
