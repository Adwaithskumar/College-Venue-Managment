import java.util.*;  
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;   
import java.util.Scanner;
public class agent3
{
	String name;
	String event;
	String phno;
	int venueid[]=new int[2];
	manager Manager; //AGGREGATION 
	protected String collegename;
	agent3(String collname)
	{
		collegename=collname;
	}
	agent3(String name,String event,String phno,int v1,int v2,manager Manager)
	{
			this.name=name;
			this.phno=phno;
			this.event=event;
			venueid[0]=v1;
			venueid[1]=v2;
			this.Manager=Manager;
	}
	public void getvenueid()
	{
		if(venueid[0]==1)
		{
			System.out.println("KE Audi Booked");
		}
		else
		{
			System.out.println("main audi BookEd");
		}
	}
	private void details()
	{
		int collegeid=17041414;
	}


	public static void main(String args[])
	{
		String name;
		String event;
		String phno;
		int v1,v2;
		manager Manager = new manager("roy","man25252");
		Scanner sc=new Scanner(System.in);
		register.emp s1 = new register.emp();    //object for static class
		register obj[] = new register[1];
		register.change();                //calling static class
		s1.show();
		obj[0]=new register(args[0],1988542);  //command line argument
		System.out.println("************************************************");
		System.out.println("Enter ur name");
		name=sc.nextLine();
		System.out.println("Enter ur event");
		event=sc.nextLine();
		System.out.println("Enter ur phno");
		phno=sc.nextLine();
		System.out.println("Enter 1 for KE AUDI && Enter 2 for MAIN AUDI");
		v1=sc.nextInt();
		v2=sc.nextInt();
		System.out.println("************************************************");
		agent3 br= new agent3(name,event,phno,v1,v2,Manager);
		br.getvenueid();
		obj[0].display("online");
		System.out.println("Manager Name: "+br.Manager.manname);
		System.out.println("Manager ID: "+br.Manager.managerID);
	}
}
class manager  //Aggregation
{
  
  String manname;
  String managerID;
  
  manager(String manname, String managerID) {
    this.manname = manname;
    this.managerID = managerID;
  }
}
class register extends agent3      //Inheritence
{
	static String registerman = "joy";       //static variable
	static void change()              //static method
	{
		registerman="raj";
	}
	static { System.out.println(".......HAI.............");}     //static block
	register(String collname, int registerid)
	{
		super(collname);
		int regid=registerid;
	}
	register(String collname, int registerid, int password)     //constructor overloading
	{
		super(collname);
		int p=password;
		int regid= registerid;
	}
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	LocalDateTime now = LocalDateTime.now();
	void display()
	{
		System.out.println(collegename);
		System.out.println(dtf.format(now));
	}
	void display(String mode)               //functon overloading
	{
		System.out.println("\n"+"Registerman in charge : "+registerman+"\n"+"College Name : "+collegename);
		System.out.println(dtf.format(now));
		System.out.println("Booked by : "+mode);
	}
	static class emp     //static class
	{
		void show()
		{
			System.out.println("Welcoome to college venue booking system");
		}
	}
}