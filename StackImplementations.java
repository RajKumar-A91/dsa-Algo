package com.dsa.stackAndQueueImplementation;
import java.util.*;
import java.io.*;
import java.lang.*;

class StackImpl{
	int data;
	StackImpl top;
	StackImpl next;
	StackImpl bottom;
	int size;
	public StackImpl() {}
	public StackImpl(int data) {
		this.data=data;
		this.next=null;
	}
	public int push(int data) {
		StackImpl newNode=new StackImpl(data);
		if(top==null) {
			top=newNode;
			bottom=top;
			top.next=bottom;
			return newNode.data;
		}
		newNode.next=top;
		top=newNode;
		return top.data;
	}
	public int pop() {
		if(top==null) {
			System.out.println("The Stack is empty");
			return 0;
		}
	    int data=top.data;
	    top=top.next;
	    return data;
		
	}
	public void show() {
		if(top==null) {
			System.out.println("The stack is empty");
		}
		StackImpl currNode=top;
		System.out.println("top:"+top.data+"\n"+"bottom:"+bottom.data);
		while(currNode!=bottom) {
			System.out.print(currNode.data+"->");
			currNode=currNode.next;
		}
		System.out.println(currNode.data);
	}
	
}
public class StackImplementations {
	
	public static void main(String args[]) {
		StackImpl stack=new StackImpl();
		stack.push(565);
		stack.push(97);
		stack.push(79);
		stack.push(9);
		stack.push(7);
		stack.show();
		stack.pop();
		stack.show();
		
	}
	

}
