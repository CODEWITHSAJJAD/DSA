import java.util.*;
public class Applicants {
int jobExp,age,id;
double contact;
String name;
Applicants next;
Scanner s=new Scanner(System.in);
public void input() {
	Applicants a=new Applicants();
	System.out.println("enter name:");
	a.name=s.nextLine();
	System.out.println("enter id:");
	a.id=s.nextInt();
	System.out.println("enter age:");
	a.age=s.nextInt();
	System.out.println("enter jobExperience:");
	a.jobExp=s.nextInt();
	System.out.println("enter Contact:");
	a.contact=s.nextDouble();
}
}
