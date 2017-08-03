package br.edu.ifce.pilhadinamica;

public class ExecutaPilha {

	public static void main(String[] args) {
		
		Pilha pilha = new Pilha();
		pilha.add(100);
		pilha.add(80);
		pilha.add(22);
		pilha.add(34);
		pilha.add(0);
		pilha.imprimePilha();
		
		
		pilha.remove(); 
		pilha.imprimePilha();
		
		pilha.remove();
		pilha.imprimePilha();
		
		pilha.remove(); 

		pilha.imprimePilha(); 
		
		pilha.remove();
		pilha.remove();
		pilha.imprimePilha();
	}
	
}
