
public class Test {
    public static void main( String args[]){
        
        Shape s1 = new Shape();
        Shape s2 = new Shape("pink", false);
        
        System.out.println(s1);
        System.out.println(s2);
        
        s2.setColor("blue");
        System.out.println(s2);
        System.out.println("Color : " + s2.getColor());
        
        s2.setFilled(true);
        System.out.println(s2);
        System.out.println("Filled : " + s2.isFilled());
        
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.6);
        Circle c3 = new Circle(1.2, "red", true);
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        
        System.out.println("Radius : " + c2.getRadius());
        c2.setRadius(3.2);
        c3.setRadius(2.3);
        System.out.println("Radius : " + c1.getRadius());
        System.out.println("Radius : " + c2.getRadius());
        System.out.println("Radius : " + c3.getRadius());
        
        System.out.println("Area of c1: " + c1.getArea());
        System.out.println("Area of c2: " + c2.getArea());
        System.out.println("Area of c3: " + c3.getArea());
        
        System.out.println("Perimeter of c1: " + c1.getPerimeter());
        System.out.println("Perimeter of c2: " + c2.getPerimeter());
        System.out.println("Perimeter of c3: " + c3.getPerimeter());
        
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(2.1, 3.2);
        Rectangle r3 = new Rectangle(4.2, 3.1, "gray", true);
        
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        
        r1.setWidth(7.8);
        r2.setWidth(3.5);
        r3.setWidth(1.2);
        
        System.out.println("Width of r1: " + r1.getWidth());
        System.out.println("Width of r2: " + r2.getWidth());
        System.out.println("Width of r3: " + r3.getWidth());
        
        r1.setLength(6.4);
        r2.setLength(4.4);
        r3.setLength(1.9);
        
        System.out.println("Length of r1:" + r1.getLength());
        System.out.println("Length of r2:" + r2.getLength());
        System.out.println("Length of r3:" + r3.getLength());
        
        System.out.println("Area of r1: " + r1.getArea());
        System.out.println("Area of r2: " + r2.getArea());
        System.out.println("Area of r3: " + r3.getArea());
        
        System.out.println("Perimeter of r1: " + r1.getPerimeter());
        System.out.println("Perimeter of r2: " + r2.getPerimeter());
        System.out.println("Perimeter of r3: " + r3.getPerimeter());
        
        
        Square sq1 = new Square();
        Square sq2 = new Square(3.9);
        Square sq3 = new Square(2.8, "black", false);
        
        System.out.println(sq1);
        System.out.println(sq2);
        System.out.println(sq3);
        
        sq2.setLength(2.2);
        sq3.setLength(2.2);
        sq3.setWidth(2.2);
        sq3.setWidth(2.2);
        sq2.setSide(3.6);
        sq3.setSide(2.7);
        
        System.out.println("Side of sq2: " + sq2.getSide());
        System.out.println("Side of sq3: " + sq3.getSide());
        
        System.out.println("Width of sq1: " + sq1.getWidth());
        System.out.println("Width of sq2: " + sq2.getWidth());
        System.out.println("Width of sq3: " + sq3.getWidth());
        
        System.out.println("Length of sq1:" + sq1.getLength());
        System.out.println("Length of sq2:" + sq2.getLength());
        System.out.println("Length of sq3:" + sq3.getLength());
        
        
        
        
        
    }
    
    
}
