package br.edu.ifce.listaduplamenteencadeada;

public class TesteLista {

	public static void main(String[] args) {
		ListaDuplamenteEncadeadaImpl lista = new ListaDuplamenteEncadeadaImpl();
		lista.imprimir();
		lista.insereFinal(10);
		lista.insereFinal(12);
		lista.insereInicio(1);
		lista.imprimir();
		lista.removeInicio();
		lista.imprimir();
		lista.insereFinal(100);
		lista.insereFinal(101);
		lista.imprimir();
		lista.removeFinal();
		lista.removeFinal();
		lista.imprimir();
		lista.insereInicio(11);
		lista.insereInicio(17);
		lista.imprimir();
//		lista.removePosicao(2);
		lista.imprimir();
		
		lista.ordenaLista();
		
		lista.imprimir();
	}
	
}
