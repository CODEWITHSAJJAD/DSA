package infixToPostfix;
public class linklist {
	node start;
	void push(char infix) 
	{
		node t=new node();
		t.data=infix;
		t.next=start;
		start=t;
	}
	public char pop()
	{	
		char x=start.data;
		start=start.next;
		return x;
	}
	public char peak()
	{	
		return start.data;
	}
	public boolean Isempty() 
	{
		if(start==null)
			return true;
		else
			return false;
	}
}
