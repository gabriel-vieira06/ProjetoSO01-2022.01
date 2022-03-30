package projetoThreads;

import interfaceGrafica.MiniEmpacotador;
import interfaceGrafica.PainelAnimaQuadro;
import programaPrincipal.DepositoCaixas;

public class Empacotador extends Thread {
	
	public int tempoDeEmpacotamento;
	int numID;
	int contIteracao;
	public MiniEmpacotador Empac;
	long time;
	
	public Empacotador (String id, int tempoDeEmpacotamento, int num) { 
		super (id);
		this.tempoDeEmpacotamento = tempoDeEmpacotamento;
		this.numID = num;
	} 
	
	public void run () { 
		while(true) { 
			contIteracao = 1;
			time = System.currentTimeMillis();
			while(System.currentTimeMillis() - time < tempoDeEmpacotamento * 1000) {
				if(System.currentTimeMillis() - time >= contIteracao * tempoDeEmpacotamento * 2) {
					PainelAnimaQuadro.quadroEmpacotador.Empac[numID].cycle();
					PainelAnimaQuadro.quadroEmpacotador.Empac[numID].repaint();
					contIteracao++;
				}
			}
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
