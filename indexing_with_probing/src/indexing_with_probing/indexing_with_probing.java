package indexing_with_probing;
import java.util.*;
public class indexing_with_probing {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice=0;
		linklist A1=new linklist();
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Press 1 to insert.\nPress 2 to search.\nPress 3 to exit.");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				A1.insertion();
				break;
			case 2:
				A1.search();
				break;
			case 3:
				System.err.println("---------------Thanks for using---------------");
				break;
			default:
				System.err.println("---------------Wronge choice---------------");
			}
		}while(choice!=3);
	}


}
