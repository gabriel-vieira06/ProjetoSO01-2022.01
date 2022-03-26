package interfaceGrafica;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CheckEmpacotador extends JPanel{

	ImageIcon unchecked = new ImageIcon("unchecked.png");
	ImageIcon checked = new ImageIcon("checked.png");
	
	JCheckBox empacCheck = new JCheckBox();
	JTextField empacName = new JTextField();
	JTextField empacTime = new JTextField();
	
	CheckEmpacotador(String defaultText){
		
		this.setBackground(new Color(0xffffff));
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		
		empacCheck.setIcon(unchecked);
		empacCheck.setSelectedIcon(checked);
		
		empacName.setPreferredSize(new Dimension(200,30));
		empacName.setText(defaultText);
		empacTime.setPreferredSize(new Dimension(30,30));
		
		this.add(empacCheck);
		this.add(empacName);
		this.add(empacTime);
		
	}
	
}
