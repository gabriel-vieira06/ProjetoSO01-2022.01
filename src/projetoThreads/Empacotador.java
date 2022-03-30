package projetoThreads;

import programaPrincipal.DepositoCaixas;

public class Empacotador extends Thread {
	
	public int tempoDeEmpacotamento;
	
	public Empacotador (String id, int tempoDeEmpacotamento) { 
		super (id);
		this.tempoDeEmpacotamento = tempoDeEmpacotamento;
	} 
	
	public void run () { 
		while(true) { 
			long time = System.currentTimeMillis();
			while(System.currentTimeMillis() - time < this.tempoDeEmpacotamento * 1000);
			try {
				Semaforos.M.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println ("Empacotador " + getName() + " embalou uma caixa!");
			DepositoCaixas.numeroDeCaixas++;
			DepositoCaixas.tempCaixas++;
			if(DepositoCaixas.tempCaixas >= DepositoCaixas.cargaDoVagao) {
				try {
					Semaforos.mutex.acquire();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(DepositoCaixas.tempCaixas >= DepositoCaixas.cargaDoVagao) {
					DepositoCaixas.tempCaixas -= DepositoCaixas.cargaDoVagao;
					Semaforos.N.release();
				}
				Semaforos.mutex.release();
			}
		}
	}
}
