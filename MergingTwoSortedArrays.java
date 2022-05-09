package com.dsa.Arrays;
import java.util.*;
import java.io.*;
import java.lang.*;

public class MergingTwoSortedArrays {
	
	public static void merginTwoSortedArrs(int arr1[],int arr2[]) {
		
		int low1=0;
		int low2=0;
		int high1=arr1.length;
		int high2=arr2.length;
		int b[]=new int[high1+high2];
		int i=0;
		while((low1<high1)&&(low2<high2)) {
			if(arr1[low1]<=arr2[low2]) {
				b[i]=arr1[low1];
				low1++;
				
			}
			else {
				b[i]=arr2[low2];
				low2++;
				
			}
			i++;
		}
		
		while(low1<high1) {
			b[i]=arr1[low1];
			
			low1++;
			i++;
			
		}
		
		
		while(low2<high2) {
			b[i]=arr2[low2];
			
			low2++;
			i++;
			
		}
		
		int temp=b[b.length-1];
		System.out.print(temp+" ");
		
		for( i=b.length-2;i>=0;i--) {
			if(temp==b[i])
				continue;
			else {
				temp=b[i];
				System.out.print(b[i]+" ");
			}
			
		}
		
	}
	
	public static void main(String args[]) {
		
		int arr1[]= {1,5,6,6,6};
		int arr2[]= {3,6,8,9,11,23};
		merginTwoSortedArrs(arr1,arr2);
		
	}

}
