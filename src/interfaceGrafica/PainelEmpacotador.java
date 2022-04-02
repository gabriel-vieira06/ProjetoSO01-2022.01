package interfaceGrafica;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelEmpacotador extends JPanel implements ActionListener {
	
	JButton empacButton = new JButton("Concluir");
	
	public static String[] listaOperarios = new String[10];
	public static int[] listaTempos = new int[10];
	public static int numeroDeOperarios = 0;
	
	static boolean start = false;
	
	CheckEmpacotador[] En = new CheckEmpacotador[10];
	
	PainelEmpacotador(){
		
		empacButton.setPreferredSize(new Dimension(100,30));
		empacButton.addActionListener(this);
		empacButton.setFont(new Font("Arial", Font.BOLD, 16));
		
		this.setLayout(new FlowLayout(FlowLayout.CENTER,500,5));
		this.setBackground(null);
		this.add(new JLabel(new ImageIcon("worker.png")));
		this.add(new LabelTexto("Nome | Tempo de Empacotamento:"));
		this.add(En[0] = new CheckEmpacotador("empacotador_1"));
		this.add(En[1] = new CheckEmpacotador("empacotador_2"));
		this.add(En[2] = new CheckEmpacotador("empacotador_3"));
		this.add(En[3] = new CheckEmpacotador("empacotador_4"));
		this.add(En[4] = new CheckEmpacotador("empacotador_5"));
		this.add(En[5] = new CheckEmpacotador("empacotador_6"));
		this.add(En[6] = new CheckEmpacotador("empacotador_7"));
		this.add(En[7] = new CheckEmpacotador("empacotador_8"));
		this.add(En[8] = new CheckEmpacotador("empacotador_9"));
		this.add(En[9] = new CheckEmpacotador("empacotador_10"));
		this.add(empacButton);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==empacButton){
			for(int i = 0; i < 10; i++) {
				if(En[i].empacCheck.isSelected()) {
					if(Integer.parseInt(En[i].empacTime.getText()) == 0) {
						PainelTrem.erro.setVisible(true);
						numeroDeOperarios = 0;
						empacButton.setBorder(null);
						return;
					}
					listaOperarios[numeroDeOperarios] = En[i].empacName.getText();
					listaTempos[numeroDeOperarios] = Integer.parseInt(En[i].empacTime.getText());
					numeroDeOperarios++;
				}
			}
			start = true;
			if(start && PainelTrem.start) Paineis.inicializa.start.setEnabled(true);
			empacButton.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.green));
			PainelTrem.erro.setVisible(false);
		}
	}
}
