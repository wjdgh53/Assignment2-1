package edu.nvcc.pos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import edu.nvcc.pos.LinkedListInterface;
import edu.nvcc.pos.CategoryNode;


public class CategoryList<T> implements LinkedListInterface<T>
{

	private CategoryNode<T> list;
	//private edu.nvcc.utils.LinkedListNode previous;
	//private Object current;
	public CategoryList() 
	{
		list = null;
	}
	
	@Override
	public void add(T element) 
	{
		// add first element
		CategoryNode<T> newNode = new CategoryNode<T>(element,list);
		list = newNode;
	}

	@Override
	public void remove(String element)
	{
		CategoryNode<T> current = list;
		CategoryNode<T> previous = list;
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
		CategoryNode<T> current = list;
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
		CategoryNode<T> temp;
		temp = list;
		while(temp!=null) {
			out += temp.getElement() + "\n";
			temp = temp.getLink();
		}
		return out;
	}
	public int size(){
		int size = 0;
		CategoryNode<T> current = list;
		while (current != null) {
			
			current = current.getLink();
			size++;
		}
		return size;
		
	}
	public T showlist(int index){
		CategoryNode<T> current = list;	

		for(int i = 0; i < index; i++){
			current = current.getLink();
		}
		return current.getElement();				
	}
	public T search(String element) {
		
		CategoryNode<T> current = list;
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