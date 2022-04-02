package projetoThreads;

import interfaceGrafica.MiniEmpacotador;
import interfaceGrafica.PainelAnimaQuadro;
import interfaceGrafica.QuadroTrem;
import programaPrincipal.DepositoCaixas;

public class Empacotador extends Thread {
	
	public int tempoDeEmpacotamento;
	public MiniEmpacotador empac;
	long time;
	
	public Empacotador (String id, int tempoDeEmpacotamento, int num) { 
		super (id);
		this.tempoDeEmpacotamento = tempoDeEmpacotamento;
		empac = PainelAnimaQuadro.quadroEmpacotador.Empac[num];
	} 
	
	public void run () { 
		while(true) { 
			empac.animation();
			time = System.currentTimeMillis();
			while(System.currentTimeMillis() - time < tempoDeEmpacotamento * 1000);
			try {
				Semaforos.M.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println ("Empacotador " + getName() + " embalou uma caixa!");
			DepositoCaixas.numeroDeCaixas++;
			QuadroTrem.progressCaixas.atualizaBar();
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
