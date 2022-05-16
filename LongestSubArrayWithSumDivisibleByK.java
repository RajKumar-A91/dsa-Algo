import java.util.*;
import java.io.*;
import java.lang.*;

public class LongestSubArrayWithSumDivisibleByK {
  public static int longestSubArrayWithSumDivisibleByK(int arr[],int n,int k) {
		int ans=0;
	       HashMap<Integer,Integer> map=new HashMap<>();
	       int sum=0;
	       int rem=0;
	       map.put(rem,-1);
	       for(int i=0;i<n;i++) {
	           sum+=arr[i];
	           rem=sum%k;
	           if(rem<0) {
	               rem=rem+k;
	           }
	           if(map.containsKey(rem)==true){
	               int idx=map.get(rem);
	               int len=i-idx;
	               if(len>ans){
	               ans=len;
	               }
	           }
	           else{
	               map.put(rem,i);
	           }
	       }
	  return ans;
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(longestSubArrayWithSumDivisibleByK(arr,n,k));
	}

}
