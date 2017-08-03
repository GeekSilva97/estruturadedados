package lista2Q5;

public class Fila {

	public No header;
	public int tamanho = 0;
	
	public Integer add(Integer valor){
		No novoNo = new No(valor, null);
		if(filaVazia()){
			header = novoNo;
		}else{
			No cauda = getCauda();
			cauda.setProximo(novoNo);
		}
		
		tamanho++;
		return valor;
	}
	
	public No getCauda(){
		No cauda = header;
		while(cauda.getProximo() != null){
			cauda = cauda.getProximo();
		}
		return cauda;
	}
	
	public boolean filaVazia(){
		return tamanho == 0;
	}
	
	public void imprimir(){
		
		if(filaVazia()){
			System.out.println("A fila está vazia\n");
			return;
		}
		
		No aux= header;
		for(int i =0;i<tamanho;i++){
			System.out.println("["+i+"] : "+aux.getValor());
			aux = aux.getProximo();
		}
	}
	
}
