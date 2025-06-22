import java.util.Scanner;

public class Book{
	int B_id,price;
	String title;
	Book l,r;
	Scanner s=new Scanner(System.in);
	public void input() {
		System.out.println("Enter Book Title:");
		title=s.next();
		System.out.println("Enter Book Id:");
		B_id=s.nextInt();
		System.out.println("Enter Price:");
		price=s.nextInt();
	}
}
