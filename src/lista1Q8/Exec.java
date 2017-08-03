package lista1Q8;

public class Exec {

	public static void main(String[] args) {
		ListaImpl lista = new ListaImpl();
		lista.add(new PontuacaoJogador("Edigleysson", 19900));
		lista.add(new PontuacaoJogador("Thiago", 109900));
		lista.add(new PontuacaoJogador("Marcelo", 29900));
		lista.add(new PontuacaoJogador("Nivando", 12300));
		lista.add(new PontuacaoJogador("Amauri", -100));
		lista.imprime();
		lista.remove();
		lista.imprime();
		
	}
	
}
