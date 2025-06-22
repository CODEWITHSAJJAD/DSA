package task;
import java.util.*;
public class isertInArray {
public static void main(String []args){
		
		int n,p,m;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Array Size");
		n=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[n+1];
		System.out.println("enter elements are:");
		for(int i=0;i<n;i++){
			
			a[i]=s.nextInt();
			
		}
		System.out.println("Elements are");
		for(int i=0;i<n;i++){
			
			System.out.println(a[i]);
			
		}
		
		System.out.println("Enter index of value");
		m=s.nextInt();
		System.out.println("Enter value which yiu want to enter");
		p=s.nextInt();
		for(int i=0;i<n+1;i++){
			
			if(i<m){
				b[i]=a[i];
			}
			else if(i==m){
				b[i]=p;	
			}
			else{
				b[i]=a[i-1];	
			}
		}
		for(int i=0;i<n+1;i++){
			System.out.println(b[i]);
			
		}
		}
		
}
