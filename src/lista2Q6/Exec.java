package lista2Q6;

public class Exec {

	public static void main(String[] args) {
		
		int[] lista = new int[8];
		lista[0] = 1;
		lista[1] = 4;
		lista[2] = 8;
		lista[3] = 11;
		lista[4] = 20;
		lista[5] = 18;
		lista[6] = -1;
		lista[7] = -18;
		
		ListHandler lh = new ListHandler();
//		lh.show(lista);
		lh.show(lh.reverse(lista));
		
	
	}
	
}
