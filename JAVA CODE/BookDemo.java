import java.util.*;
import java.util.stream.*;
class Author{
		String authorName;
		String email;
		String gender;
		int age;
	}
class Book extends Author{
	String bookName ;
	double price;
	Book(String bookName,String authorName,String email,String gender,int age,double price){
		this.bookName=bookName;
		this.authorName=authorName;
		this.email=email;
		this.gender=gender;
		this.age=age;
		this.price=price;

	}

}
public class BookDemo{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Book> list=new ArrayList<>();
		do{
			System.out.println("***************************************************");
			System.out.println("Select 1 to enter n book entries.");
			System.out.println("Select 2 to display book entries.");
			System.out.println("Select 3 to get 1st five authors.");
			System.out.println("Select 4 to get sum of ages of female authors.");
			System.out.println("Select 5 to exit.");
			System.out.println("Enter your chioice :");
			int choice=sc.nextInt();
			switch(choice){
				case 1: bookEntries(list);
	                   break;
				case 2: displayEntries(list);
				       break;
				case 3: displayFiveAuthors(list);
				       break;
				case 4: sumOfAges(list);
				       break;
				case 5: System.exit(0);
				       break;
				default: System.out.println("Idiot enter correct choice.");
	
			} //switch ends
		}while(true);
	}// main method ends
	static void bookEntries(List<Book> list){
		Scanner sc=new Scanner(System.in);
		System.out.println("How many entries u want to make :");
		int n=sc.nextInt();sc.nextLine();
		// Book book=new Book(); //book obj
		for(int i=0;i<n;i++){
		System.out.println("Enter book name :");
		String bookName=sc.nextLine();
		System.out.println("Enter author name :");
		String authorName=sc.nextLine();
		System.out.println("Enter author email :");
		String email=sc.nextLine();
		System.out.println("Enter author gender :");
		String gender=sc.nextLine();
		System.out.println("Enter author age :");
		int age=sc.nextInt();
		System.out.println("Enter book price :");
		double price=sc.nextDouble();sc.nextLine();
		list.add(new Book(bookName,authorName,email,gender,age,price));
		} // for loop ends
	} // method ends
	static void displayEntries(List<Book> list){
		System.out.println("*********************USING FOR-EACH***********************");
		for(Book b:list){
			System.out.println("Book Name :"+b.bookName);
			System.out.println("Book author :"+b.authorName);
			System.out.println("Book author's email :"+b.email);
			System.out.println("Book author's gender :"+b.gender);
			System.out.println("Book author's age :"+b.age);
			System.out.println("Book price :"+b.price);
		}

	} //method ends
	static void  displayFiveAuthors(List<Book> list){
		/*Collections.sort(list,new Comparator(){
			public int compare(Object a, Object b){
				Book b1=(Book)a;
				Book b2=(Book)b;
				if(b1.age==b2.age)
					return 0;
				else if(b1.age>b2.age)
					return 1;
				else
					-1;
			}

		});*/
		System.out.println("******************filter out and print directly**********************");
		list.stream().filter(book->book.age>=30).limit(5).forEach(book->System.out.println(book)); // one way
		System.out.println("*****************filter out, store somewhere then print************");  //2nd way
		List<Book> temp=list.stream().filter(book->book.age>=30).limit(5).collect(Collectors.toList()); //stream into list
		for(Book b:temp){
			System.out.println(b.authorName);
			System.out.println(b.age);  // print age for confirmation 
		}
		// System.out.println("*****************in case limit() method does work************");
		// for(int i=0;i<5;i++){  // printing only five authors >=30 age
		// 	System.out.println("author "+(i+1) +" :"+temp[i].authorName);
		// } //loop ends 
		
	} //method ends

	static void sumOfAges(List<Book> list){
		List<Book> temp=list.stream().filter(book->(book.gender.equalsIgnoreCase("female") && book.age<25)).collect(Collectors.toList());
		int sum=0;
		for(Book b:temp){
			sum +=b.age;
			System.out.println(b.authorName);
			System.out.println(b.age);  // print age for confirmation 
			System.out.println(b.gender);  // print gender for confirmation 
		}// loop ends
		System.out.println("Sum of ages of all female authors younger than 25 ="+sum);



	} //method ends

} // class ends