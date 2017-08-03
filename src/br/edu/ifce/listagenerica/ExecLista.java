package br.edu.ifce.listagenerica;

public class ExecLista {

	public static void main(String[] args) {
		ListaImpl<Integer> lista =  new ListaImpl<Integer>();
		lista.addUtimo(1);
		lista.addUtimo(2);
		lista.addUtimo(3);
		
		lista.imprimir();
		
		lista.addPrimeiro(0);
		lista.addAntes(2, -1);
		
		lista.imprimir();
		
		lista.set(0, -1);
		lista.set(1, 0);
		
		lista.imprimir();
		lista.set(4, 1);
		
		lista.addPrimeiro(-2);
		
		lista.imprimir();
		
		
		
	}
	
}
