package edu.nvcc.utils;

//import LinkedListNode;

public class LinkedList<T> implements LinkedListInterface<T>
{

	private LinkedListNode<T> list;
	//private edu.nvcc.utils.LinkedListNode previous;
	//private Object current;
	public LinkedList() 
	{
		list = null;
	}
	
	@Override
	public void add(T element) 
	{
		// add first element
		LinkedListNode newNode = new LinkedListNode(element,list);
		list = newNode;
	}

	@Override
	public void remove(T element)
	{
		LinkedListNode<T> current = list;
		LinkedListNode<T> previous = list;
		boolean found = false;		
		while (!found && current !=null) 
		{
			if (current.getElement().equals(element))
			{
				if (current == list) 
				{
					list = list.getLink();
					found = true;
					//size--;
				}else {
					/*if (current == this.previous)
					{
						this.previous =previous;
					}else if (this.current ==current) {
						this.current =previous;
					}*/
					previous.setLink(current.getLink());
					found = true;
					//size--;
				}
			}else{
				previous = current;
				current = current.getLink();
			}
		}

	}
	public T pop(){
		T temp = list.getElement();
		list = list.getLink();
		return temp;
		
	}
	public boolean contains(T element) {
		LinkedListNode<T> current = list;
		if (!isEmpty()) {
			while (current != null) {
				if (current.getElement().equals(element))
					return true;
				current = current.getLink();
			}
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		if (list == null)
			return true;
		else
			return false;
	}

	public String toString() {
		String out="";
		LinkedListNode<T> temp;
		temp = list;
		while(temp!=null) {
			out += temp.getElement() + "\n";
			temp = temp.getLink();
		}
		return out;
	}

}
