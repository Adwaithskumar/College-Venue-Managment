import java.util.Scanner;
class agent
{
	String name;
	String event;
	String phno;
	int venueid[]=new int[2];
	
	agent(String name,String event,String phno,int v1,int v2)
	{
			this.name=name;
			this.phno=phno;
			this.event=event;
			venueid[0]=v1;
			venueid[1]=v2;
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


	public static void main(String args[])
	{
		String name;
		String event;
		String phno;
		int v1,v2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur name");
		name=sc.nextLine();
		System.out.println("Enter ur event");
		event=sc.nextLine();
		System.out.println("Enter ur phno");
		phno=sc.nextLine();
		System.out.println("Enter 1 for KE AUDI && Enter 2 for MAIN AUDI");
		v1=sc.nextInt();
		v2=sc.nextInt();
		agent br= new agent(name,event,phno,v1,v2);
		br.getvenueid();

	}
}


