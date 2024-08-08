package QE;

public class QEMain {
	    public static void main(String[] args) {
	      
	        Account acc1 = new Account("A001", "John Doe", 1000);
	        Account acc2 = new Account("A002", "Jane Smith");

	     
	        System.out.println("Account 1: " + acc1); 
	        System.out.println("Account 2: " + acc2);

	        
	        acc1.credit(500);
	        acc2.credit(200);
	        acc1.debit(200);
	        acc2.debit(100);

	     
	        System.out.println("Updated Account 1: " + acc1); 
	        System.out.println("Updated Account 2: " + acc2); 

	      
	        acc1.transferTo(acc2, 300);

	      
	        System.out.println("Final Account 1: " + acc1); 
	        System.out.println("Final Account 2: " + acc2); 
	    }
	}