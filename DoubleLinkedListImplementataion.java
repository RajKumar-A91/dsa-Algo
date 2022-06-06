package com.dsa.linkedList.Implementations;
import java.util.*;
import java.io.*;
import java.lang.*;
class DLL{
	DLL head;
	DLL tail;
	int data;
	DLL previous;
	DLL next;
	int size;
	public DLL() {}
	public DLL(int data) {
		this.data=data;
		this.size=0;
	}
	public void addFirst(int data) {
		size++;
		DLL newNode=new DLL(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
			head.next=null;
			head.previous=null;
			tail.next=null;
			return ;
		}
		newNode.next=head;
		head.previous=newNode;
		head=newNode;
		head.previous=null;
	}
//	/*This is using with tail*/
	public void addLast(int data) {
		size++;
		DLL newNode=new DLL(data);
		if(tail==null) {
			System.out.println("Empty");
			return ;
		}
		newNode.previous=tail;
		tail.next=newNode;
		tail=newNode;
		tail.next=null;
	}
//	public void addLast(int data) {
//		DLL newNode=new DLL(data);
//		if(head==null) {
//			head=newNode;
//			head.next=null;
//			head.previous=null;
//			return ;
//		}
//		DLL currNode=head;
//		while(currNode.next!=null) {
//			currNode=currNode.next;
//		}
//		currNode.next=newNode;
//		newNode.previous=currNode;
//		newNode.next=null;
//	}
	public void disply() {
		if(head==null) {
			System.out.println("empty");
			return ;
		}
		DLL currNode=head;
		while(currNode!=null) {
			System.out.print(currNode.data+"-->");
			currNode=currNode.next;
		}
		System.out.print("end");
		System.out.println();
	    currNode=tail;
	    
	    while(currNode!=null) {
	    	System.out.print(currNode.data+"-->");
	    	currNode=currNode.previous;
	    }
	    System.out.println("start");
	    System.out.println("\nthe size of this double linked list is:"+size);
	}
}
public class DoubleLinkedListImplementataion {
	
	
	
	public static void main(String args[]) {
		DLL list=new DLL();
		list.addFirst(45);
		list.addFirst(6565);
		list.addFirst(7676);
		list.addFirst(7878);
		list.addLast(565);
		list.addLast(0);
		list.addLast(97);
		list.disply();
	}

}
