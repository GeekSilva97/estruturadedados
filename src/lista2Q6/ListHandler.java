package lista2Q6;

public class ListHandler {

	private int[] collection;
	
	
	public int[] reverse(int[] v){
		int aux;
		int tamanho = v.length;
		this.collection = v;
		
		float loops = Float.parseFloat( Math.ceil( tamanho/(float) 2 )+"" );
		
		for(int i=0; i<loops;i++){
			System.out.println("Troca "+collection[i]+", com "+collection[(tamanho-1)-i]);
		}
		
		return null;
	}
	
	public void show(int[] v){
		for(int i=0; i<v.length; i++){
			System.out.println("["+i+"] : "+v[i]);
		}
	}
	
}
