package projetoThreads;

import interfaceGrafica.PainelAnimaQuadro;
import interfaceGrafica.QuadroTrem;
import programaPrincipal.DepositoCaixas;

public class Trem extends Thread {

	public int tempoDeViagem;
	int contIteracao;
	long time;
	
	public Trem (int tempoDeViagem) { 
		super("Trem");
		this.tempoDeViagem = tempoDeViagem;
	}
	
	public void run () { 
		while(true) {
			try {
				Semaforos.N.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(getName() + " pegou as caixas do depósito!");
			System.out.println(getName() + " está viajando de A para B!");
			
			Semaforos.M.release(DepositoCaixas.cargaDoVagao);
			DepositoCaixas.numeroDeCaixas -= DepositoCaixas.cargaDoVagao;
			QuadroTrem.progressCaixas.atualizaBar();
			
			contIteracao = 1;
			time = System.currentTimeMillis();
			while(System.currentTimeMillis() - time < tempoDeViagem * 1000 ) {
				if(System.currentTimeMillis() - time >= contIteracao * tempoDeViagem) {
					PainelAnimaQuadro.quadroTrem.cycle();
					PainelAnimaQuadro.quadroTrem.repaint();
					contIteracao++;
				}
			};
			
			System.out.println(getName() + " chegou em B ");
			System.out.println(getName() + " está viajando de B para A!");
			
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
