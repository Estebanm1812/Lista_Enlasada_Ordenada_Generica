package model;

public class Tema<T extends Number> {

	T number;
	
	Tema<T> next;
	
	
	public Tema(T number) {
		this.number = number;
		next = null;
	}
	
	public T getNumber() {
		return number;
	}
	public Tema<T> getNext() {
		return next;
	}
	public void setNumber(T number) {
		this.number = number;
	}
	public void setNext(Tema<T> next) {
		this.next = next;
	}
	
	
}
