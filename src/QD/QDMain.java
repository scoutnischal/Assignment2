package QD;

public class QDMain {
    public static void main(String[] args) {
    
        InvoiceItem item1 = new InvoiceItem("ITM001", "Laptop", 2, 1200.0);

   
        System.out.println(item1);

      
        item1.setQty(3);
        item1.setUnitPrice(1250.0);

     
        System.out.println("Updated quantity: " + item1.getQty()); 
        System.out.println("Updated unit price: " + item1.getUnitPrice()); 

      
        System.out.println("Total price: " + item1.getTotal()); 
    }
}