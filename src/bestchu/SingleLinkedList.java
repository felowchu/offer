package bestchu;

import java.util.Iterator;
import java.util.NoSuchElementException;


public class SingleLinkedList<E> implements Iterable<E>{
	private Node<E> first;
	private int size = 0;
	
	public SingleLinkedList(){
		this.first = null;
	}
	
	//判断链表是否为空
	public boolean isEmpty(){
		return first == null;
	}
	
	//获取链表的大小
	public int size(){
		return size;
	}
	
	//在链表的开头增加一个元素
	public void addToFirst(E e){
		Node<E> f = new Node<>(e,first);
		first = f;
		size++;
	}
	
	//在链表的结尾增加一个元素
	public void addToLast(E e){
		Node<E> newNode = new Node<>(e,null);
		if(first == null){
			first = newNode; 
		}
		else{
			Node<E> pNode = first;
			while(pNode.next != null){
				pNode = pNode.next;
			}
			pNode.next = newNode;
		}
		size++;
	}
	
	//插入节点
	public void insert(int index, E e){
		if(index > size || index < 0)
			throw new NoSuchElementException();
		Node<E> x = first;
		for(int i = 0; i < index; i++)
			x = x.next;
		Node<E> newNode = new Node<>(e,x.next);
		x.next = newNode;
		size++;
	}
	
	//删除节点,删除第一个节点
	public void remove(E e){
		if(first == null) return;
		if(first.item == e){
			first = first.next;
		}
		else{
			Node<E> x = first;
			while(x.next !=null && x.next.item != e  )
				x = x.next;
			if(x.next != null && x.next.item == e){
				x.next = x.next.next;
			}
		}
		size--;
	}
	
	//获取指定元素第一次出现的位置
	public int indexOf(E e){
		int index = 0;
		if(e == null){
			for(Node<E> x = first; x != null; x = x.next)
				if(x.item == null)
					return index;
				index++;
		}else{
			for(Node<E> x = first; x != null; x = x.next)
				if(x.item == e)
					return index;
				index++;
		}
		return -1;
	}
	
	//获取指定位置的元素
	public E elmentAt(int index){
		if(index > size || index < 0)
			throw new NoSuchElementException();
		Node<E> x = first;
		for(int i = 0; i < index; i++)
			x = x.next;
		return x.item;
	}
	
	//修改指定位置的元素
	public void set(int index, E e){
		if(index > size || index < 0)
			throw new NoSuchElementException();
		Node<E> x = first;
		for(int i = 0; i < index; i++)
			x = x.next;
		x.item = e;
	}
	//清空所有元素
	public void clear(){
		for(Node<E> x = first; x != null;){
			Node<E> next = x.next;
			x.item = null;
			x.next = null;
			x = next;
		}
		first = null;
		size = 0;
	}
	
	//输出链表所有元素
	public Iterator<E> iterator(){
		return new ListIterator<E>(first);
	}
	
	@SuppressWarnings("hiding")
	private class ListIterator<E> implements Iterator<E>{
		private Node<E> current;
		public ListIterator(Node<E> first){
			this.current = first;
		}
		public boolean hasNext() {
			return isEmpty();
		}

		public E next() {
			if(!hasNext()) throw new NoSuchElementException();
			E e = current.item;
			current = current.next;
			return e;
		}
		
		public void remove(){
			throw new UnsupportedOperationException();
		}
	}
	//内部节点
	private static class Node<E>{
		private E item;
		private Node<E> next;
		Node(E element, Node<E> next){
			this.item = element;
			this.next = next;
		}
	}
}
