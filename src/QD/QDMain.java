package QD;

public class QDMain {
    public static void main(String[] args) {
        // Create an InvoiceItem object
        InvoiceItem item1 = new Invoicetem("ITM001", "Laptop", 2, 1200.0);

        // Display item details using toString method
        System.out.println(item1); // Output: InvoiceItem[id=ITM001, desc=Laptop, qty=2, unitPrice=1200.0]

        // Demonstrate quantity and unit price related methods
        item1.setQty(3);
        item1.setUnitPrice(1250.0);

        // Display updated details
        System.out.println("Updated quantity: " + item1.getQty()); // Output: Updated quantity: 3
        System.out.println("Updated unit price: " + item1.getUnitPrice()); // Output: Updated unit price: 1250.0

        // Display total price
        System.out.println("Total price: " + item1.getTotal()); // Output: Total price: 3750.0
    }
}