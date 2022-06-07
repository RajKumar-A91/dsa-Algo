package com.dsa.stackAndQueueImplementation;
import java.util.*;
import java.io.*;

class CircularQueue{
	protected int data[];
	private static final int DEFAULT_SIZE=10;
	protected int end=0;
	protected int front=0;
	int size=0;
	public CircularQueue() {
		this(DEFAULT_SIZE);
	}
	public CircularQueue(int size) {
		data=new int[size];
	}
	public boolean isFull() {
		return size==data.length;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public boolean insert(int item) {
		if(isFull()) {
			return false;
		}
		data[end++]=item;
		end=end%data.length;
		size++;
		return true;
	}
	public int remove() throws Exception{
		if(isEmpty()) {
			throw new Exception("The Queue is Empty");
		}
		int removed=data[front++];
		front=front%data.length;
		size--;
		return removed;
	}
	public int front() throws Exception{
		if(isEmpty()) {
			throw new Exception("The Queue is Empty");
		}
		return data[front];
	}
	public void display() throws Exception{
		if(isEmpty()) {
			throw new Exception("The Queue is Empty");
		}
		int i=front;
		do {
			System.out.print(data[i]+" ");
			i++;
			i%=data.length;
		}while(i!=end);
		System.out.println("End");
	}
}
public class CircularQueueUsingArray {
	
	public static void main(String args[])throws Exception {
		CircularQueue queue=new CircularQueue(5);
		queue.insert(9);
		queue.insert(7);
		queue.insert(1);
		queue.insert(6);
		queue.insert(2000);
		System.out.println(queue.front());
		queue.display();
		queue.remove();
		System.out.println(queue.front());
		queue.display();
		queue.insert(9);
		queue.display();
	}

}
