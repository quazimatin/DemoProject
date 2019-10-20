package basic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class SalesReceipt10122019{

	static String customerName;
	static String productName;
	static double quantityPurchase;
	static double priceForTheProduct;
	static double grossAmountPay;
	static double taxAmountPay;
	static double discountAmount;
	static double netAmountPay;

	static Scanner salessummary = new Scanner(System.in);
	public static void wellCome() {   
		System.out.println("Well Come To Our Store ");
		System.out.println("");
		System.out.println("Please Input Data");
		System.out.println("");
		System.out.println("");
	}

	public static void getInput() {


		boolean continiueToNextSteps;

		System.out.print("customerName                        :");
		customerName = salessummary.nextLine();

		System.out.print("productName                         :");
		productName = salessummary.nextLine();

		do {
			try {

		Scanner salessummary = new Scanner(System.in);
	    System.out.print("Enter Product Quantity              :");
		quantityPurchase = salessummary.nextDouble();

				if(quantityPurchase > 0){
					continiueToNextSteps = true;

				} else {

	    System.out.println("Invalied Quantity. Please Enter quantity 1 - up"); 
	    continiueToNextSteps=false;

				}

			} catch (Exception e) {
				System.out.println(e.getMessage());
		System.out.print("Exception Please Enter  Valid Input");
				continiueToNextSteps = false;
			}

		} while (!continiueToNextSteps);



		do {
			try {

		Scanner salessummary = new Scanner(System.in);
		System.out.println("Enter Product Price                 :");
		priceForTheProduct = salessummary.nextDouble();

				if(priceForTheProduct > 0){
					continiueToNextSteps = true;

				} else {

					System.out.println("Invalied Price. Please Enter price 1 - up:"); 
					continiueToNextSteps=false;

				}

			} catch (Exception e) {
				System.out.println("Exception Please Enter  Valid Input ");
				continiueToNextSteps = false;
			}

		} while (!continiueToNextSteps);


	}

	public static boolean doYouwantToContinue() {

		String doYouwantToContinue;
		Scanner choiceOption = new Scanner(System.in);


		System.out.println("DO You Want to continue ...");
		System.out.println("Enter Y or N");

		doYouwantToContinue = choiceOption.nextLine();

		if(doYouwantToContinue.equals("Y")) {
			return true;} 
		return false;

	}


	public static void calculateGrossPay() {

		grossAmountPay = quantityPurchase * priceForTheProduct;


	}public static void calculateTaxPay () {

		taxAmountPay =  (grossAmountPay*8.75)/100;

	}public static void calculateDiscountPay() {

		if(grossAmountPay>0 && grossAmountPay<=100) {
			discountAmount =  - 5; 
		}else if(grossAmountPay >100 &&  grossAmountPay<=500 ) {
			discountAmount  =  - 10;
		} else if(grossAmountPay > 500 && grossAmountPay<=1000 ) {
			discountAmount   = - 20;
		} else if(grossAmountPay >1000) {
			discountAmount  =  - 30;
		} else {
			netAmountPay = 0;
			System.out.println("Invalid Input Captured!!!!");
		}		

	}public static void calculateNetPay() {

		if(grossAmountPay>0 && grossAmountPay<=100) {
			netAmountPay = grossAmountPay - 5;
		} else if(grossAmountPay > 100 &&  grossAmountPay<=500 ) {
			netAmountPay = grossAmountPay - 10;
		} else if(grossAmountPay > 500 && grossAmountPay<=1000 ) {
			netAmountPay  = grossAmountPay- 20;
		} else if(grossAmountPay > 1000) {
			netAmountPay = grossAmountPay - 30;
		} else {
			netAmountPay = 0;
			System.out.println("Invalid Input Captured!!!!");
		}

	}

	public static void dateTime(){
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now)); 

	}



	public static void displayOutput() {

		System.out.println("");
		System.out.println("             QUAZI SUPER MALL             ");
		System.out.println("              SALES RECEIPT               ");
		System.out.println("*************************************************");
		System.out.println("customerName is               : "+ customerName);
		System.out.println("productName                   : "+ productName);
		System.out.println("quantityPurchase              : "+ quantityPurchase);
		System.out.println("priceForTheProduct            : "+ priceForTheProduct);
		System.out.println("grossAmountPay                : "+ grossAmountPay);
		System.out.println("Tax Payable(8.75%)            : "+ taxAmountPay);
		System.out.println("Discount Amount               : "+ discountAmount);
		System.out.println("Net Amount Pay                : "+ (netAmountPay+taxAmountPay));

		System.out.println("***************************************************");


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

	
	
	public static void loop() {
		
		wellCome();

		for(int i=0; i<10;i++) {

			System.out.println("CustomerInformation  : " + (i+1));

			getInput();
			calculateGrossPay();
			calculateTaxPay();
			calculateDiscountPay();
			calculateNetPay();
			displayOutput();
			dateTime();
			System.out.println("******************************************************");
			doYouwantToContinue();
			
			//if (! doYouwantToContinue()) {
				//break;
			}
			
		
		
		
		}
//	}

	public static void main(String[] args) {


		loop();
			
			
			exitProgram();

		}
	
}

	