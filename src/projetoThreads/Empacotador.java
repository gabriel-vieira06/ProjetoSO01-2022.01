package projetoThreads;

import programaPrincipal.DepositoCaixas;

public class Empacotador extends Thread {
	
	public double tempoDeEmpacotamento;
	
	public Empacotador (String id, int tempoDeEmpacotamento) { 
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
					DepositoCaixas.numeroDeCaixas -= DepositoCaixas.cargaDoVagao;
					Semaforos.N.release();
				}
				Semaforos.mutex.release();
			}
		}
	}
}
