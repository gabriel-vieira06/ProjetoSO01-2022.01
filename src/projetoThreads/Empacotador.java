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
		while(true) { 
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
			if(DepositoCaixas.cargaDoVagao <= DepositoCaixas.numeroDeCaixas) {
				try {
					Semaforos.mutex.acquire();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(DepositoCaixas.cargaDoVagao <= DepositoCaixas.numeroDeCaixas) {
					DepositoCaixas.numeroDeCaixas = DepositoCaixas.numeroDeCaixas - DepositoCaixas.cargaDoVagao;
					Semaforos.N.release();
				}
				Semaforos.mutex.release();
			}
		}
	}
}
