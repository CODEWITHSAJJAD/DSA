import java.util.Scanner;
public class Tree {
Book root;
public void insertion() {
	Book b=new Book();
	b.input();
	if(root==null)
		root=b;
	else {
		Book t=root;
		while(true) {
			if(b.price>t.price) {
				if(t.r==null) {
					t.r=b;
					break;
					}
				else
					t=t.r;
				}
			else {
				if(t.l==null) {
					t.l=b;
					break;
				}
				else
					t=t.l;
					
			}
		}
	}
}
public void DisplayInOrder(Book t) {
	if(t==null) 
		return;
	else {
		DisplayInOrder(t.l);
		System.out.println(t.title+t.B_id+t.price);
		DisplayInOrder(t.r);
	}		
}
public void DisplayPreOrder(Book t) {
	if(t==null) 
		return;
	else {
		System.out.println(t.title+t.B_id+t.price);
		DisplayPreOrder(t.l);
		DisplayPreOrder(t.r);
	}		
}
public void DisplayPostOrder(Book t) {
	if(t==null) 
		return;
	else {
		DisplayPostOrder(t.l);
		DisplayPostOrder(t.r);
		System.out.println(t.title+t.B_id+t.price);
	}		
}
public void Search(Book t,int p) {
	if(t==null)
		System.out.println("Not Found!");
	else if(t.price==p)
		System.out.println("Found!");
	else if(t.price<p)
		Search(t.l,p);
	else
		Search(t.r,p);
}
public void CheapestBook() {
	if(root==null)
		System.out.println("Nothing!");
	else {
		Book b=root;
		while(b.l!=null)
			b=b.l;
		System.out.println(b.title+b.B_id+b.price);	
	}
}
public void CostlyBook() {
	if(root==null)
		System.out.println("Nothing!");
	else {
		Book b=root;
		while(b.r!=null)
			b=b.r;
		System.out.println(b.title+b.B_id+b.price);
	}
}

}

