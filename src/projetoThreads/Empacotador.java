package projetoThreads;

import programaPrincipal.DepositoCaixas;

/*
Os produtos a serem
transportados s�o embalados nas caixas pelos empacotadores; cada empacotador, quando tem
uma caixa pronta, coloca a caixa em um dep�sito da esta��o de trem que tem capacidade para
armazenar M caixas (M >= N). Cada empacotador trabalha continuamente embalando caixas e
armazenando no dep�sito. Quando o dep�sito estiver cheio, os empacotadores que tentarem
armazenar suas caixas devem dormir (bloqueados). Usando sem�foros, modele o thread trem e o
thread empacotador, lembrando que podem existir muitos empacotadores e apenas um trem.
*/

public class Empacotador extends Thread {
	
	public double tempoDeEmpacotamento;
	
	public Empacotador (String id, double tempoDeEmpacotamento) { 
		super (id);
		this.tempoDeEmpacotamento = tempoDeEmpacotamento * 1000;
	} 
	
	public void run () { 
		for (int i=1; i<1000; i++) { 
			long time = System.currentTimeMillis();
			while(System.currentTimeMillis() - time < this.tempoDeEmpacotamento);
			try {
				Semaforos.M.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			DepositoCaixas.numeroDeCaixas++;
			System.out.println ("Empacotador " + getName() + " embalou uma caixa!");
			//Semaforos.M.release();	// Todos os empacotadores ir�o ser bloqueados caso n�o haja um release.
			System.out.println("Caixas no dep�sito: " + DepositoCaixas.numeroDeCaixas);
		}
	}
}
