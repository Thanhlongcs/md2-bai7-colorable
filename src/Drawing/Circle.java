package Drawing;

public class Circle extends Shape {
    private double radius = 1.0;
    private final double PI = 3.14159;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getArea(){
        return PI*this.radius*this.radius;
    }
    public double perimeter(){
        return 2*Math.PI*this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                ",radius=" + radius +
                ",area = "+this.getArea()+
                '}';
    }
}
