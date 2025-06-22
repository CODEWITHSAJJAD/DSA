package taskk;
import java.util.*;
public class student {
	Scanner s=new Scanner(System.in);
String Name;
int age,id;
double cgpa;
void inser() {
	System.out.println("enter name=");
	Name=s.nextLine();
	System.out.println("enter id=");
	id=s.nextInt();
	System.out.println("enter age=");
	age=s.nextInt();
	System.out.println("enter cgpa=");
	cgpa=s.nextDouble();
}
void display() {
	System.out.println("name="+Name+"\nage="+age+"\nid="+id+"\ncgpa"+cgpa);
}
void search(student []ar,int x,int c) {
	if(c==0) {
		System.out.println("Ärray is Empty");
	}
	else {
		int f=0;
		for(int i=0;i<c;i++) {
			if(ar[i].age==x) {
				f++;
				break;
			
			}
		}
		if(f==0) {
			System.out.println("not found\n");
		}
		else {
			System.out.println("found\n");
		}
	}
	
}
int del(int c) {
	if(c==0) {
		System.out.println("nothing found to delete\n");
	}
	else
		c--;
	return c;
}
void eldest(student []arr,int c) {
	if(c==0)
		System.out.println("Array is empty");
	else {
		int m=arr[0].age,ind=0;
		for(int i=1;i<c;i++) {
			if(arr[i].age>m) {
				m=arr[i].age;
				ind=i;
			}
		}
		System.out.println(arr[ind].Name+arr[ind].age+arr[ind].id+arr[ind].cgpa);
		
	}
}
void youngest(student [] ar,int c) {
	if(c==0)
		System.out.println("Array is empty\n");
	else {
		int m=ar[0].age,ind=0;
		for(int i=1;i<c;i++) {
			if(ar[i].age<m) {
				m=ar[i].age;
				ind=i;
			}
			System.out.println(ar[ind].Name+ar[ind].age+ar[ind].id+ar[ind].cgpa);
		}
	}
}
public static void main(String [] a) {
	System.out.println("press 1 to isert\npress 2 to display\npress 3 to search\npress 4 to delete\npress 5 to get oldest\n press 6 to get youngest");
	student arr[]=new student[10];
	Scanner sc=new Scanner(System.in);
	int choice,i=0;
	do {
		System.out.println("enter your choice=");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
		if(i<10) {
			arr[i].inser();
			i++;
		}
		case 2:
			arr[i].display();
			i++;
		case 3:
			arr[i].search(arr, i, choice);
		case 4:
			arr[i].del(choice);
		case 5:
			arr[i].eldest(arr, choice);
		case 6:
			arr[i].youngest(arr, choice);
		}
		
	}while(choice<7);
}
}
