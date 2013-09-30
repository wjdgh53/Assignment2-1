package edu.nvcc.pos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import edu.nvcc.pos.LinkedListInterface;
import edu.nvcc.pos.ItemNode;

public class ItemList<T> implements LinkedListInterface<T>
{

	private ItemNode<T> list;
	//private edu.nvcc.utils.LinkedListNode previous;
	//private Object current;
	public ItemList() 
	{
		list = null;
	}
	
	@Override
	public void add(T element) 
	{
		// add first element
		ItemNode<T> newNode = new ItemNode<T>(element,list);
		list = newNode;
	}

	@Override
	public void remove(String element)
	{
		ItemNode<T> current = list;
		ItemNode<T> previous = list;
		boolean found = false;		
		while (!found && current !=null) 
		{
			if (((FoodItem) current.getElement()).getName().equals(element))
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
		ItemNode<T> current = list;
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
		ItemNode<T> temp;
		temp = list;
		while(temp!=null) {
			out += temp.getElement() + "\n";
			temp = temp.getLink();
		}
		return out;
	}

	public T search(String element) {
		
		ItemNode<T> current = list;
		if (!isEmpty()) {
			while (current != null) {
				if (((FoodItem) current.getElement()).getName().equals(element))
				{
					
					return current.getElement();
				}
				current = current.getLink();
			}
		}
		return null;
	}

}

