package edu.nvcc.pos;

//import edu.nvcc.utils.LinkedListNode;

public class ItemNode<T> {
	T element;
	ItemNode<T> link;
	
	public ItemNode(T element) {
		super();
		this.element = element;
		this.link = null;
	}
	
	public ItemNode(T element, ItemNode<T> link) {
		super();
		this.element = element;
		this.link = link;
	}
	public T getElement() {
		return element;
	}
	public void setElement(T element) {
		this.element = element;
	}
	public ItemNode<T> getLink() {
		return link;
	}
	public void setLink(ItemNode<T> link) {
		this.link = link;
	}
}
