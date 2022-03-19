package projetoThreads;

/*
Os produtos a serem
transportados s�o embalados nas caixas pelos empacotadores; cada empacotador, quando tem
uma caixa pronta, coloca a caixa em um dep�sito da esta��o de trem que tem capacidade para
armazenar M caixas (M >= N). Cada empacotador trabalha continuamente embalando caixas e
armazenando no dep�sito. Quando o dep�sito estiver cheio, os empacotadores que tentarem
armazenar suas caixas devem dormir (bloqueados). Usando sem�foros, modele o thread trem e o
thread empacotador, lembrando que podem existir muitos empacotadores e apenas um trem.
*/

public class Empacotador extends Thread {
	
	public double tempoDeEmpacotamento;
	
	public Empacotador (String id, double tempo) { 
		super (id);
		tempoDeEmpacotamento = tempo * 1000;
	} 
	
	public void run () { 
		for (int i=1; i<1000; i++) { 
			long time = System.currentTimeMillis();
			while(System.currentTimeMillis() - time < tempoDeEmpacotamento);
			System.out.println ("Empacotador " + getName() + " embalou uma caixa!");
		}
	}
	
	public static void main(String[] args) {	    
	    
	    System.out.println("*** EXECU��O DA THREAD EMPACOTADOR ***");
		Empacotador e1 = new Empacotador("E1", 3);
		Empacotador e2 = new Empacotador("E2", 6);
		Empacotador e3 = new Empacotador("E3", 9);
		e1.start();
		e2.start();
		e3.start();
	}
	
}
