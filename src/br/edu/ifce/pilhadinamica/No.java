package br.edu.ifce.pilhadinamica;

public class No {

	private Integer valor;
	private No proximo;

	
	public No(){}
	
	public No(Integer valor){
		this.valor = valor;
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
