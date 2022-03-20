package programaPrincipal;

import projetoThreads.*;

public class EntregarCaixa {
	
	public static void main(String[] args) {
  
		System.out.println("*** EXECUÇÃO DAS THREADS ***");
        Empacotador e1 = new Empacotador("E1", 3);
		Empacotador e2 = new Empacotador("E2", 1);
		Trem T1 = new Trem(10);
		e1.start();
		e2.start();
		T1.start();
	}
}
