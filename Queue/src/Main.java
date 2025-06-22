import java.util.*;
public class Main {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	Queue q= new Queue();
	String message="press 1 to add new order\npress 2 to Display next order\npress 3 to Display all pending orders\npress 4 to search order by name\npress 5 to Remove order by name";
	int op=0;
	do {
		System.out.println(message);
		System.out.println("option:");
		op=s.nextInt();
		switch(op) {
		case 1:
			q.enque();
			break;
		case 2:
			q.nextDIsplay();
			break;
		case 3:
			q.PendingOrders();
			break;			
		}
	}while(op!=6);
}
}
