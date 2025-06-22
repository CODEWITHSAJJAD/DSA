import java.util.*;
public class employee {
	node[] n=new node[200];
	node a=new node();
	Scanner sc=new Scanner(System.in);
	employee(){
		for(int i=0;i<10;i++){
			n[i]=new node();
			n[i].age=-1;
		}
	}
	public void inputemployeedata(){
		for(int i=0;i<10;i++){
			n[i].input();
		}
		}
	public void sortemployeebyage(){
		int i=0;
	}


}
