package com.dsa.stackAndQueueImplementation;

public class DynamicQueue extends CircularQueue {
	
	public DynamicQueue() {
		super();
	}
	public DynamicQueue(int size) {
		super(size);
	}
	@Override
	public boolean insert(int item) {
		if(isFull()) {
			int temp[]=new int[data.length*2];
			for(int i=0;i<data.length;i++) {
				temp[i]=data[(front+i)%data.length];
			}
			front=0;
			end=data.length;
			data=temp;
		}
		return super.insert(item);
	}
	public static void main(String args[])throws Exception {
		DynamicQueue queue=new DynamicQueue(5);
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
		queue.insert(97);
		queue.display();
	}

}
