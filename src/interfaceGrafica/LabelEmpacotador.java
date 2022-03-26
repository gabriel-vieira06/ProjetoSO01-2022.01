package interfaceGrafica;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class LabelEmpacotador extends JLabel implements ActionListener {
	
	JButton empacButton = new JButton("Concluir");
	
	LabelEmpacotador(){
		
		ImageIcon empacLabelIcon = new ImageIcon("worker.png");
		
		empacButton.setBounds(200,570,100,40);
		empacButton.addActionListener(this);
		empacButton.setFont(new Font("Arial", Font.BOLD, 16));
		
		this.setText("Digite o número de empacotadores:");
		this.setIcon(empacLabelIcon);
		this.setHorizontalTextPosition(JLabel.CENTER);
		this.setForeground(Color.WHITE);
		this.setVerticalTextPosition(JLabel.BOTTOM);
		this.setFont(new Font("Arial", Font.BOLD, 16));
		this.setHorizontalAlignment(JLabel.CENTER);
		this.setVerticalAlignment(JLabel.TOP);
		this.add(empacButton);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==empacButton) System.out.println("Flamengoo");
	}
	
}
