package infixToPostfix;
import java.util.*;
public class main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=0;
		linklist temp=new linklist();
		System.out.println("Enter Infix expresion: ");
		String postfix="",infix=sc.next();
		while(i<infix.length())
		{
			char c=infix.charAt(i);
			if(c=='('||c=='/'||c=='*'||c=='-'||c=='+'||c==')')
			{
				if(c=='('||c=='/'||temp.Isempty())
				{
					temp.push(c);
					i++;
				}
				else if(c=='*')
				{
					if(temp.peak()=='/')
					{
						postfix=postfix+temp.pop();
						postfix=postfix+',';
					}
					else
					{
						temp.push(c);
						i++;
					}
				}
				else if(c=='-')
				{
					if(temp.peak()=='/'||temp.peak()=='*')
					{
						postfix=postfix+temp.pop();
						postfix=postfix+',';
					}
					else
					{
						temp.push(c);
						i++;
					}
				}
				else if(c=='+')
				{
					if(temp.peak()=='/'||temp.peak()=='*'||temp.peak()=='-')
					{
						postfix=postfix+temp.pop();
						postfix=postfix+',';
					}
					else
					{
						temp.push(c);
						i++;
					}
				}
				else if(c==')')
				{
					while(temp.peak()!='(')
					{	
						postfix=postfix+temp.pop();
						postfix=postfix+',';
					}
					
					temp.pop();
					i++;
				}
			}
			else
			{
				postfix=postfix+c;
				
				if(i+1<infix.length())
				{
					if(infix.charAt(i+1)==')'||infix.charAt(i+1)=='/'||infix.charAt(i+1)=='*'||infix.charAt(i+1)=='-'||infix.charAt(i+1)=='+') 
					{
					postfix=postfix+',';
					}
				i++;
				}
			}
			}
		while(!(temp.Isempty()))
		{
			postfix=postfix+temp.pop();
			if(!(temp.Isempty()))
					postfix=postfix+',';
		}
		System.out.println("Infix to POSTFIX : "+postfix);
		String s=postfix;
		String[] s1=s.split(",");
		i=0;
		stack evl=new stack(); 
		while(i<s1.length)
		{
			if(s1[i].equals("-")||s1[i].equals("+")||s1[i].equals("*")||s1[i].equals("/"))
			{
				double x=evl.pop();
				double y=evl.pop();
				switch(s1[i])
				{
				case "+":
					evl.push(y+x);
					i++;
					break;
				case "-":
					evl.push(y-x);
					i++;
					break;
				case "*":
					evl.push(y*x);
					i++;
					break;
				case "/":
					evl.push(y/x);
					i++;
					break;
				}
			}
			else
			{
				evl.push(Integer.parseInt(s1[i]));
				i++;
			}
			
		}
		System.out.println("Evaluation : "+evl.pop());
		}
	}
