package basic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class SalesReceipt10182019{
	
	static int mX =11;
	static  int array = 0;

	static int[] slNo=new int[mX];
    static int counter;
	static String[] customerName = new String[mX];
	static String greeting;
	static String[] productName = new String[mX];
	static double[] quantityPurchase = new double[mX];
	static double[] priceForTheProduct = new double[mX];
	static double[] grossAmountPay = new double[mX];
	static double[] taxAmountPay = new double[mX];
	static double[] discountAmount = new double[mX];
	static double[] netAmountPay = new double[mX];
	
	
public static void deleteData(int arrayPointer) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Delete By [SerialNo(D#)] \t");
		String delete = scanner.nextLine();
		switch(delete) {
		case "D#" : 
			System.out.println("");
			System.out.print(" Enter Serial No to Delete : \t");
			String sSerialNo = scanner.nextLine();
			for(int i=0;i<array; i++) {
				if(slNo[i]==Integer.parseUnsignedInt(sSerialNo) )	{
				wellCome(greeting);
				getInput(i);
				calculateGrossPay(i);
				calculateTaxPay(i);
				calculateDiscountPay(i);
				calculateNetPay(i);displayOutput(i);
				dateTime(i);
				System.out.println("*****************************************************");
				displayTable(i);
					
//			     exitProgram();
					//counter++;
					break;
			}}
        break; // Come Out From Editing 
			
		default:
			System.out.println("[ Option Selected " + delete + " is not available !!!!]");
			System.out.println(" [" + delete + "] is not a valid Chose correct Action !!!!]");
			editData(counter) ;
		}}
	
	public static void editData(int arrayPointer) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Edit By [ SerialNo(S#) \t");
		String eEditData = scanner.nextLine();
		switch(eEditData) {
		case "S#" : 
			System.out.println("");
			System.out.print(" Enter Serial No to EDIT : \t");
			String selNo = scanner.nextLine();
			for(int i=0;i<array;i++) {
				if(slNo[i]==Integer.parseInt(selNo) )	{
					getInput(i);
					calculateGrossPay(i);
					calculateTaxPay(i);
					calculateDiscountPay(i);
					calculateNetPay(i);
					displayOutput(i);
					dateTime(i);
					System.out.println("*****************************************************");
					displayTable(i);
					
					exitProgram();
					counter++;
					break;
				}
			}
			break; // Come Out From Editing 
			
		default:
			//System.out.println("[ Option Selected " + cMenueSelection + " is not available !!!!]");
			System.out.println(" [" + eEditData + "] is not a valid Chose correct Action !!!!]");
			editData(arrayPointer) ;
		}
	}
	

 static Scanner salessummary = new Scanner(System.in);
	

   
  public static void menuSelection() {

		Scanner menuScan = new Scanner(System.in);
		String menuSelected;		
		System.out.println("Please Chose a option [(A)Add / (E)Edit / (D)Delete / (X) exit]");
		menuSelected = menuScan.nextLine();


	
		switch(menuSelected) {

		case "A": 
			 
			wellCome(greeting);
			
			
			getInput(counter);
			calculateGrossPay(counter);
			calculateTaxPay(counter);
			calculateDiscountPay(counter);
			calculateNetPay(counter);
			displayOutput(counter);
			dateTime(counter);
			System.out.println("*****************************************************");
			displayTable(counter);
			
			exitProgram();
			counter++;
			
			menuSelection();   

		case "E":
			
			editData(counter);
			counter++;
			menuSelection();

		case "D":	
			
			System.out.println("Deleting  Opration .. ");
			deleteData(counter);
			
			counter++;
			menuSelection();  // Recursive Function Call 


		case "X":	
			
			System.out.println("Closing   Entire Program Bye Bye !!!! .. ");
			System.exit(0);  


		default : 
			// What the Hell 
			System.out.println("Wrong Option  .. ");
			menuSelection(); // Recursive Function Call 

		}
  }
	
	public static void wellCome(String greeting) {  
		
//		Scanner greetings= new Scanner(System.in);
//		System.out.println("Please Enter Owner Name");
//		greeting= greetings.nextLine(); 
		
	    System.out.println(" Well Come To Quazi Matin Store ");
		System.out.println("");
		System.out.println("Please Input Data");
		System.out.println("");
		System.out.println("");
	}

	public static void getInput(int arrayPointer) {


		boolean continiueToNextSteps;
		slNo[arrayPointer] = arrayPointer + 1;
		System.out.print("customerName                        :");
		customerName[arrayPointer] = salessummary.nextLine();

		System.out.print("productName                         :");
		productName[arrayPointer] = salessummary.nextLine();

		do {
			try {

		Scanner salessummary = new Scanner(System.in);
	    System.out.print("Enter Product Quantity              :");
		quantityPurchase[arrayPointer] = salessummary.nextDouble();

				if(quantityPurchase[arrayPointer] > 0){
					continiueToNextSteps = true;

				} else {

	    System.out.print("Invalied Quantity. Please Enter quantity 1 - up"); 
	    continiueToNextSteps=false;

				}

			} catch (Exception e) {
		System.out.print("Exception Please Enter  Valid Input");
				continiueToNextSteps = false;
			}

		} while (!continiueToNextSteps);



		do {
			try {

		Scanner salessummary = new Scanner(System.in);
		System.out.print("Enter Product Price                 :");
		priceForTheProduct[arrayPointer] = salessummary.nextDouble();

				if(priceForTheProduct[arrayPointer] > 0){
					continiueToNextSteps = true;

				} else {

					System.out.println("Invalied Price. Please Enter price 1 - up:"); 
					continiueToNextSteps=false;

				}

			} catch (Exception e) {
				System.out.println("e= e.message ");
				System.out.println("Exception Please Enter  Valid Input ");
				continiueToNextSteps = false;
			}

		} while (!continiueToNextSteps);


	}



	public static void calculateGrossPay(int arrayPointer) {

		

		grossAmountPay[arrayPointer] = quantityPurchase[arrayPointer] * priceForTheProduct[arrayPointer];


	}
	
	
	public static void calculateTaxPay (int arrayPointer) {

		
		taxAmountPay[arrayPointer] =  (grossAmountPay[arrayPointer]*8.75)/100;
		

	}public static void calculateDiscountPay(int arrayPointer) {

		if(grossAmountPay[arrayPointer]>0 && grossAmountPay[arrayPointer]<=100) {
			discountAmount[arrayPointer] =  - 5; 
		}else if(grossAmountPay[arrayPointer] >100 &&  grossAmountPay[arrayPointer]<=500 ) {
			discountAmount[arrayPointer]  =  - 10;
		} else if(grossAmountPay[arrayPointer] > 500 && grossAmountPay[arrayPointer]<=1000 ) {
			discountAmount[arrayPointer]   = - 20;
		} else if(grossAmountPay[arrayPointer] >1000) {
			discountAmount[arrayPointer]  =  - 30;
		} else {
			netAmountPay[arrayPointer] = 0;
			System.out.println("Invalid Input Captured!!!!");
		}		

	}public static void calculateNetPay(int arrayPointer) {

		if(grossAmountPay[arrayPointer]>0 && grossAmountPay[arrayPointer]<=100) {
			netAmountPay[arrayPointer] = grossAmountPay[arrayPointer] - 5;
		} else if(grossAmountPay[arrayPointer] > 100 &&  grossAmountPay[arrayPointer]<=500 ) {
			netAmountPay[arrayPointer] = grossAmountPay[arrayPointer] - 10;
		} else if(grossAmountPay[arrayPointer] > 500 && grossAmountPay[arrayPointer]<=1000 ) {
			netAmountPay[arrayPointer]  = grossAmountPay[arrayPointer]- 20;
		} else if(grossAmountPay[arrayPointer] > 1000) {
			netAmountPay[arrayPointer] = grossAmountPay[arrayPointer] - 30;
		} else {
			netAmountPay[arrayPointer] = 0;
			System.out.println("Invalid Input Captured!!!!");
		}

	}

	public static void dateTime(int arrayPointer){
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now)); 

	}


	public static void displayOutput(int arraypointer) {

		System.out.println("");
		System.out.println("             QUAZI SUPER MALL             ");
		System.out.println("              SALES RECEIPT               ");
		System.out.println("****************************************************");
		System.out.println("customerName is               : "+ customerName[arraypointer]);
		System.out.println("productName                   : "+ productName[arraypointer]);
		System.out.println("quantityPurchase              : "+ quantityPurchase[arraypointer]);
		System.out.println("priceForTheProduct            : "+ priceForTheProduct[arraypointer]);
		System.out.println("grossAmountPay                : "+ grossAmountPay[arraypointer]);
		System.out.println("Tax Payable(8.75%)            : "+ taxAmountPay[arraypointer]);
		System.out.println("Discount Amount               : "+ discountAmount[arraypointer]);
		System.out.println("Net Amount Pay                : "+ (netAmountPay[arraypointer]+taxAmountPay[arraypointer]));

		System.out.println("*****************************************************");


	}
	
	
	 public static void displayTable(int arraryPointer) {
		  
		 System.out.println(" ");
		 System.out.println("==================================================================================================================================");
		 System.out.println("Sl Number  |  CUSTOMER NAME |  PRODUCT NAME  |  PRODUCT QUANTITY |  PRODUCT PRICE |  GROSS PAY |  TAX PAYABLE |  DISCOUNT AMONT |  NET PAY |    ");	  
		 System.out.println("==================================================================================================================================");	 
		 
		 
		 for(int i=0; i<customerName.length;i++) {

	     System.out.println(slNo[i]+"       |       "+customerName[i]+ "      |  "+productName[i]+ "  |            "+  quantityPurchase[i]+"  |            "+ priceForTheProduct[i]+ "  |   "+ grossAmountPay[i]+ "  |      "+ taxAmountPay[i]+  "  |   "+ discountAmount[i]+  "  |      "+ netAmountPay[i] + "|");
		
	     System.out.println("==================================================================================================================================");	 
		  
			  
			  }
	 }

	public static void exitProgram() {


		System.out.println("");
		System.out.println("");
		System.out.println("Thanks for Shopping With Us. Vist Us Again.");
		System.out.println("");
		System.out.println("");
		System.out.println("ADDRESS  :  PARSONS BLVD, JAMAICA, NEW YORK-11432.");
		System.out.println("EMAIL    :  quazinf@gmail.com.");
		System.out.println("PHONE    :  516-430-3447.");

	}
	
	
	public static void main(String[] args) {

		
	      menuSelection();
	
	
        
	
}
}

	
	
	

//	public static boolean doYouwantToContinue(int arrayPointer) {
//
//		String doYouwantToContinue;
//		Scanner choiceOption = new Scanner(System.in);
//
//
//		System.out.println("DO You Want to continue ...");
//		System.out.println("Enter Y or N");
//
//		doYouwantToContinue = choiceOption.nextLine();
//
//		if(doYouwantToContinue.equals("Y")) {
//			return true;} 
//		return false;
//
//	}