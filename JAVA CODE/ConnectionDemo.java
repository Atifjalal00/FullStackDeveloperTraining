import java.util.Scanner;
class Connection
{

	String connid;
	String customerid;
	String customerEmail;
	double balance;
	public Connection(String connid,String customerid,String customerEmail,double balance)
	{
		this.connid=connid;
		this.customerid=customerid;
		this.customerEmail=customerEmail;
		this.balance=balance;
	}

} //class ends

public class ConnectionDemo
{
	public static void main(String[] args)
	{
		Connection con[]=new Connection[4];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<con.length;i++){
			System.out.println("******************************************");
			System.out.print("Enter connid :");
			String connid=sc.nextLine();
			System.out.print("Enter customerid :");
			String customerid=sc.nextLine();
			System.out.print("Enter customerEmail :");
			String customerEmail=sc.nextLine();
			System.out.print("Enter balance  :");
			double balance=sc.nextDouble();sc.nextLine();
			con[i]=new Connection(connid,customerid,customerEmail,balance);
		}
		System.out.print("enter  customerid to get average:");
		String check_customer=sc.nextLine();
		double avg=getAverageBalance(con,check_customer);
		if(avg>0)
		System.out.println("average balance of customer with customerid :"+check_customer+" is "+avg);
	else
		System.out.println("No such match found");
		
	}
   static double getAverageBalance(Connection con[], String check_customer)
	{
		double average=0;
		int count=0;
		for(int i=0;i<con.length;i++)
		{
			if(con[i].customerid.equalsIgnoreCase(check_customer))
			{
				average +=con[i].balance;
				count++;
			}
		}
		if(count>0)
		return (average/count); 
	else
		return 0;
	}

}