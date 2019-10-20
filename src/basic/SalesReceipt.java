package basic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SalesReceipt{

		static String customerName;
		static String productName;
		static double quantityPurchase;
		static double priceForTheProduct;
		static double grossAmountPay;
		static double netAmountPay;


		public static void wellCome() {   
			System.out.println("Well Come To Our Webpage ");
			System.out.println("");
			System.out.println("Sales Receipt Summary");
			System.out.println("");
			System.out.println("");
		}

		public static void getInput() {

			Scanner salessummary = new Scanner(System.in);


			System.out.print("customerName         :");
			customerName = salessummary.nextLine();

			System.out.print("productName          :");
			productName = salessummary.nextLine();


			System.out.print("quantityPurchase     :");
			quantityPurchase = salessummary.nextDouble();

			System.out.print("priceForTheProduct   :");
			priceForTheProduct = salessummary.nextInt();
			
	
		}

		public static void calculategrossPay() {

			grossAmountPay = quantityPurchase * priceForTheProduct;

		}

		public static void calculateNetPay() {
			
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
			System.out.println("customerName is               : " + customerName);
			System.out.println("productName                   : " + productName);
			System.out.println("quantityPurchase              : "+ quantityPurchase);
			System.out.println("priceForTheProduct            : "+ priceForTheProduct);
			System.out.println("grossAmountPay                : "+ grossAmountPay);
			System.out.println("NetAmountPays                 : "+ netAmountPay);

			System.out.println("***************************************************");
			System.out.println("******************ARIF AND QUAZI*********************************");
			

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


			wellCome();

			for(int i=0; i<10;i++) {

			System.out.println("CustomerInformation  : " + (i+1));

				getInput();
			    calculategrossPay();
				calculateNetPay();
				displayOutput();
				dateTime();
				System.out.println("***************************************************");
				exitProgram();


				String doYouwantToContinue;
				Scanner choiceOption = new Scanner(System.in);


				System.out.println("DO You Want to continue ...");
				System.out.println("Enter Y or N");
				
				doYouwantToContinue = choiceOption.nextLine();

				if(doYouwantToContinue.equals("N")) {
					break;
					
				}

			}

		}

		}