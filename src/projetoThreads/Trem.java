package projetoThreads;

import programaPrincipal.DepositoCaixas;

public class Trem extends Thread {

	public double tempoDeViagem;
	
	public Trem (double tempoDeViagem) { 
		super("Trem");
		this.tempoDeViagem = tempoDeViagem * 1000;
	}
	
	public void run () { 
		while(true) { 
			long time = System.currentTimeMillis();
			try {
				Semaforos.N.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(getName() + " pegou as caixas do depósito!");
			Semaforos.M.release(DepositoCaixas.cargaDoVagao);
			System.out.println(getName() + " está viajando de A para B!");
			while(System.currentTimeMillis() - time < this.tempoDeViagem);
			System.out.println(getName() + " chegou em B ");
			time = System.currentTimeMillis();
			System.out.println(getName() + " está viajando de B para A!");
			while(System.currentTimeMillis() - time < this.tempoDeViagem);
			System.out.println(getName() + " chegou em A ");
		}
	}
}
