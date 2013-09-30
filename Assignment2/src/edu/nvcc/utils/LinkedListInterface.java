package edu.nvcc.utils;

public interface LinkedListInterface<T> {
	public void add(T element);
	public void remove(T elememt);
	public T pop();
	public boolean contains(T element);
	public boolean isEmpty();	
}
