package Drawing;

import Colorable.IColorable;

public class Square extends Shape implements IColorable {
    private double height;
    private double width;

    public Square() {
    }

    public Square(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
        return this.getHeight()*this.getWidth();
    }

    @Override
    public String howToColor() {
        return "full color";
    }

    @Override
    public String toString() {
        return "Square{" +
                "height=" + height +
                ", width=" + width +
                ",area = "+this.getArea()+
                '}';
    }
}
