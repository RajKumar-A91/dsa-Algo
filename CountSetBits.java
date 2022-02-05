package com.dsa;
import java.util.*;
import java.io.*;
import java.lang.*;

public class CountSetBits {
	/*public static int countSetBitsNaiveMethod(int N) {
		
		
		int count=0;
		while(N!=0) {
			if(N%2==1) count++;
			N=N>>1;
		}
		//the timeComplexity of this program will be O(log2(N))
		return count;
		
	}
	
	public static int brainKerningamSetBitCount(int N) {
		int res=0;
		while(N>0) {
			N=(N&(N-1));
			res++;
			//the TimeComplexity of this program is O(setbitsCount)
		}
		return res;
	}*/
	static int table[]=new int[256];
	
	public static void intializeTable() {
		
	   //this table array simply stores no.of set bits in index i
	   //ex:if i is 2 then 2 has one set bit ie table[2]=1
		table[0]=0;
		for(int i=1;i<256;i++) {
			table[i]=(i&1)+table[i/2];
		}
	}
	
	public static int lookUpTableSetBitCount(int N) {
		
		int res=table[(N&(0xff))];
		N>>=8;
		res=res+table[N&0xff];
		N>>=8;
		res=res+table[N&0xff];
		N>>=8;
		res=res+table[N&0xff];
		return res;
		
		
		
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.close();
		/*System.out.println(CountSetBits.countSetBitsNaiveMethod(N));
		System.out.println(CountSetBits.brainKerningamSetBitCount(N));*/
		CountSetBits.intializeTable();
		System.out.println(CountSetBits.lookUpTableSetBitCount(N));
	}

}
