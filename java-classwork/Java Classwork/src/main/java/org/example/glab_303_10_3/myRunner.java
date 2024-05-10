package org.example.glab_303_10_3;

public class myRunner {
    public static void main(String[] args) {
        Circle c = new Circle(100);
        System.out.println("Area of Circle " + c.getArea());
        System.out.println("+++++++++++++++++");
        Shape shapeCircleObj = new Circle(100); // UpCasting
        shapeCircleObj.displayshapeName();
        System.out.println("Area of Circle " + shapeCircleObj.getArea());
        System.out.println(shapeCircleObj); // Run circle's toString()
        System.out.println(shapeCircleObj instanceof Circle); // true
        System.out.println("+++++++++++++++++");
        Shape shapeRectangleObj = new Rectangle("Red"); //UpCasting
        shapeRectangleObj.displayshapeName();
        shapeRectangleObj.setHeight(2);
        shapeRectangleObj.setWidth(4);
        System.out.println("Area of Rectangle is " +
                shapeRectangleObj.getArea());
        System.out.println(shapeRectangleObj); // Run Rectangle's toString()
        System.out.println(shapeRectangleObj instanceof Rectangle); // true
        System.out.println("--------------------");
        Shape shapeTriangleObj = new Triangle("Blue"); //UpCasting
        shapeTriangleObj.displayshapeName();
        shapeTriangleObj.setHeight(10);
        shapeTriangleObj.setBase(15);
        System.out.println("Area of Triangle is " + shapeTriangleObj.getArea());
        System.out.println(shapeTriangleObj); // Run Triangle's toString()
    }
}
