package indexingWITHChaining;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Indexing s=new Indexing();
	
		 for(boolean a=true;a==true;){
			    System.out.println("1):Press 1 to insert data of student:\n2):Press 2 to search by name:");
			    System.out.println("Enter your choice: ");
			 	int choice=sc.nextInt();
			    switch(choice){
			    case 1:
			    	System.out.print("Enter student name:- ");
			    	String name=sc.next();
			    	System.out.print("Enter student id:- ");
			    	int id=sc.nextInt();
			    	System.out.print("Enter student discipline:- ");
			    	String discipline=sc.next();
			    	s.insert(id,name,discipline);
			    	break;
			    case 2:
			    	System.out.print("Enter student name:- ");
			    	String nam=sc.next();
			    	s.search(nam);
			    	break;
			    	default:
			    	System.out.println("Invalid choice!");
			  	}
			    System.out.println("Press c to countinue or e to exit:");
			    char ch=sc.next().charAt(0);
			    if(ch=='c')
					a=true;
				else
					a=false;
			    }
	}

}
