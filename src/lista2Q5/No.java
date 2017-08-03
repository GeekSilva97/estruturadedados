package lista2Q5;

public class No {

	private No proximo;
	private Integer valor;
	
	public No(Integer valor, No proximo){
		this.valor=valor;
		this.proximo=proximo;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}
	
	
	
}
