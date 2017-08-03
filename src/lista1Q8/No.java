package lista1Q8;

public class No {

	private No proximo;
	private No anterior;
	private PontuacaoJogador pontuacao;
	
	public No(PontuacaoJogador pontuacao, No proximo, No anterior){
		this.pontuacao = pontuacao;
		this.proximo = proximo;
		this.anterior = anterior;
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
	
	public PontuacaoJogador getPontuacao() {
		return pontuacao;
	}
	
	public void setPontuacao(PontuacaoJogador pontuacao) {
		this.pontuacao = pontuacao;
	}
	
	
	
}
