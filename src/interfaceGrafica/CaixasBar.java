package interfaceGrafica;

import javax.swing.JProgressBar;

import programaPrincipal.DepositoCaixas;

public class CaixasBar extends JProgressBar {

	CaixasBar(){
		this.setValue(0);
		this.setMaximum(DepositoCaixas.capacidadeMaxima);
		this.setString("Caixas = " + DepositoCaixas.numeroDeCaixas);
		this.setStringPainted(true);
	}
	
	public void atualizaBar() {
		this.setString("Caixas = " + DepositoCaixas.numeroDeCaixas);
		this.setValue(DepositoCaixas.numeroDeCaixas);
	}
	
}
