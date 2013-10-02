package edu.nvcc.pos;

public interface LinkedListInterface<T> {
	public void add(T element);
	//public void remove(T elememt);
	public T pop();
	public boolean contains(T element);
	public boolean isEmpty();
	public void remove(String element);	
	public T search(String element);
	
	public T showlist(int index);
	public int size();
	
}
