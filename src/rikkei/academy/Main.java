package rikkei.academy;

import Colorable.IColorable;
import Drawing.Circle;
import Drawing.Shape;
import Drawing.Square;
import Drawing.Rectangle;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Shape[] shape1 = new Shape[3];
        shape1[0] = new Circle(2.6);
        shape1[1] = new Rectangle(2,4);
        shape1[2] = new Square(6.4,6.5);


        for (Shape shape2: shape1) {
            System.out.println(shape2);
            if (shape2 instanceof IColorable){
                System.out.println(((IColorable) shape2).howToColor());
            }
        }
    }

}
