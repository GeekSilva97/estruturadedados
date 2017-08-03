package lista2Q1;

public class No {

	private No anterior, proximo;
	private Integer valor;
	
	public No(Integer valor, No anterior, No proximo){
		this.valor = valor;
		this.anterior = anterior;
		this.proximo = proximo;
	}
	
	public No getAnterior() {
		return anterior;
	}
	public void setAnterior(No anterior) {
		this.anterior = anterior;
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
