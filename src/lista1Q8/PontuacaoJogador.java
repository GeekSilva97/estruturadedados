package lista1Q8;

public class PontuacaoJogador {

	private String nome;
	private int pontuacao;
	
	public PontuacaoJogador(String nome, int pontuacao){
		this.nome = nome;
		this.pontuacao = pontuacao;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getPontuacao() {
		return pontuacao;
	}
	
	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}
	
	
	
}
