package basic;

import java.util.Calendar; 


public class Variable {  
	
   public static void main(String[] args) {  
   Calendar calendar = Calendar.getInstance();  
   System.out.println("The current date is : " + calendar.getTime());  
   calendar.add(Calendar.DATE, +15);  
   System.out.println("Departure Date: " + calendar.getTime());  
   
   }
   }
   
   //calendar.add(Calendar.Time, 22:00);  
   //System.out.println("4 months later: " + calendar.getTime());  
   //calendar.add(Calendar.YEAR, 2);  
   //System.out.println("2 years later: " + calendar.getTime());  
   //}  
//}  