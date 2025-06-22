import java.util.Scanner;
public class Queue {
CoffeeShop start,end;
//CoffeeShop c=new CoffeeShop();
public void enque() {
	CoffeeShop c=new CoffeeShop();
	c.input();
	if(start==null) {
		start=c;
	end=c;}
	else {
		end.next=c;
		end=c;
	}
	System.out.println("order has been added!");
}
public void PendingOrders() {
	if(end==null&&start==null)
		System.out.println("nothing Pending:-");
	else {
		CoffeeShop t=end;
		while(t.next!=null) {
			System.out.println(t.Customer_name+"\n"+t.typeOFcoffee+"\n"+t.price+"\n");
		}
		
	}
}
public void nextDIsplay() {
	if(start==null)
		System.out.println("noting next:-");
	else{
		CoffeeShop t=end;
		System.out.println("Next order Details:-");
		System.out.println(t.Customer_name+"\n"+t.typeOFcoffee+"\n"+t.price+"\n");
		
	}
}
}
