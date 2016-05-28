import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args){
		
		//To check total number of days in the given month.
		
		int month;
		Scanner sc=new Scanner(System.in);
		System.out.print("\n Which Month it is??\n");
		
		month=sc.nextInt();
		
		
		
		
		switch(month){
         case 1:
         case 3:
         case 5:
         case 7:
         case 8:
         case 10:
         case 12:
            
        	 System.out.println("this month have 31 days");
             break;
         case 4:
         case 6:
         case 9:
         case 11:
            
        	 
        	 System.out.println("this month have 30 days");
        	 
             break;
 
	  
	}
		  /*if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
		    {
		        System.out.println("this month have 31 days");
		    }
		    else if(month==4 || month==6 || month==9 || month==11)
		    {
		    	 System.out.println("this month have 30 days");
		    }
		    else if(month==2)
		    {
		    	 System.out.println("this month have 28 or 29 days");
		    }
		    else
		    {
		    	 System.out.println("Invalid input! Please enter month number between (1-12).\n");
		    }*/
		 

	}
}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


