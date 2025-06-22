import java.util.Scanner;
public class Main {
public static void main(String[] a) {
	Scanner sc=new Scanner(System.in);
	Tree t=new Tree();
	int op;
	String mainu="Press 1 for Insertion\nPress 2 for Display InOrder\nPress 3 for Disply PreOrder\nPress 4 for PostOrder\nPress 5 for Search\nPress 6 for CheapestBook\nPress 7 for CostlyBook\nPress 8 for Sum of Price Of All Books\nPress 9 for Total Books\nOptions";
	do {
		System.out.println(mainu);
		op=sc.nextInt();
		switch(op) {
		case 1:
			t.insertion();
			break;
		case 2:
			t.DisplayInOrder(t.root);
			break;
		case 3:
			t.DisplayPreOrder(t.root);
			break;
		case 4:
			t.DisplayPostOrder(t.root);
		case 5:
			System.out.println("Enter Value to search:");
			int value=sc.nextInt();
			t.Search(t.root, value);
			break;
		case 6:
			t.CheapestBook();
			break;
		case 7:
			t.CostlyBook();
			break;
		case 8:
			
		}
	}while(op!=10);
}
}
