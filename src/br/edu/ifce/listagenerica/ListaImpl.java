package br.edu.ifce.listagenerica;


public class ListaImpl<E> implements Lista<E> {

	public E[] fila;
	public int pos = -1;
	public static final int MAX = 5;
	
	public ListaImpl() {
		fila = (E[]) new Object[MAX];
	}
	
	@Override
	public E set(int pos, E e) {
		
		if(pos > MAX-1 || pos < 0){
			System.out.println("Posição informada é inválida");
			return null;
		}
		
		fila[pos] = e;
		return e;
	}

	@Override
	public void addPrimeiro(E e) {
		
		if(listaCheia()){
			System.out.println("A lista já está cheia, não é possível adicionar elementos");
			return;
		}
		
		if(listaVazia()){
			fila[++pos] = e;
			return;
		}
	
		
		// definindo lista auxiliar
		E[] aux = (E[]) new Object[MAX];
		aux[0] = e;
		
		for(int i=0; i<=pos; i++){
			aux[i+1] = fila[i];
		}
		
		fila = aux;
		pos++;
			
	}

	@Override
	public void addUtimo(E e) {
		if(listaCheia()){
			System.out.println("A lista já está cheia, não é possível adicionar elementos");
			return;
		}
		fila[++pos]=e;
	}

	@Override
	public void addAntes(int pos, E e) {
		
		if(listaCheia()){
			System.out.println("A lista já está cheia, não é possível adicionar elementos");
			return;
		}
		
		if(pos-1 == 0){
			addPrimeiro(e);
			this.pos++;
			return;
		}
		
	
		E[] aux = (E[]) new Object[MAX];
		int counter=0;
		for(int i=0; i<=this.pos; i++){
			
			if(counter == pos-1){
				aux[counter++] = e;
				i--;
				continue;
			}
			
			aux[counter] = fila[i];
			counter++;
		}
		
		this.pos++;
		fila = aux;
	}

	@Override
	public void addApos(int pos, E e) {
		
		if(listaCheia()){
			System.out.println("A lista já está cheia, não é possível adicionar elementos");
			return;
		}
		
		E[] aux = (E[]) new Object[MAX];
		int counter = 0;
		for(int i=0; i<= this.pos; i++){
			if(counter == pos+1){
				aux[counter++] = e;
				System.out.println(e);
				i--;
				continue;
			}
			
			aux[counter] = fila[i];
			counter++;
		}
		
		this.pos++;
		fila=aux;
	}

	@Override
	public E first() {
		if(listaVazia()){
			System.out.println("A lista está vazia");
			return null;
		}
		
		return fila[0];
	}

	@Override
	public E last() {
		if(listaVazia()){
			System.out.println("A lista está vazia");
			return null;
		}
		
		return fila[pos];
	}

	@Override
	public E anterior(int pos) {
		if(listaVazia()){
			return null;
		}
		return this.fila[--pos];
	}

	@Override
	public E posterior(int pos) {
		if(listaVazia()){
			return null;
		}
		return this.fila[++pos];
	}
	
	public boolean listaVazia(){
		return pos == -1;
	}
	
	public boolean listaCheia(){
		return pos+1==MAX;
	}
	
	public void imprimir(){
		System.out.println("Imprimindo fila");
		for(int i=0; i<=pos; i++){
			System.out.println("Elemento "+i+" tem valor : "+fila[i]);
		}
		System.out.println();
	}

}
