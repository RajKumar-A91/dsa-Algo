package com.dsa.linkedList.Implementations;
import java.util.*;
import java.lang.*;
import java.io.*;

class Cll{
	int data;
	Cll head;
	Cll next;
	int size;
	Cll tail;
	public Cll() {}
	public Cll(int data) {
		this.data=data;
		this.size=0;
		this.next=null;
	}
	public void addFirst(int data) {
		Cll newNode=new Cll(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
			tail.next=head;
			head.next=tail;
			return ;
		}
		tail.next=newNode;
		newNode.next=head;
		head=newNode;
	}
	public void addLast(int data) {
		Cll newNode=new Cll(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
			tail.next=head;
			head.next=tail;
			return ;
		}
		newNode.next=head;
		tail.next=newNode;
		tail=newNode;
	}
	public void display() {
		if(head==null) {
			System.out.println("The List is empty");
			return;
		}
		System.out.println("head:"+head.data);
		System.out.println("tail:"+tail.data);
		Cll currNode=head;
		while(currNode.next!=head) {
			System.out.print(currNode.data+"-->");
			currNode=currNode.next;
		}
		System.out.println(currNode.data);
	}
	public void deleteFirst() {
		if(head==null) {
			System.out.println("The List is empty");
			return ;
		}
		tail.next=head.next;
		head=head.next;
	}
	public void deleteLast() {
		if(head==null) {
			System.out.println("the List is empty");
			return ;
		}
		Cll currNode=head;
		while(currNode.next!=tail) {
			currNode=currNode.next;
		}
		currNode.next=head;
		tail=currNode;
	}
	public void delete(int data) {
		if(head==null) {
			System.out.println("the List is empty");
			return ;
		}
		if(head.data==data) {
			tail.next=head.next;
			head=head.next;
			return;
		}
		
	}
}
public class CircularLL {
	public static void main(String args[]) {
		Cll list=new Cll() {};
		list.addFirst(565);
		list.addFirst(26);
		list.addFirst(99);
		list.addLast(79);
		list.addFirst(97);
		list.addLast(10);
		list.display();
		list.deleteFirst();
		list.display();
		list.deleteLast();
		list.display();
	}
}
