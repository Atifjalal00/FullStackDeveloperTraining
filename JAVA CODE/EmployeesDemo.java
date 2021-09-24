import java.util.*;
import java.lang.*;
class Employee{
int empId;
String empName;
String dob;
double salary;
String designation;
Employee(int id,String name,String dob,double salary , String designation){
	empId=id;
	empName=name;
	this.dob=dob;
	this.salary=salary;
	this.designation=designation;
}	
}// class ends

class EmployeesDemo{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
ArrayList<Employee> list=new ArrayList<Employee>();
System.out.println("Enter no. of employees to de added:");
int n=sc.nextInt();
for(int i=0;i<n;i++){
	System.out.println("Enter Employee ID : ");
	int id=sc.nextInt(); sc.nextLine();
	System.out.println("Enter Employee name :");
	String name=sc.nextLine();
	System.out.println("Enter Employee DOB :");
	String dob=sc.nextLine();
	System.out.println("Enter Employee salary");
	double salary=sc.nextDouble();sc.nextLine();
	System.out.println("Enter Employee designation :");
	String designation=sc.nextLine();
	list.add(new Employee(id,name,dob,salary,designation));
	
}
System.out.println("Employees details added successfully");
System.out.println("****************************************************************");

do{
	System.out.println("Select 1 to display Using For-Each Loop");
	System.out.println("Select 2 to display Using Iterator");
	System.out.println("Select 3 to search");
	System.out.println("Select 4 to delete");
	System.out.println("Select 5 to exit");
	System.out.println("Enter your choice :");
	int choice=sc.nextInt();
switch(choice){
	case 1: displayUsingForEachLoop(list);
	break;
	case 2: displayUsingIterator(list);
	break;
	case 3: search(list);
	break;
	case 4: delete(list);
	break;
	case 5: System.exit(0);
	default : System.out.println("Idiot select valid options");
	
}//switch ends
}while( 1 != 0);

}//main method ends

static void  displayUsingForEachLoop(ArrayList<Employee> list){
System.out.println("********************USING FOR-EACH LOOP***********************************");
for(Employee obj:list){
	System.out.println("Employee Id :"+obj.empId);
	System.out.println("Employee name :"+obj.empName);
	System.out.println("Employee dob :"+obj.dob);
	System.out.println("Employee  salary :"+obj.salary);
	System.out.println("Employee designation :"+obj.designation);
}
}// ends

static void displayUsingIterator(ArrayList<Employee> list){
System.out.println("************************USING ITERATOR*******************************");
Iterator itr=list.iterator();
while(itr.hasNext()){
	Employee obj=(Employee)itr.next();
	System.out.println("Employee Id :"+obj.empId);
	System.out.println("Employee name :"+obj.empName);
	System.out.println("Employee dob :"+obj.dob);
	System.out.println("Employee  salary :"+obj.salary);
	System.out.println("Employee designation :"+obj.designation);
}
}//ends

static void search(ArrayList<Employee> list){
System.out.println("Enter Employee name to be searched : ");
Scanner sc=new Scanner(System.in);
String emp=sc.nextLine();
Iterator itr=list.iterator();
boolean found=false;
while(itr.hasNext()){
	Employee obj=(Employee)itr.next();
	if(obj.empName.equalsIgnoreCase(emp))
		found=true;

}
if(found)
	System.out.println("matched found");
else
	System.out.println("matched not found");

} //ends
static void delete(ArrayList<Employee> list){
System.out.println("Enter Employee name to be deleted :");
Scanner sc=new Scanner(System.in);
String emp=sc.nextLine();
Iterator itr=list.iterator();
while(itr.hasNext()){
	Employee obj=(Employee)itr.next();
	if(obj.empName.equalsIgnoreCase(emp))
		list.remove(obj);
}
}//ends


}
