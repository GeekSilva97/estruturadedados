package br.edu.ifce.listaduplamenteencadeada;

public interface ListaDuplamenteEncadeada {

	public Integer insereFinal(Integer valor);
	public Integer insereInicio(Integer valor);
	public Integer inserePosicao(int pos, Integer valor);
	public Integer insereOrdenado(Integer valor);
	
	public Integer removeInicio();
	public Integer removeFinal();
	public Integer removePosicao(int pos);
	
	public void ordenaLista();
	
	public No pesquisaPosicao(int pos);
	
}
