package interfaceGrafica;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.NumberFormatter;

import programaPrincipal.DepositoCaixas;
import projetoThreads.Trem;

public class PainelTrem extends JPanel implements ActionListener {	

	JButton tremButton = new JButton("Concluir");
	
	static Trem T1;
	
	static boolean start = false;
	
	NumberFormatter formataNumero = new NumberFormatter(NumberFormat.getIntegerInstance());
	
	JFormattedTextField tempoTrem, cargaTrem, capacidadeMaxima;
	
	static JLabel erro = new JLabel("Valor inválido detectado!");
	
	PainelTrem(){

		formataNumero.setAllowsInvalid(false);
		
		tempoTrem = new JFormattedTextField(formataNumero);
		cargaTrem = new JFormattedTextField(formataNumero);
		capacidadeMaxima = new JFormattedTextField(formataNumero);
		
		tempoTrem.setText("0");
		cargaTrem.setText("0");
		capacidadeMaxima.setText("0");
		
		tempoTrem.setPreferredSize(new Dimension(30,30));
		tempoTrem.setHorizontalAlignment(JTextField.CENTER);
		
		cargaTrem.setPreferredSize(new Dimension(30,30));
		cargaTrem.setHorizontalAlignment(JTextField.CENTER);
		
		capacidadeMaxima.setPreferredSize(new Dimension(30,30));
		capacidadeMaxima.setHorizontalAlignment(JTextField.CENTER);

		tremButton.setPreferredSize(new Dimension(100,30));
		tremButton.addActionListener(this);
		tremButton.setFont(new Font("Arial", Font.BOLD, 16));
		
		erro.setFont(new Font("Arial", Font.BOLD,24));
		erro.setForeground(Color.red);
		erro.setVisible(false);
		
		this.setLayout(new FlowLayout(FlowLayout.CENTER,22,5));
		this.setBackground(null);
		this.add(new JLabel(new ImageIcon(getClass().getResource("/assets/train.png"))));
		this.add(new LabelTexto("Digite o tempo de viagem:"));
		this.add(tempoTrem);
		this.add(new LabelTexto("Digite a carga do trem:"));
		this.add(cargaTrem);
		this.add(new LabelTexto("Digite o número máximo de caixas:"));
		this.add(capacidadeMaxima);
		this.add(tremButton);
		this.add(erro);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==tremButton) {
			if(Integer.parseInt(cargaTrem.getText()) == 0 ||
			   Integer.parseInt(capacidadeMaxima.getText()) == 0 ||
		       Integer.parseInt(tempoTrem.getText()) == 0) {
				erro.setVisible(true);
				tremButton.setBorder(null);
				return;
			};
			DepositoCaixas.cargaDoVagao = Integer.parseInt(cargaTrem.getText());
			DepositoCaixas.capacidadeMaxima = Integer.parseInt(capacidadeMaxima.getText());
			T1 = new Trem(Integer.parseInt(tempoTrem.getText()));
			erro.setVisible(false);
			start = true;
			if(start && PainelEmpacotador.start) Paineis.inicializa.start.setEnabled(true);
			tremButton.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.green));
		};
	}
	
}
