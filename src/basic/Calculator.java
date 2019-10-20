package basic;


	import java.io.IOException;
	import java.util.Scanner;

	public class Calculator {


	static double result;
	static int z;
	
	
	public static void result() {
	result = z % 100;
	}



	public static void main(String[] args) throws IOException{
	        Scanner scan = new Scanner (System.in);
	result();
	System.out.print("First number: ");
	int x = Integer.parseInt(scan.nextLine());
	System.out.print("Second number: ");
	int y = Integer.parseInt(scan.nextLine());
	System.out.print("Operator: ");
	String op = scan.nextLine();


	System.out.print("Operator: ");
	int p  = Integer.parseInt(scan.nextLine());
	

	//percentage = (x/y)*100	



	 
	//int z;
	 
	if (op.equals("+")) {
	   z = x+y;
	} else if (op.equals("-")){
	   z = x-y;
	} else if (op.equals("*")){
	   z = x*y;
	} else if (op.equals("/")){
	   z = x/y;
	} else if (op.equals ("%")) {

	z = (x/y)*100;}
	else{
	    throw new java.lang.Error("Operator not recognized");
	}
	System.out.println("Result: " + z);
	System.out.println(result);


	 
	    }
	}












