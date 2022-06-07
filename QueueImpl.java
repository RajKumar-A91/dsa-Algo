package com.dsa.stackAndQueueImplementation;
import java.util.*;
import java.io.*;
import java.lang.*;
class Queue{
	int data;
	Queue front;
	Queue rear;
	Queue next;
	int size;
	public Queue() {}
	public Queue(int data) {
		this.data=data;
		this.size=0;
		this.next=null;
	}
	public void add(int data) {
		Queue newNode=new Queue(data);
		if(front==null) {
			front=newNode;
			rear=newNode;
			front.next=rear;
			rear.next=null;
			return ;
		}
		rear.next=newNode;
		rear=newNode;
	}
	public void peek() {
		if(front==null) {
			System.out.println("the Queue is empty");
			return ;
		}
		System.out.println(front.data);
	}
	public void delete() {
		if(front==null) {
			System.out.println("the queue is empty");
			return ;
		}
		
		front=front.next;
		
	}
}
public class QueueImpl {
	
	public static void main(String args[]) {
		Queue queue=new Queue();
		queue.add(565);
		queue.add(97);
		queue.add(79);
		queue.add(9);
		queue.add(7);
		queue.peek();
		queue.delete();
		queue.peek();
		queue.add(13);
		queue.add(10);
		queue.delete();
		queue.peek();
	}
	
}
