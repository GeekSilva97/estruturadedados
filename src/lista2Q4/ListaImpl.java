package lista2Q4;

public class ListaImpl implements Lista {

	public final int MAX = 10;
	public Integer[] colecao = new Integer[MAX];
	public int tamanho = 0;
	
	@Override
	public Integer add(Integer valor) {
		
		if(listaCheia()){
			System.out.println("A lista está cheia, não podem ser adicionados mais elementos");
			return null;
		}
		colecao[tamanho++] = valor;
		return valor;
	}

	@Override
	public Integer remove() {
		if(listaVazia()){
			System.out.println("A lista está vazia, não há elementos a serem removidos");
			return null;
		}
		
		Integer valorRemovido = colecao[0];
		for(int i=0; i<tamanho; i++){
			colecao[i] = colecao[i+1];
		}
		
		tamanho--;
		return valorRemovido;
	}

	@Override
	public boolean listaVazia() {
		return tamanho == 0;
	}

	@Override
	public boolean listaCheia() {
		return tamanho == MAX;
	}
	
	public void troca(){
		Integer aux;
		for(int i=0; i<tamanho; i++){
			if(i%2 == 1){
				aux = colecao[i];
				if(i < MAX-1 && colecao[i+1] != null){
					colecao[i] = colecao[i+1];
					colecao[i+1] = aux;
				}
			}
			
		}
	}
	
	
	public void imprime(){
		for(int i=0; i<tamanho; i++){
			System.out.println("["+i+"] : "+colecao[i]);
		}
		System.out.println();
	}

}
