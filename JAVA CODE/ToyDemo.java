import java.util.Scanner;

class Toy{
String name;
String category;
double price;
double discount;
Toy(String name, String category ,double price , double discount){ //parametarized constructor
	this.name=name;
	this.category=category;
	this.price=price;
	this.discount=discount;
}
}

class ToyDemo{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
Toy arr[]=new Toy[4]; // array of objects
for(int i=0;i<arr.length;i++){
	System.out.println("Enter name for obj " + (i+1));
	String name=sc.nextLine();
	System.out.println("Enter category for obj " + (i+1));
	String category=sc.nextLine();
	System.out.println("Enter price for obj " + (i+1));
	double price=sc.nextDouble();
	System.out.println("Enter discount for obj " + (i+1));
	double discount=sc.nextDouble();
	sc.nextLine();
	arr[i]=new Toy(name, category,price,discount);

}
System.out.println("Enter category to get least price :");
String givenCategory=sc.nextLine();
double leastPrice=leastPriceForGivenCategory(arr,givenCategory);
if(leastPrice >0)
System.out.println("LEAST PRICE FOR GIVEN CATEGORY :" + leastPrice);
else
	System.out.println("NO MATCH FOUND");
}// main method ends
static double leastPriceForGivenCategory(Toy arr[], String category){
	Toy temp[]=new Toy[4];
	int k=0;
	for(int i=0;i<4;i++){
	if(arr[i].category.equalsIgnoreCase(category)){
		temp[k]=arr[i];
		k++;
	}
	}	// for loop ends		
	double leastPrice=temp[0].price;
 for(int i=0;i<k;i++){
	if((temp[i].price - temp[i].discount ) <  leastPrice)
		 leastPrice= temp[i].price - temp[i].discount;
 }
	if(k>0)
		return leastPrice;
	else
		return -1;
}
}// class ends

