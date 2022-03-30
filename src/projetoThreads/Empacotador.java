package projetoThreads;

import programaPrincipal.DepositoCaixas;

public class Empacotador extends Thread {
	
	public double tempoDeEmpacotamento;
	int caixas;
	
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
			System.out.println ("Empacotador " + getName() + " embalou uma caixa!");
			DepositoCaixas.numeroDeCaixas++;
			System.out.println(DepositoCaixas.numeroDeCaixas);
			caixas++;
			if(DepositoCaixas.cargaDoVagao <= caixas) {
				try {
					Semaforos.mutex.acquire();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(DepositoCaixas.cargaDoVagao <= caixas) {
					caixas -= DepositoCaixas.cargaDoVagao;
					Semaforos.N.release();
				}
				Semaforos.mutex.release();
			}
		}
	}
}
