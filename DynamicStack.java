package com.dsa.stackAndQueueImplementation;
import java.io.*;
import java.util.*;
public class DynamicStack extends CustomStack{
	
	public DynamicStack() {
		super();
	}
	public DynamicStack(int size) {
		super(size);
	}
	@Override
	public boolean push(int item) {
		if(this.isFull()) {
			//double the array size;
			int temp[]=new int[(data.length-1)*2];
			//copy all previous data in new array;
			for(int i=0;i<data.length;i++) {
				temp[i]=data[i];
			}
			data=temp;
		}
		//we made the size of the data array double so we can now 
		//normally add item to array data
		//insert item
		return super.push(item);
	}
	public static void main(String args[])throws StackException {
		DynamicStack stack=new DynamicStack(5);
		stack.push(9);
		stack.push(7);
		stack.push(1);
		stack.push(6);
		stack.push(2000);
		System.out.println(stack.peek());
		stack.push(97);
		System.out.println(stack.peek());
		
	}
}
