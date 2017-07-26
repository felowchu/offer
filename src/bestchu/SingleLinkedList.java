package bestchu;

import java.util.Iterator;
import java.util.NoSuchElementException;


public class SingleLinkedList<E> implements Iterable<E>{
	private Node<E> first;
	private int size = 0;
	
	public SingleLinkedList(){
		this.first = null;
	}
	
	//�ж������Ƿ�Ϊ��
	public boolean isEmpty(){
		return first == null;
	}
	
	//��ȡ����Ĵ�С
	public int size(){
		return size;
	}
	
	//������Ŀ�ͷ����һ��Ԫ��
	public void addToFirst(E e){
		Node<E> f = new Node<>(e,first);
		first = f;
		size++;
	}
	
	//������Ľ�β����һ��Ԫ��
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
	
	//����ڵ�
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
	
	//ɾ���ڵ�,ɾ����һ���ڵ�
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
	
	//��ȡָ��Ԫ�ص�һ�γ��ֵ�λ��
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
	
	//��ȡָ��λ�õ�Ԫ��
	public E elmentAt(int index){
		if(index > size || index < 0)
			throw new NoSuchElementException();
		Node<E> x = first;
		for(int i = 0; i < index; i++)
			x = x.next;
		return x.item;
	}
	
	//�޸�ָ��λ�õ�Ԫ��
	public void set(int index, E e){
		if(index > size || index < 0)
			throw new NoSuchElementException();
		Node<E> x = first;
		for(int i = 0; i < index; i++)
			x = x.next;
		x.item = e;
	}
	//�������Ԫ��
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
	
	//�����������Ԫ��
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
	//�ڲ��ڵ�
	private static class Node<E>{
		private E item;
		private Node<E> next;
		Node(E element, Node<E> next){
			this.item = element;
			this.next = next;
		}
	}
}
