package task;
import java.util.*; 
public class Student {
	public String sname;
	public int age;
	public float cgpa;

		public static void main(String[] args) {
			String[] d=new String[2];
			Scanner s=new Scanner(System.in);
			System.out.println("Press 1 for insert=\n Press 2 for display =");
			int a;
			a=s.nextInt();
			if(a==1)
			{
			Student ss=new Student();
			ss.insert(d);	
				
			}
			else if(a==2)
			{
				
				display(d);
			}
			else 
				System.out.println("please press right key");
			
		}
			public  void insert(String d[]){
				for(int i=0;i<d.length;i++)
				{
					Scanner sc=new Scanner(System.in);
					System.out.println("name");
					sname=sc.next();
					System.out.println("Age");
					age=sc.nextInt();
					System.out.println("cgpa");
					cgpa=sc.nextFloat();
					d[i]=sname+"   "+age+"   "+cgpa;		
				}
				System.out.println(" Press 2 for display =");
				Scanner s=new Scanner(System.in);
				int a;
				a=s.nextInt();
				display(d);
			}
	public static void display(String d[]){
				for(int i=0;i<d.length;i++)
				System.out.println(d[i]);
				}

		}

