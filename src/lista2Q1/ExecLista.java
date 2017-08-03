package lista2Q1;

public class ExecLista {

	public static void main(String[] args) {
		ListaDuplamenteEncadeadaImpl lista = new ListaDuplamenteEncadeadaImpl();
		lista.addOrdenado(100);
		lista.addOrdenado(10);
		lista.addOrdenado(50);
		lista.addOrdenado(-2);
		lista.show();
	}
	
}
