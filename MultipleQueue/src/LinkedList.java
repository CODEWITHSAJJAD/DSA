import java.util.*;
public class LinkedList {
Applicants Start,end;
Scanner s=new Scanner(System.in);

public void enqueApplicants() {
	Applicants a=new Applicants();
	a.input();
	if(Start==null) {
		Start=a;
		end=a;
	}
	else {
		end.next=a;
		end=a;
	}
	System.out.println("Apllicant Added!");
		
}
public void dequeue() {
	if(Start!=null)
		Start=Start.next;
		
}
public void enqueueShortList() {
	Applicants a=new Applicants();
//	if(a.jobExp>2)
		
}
}
