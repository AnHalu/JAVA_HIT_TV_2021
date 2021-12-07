package Bai2;

import java.util.Scanner ;

public class Rectangle implements Ishape {

    private double length;
    private double width ;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return 2*this.length + 2*width ;
    }

    @Override
    public double getPerimeter() {
        return this.length*this.width ;
    }


}
