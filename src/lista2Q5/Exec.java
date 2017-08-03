package lista2Q5;

import java.util.Scanner;

public class Exec {

	public static void main(String[] args) {
		Pilha stack = new Pilha();
		Scanner read = new Scanner(System.in);
		int op, valor;
		while(true){
			System.out.print("Informe o valor : ");
			valor = read.nextInt();
			stack.add(valor); // adicionando a pilha
			System.out.println();
			System.out.println("Para finalizar digite 0 ou um valor menor");
			op = read.nextInt();
			
			if(op <= 0){
				break;
			}
		} // loop
		
		System.out.println("Imprimindo pilha");
		stack.imprimir();
		System.out.println();
		stack.gerarFilas();
		System.out.println("Fila dos pares");
		stack.fila1.imprimir();
		
		System.out.println("Fila dos ímpares");
		stack.fila2.imprimir();
	}
	
}
