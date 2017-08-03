package br.edu.ifce.pilhadinamica;

public class Pilha {

	public No topo;
	public int tamanho = 0;

	
	/**
	 * Imprime os elementos da pilha
	 */
	public void imprimePilha() {

		if (pilhaVazia()) {
			System.out.println("A pilha está vazia, não há elementos a imprimir");
			return;
		}

		System.out.println("\n------------------------ Imprimindo pilha ------------------------\n");
		No aux = topo;
		while (aux.getProximo() != null) {
			System.out.println("(" + aux.getValor() + ")");
			aux = aux.getProximo();
		}
		System.out.println("(" + aux.getValor() + ")");
	}

	/**
	 * Checa se a pilha está vazia
	 * @return TRUE se tamanho for 0, FALSE caso contrário
	 */
	public boolean pilhaVazia() {
		return tamanho == 0;
	}

	
	/**
	 * Adiciona um novo elemento a pilha
	 * @param valor - Valor a ser adicionado a pilha
	 * @return valor - Valor adicionado
	 */
	public Integer add(Integer valor) {
		
		No noAdd = new No(valor);
	 
		if (pilhaVazia()) {
			topo = noAdd;
		} else {
			// definindo o priximo do novo no como sendo o topo atual
			noAdd.setProximo(topo);
			
			// Topo sendo atualizado para o novo no inserido na pilha
			topo = noAdd;
		}

		tamanho++;
		return noAdd.getValor();
	}

	
	/**
	 * Remove um elemento da pilha
	 * @return valor - Elemento removido
	 */
	public Integer remove() {

		if (pilhaVazia()) {
			System.out.println("A pilha está vazia, não há elementos para serem removidos");
			return null;
		}
		
		Integer valor = topo.getValor();
		
		// definindo novo topo da pilha
		topo = topo.getProximo();
		
		tamanho--;

		return valor;
	}

}
