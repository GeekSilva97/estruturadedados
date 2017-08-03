package lista2Q4;

import java.util.Scanner;

public class Exec {
	
	public static void main(String[] args) {
		ListaImpl lista = new ListaImpl();
		Scanner read = new Scanner(System.in);
		Integer val;
		for(int i = 0; i<10; i++){
			System.out.println("Informe um inteiro");
			val = read.nextInt();
			lista.add(val);
		}
		
		
		System.out.println("Imprimindo lista antes da troca");
		lista.imprime();
		lista.troca();
		System.out.println("Imprimindo apos a troca");
		lista.imprime();
		
	}
	
}
