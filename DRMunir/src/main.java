import java.util.*;
public class main {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String mainu="press-1 to at start\npress-2 to at end\npress-3 to at given position\npress-4 to print data";
	linkedlist l= new linkedlist();
	System.out.println(mainu);
	int n=s.nextInt();
	switch(n) {
	case 1:
	l.InsertAtStart();
	case 2:
	l.GivenPos();
	}
}
}
