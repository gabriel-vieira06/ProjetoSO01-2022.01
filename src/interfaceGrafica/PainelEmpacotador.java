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
		
		this.setLayout(new FlowLayout(FlowLayout.CENTER,500,10));
		this.setBackground(null);
		this.add(new JLabel(new ImageIcon("worker.png")));
		this.add(new LabelTexto("Selecione os empacotadores desejados:"));
		this.add(empacButton);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==empacButton) System.out.println("Flamengoo");
	}
	
	/*JPanel checkList = new JPanel();
	checklist.setPreferredSize(new Dimension());
	*/
}
