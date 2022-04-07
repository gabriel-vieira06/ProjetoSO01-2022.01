package interfaceGrafica;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.NumberFormatter;

import projetoThreads.Empacotador;

public class AddEmpac extends JFrame implements ActionListener{

	NumberFormatter formataNumero = new NumberFormatter(NumberFormat.getIntegerInstance());
	JTextField empacName = new JTextField();
	JFormattedTextField empacTime;
	
	ArrayList<Empacotador> novoEmpacotador = new ArrayList<Empacotador>();
	ArrayList<MiniEmpacotador> novoMiniEmpacotador = new ArrayList<MiniEmpacotador>();
	
	JButton criaEmpacotador = new JButton("Criar Empacotador");
	
	int indiceEmpacotador = PainelAnimaQuadro.backgroundEmpac.quadroEmpacotador.i;
	int indiceArray = 0;
	
	JLabel erro = new JLabel("Valor inválido detectado!");
	
	public AddEmpac() {
		
		formataNumero.setAllowsInvalid(false);
		empacTime = new JFormattedTextField(formataNumero);
		
		empacName.setBounds(180,80,200,30);
		empacName.setText("extra_" + (indiceArray + 1));
		
		empacTime.setBounds(140,80,30,30);
		empacTime.setHorizontalAlignment(JTextField.CENTER);
		empacTime.setText("0");
		
		criaEmpacotador.setBounds(100,140,300,50);
		criaEmpacotador.addActionListener(this);
		
		erro.setBounds(130,190,300,60);
		erro.setFont(new Font("Arial", Font.BOLD,20));
		erro.setForeground(Color.red);
		erro.setVisible(false);
		
		this.setLayout(null);
		this.add(empacName);
		this.add(empacTime);
		this.add(criaEmpacotador);
		this.add(erro);
		this.setTitle("Projeto SO - Adicionar Novo Empacotador");
		this.setSize(500,300);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==criaEmpacotador) {
			
			if(Integer.parseInt(empacTime.getText()) == 0) {
				erro.setVisible(true);
				return;
			}
			
			novoMiniEmpacotador.add(new MiniEmpacotador(empacName.getText(), Integer.parseInt(empacTime.getText())));
			
			PainelAnimaQuadro.backgroundEmpac.quadroEmpacotador.empac.add(novoMiniEmpacotador.get(indiceArray));
			PainelAnimaQuadro.backgroundEmpac.quadroEmpacotador.add(novoMiniEmpacotador.get(indiceArray));
			
			novoEmpacotador.add(new Empacotador(empacName.getText(), Integer.parseInt(empacTime.getText()), indiceEmpacotador + indiceArray));
			novoEmpacotador.get(indiceArray).start();
			indiceArray++;
			
			empacName.setText("extra_" + (indiceArray + 1));
			empacTime.setText("0");
			
			erro.setVisible(false);
			
			PainelAnimaQuadro.backgroundEmpac.quadroEmpacotador.revalidate();
			PainelAnimaQuadro.backgroundEmpac.quadroEmpacotador.repaint();
		}

	}
}
