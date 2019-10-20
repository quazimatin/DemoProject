package basic;


import java.util.Scanner;

public class EmployeeCalculatorV4 {


	// Variable Declation  
	static String nameOfEmployee;
	static double numberOfHourWorked;
	static double hourlyPayRate;
	static  double grossPay;
	static double netPay;

	

	// Module : Wellcome 
	public static void wellCOme() {
		System.out.println("Well Come to EMP Cal - Please Follow the Instruction .... ");
		System.out.println("");
		System.out.println("");
	}

	public static void getInput() {

		
		

		// Taking a object Reference for Scanning information from any Input syste
		Scanner hrscan = new Scanner(System.in);


		System.out.println("Enter Employee Name ");
		nameOfEmployee = hrscan.nextLine();

		System.out.println("Enter Employee Total Hour ");
		numberOfHourWorked = hrscan.nextDouble();


		System.out.println("Enter Employee Hrate");
		hourlyPayRate = hrscan.nextDouble();

	}

	public static void calculateGrossPay() {
		
		
		
		// Process
		grossPay = numberOfHourWorked * hourlyPayRate;

	}

	
	public static void calculateNetPay() {
		
		if(grossPay>0 && grossPay<=1500) {
			netPay = grossPay - (grossPay*10)/100;
		} else if(grossPay > 1500 &&  grossPay<=3000 ) {
			netPay = grossPay - (grossPay*20)/100;
		} else if(grossPay > 3000 &&  grossPay<=4500 ) {
			netPay = grossPay - (grossPay*30)/100;
		} else if(grossPay > 4500 &&  grossPay<=6000 ) {
			netPay = grossPay - (grossPay*40)/100;
		} else if(grossPay > 6000  ) {
			netPay = grossPay - (grossPay*50)/100;
		} 
		else {
			netPay = 0;
			System.out.println("Invalid Input Captured!!!!");
		}

		
	}
	
	
	
	public static void displayOutput() {

		
		// Display Out Put
		System.out.println("");
		System.out.println("==================================================");
		System.out.println("Employee Name is : " + nameOfEmployee);
		System.out.println("Employee Total Hour is : " +numberOfHourWorked);
		System.out.println("Employee Hourly Rate is  : "+ hourlyPayRate);
		System.out.println("Employee Gross is  : "+ grossPay);
		System.out.println("Employee Netpay is  : "+ netPay);

		System.out.println("==================================================");


	}

	public static void exitProgram() {


		System.out.println("");
		System.out.println("");
		System.out.println("Well Come to EMP Cal - Please Follow the Instruction .... ");

	}




	public static void main(String[] args) {

		
		wellCOme();

		
		// Pre Conditonal Loop 
		
		for(int i=0; i<3;i++) {
			
			System.out.println("Employee  : " + (i+1) + "******");
			
			getInput();
			calculateGrossPay();
			calculateNetPay();
			displayOutput();
			
			
			String doYouwantToContinue;
			Scanner choiceScanner = new Scanner(System.in);
			
			
			System.out.println("DO You Want to continue ...");
			doYouwantToContinue = choiceScanner.nextLine();
			
			if(doYouwantToContinue.equals("no")) {
				break;
			}
			
			
			
		}
		
		
		
	
		exitProgram();
				
		
	}

}
