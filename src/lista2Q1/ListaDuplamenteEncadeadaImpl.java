package lista2Q1;

public class ListaDuplamenteEncadeadaImpl implements ListaDuplamenteEncadeada {

	protected int tamanho = 0;
	public No header;
	
	@Override
	public Integer addOrdenado(Integer valor) {
		
		No newNo = new No(valor, null, null);
		if(isEmpty()){
			header = newNo;
		}else{
			No last = getCauda();
			newNo.setAnterior(last);
			last.setProximo(newNo);
		}
		tamanho++;
		ordena();
		return valor;
	}

	@Override
	public void ordena() {
		
		No atual = header,prox;
		int j;
		for(int i=0; i<tamanho-1;i++){
			prox = atual.getProximo();
			j=i+1;
			while(j < tamanho){
				if(atual.getValor() > prox.getValor()){
					Integer valor = prox.getValor();
					prox.setValor(atual.getValor());
					atual.setValor(valor);
				}
				
				prox = prox.getProximo();
				j++;
			}
			
			atual = atual.getProximo();
		}

	}
	
	public No getCauda(){
		if(isEmpty()){ return null; }
		
		No cauda = header;
		while(cauda.getProximo() != null){
			cauda = cauda.getProximo();
		}
		
		return cauda;
	}
	
	
	public boolean isEmpty(){
		return tamanho == 0;
	}
	
	public int getSize(){
		return tamanho;
	}
	
	public void show(){
		No aux = header;
		for(int i=0; i<tamanho; i++){
			System.out.println("Elemento ["+i+"] -> "+aux.getValor());
			aux = aux.getProximo();
		}
	}

}
