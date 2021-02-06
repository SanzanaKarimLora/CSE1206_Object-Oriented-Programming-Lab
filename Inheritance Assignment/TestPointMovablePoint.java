
public class TestPointMovablePoint {
    public static void main( String args[]){
        
        Point p1 = new Point(1.2f, 2.3f);
        System.out.println(p1);
        Point p2 = new Point(); 
        System.out.println(p2);

        p1.setX(3.3f); 
        p2.setY(4.4f);
        System.out.println(p1);
        System.out.println("x is: " + p1.getX());
        System.out.println("y is: " + p1.getY());
        
        p1.setXY(4.5f, 3.5f);
        System.out.println(p1);
        System.out.println("xy is:"+ p1.getXY());
        
        
        MovablePoint mp1 = new MovablePoint(1.1f, 2.2f, 3.3f, 4.4f);
        MovablePoint mp2 = new MovablePoint(1.5f, 2.5f);
        MovablePoint mp3 = new MovablePoint();
        
        System.out.println(mp1);
        System.out.println(mp2);
        System.out.println(mp3);
        
        mp1.setXSpeed(3.6f); 
        mp2.setYSpeed(4.6f);
        System.out.println(mp1);
        System.out.println("x is: " + mp1.getXSpeed());
        System.out.println("y is: " + mp1.getYSpeed());
        
        mp1.setSpeed(4.5f, 3.5f);
        System.out.println(mp1);
        System.out.println("Speed is:"+ mp1.getSpeed());
        
        System.out.println(mp1.move());

    }
    
}
