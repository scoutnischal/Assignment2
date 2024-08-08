package QC;

public class QCMain {
    public static void main(String[] args) {
     
        Employee emp1 = new Employee(1, "John", "Doe", 50000);

       
        System.out.println(emp1); 

     
        emp1.raiseSalary(10);
        System.out.println("Updated salary: " + emp1.getSalary()); 
        System.out.println("Annual salary: " + emp1.getAnnualSalary()); 
    }
}