package projetoThreads;

import interfaceGrafica.PainelAnimaQuadro;
import programaPrincipal.DepositoCaixas;

public class Trem extends Thread {

	public int tempoDeViagem;
	public boolean partiu = false;
	int contIteracao;
	
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
			System.out.println(getName() + " pegou as caixas do dep�sito!");
			System.out.println(getName() + " est� viajando de A para B!");
			
			Semaforos.M.release(DepositoCaixas.cargaDoVagao);
			DepositoCaixas.numeroDeCaixas -= DepositoCaixas.cargaDoVagao;
			
			contIteracao = 1;
			time = System.currentTimeMillis();
			while(System.currentTimeMillis() - time < this.tempoDeViagem * 1000 ) {
				if(System.currentTimeMillis() - time >= contIteracao * tempoDeViagem) {
					PainelAnimaQuadro.quadroTrem.cycle();
					PainelAnimaQuadro.quadroTrem.repaint();
					contIteracao++;
				}
			};
			
			System.out.println(getName() + " chegou em B ");
			System.out.println(getName() + " est� viajando de B para A!");
			
			contIteracao = 1;
			time = System.currentTimeMillis();
			while(System.currentTimeMillis() - time < this.tempoDeViagem * 1000 ) {
				if(System.currentTimeMillis() - time >= contIteracao * tempoDeViagem) {
					PainelAnimaQuadro.quadroTrem.cycle();
					PainelAnimaQuadro.quadroTrem.repaint();
					contIteracao++;
				}
			};
			
			System.out.println(getName() + " chegou em A ");
		}
	}
}
