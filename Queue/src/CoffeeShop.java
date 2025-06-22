import java.util.Scanner;

public class CoffeeShop {
String Customer_name,typeOFcoffee;
double price;
CoffeeShop next;

Scanner sc=new Scanner(System.in);
public void input() {
	System.out.println("enter customer name:");
	Customer_name=sc.next();
	System.out.println("enter type of coffee from '-latte,cappuccino,espresso-'");
	typeOFcoffee=sc.next();
	System.out.println("enter price:");
	price=sc.nextInt();
}
}
