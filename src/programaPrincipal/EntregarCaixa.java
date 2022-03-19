package programaPrincipal;

import projetoThreads.Empacotador;

public class EntregarCaixa {
	
	public static void main(String[] args) {
  
		System.out.println("*** EXECUÇÃO DA THREAD EMPACOTADOR ***");
        Empacotador e1 = new Empacotador("E1", 3);
		Empacotador e2 = new Empacotador("E2", 6);
		e1.start();
		e2.start();
		
	}
}
