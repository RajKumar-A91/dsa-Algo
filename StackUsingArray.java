package com.dsa.stackAndQueueImplementation;
import java.util.*;
import java.lang.*;
import java.io.*;
class CustomStack{
	protected int data[];
	private static final int DEFAULT_SIZE=10;
	int ptr=-1;
	public CustomStack() {
		this(DEFAULT_SIZE);
	}
	public CustomStack(int size) {
		this.data=new int[size];
	}
	public boolean push(int item) {
		if(isFull()) {
			System.out.println("The stack is full!!");
			return false;
		}
		ptr++;
		data[ptr]=item;
		return true;
	}
	public int peek() throws StackException {
		if(isEmpty()) {
			throw new StackException("The stack is empty, Cannot peek!!");
		}
		return data[ptr];
	}
	public boolean isFull() {
		if(ptr==data.length-1) {
			return true;
		}
		return false;
	}
	public boolean isEmpty() {
		if(ptr==-1) 
			return true;
		return false;
	}
	public int pop() throws StackException{
		if(isEmpty()) {
			throw new StackException("The Stack is empty, Cannot pop");
		}
//		int removed=data[ptr];
//		ptr--;
//		return removed;
		return data[ptr--];
	}
}
public class StackUsingArray {
	
	public static void main(String args[]) throws StackException {
		CustomStack stack=new CustomStack(5);
//		System.out.println(stack.peek());
//		System.out.println(stack.pop());
		stack.push(9);
		stack.push(7);
		stack.push(1);
		stack.push(6);
		stack.push(2000);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
