package projetoThreads;

import programaPrincipal.DepositoCaixas;

public class Trem extends Thread {

	public int tempoDeViagem;
	public boolean partiu = false;
	
	public Trem (int tempoDeViagem) { 
		super("Trem");
		this.tempoDeViagem = tempoDeViagem;
	}
	
	public void run () { 
		while(true) {
			long time;
			try {
				Semaforos.N.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(getName() + " pegou as caixas do depósito!");
			Semaforos.M.release(DepositoCaixas.cargaDoVagao);
			partiu = true;
			DepositoCaixas.numeroDeCaixas -= DepositoCaixas.cargaDoVagao;
			System.out.println(getName() + " está viajando de A para B!");
			time = System.currentTimeMillis();
			while(System.currentTimeMillis() - time < this.tempoDeViagem * 1000 );
			System.out.println(getName() + " chegou em B ");
			time = System.currentTimeMillis();
			System.out.println(getName() + " está viajando de B para A!");
			while(System.currentTimeMillis() - time < this.tempoDeViagem * 1000 );
			System.out.println(getName() + " chegou em A ");
			partiu = false;
		}
	}
}
