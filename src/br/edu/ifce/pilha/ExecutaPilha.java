package br.edu.ifce.pilha;

public class ExecutaPilha {

	public static void main(String[] args) {
		PilhaImpl pilha = new PilhaImpl();
	
		// mudança
	
		
		pilha.adicionar(10);
		pilha.adicionar(150);
		pilha.adicionar(40);
		pilha.adicionar(12);
		pilha.adicionar(90);
		
		pilha.imprimePilha();
		
		pilha.remover();
		
		pilha.imprimePilha();
		
		
		
	}
	
}
