package dataStructure.chapter4.section4;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class KWLinkedList<E> {
	
	private Node<E> head = null;
	private Node<E> tail = null;
	private int size = 0;
	
	private static class Node<T> {
		public T data;
		public Node<T> next = null;
		public Node<T> prev = null;
		
		public Node(T item) {
			data = item;
		}
	}
	
	public Iterator<E> iterator(){
		return new KWListIterator(0);
	}
	
	public ListIterator<E> listIterator(){
		return new KWListIterator(0);
	}
	
	public ListIterator<E> listIterator(int index){
		return new KWListIterator(index);
	}
	
	
	private class KWListIterator implements ListIterator<E> {
		// data member and constructor
		
		private Node<E> nextItem; // refer the next node
		private Node<E> lastItemReturned; 
		private int index;
		
		public KWListIterator(int i) {
			if (i < 0 || i > size)
				throw new IndexOutOfBoundsException("Invalid index " + i);
			
			lastItemReturned = null;
			if(i == size) {
				index = size;
				nextItem = null;
			}else {
				nextItem = head;
				for(index = 0; index<i; i++) {
					nextItem = nextItem.next;
				}
			}
				
		}
		
		@Override
		public boolean hasNext() {
			return nextItem != null;
		}

		@Override
		public E next() {
			if(!hasNext())
				throw new NoSuchElementException();
			
			lastItemReturned = nextItem;
			nextItem = nextItem.next;
			index++;
			
			return lastItemReturned.data;
		}

		@Override
		public boolean hasPrevious() {
			return (nextItem == null && size!=0) || nextItem.prev != null;
		}

		@Override
		public E previous() {
			if(!hasPrevious())
				throw new NoSuchElementException();
			
			if(nextItem == null)
				nextItem = tail;
			else
				nextItem = nextItem.prev;
			lastItemReturned = nextItem;
			index--;
			return lastItemReturned.data;
		}

		@Override
		public int nextIndex() {
			return index;
		}

		@Override
		public int previousIndex() {
			return index-1;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void set(E e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void add(E e) {
			if(head == null) { //empty list
				head = new Node<E>(e);
				tail = head;
			}else if(nextItem == head) { // at the head
				Node<E> newNode = new Node<E>(e);
				newNode.next = nextItem;
				nextItem.prev = newNode;
				head = newNode;
			}else if(nextItem == null) { // at the tail
				Node<E> newNode = new Node<E>(e);
				tail.next = newNode;
				newNode.prev = tail;
				tail = newNode;
			}else {
				Node<E> newNode = new Node<E>(e);
				newNode.prev = nextItem.prev;
				nextItem.prev.next = newNode;
				newNode.next = nextItem;
				nextItem.prev = newNode;
			}
			size++;
			index++;
		}
		
	}
	
	public int indexOf(E item) {
		return 0;
	}
	
	public void add(int index, E item) {
		
	}
	
	public E get(int index) {
		return null;
	}
	
	
}
