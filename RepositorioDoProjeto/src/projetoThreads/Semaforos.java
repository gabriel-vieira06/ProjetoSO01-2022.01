package projetoThreads;

import java.util.concurrent.Semaphore;
import programaPrincipal.DepositoCaixas;

public class Semaforos {
	public static Semaphore M = new Semaphore(DepositoCaixas.capacidadeMaxima);
	public static Semaphore N = new Semaphore(0);
	public static Semaphore mutex = new Semaphore(1);
}
