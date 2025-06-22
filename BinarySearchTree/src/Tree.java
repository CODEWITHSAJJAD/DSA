import java.util.Scanner;
public class Tree {
Node root;
Scanner sc=new Scanner(System.in);
public void insertion() {
	Node s=new Node();
	System.out.println("Enter Data:");
	s.d=sc.nextInt();
	if(root==null)
		root=s;
	else {
		Node t=root;
		while(true) {
			if(s.d>t.d)
				if(t.r==null) {
					t.r=s;
					break;
					}
				else
					t=t.r;
					
			else {
				if(t.l==null) {
					t.l=s;
					break;
				}
				else
					t=t.l;
			}
		}
	}
}
public void Search(int x) {
	if(root==null)
		System.out.println("empty tree!");
	else {
		Node t=root;
		while(t!=null) {
			if(t.d==x) {
				System.out.println("Found!");
				break;
			}
			else if(t.d<x)
				t=t.r;
			else
				t=t.l;
			}
		if(t==null)
			System.out.println("Not Found!");
			
				
				
				
		}
	}

public void Display(Node t) {
	if(t==null)
		return;
	else {
		System.out.println(t.d);
		Display(t.l);
		Display(t.r);
		
	}
}
}
