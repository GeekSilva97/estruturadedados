package br.edu.ifce.listagenerica;

public interface Lista<E> {

	
	/* Operações básicas */
	public abstract E set(int pos, E e);
	
	public abstract void addPrimeiro(E e);
	public abstract void addUtimo(E e);
	
	public abstract void addAntes(int pos, E e);
	public abstract void addApos(int pos, E e);
	
	
	/*Operações auxiliares*/
	public abstract E first();
	public abstract E last();
	
	public abstract E anterior(int pos);
	public abstract E posterior(int pos);
	
}
