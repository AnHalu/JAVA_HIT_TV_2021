package Bai2;

public class Circle implements Ishape{
    public double radius ;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getPerimeter() {
        return this.radius*this.radius*3.14 ;
    }

    @Override
    public double getArea() {
        return 2*3.14*this.radius ;
    }
}
