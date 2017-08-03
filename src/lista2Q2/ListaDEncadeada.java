package lista2Q2;

public class ListaDEncadeada {

	public No header;
	public int length = 0;
	
	public Integer add(Integer value){
		No noAdd = new No(value, null, null);
		if(isEmpty()){
			header = noAdd;
		}else{
			No last = getLast();
			noAdd.setPrev(last);
			last.setNext(noAdd);
		}
		length++;
		return value;
	}
	
	private No getLast(){
		No last = header;
		while(last.getNext() != null){
			last = last.getNext();
		}
		return last;
	}
	
	public boolean isEmpty(){
		return length == 0;
	}
	
}
