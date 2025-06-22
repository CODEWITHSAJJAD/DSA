import java.util.*;
public class Stack {
int top=-1;
int size=10;
int a[]=new int[size];
Scanner sc=new Scanner(System.in);
public void push() {
	if(top==(size-1)) {
		System.out.println("OverFlow Stack");
	}
	else {
		System.out.println("Enter Data:");
		System.out.println();
		int i=sc.nextInt();
		top=top+1;
		a[top]=1;
		System.out.println("intem inserted\n");
	}
}
public void pop() {
	if(top==-1)
		System.out.println("UnderFlow Stack\n");
	else {
		top=top-1;
		System.out.println("item deleted\n");
	}
}
public void display() {
	System.out.println("items are:\n");
	for(int j=top;j>=0;j++)
		System.out.println(a[j]+"\n");
	
}
public static void main(String[] a) {
	Stack s=new Stack();
	Scanner s1=new Scanner(System.in);
	System.out.println("1 to add \n2 to delete \n3 to displAY");
	int op;
	op=s1.nextInt();
	switch(op) {
	case 1:
		s.push();
		break;
	case 2:
		s.pop();
		break;
	case 3:
		s.display();
		break;
	}
	
	

}
}
