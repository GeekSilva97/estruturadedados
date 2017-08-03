package br.edu.ifce.filadinamica;

public class TesteFila {

	public static void main(String[] args) {
		
		Fila fila = new Fila();
		fila.adiciona(100);
		fila.adiciona(80);
		fila.adiciona(50);
		fila.adiciona(10);
		
//		fila.imprimeFila();
		
		System.out.println("ITEM 0 : "+fila.item(0)); // 1
		System.out.println("ITEM 1 : "+fila.item(1)); // 2
		System.out.println("ITEM 2 : "+fila.item(2)); // 3
		System.out.println("ITEM 3 : "+fila.item(3)); // 4
		
		
		System.out.println("ITEM 4 : "+fila.item(4)); // 5
		
		
	}
	
}
