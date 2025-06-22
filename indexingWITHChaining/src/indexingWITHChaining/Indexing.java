package indexingWITHChaining;

public class Indexing {
	Student[] arr=new Student[20];
	Indexing(){
		for(int i=0;i<arr.length;i++){
			arr[i]=new Student();
			arr[i].name=null;
	    }
	}
	public int hashFunction(String input){
		int index=0;
		for(int i=0;i<input.length();i++)
		{
			int ind=input.charAt(i);
			index+=ind;
		}
		return index%arr.length;
	}
	public void insert(int id, String name,String discipline){
		int index=hashFunction(name);
		if(arr[index].name==null){
			arr[index].name=name;
			arr[index].id=id;
			arr[index].Decipline=discipline;
		}
		else{
			  Student s = new Student();
	            s.name = name;
	            s.Decipline = discipline;
	            s.id = id;
	            s.next = arr[index].next;
	            arr[index].next= s;
		}
	}
	public void search(String name){
		int index=hashFunction(name);
		if(arr[index].name.equals(name))
			System.out.println("Name:- "+arr[index].name+" id:- "+arr[index].id+" Discipline:- "+arr[index].Decipline);
		else{
			Student t=arr[index].next;
			while(t!=null){
				if(t.name.equals(name)){
					System.out.println("Name:- "+t.name+" id:- "+t.id+" Discipline:- "+t.Decipline);
					return;
				}
			}
			System.out.println("Not found!");
		}
	}
   

    
}
