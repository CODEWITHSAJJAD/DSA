package infixToPostfix;
public class stack {
	node2 start;
	public void push(double x)
	{
		node2 t=new node2();
		t.data=x;
		t.next=start;
		start=t;
	}
	public double pop()
	{
		double t=start.data;
		start=start.next;
		return t;
	}
}

