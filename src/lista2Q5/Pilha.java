package lista2Q5;

public class Pilha {

	public No header;
	public int tamanho = 0;
	public Fila fila1 = new Fila();
	public Fila fila2 = new Fila();

	public Integer add(Integer valor) {
		No novoNo = new No(valor, null);
		if (pilhaVazia()) {
			header = novoNo;
		} else {
			novoNo.setProximo(header);
			header = novoNo;
		}
		tamanho++;
		return valor;
	}
	
	
	public void gerarFilas(){
		No aux = header;
		for(int i=0; i<tamanho; i++){
			if(aux.getValor()%2 == 0){
				fila1.add(aux.getValor());
			}else{
				fila2.add(aux.getValor());
			}
			
			aux = aux.getProximo();
		}
	}

	public void imprimir() {
		if (pilhaVazia()) {
			System.out.println("A pilha está vazia, não há elementos para imprimir");
			return;
		}

		No aux = header;
		while (aux.getProximo() != null) {
			System.out.println("(" + aux.getValor() + ")");
			aux=aux.getProximo();
		}
		System.out.println("(" + aux.getValor() + ")");
	}

	public boolean pilhaVazia() {
		return tamanho == 0;
	}

}
