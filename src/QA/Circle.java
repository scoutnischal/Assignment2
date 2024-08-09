package QA;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }

    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        System.out.println("Default Circle: " + defaultCircle);
        System.out.println("Area: " + defaultCircle.getArea());
        System.out.println("Circumference: " + defaultCircle.getCircumference());

        Circle customCircle = new Circle(5.0);
        System.out.println("Custom Circle: " + customCircle);
        System.out.println("Area: " + customCircle.getArea());
        System.out.println("Circumference: " + customCircle.getCircumference());

        customCircle.setRadius(10.0);
        System.out.println("Updated Custom Circle: " + customCircle);
        System.out.println("Area: " + customCircle.getArea());
        System.out.println("Circumference: " + customCircle.getCircumference());
    }
}
