import java.util.*;
public class Student {
int id,age;
double cgpa;
String name;
Student next;
Scanner sc=new Scanner(System.in);
public void Input() {
	Student s=new Student();
	System.out.println("enter name:");
	s.name=sc.nextLine();
	System.out.println("enter id:");
	s.id=sc.nextInt();
	System.out.println("enter cgpa:");
	s.cgpa=sc.nextDouble();
	System.out.println("enter age:");
	s.age=sc.nextInt();
}
}
