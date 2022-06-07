package com.dsa.stackAndQueueImplementation;
import java.io.*;
import java.util.*;
public class CustomQueue {
	protected int data[];
	private static final int DEFAULT_SIZE=10;
	int end=-1;
	public CustomQueue() {
		this(DEFAULT_SIZE);
	}
	public CustomQueue(int size) {
		data=new int[size];
	}
	public boolean isFull() {
		return end==data.length-1;
	}
	public boolean isEmpty() {
		return end==-1;
	}
	public boolean insert(int item) {
		if(isFull()) {
			return false;
		}
		end++;
		data[end]=item;
		return true;
	}
	public int remove() throws Exception{
		if(isEmpty()) {
			throw new Exception("The Queue is Empty");
		}
		int removed=data[0];
		for(int i=0;i<data.length-1;i++) {
			data[i]=data[i+1];
		}
		data[end--]=0;
		return removed;
	}
	public int front() throws Exception{
		if(isEmpty()) {
			throw new Exception("The Queue is Empty");
		}
		return data[0];
	}
	public void disply() {
		for(int i=0;i<=end;i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println("End");
	}
	public static void main(String args[])throws Exception {
		CustomQueue queue=new CustomQueue(5);
		queue.insert(9);
		queue.insert(7);
		queue.insert(1);
		queue.insert(6);
		queue.insert(2000);
		System.out.println(queue.front());
		queue.disply();
		queue.remove();
		System.out.println(queue.front());
		queue.disply();
	}

}
