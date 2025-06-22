import java.util.*;
public class linkedlist
{
	Student start;
	Scanner s=new Scanner(System.in);
	public void InsertAtStart(){
		Student s=new Student();
		s.Input();
		if(start==null){
			start=s;
		}
		else{
			Student t=start;
			s.next=t;
			t=s;
		}
	}
	public void insertatEnd() {
		Student sss=new Student();
	}
	public void GivenPos(){
		int a;
		System.out.println("ENTER THE POSITION");
		a=s.nextInt();
		Student ss=new Student();
		ss.Input();
		Student t=start;
		if(start==null){
			System.out.println("EMPTY");
			t=ss;
		}
		for(int i=1;i<=a;i++){
			t=t.next;
		}
		t.next=t;
		t=t.next;
		
		
	}

}
