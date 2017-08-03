package lista2Q2;

public class No {

	private No next;
	private No prev;
	private Integer value;
	
	
	public No(Integer value, No next, No prev){
		this.value = value;
		this.next = next;
		this.prev = prev;
	}
	
	public No getNext() {
		return next;
	}
	public void setNext(No next) {
		this.next = next;
	}
	public No getPrev() {
		return prev;
	}
	public void setPrev(No prev) {
		this.prev = prev;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	
	
	
}

