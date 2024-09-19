package Genaric;
// T -> data type
public class GenericClass<T> {
	T data;
	void set(T data) {
		this.data = data;
	}
	
	T get() {
		return this.data;
	}
}
