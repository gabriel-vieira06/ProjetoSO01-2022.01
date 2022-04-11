package interfaceGrafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import programaPrincipal.InicializaGUI;
import projetoThreads.Empacotador;

public class PainelStart extends JPanel implements ActionListener{

	JButton start = new JButton("Iniciar aplicação");
	static Empacotador[] empac;
	
	
	PainelStart(){
		
		start.setBounds(30,75,300,50);
		start.addActionListener(this);
		start.setEnabled(false);
		
		this.setBackground(null);
		this.setLayout(null);
		this.add(start);
	}
	
	public void actionPerformed(ActionEvent e) {
		empac = new Empacotador[PainelEmpacotador.numeroDeOperarios];
		if(e.getSource()==start) {
			for(int i = 0; i < PainelEmpacotador.numeroDeOperarios; i++) {
				empac[i] = new Empacotador(PainelEmpacotador.listaOperarios[i], PainelEmpacotador.listaTempos[i], i);
			}
			for(int i = 0; i < PainelEmpacotador.numeroDeOperarios; i++) empac[i].start();
			PainelTrem.T1.start();
		}
		new AddEmpac();
		new AnimaQuadro();
		InicializaGUI.form.dispose();
	}
}
