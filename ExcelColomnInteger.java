package InternalHackathon;
import java.util.*;
import java.io.*;
import java.lang.*;

public class ExcelColomnInteger {
	
	public static void titleToInteger(String str) {
		int result=0;
		for(int i=0;i<str.length();i++) {
			result = 26 * result + (str.charAt(i) - 'A' + 1);
		}
		System.out.println(result); 
		
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		ArrayList<String> st=new ArrayList<>();
		for(int i=0;i<n;i++) {
			st.add(i,sc.nextLine());
		}
		for(int i=0;i<n;i++) {
			titleToInteger(st.get(i));
		}
    }
}
 