package lista2Q2;


public class Exec {

	public static boolean equalsLists(ListaDEncadeada l1, ListaDEncadeada l2){
		
		if(l1.length == l2.length){
			No n1 = l1.header, n2 = l2.header;
			boolean ret=true;
			for(int i=0; i<l1.length; i++){
				if(n1.getValue() != n2.getValue()){
					ret = false;
					break;
				}
			}
			return ret;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		ListaDEncadeada l1 = new ListaDEncadeada();
		ListaDEncadeada l2 = new ListaDEncadeada();
		
		l1.add(10);
		l2.add(10);
		l2.add(5);
		l1.add(5);
		
		
		boolean equals = equalsLists(l1, l2);
		if(equals){
			System.out.println("As listas são iguais");
		}else{
			System.out.println("As listas são diferentes");
		}
	}
	
	
}
