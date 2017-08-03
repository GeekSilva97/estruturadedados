package br.edu.ifce.filadinamica;

public class Fila {

	public static final int MAX = 5;
	public No head;
	public int tamanho = 0;
	
	
	/**
	 * Adiciona um novo elemento a fila
	 * @param valor
	 * @return
	 */
	public Integer adiciona(Integer valor) {

		if (tamanho == 0) {
			head = new No(valor, null);
		} else {

			No novoNo = new No(valor, null);
			getCauda().setProximo(novoNo);

		}

		tamanho++; // incrementando tamanho

		return valor;
	}

	
	/**
	 * Retorna o item
	 * @param index
	 * @return
	 */
	public Integer item(int index) {
		
		if(filaVazia() || (index + 1) > tamanho){
			return null;
		}
		
		No no = head;
		int counter = 0;
		
		while(no.getProximo() != null){
			if(index == counter){			
				break;
			}
			
			no = no.getProximo();
			counter++;
			
		}
		
		return no.getValor();
	}

	
	/**
	 * Remove um elemento da fila
	 * @return
	 */
	public Integer remove() {

		if (filaVazia()) {
			System.out.println("A fila está vazia e não há como remover elementos");
			return null;
		}

		// elemento a ser removido
		Integer valor = head.getValor();
		head = head.getProximo();

		tamanho--;

		return valor;
	}

	public void imprimeFila() {
		if (filaVazia()) {
			System.out.println("A fila está vazia, não há elementos a imprimir");
			return;
		}

		No no = head;
		int counter = 0;

		System.out.println("-------- IMPRIMINDO FILA --------\n");

		while (no.getProximo() != null) {
			System.out.println("Elemento [" + counter + "] = " + no.getValor());
			no = no.getProximo();
			counter++;
		}

		System.out.println("Elemento [" + counter + "] = " + no.getValor());

	}

	public boolean filaVazia() {
		return tamanho == 0;
	}

	public boolean filaCheia() {
		return tamanho == MAX;
	}

	public No getCauda() {
		No no = head;
		while (no.getProximo() != null) {
			no = no.getProximo();
		}
		return no;
	}

}
