package lista1Q8;

public class ListaImpl {

	public No header;
	public int tamanho = 0;
	
	public PontuacaoJogador add(PontuacaoJogador pontuacao){
		No novoNo = new No(pontuacao, null, null);
		
		if( tamanho ==0 ){
			header = novoNo;
		}else{
			No cauda = getCauda();
			novoNo.setAnterior(cauda);
			cauda.setProximo(novoNo);
		}
		tamanho++;
		ordena();
		
		return pontuacao;
	}
	
	public void ordena(){
		No atual = header, prox;
		int j;
		for(int i=0;i<tamanho-1;i++){
			prox = atual.getProximo();
			j = i+1;
			while(j<tamanho){
				if(atual.getPontuacao().getPontuacao() > prox.getPontuacao().getPontuacao()){
					PontuacaoJogador aux = prox.getPontuacao();
					prox.setPontuacao(atual.getPontuacao());
					atual.setPontuacao(aux);
				}
				prox = prox.getProximo();
				j++;
			}
			
			atual = atual.getProximo();
		}
	}
	
	public PontuacaoJogador remove(){
		No noRemovido = header;
		
		header = header.getProximo();
		header.setAnterior(null);
		
		tamanho--;
		
		return noRemovido.getPontuacao();
	}
	
	public No getCauda(){
		No cauda = header;
		while(cauda.getProximo() != null){
			cauda = cauda.getProximo();
		}
		
		return cauda;
	}
	
	public void imprime(){
		No aux = header;
		System.out.println("\nIMPRESSÃO DA LISTA");
		for(int i=0; i<tamanho; i++){
			System.out.println("[ "+aux.getPontuacao().getNome()+" | "+aux.getPontuacao().getPontuacao()+" ]");
			aux = aux.getProximo();
		}
	}
			
}
