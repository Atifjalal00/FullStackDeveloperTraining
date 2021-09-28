import java.util.Scanner;
class ThreadOne extends Thread{
	String str;
	public void run(){
		System.out.println("Thread ONE");  //rum method starts
		System.out.println("Given line for thread one :"+str); 
		int vowelCount=0;
		int consonantCount=0;
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			switch(ch){
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u': vowelCount++;
				break;
				default:consonantCount++;
			} //switch ends

		}// loop ends
		System.out.println("FOR THREAD ONE consonantCount ="+consonantCount+" vowelCount ="+vowelCount);
	}
	ThreadOne(String str){
		this.str=str;
	}
	
}

class ThreadTwo extends Thread{
	String str;
	public void run(){
		System.out.println("Thread TWO ");    //rum method starts
		// try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}	
		System.out.println("Given line for thread two:"+str); 
		int vowelCount=0;
		int consonantCount=0;
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			switch(ch){
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u': vowelCount++;
				break;
				default:consonantCount++;
			} //switch ends

		}// loop ends
		System.out.println("FOR THREAD TWO consonantCount ="+consonantCount+" vowelCount ="+vowelCount);
		
	}
	ThreadTwo(String str){
   	this.str=str;

	}
}

class ThreadThree extends Thread{
	String str;
	public void run(){
		System.out.println("Thread THREE");	 //rum method starts
		System.out.println("Given line for thread three:"+str); 
		int vowelCount=0;
		int consonantCount=0;
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			switch(ch){
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u': vowelCount++;
				break;
				default:consonantCount++;
			} //switch ends

		}// loop ends
		System.out.println("FOR THREAD THREE consonantCount ="+consonantCount+" vowelCount ="+vowelCount);
	}
	ThreadThree(String str){
		this.str=str;
	}
}

class ThreadFour extends Thread{
	String str;
	public void run(){
		System.out.println("Thread FOUR");  //rum method starts
		System.out.println("Given line for thread four :"+str); 
		int vowelCount=0;
		int consonantCount=0;
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			switch(ch){
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u': vowelCount++;
				break;
				default:consonantCount++;
			} //switch ends

		}// loop ends
		System.out.println("FOR THREAD FOUR consonantCount ="+consonantCount+" vowelCount ="+vowelCount);
	}
	ThreadFour(String str){
		this.str=str;
	}
}

class ThreadDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter line 1 :");
		String line1=sc.nextLine();
		System.out.print("Enter line 2 :");
		String line2=sc.nextLine();
		System.out.print("Enter line 3 :");
		String line3=sc.nextLine();
		System.out.print("Enter line 4 :");
		String line4=sc.nextLine();

		//now create objects of threads
		ThreadOne t1=new ThreadOne(line1);
		ThreadTwo t2=new ThreadTwo(line2);
		ThreadThree t3=new ThreadThree(line3);
		ThreadFour t4=new ThreadFour(line4);
		//before execution set priority
		t1.setPriority(1);
		t2.setPriority(4);
		t3.setPriority(5);
		t4.setPriority(10);
		//now execue threads
		t1.start();
		t2.start();
		t3.start();
		t4.start();



		/*
		t2.start();  //this means we can call run() method explicitly
		// try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
		t1.start(); //this means run() method is invoked automatically
		// try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
		t4.start(); //any order of execution will be followed if not specified
		// try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
		t3.start(); // we can specify the order with the help of sleep() method but it throws InterruptedException*/

		
	}
}