import java.util.Scanner;
public class Main {
public static void main(String[] a) {
	Scanner S=new Scanner(System.in);
	Tree t=new Tree();
	String message="Press 1 for insert\nPress 2 for Search\nPress 3 for Display\nYour Choice:";
	int Choice;
	do {
		System.out.println(message);
		Choice=S.nextInt();
		switch(Choice) {
		case 1:
			t.insertion();
			break;
		case 2:
			System.out.println("enter Value to search:");
			int v=S.nextInt();
			t.Search(v);
			break;
		case 3:
			t.Display(t.root);
			break;
		}
	}while(Choice!=4);
}
}
