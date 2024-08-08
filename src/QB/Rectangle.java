package QB;

public class Rectangle {

 private float length;
 private float width;


 public Rectangle() {
     this.length = 1.0f;
     this.width = 1.0f;
 }

 public Rectangle(float length, float width) {
     this.length = length;
     this.width = width;
 }


 public float getLength() {
     return length;
 }

 public void setLength(float length) {
     this.length = length;
 }

 public float getWidth() {
     return width;
 }

 public void setWidth(float width) {
     this.width = width;
 }

 public double getArea() {
     return length * width;
 }

 public double getPerimeter() {
     return 2 * (length + width);
 }

 @Override
 public String toString() {
     return "Rectangle[length=" + length + ", width=" + width + "]";
 }

 
 public static void main(String[] args) {
     Rectangle rectangle1 = new Rectangle();
     System.out.println(rectangle1); 

     Rectangle rectangle2 = new Rectangle(5.0f, 3.0f);
     System.out.println(rectangle2); 

     rectangle2.setLength(7.5f);
     rectangle2.setWidth(4.2f);
     System.out.println("Length: " + rectangle2.getLength()); 
     System.out.println("Width: " + rectangle2.getWidth());   

     System.out.println("Area: " + rectangle2.getArea());       
     System.out.println("Perimeter: " + rectangle2.getPerimeter()); 
 }
}