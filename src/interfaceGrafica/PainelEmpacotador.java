package interfaceGrafica;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelEmpacotador extends JPanel implements ActionListener {
	
	JButton empacButton = new JButton("Concluir");
	
	PainelEmpacotador(){
		
		empacButton.setPreferredSize(new Dimension(100,30));
		empacButton.addActionListener(this);
		empacButton.setFont(new Font("Arial", Font.BOLD, 16));
		
		this.setLayout(new FlowLayout(FlowLayout.CENTER,500,5));
		this.setBackground(null);
		this.add(new JLabel(new ImageIcon("worker.png")));
		this.add(new LabelTexto("Nome | Tempo de Empacotamento:"));
		this.add(new CheckEmpacotador("empacotador_1"));
		this.add(new CheckEmpacotador("empacotador_2"));
		this.add(new CheckEmpacotador("empacotador_3"));
		this.add(new CheckEmpacotador("empacotador_4"));
		this.add(new CheckEmpacotador("empacotador_5"));
		this.add(new CheckEmpacotador("empacotador_6"));
		this.add(new CheckEmpacotador("empacotador_7"));
		this.add(new CheckEmpacotador("empacotador_8"));
		this.add(new CheckEmpacotador("empacotador_9"));
		this.add(new CheckEmpacotador("empacotador_10"));
		this.add(empacButton);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==empacButton) System.out.println("Flamengoo");
	}
}
