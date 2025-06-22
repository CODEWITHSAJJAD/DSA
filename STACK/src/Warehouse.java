import java.util.Scanner;
public class Warehouse {
Product start;
public void input() {
	Product p3=new Product();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Product Title:");
	p3.p_title=sc.nextLine();
	System.out.println("Enter Product Id:");
    p3.p_id=sc.nextInt();
	System.out.println("Enter Price:");
	p3.p_price=sc.nextDouble();
}
public void Push() {
	Product p=new Product();
	if(start==null) {
		input();
		start=p;
	}
	else {
		input();
		p.next=start;
		start=p;
	}
}
public void Pop() {
	Product p1=new Product();
	if(start==null) {
		System.out.println("list is already empty -:!");
		
	}
	else {
//		System.out.println(start.p_id+start.p_title+start.p_title);
		System.out.println("deleted!");
		start=start.next;
		
	}
	
}
public void display() {
	if(start==null) 
		System.out.println("no product to display!");
	else {
		Product t=start;
		while(t!=null) {
//			System.out.println("t.p_id+t.p_title+t.p_title");
			t=t.next;
		}
	}
}
}
