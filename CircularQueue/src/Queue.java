import java.util.Scanner;
public class Queue {
int c,d,f;
Node[]ar=new Node[10];
Queue() {
	c=0;d=0;f=0;
	for(int i=0;i<10;i++)
		ar[i]=new Node();
}
public void EnQueue() {
	if(f==1&&c==d)
		System.out.println("Queue is empty!");
	else {
		System.out.println("Enter value;");
		//Node s=new Node();
		Scanner sc=new Scanner(System.in);
		ar[c++].x=sc.nextInt();
		if(c==10) {
			f=1;
			c=0;
		}
	}
	
}
public void DeQueue() {
	if(f==0&&c==d)
		System.out.println("Queue id empty!");
	else {
		d++;
		if(d==10) {
			f=0;
			d=0;
			
		}
		System.out.println("Deleted");
	}
}
public void Display() {
	if(f==0) {
		if(c==d)
			System.out.println("Empty!");
		else
			for(int i=d;i<c;i++)
				System.out.println(ar[i].x);
		
	}
	else {
		for(int i=d;i<10;i++)
			System.out.println(ar[i].x);
		for(int i=0;i<c;i++)
			System.out.println(ar[i].x);
	}
}
}
