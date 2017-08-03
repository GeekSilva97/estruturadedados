package br.edu.ifce.pilha;

public class PilhaImpl implements PIlha {

	private static final int MAX = 5;
	public Integer pilha[];
	public Integer pos = 0;
	
	
	public PilhaImpl() {
		pilha = new Integer[MAX];
	}
	
	@Override
	public Integer adicionar(Integer valor) {
		// verifica se a pilha esta cheia
		if(pilhaCheia()){
			return null;
		}
		pilha[pos++] = valor;
		
		return valor;
	}

	@Override
	public Integer remover() {
		// verifica se a pilha esta vazia
		if(pilhaVazia()){
			return null;
		}
		
		Integer valor = pilha[--pos];
		pilha[pos] = null;
		
		return valor;
	}

	@Override
	public boolean pilhaVazia() {
		
		if(pos == 0){
			System.out.println("Pilha vazia");
			return true;
		}
		
		return false;
	}

	@Override
	public boolean pilhaCheia() {

		if(pos == MAX){
			System.out.println("Pilha cheia");
			return true;
		}
		
		return false;
	}
	
	
	public void imprimePilha(){
		System.out.println("--------------------- IMPRIMINDO PILHA --------------------------");
		for (int i = 0; i < pos; i++) {
			System.out.println("Elemento ["+ i +"] = "+pilha[i]);
		}
	}

}
