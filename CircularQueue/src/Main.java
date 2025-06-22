import java.util.Scanner;
public class Main {
public static void main(String [] a) {
	Scanner s=new Scanner(System.in);
	Queue que=new Queue();
	int choice;
	do{System.out.println("press-1 to Insert In Queue\npress-2 to Delete from Queue\npress-3 to Display from Queue");
	choice=s.nextInt();
	switch(choice) {
	case 1:
		que.EnQueue();
		break;
	case 2:
		que.DeQueue();
		break;
	case 3:
		que.Display();
		break;
	
	}
	}while(choice<4);
}
}
