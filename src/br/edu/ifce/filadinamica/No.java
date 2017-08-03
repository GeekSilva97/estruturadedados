package br.edu.ifce.filadinamica;

public class No {

	public Integer valor;
	private No proximo;
	
	public No(){
		this.valor = null;
		this.proximo = null;
	}
	
	public No(Integer valor, No proximo){
		this.valor = valor;
		this.proximo = proximo;
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
	
	
	
}
