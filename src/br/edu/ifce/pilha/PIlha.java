package br.edu.ifce.pilha;

public interface PIlha {

	/**
	 * Adiciona um novo elemento na pilha
	 * @param valor
	 * @return valor inserido
	 */
	public Integer adicionar(Integer valor);

	
	/**
	 * Remove um elemento da pilha
	 * @return valor removido
	 */
	public Integer remover();

	/**
	 * Checa se uma pilha está vazia
	 * @return true se estiver vazia, false caso contrário
	 */
	public boolean pilhaVazia();

	/**
	 * Checa se uma pilha está cheia
	 * @return true se estiver cheia e false caso contrário
	 */
	public boolean pilhaCheia();

}
