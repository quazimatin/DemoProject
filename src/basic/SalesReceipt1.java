package basic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SalesReceipt1{

		static String customerName;
		static String productName;
		static double quantityPurchase;
		static double priceForTheProduct;
		static double grossAmountPay;
		static double taxAmountPay;
		static double discountAmount;
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


			System.out.println("customerName");
			customerName = salessummary.nextLine();

			System.out.println("Enter Three Name Of Product" + "(Press Enter after each):" );
			String n1, n2, n3;
			n1 = salessummary.nextLine();
			n2 = salessummary.nextLine();
			n3 = salessummary.nextLine();
			
			productName = n1+n2+n3;
			
			
			System.out.println("Enter Three Quantity Of Product" + "(Press Enter after each):" );
			double q1,q2,q3;
			q1 = salessummary.nextDouble();
			q2 = salessummary.nextDouble();
			q3 = salessummary.nextDouble();
			
			quantityPurchase= q1+q2+q3;
			
			
			System.out.println("Enter Three Price Of Product" + "(Press Enter after each):" );
			double p1,p2,p3;
			p1 = salessummary.nextDouble();
			p2 = salessummary.nextDouble();
			p3 = salessummary.nextDouble();
			
			priceForTheProduct = p1+p2+p3;
			
			 grossAmountPay = (q1*p1)+(q2*p2)+(q3*p3);
			 salessummary.close();
		}
			 
			 
		public static void calculateTaxPay() {

						taxAmountPay =  (grossAmountPay*8.75)/100; 
					
					}


        public static void calculateDiscountPay() {
			
			if(grossAmountPay>0 && grossAmountPay<100) {
				discountAmount =  - 5; 
			}else if(grossAmountPay >=100 &&  grossAmountPay<500 ) {
				discountAmount  =  - 10;
			} else if(grossAmountPay >= 500 && grossAmountPay<1000 ) {
				discountAmount   = - 20;
			} else if(grossAmountPay >=1000) {
				discountAmount  =  - 30;
			} else {
				netAmountPay = 0;
				System.out.println("Invalid Input Captured!!!!");
			}
			
		}
		
		
		public static void calculateNetPay() {
			
			if(grossAmountPay>0 && grossAmountPay<100) {
				netAmountPay = grossAmountPay - 0; 
			}else if(grossAmountPay >=100 &&  grossAmountPay<500 ) {
				netAmountPay = grossAmountPay - 10;
			} else if(grossAmountPay >= 500 && grossAmountPay<1000 ) {
				netAmountPay  = grossAmountPay- 20;
			} else if(grossAmountPay >=1000) {
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
			System.out.println("                  QUAZI SUPER MALL             ");
			System.out.println("                   SALES RECEIPT               ");
			System.out.println("*****************************************************");
			System.out.println("Customer Name                 : " + customerName);
			System.out.println("Product Name                  : " + productName);
			System.out.println("Quantity Purchase             : "+ quantityPurchase);
			System.out.println("Price For The Product         : "+ priceForTheProduct);
			System.out.println("Gross Amount Pay              : "+ grossAmountPay);
			System.out.println("Tax Payable(8.75%)            : "+ taxAmountPay);
			System.out.println("Discount Amount               : "+ discountAmount);
			System.out.println("Net Amount Pays               : "+ (netAmountPay+taxAmountPay));

			System.out.println("******************************************************");
			

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
				calculateTaxPay();
				calculateDiscountPay();
				calculateNetPay();
				displayOutput();
				dateTime();
				System.out.println("******************************************************");
				exitProgram();


				String doYouwantToContinue;
				Scanner choiceOption = new Scanner(System.in);


				System.out.println("DO You Want to continue ...");
				System.out.println("Enter Y or N");
				
				doYouwantToContinue = choiceOption.nextLine();

				if(doYouwantToContinue.equals("N")) {
					break;}
					choiceOption.close();
				

			}

		}

		

		}