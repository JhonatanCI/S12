package model;

public class Turn {
	Turn next;
	Turn prev;
	int value;
	int passed;
	
	public Turn() {
		passed=0;
	}

	public int getPassed() {
		return passed;
	}

	public void setPassed(int passed) {
		this.passed = passed;
	}

	public Turn getNext() {
		return next;
	}

	public void setNext(Turn next) {
		this.next = next;
	}

	public Turn getPrev() {
		return prev;
	}

	public void setPrev(Turn prev) {
		this.prev = prev;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
