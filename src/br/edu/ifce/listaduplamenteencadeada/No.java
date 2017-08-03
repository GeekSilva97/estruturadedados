package br.edu.ifce.listaduplamenteencadeada;

public class No {

	private Integer valor;
	private No proximo;
	private No anterior;

	public No() {
	}

	public No(Integer valor, No proximo, No anterior) {
		this.valor = valor;
		this.proximo = proximo;
		this.anterior = anterior;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}

	public No getAnterior() {
		return anterior;
	}

	public void setAnterior(No anterior) {
		this.anterior = anterior;
	}
	
	public String toString(){
		return ""+valor;
	}

}
