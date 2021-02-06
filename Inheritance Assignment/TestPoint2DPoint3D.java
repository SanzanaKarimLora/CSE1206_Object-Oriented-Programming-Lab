
public class TestPoint2DPoint3D {
    public static void main( String args[]){
        
        Point2D p2a = new Point2D(1.1f, 2.2f);
        System.out.println(p2a);
        Point2D p2b = new Point2D(); 
        System.out.println(p2b);

        p2a.setX(3.3f); 
        p2a.setY(4.4f);
        System.out.println(p2a);
        System.out.println("x is: " + p2a.getX());
        System.out.println("y is: " + p2a.getY());
        
        p2a.setXY(4.5f, 3.5f);
        System.out.println(p2a);
        System.out.println("xy is: " + p2a.getXY());

        Point3D p3a = new Point3D(1.2f, 2.3f, 3.4f);
        System.out.println(p3a); 
        Point2D p3b = new Point3D(); 
        System.out.println(p3b);

        p3a.setX(2.1f); 
        p3a.setY(2.2f); 
        p3a.setZ(2.3f); 
        System.out.println(p3a); 
        System.out.println("x is: " + p3a.getX()); 
        System.out.println("y is: " + p3a.getY()); 
        System.out.println("z is: " + p3a.getZ()); 
    }
    
}
