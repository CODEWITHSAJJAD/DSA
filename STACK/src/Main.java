import java.util.Scanner;
public class Main {
	public static void main(String[] a) {
		Warehouse w=new Warehouse();
String Main_menu="press-1 to implement LinkList\npress-2 to implement Array\npress-3 to exit";
String menu="press-1 to add\npress-2 to remove\npress-3 to display";
int op=0;
do {
	Scanner s=new Scanner(System.in);
	System.out.println(Main_menu);
	op=s.nextInt();
	switch(op) {
	case 1:
		System.out.println(menu);
		int op1=s.nextInt();
		switch(op) {
		case 1:
			w.Push();
			break;
		case 2:
			w.Pop();
			break;
		case 3:
			w.display();
			break;
		}
		break;
	case 2:
		System.out.println(menu);
		int op2=s.nextInt();
		switch(op2) {
		case 1:
		
		}
	}
}while(op<3);
	}
}
