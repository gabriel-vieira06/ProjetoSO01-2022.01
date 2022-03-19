package projetoThreads;

import java.util.concurrent.Semaphore;
import programaPrincipal.DepositoCaixas;

public class Semaforos {
	public static Semaphore M = new Semaphore(DepositoCaixas.capacidadeMaxima);
}
