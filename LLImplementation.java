package com.dsa.linkedList.Implementations;
import java.lang.*;
import java.io.*;
import java.util.*;
class LL{
	int size;
	LL head;
	int value;
	LL next;
	public LL() {
		size=0;
	}
	public LL(int value) {
		this.value=value;
		next=null;
	}
	public void addFirst(int value) {
		size++;
		LL newNode=new LL(value);
		if(head==null) {
			head=newNode;
			return ;
		}
		newNode.next=head;
		head=newNode;
	}
	public void addLast(int value) {
		size++;
		LL newNode =new LL(value);
		if(head==null) {
			head=newNode;
			return ;
		}
		LL currentNode=head;
		while(currentNode.next!=null) {
			currentNode=currentNode.next;
		}
		currentNode.next=newNode;
	}
	
	public void display() {
		if(head==null) {
			System.out.println("LinkedList is Empty");
			return ;
		}
		LL currNode=head;
		while(currNode!=null) {
			System.out.print(currNode.value+"-->");
			currNode=currNode.next;
		}
		System.out.print("null");
		System.out.println();
	}
    public void delete() {
    	size--;
    	if(head==null) {
    		System.out.println("List is empty");
    		return ;
    	}
    	head=head.next;
    }
    public void deleteLast() {
    	size--;
    	if(head==null) {
    		System.out.println("List is Empty");
    		return ;
    	}
    	if(head.next==null) {
    		head=null;
    		return ;
    	}
    	LL secondLast=head;
    	LL lastNode=head.next;
    	while(lastNode.next!=null) {
    		lastNode=lastNode.next;
    		secondLast=secondLast.next;
    	}
    	secondLast.next=null;
    }
}
public class LLImplementation {
	
	public static void main(String args[]) {
		LL list=new LL();
		System.out.println(list.size);
		list.addFirst(565);
		System.out.println(list.size);
		list.addLast(9);
		System.out.println(list.size);
		list.addFirst(1);
		System.out.println(list.size);
		list.addLast(2000);
		System.out.println(list.size);
		list.display();
		list.delete();
		System.out.println(list.size);
		list.display();
		list.deleteLast();
		System.out.println(list.size);
		list.display();
		
	}

}
