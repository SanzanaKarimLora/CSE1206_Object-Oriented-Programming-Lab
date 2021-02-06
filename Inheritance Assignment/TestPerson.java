
public class TestPerson {
    public static void main( String args[]){
        
        Student s1 = new Student("Rini", "Dhaka", 2, 500);
        
        s1.setProgram("CSE");
        System.out.println("Program is : " + s1.getProgram());
        System.out.println(s1);
        
        Stuff st1 = new Stuff("Matin", "Comilla", "VNS", 2000);
        System.out.println(st1);
    }
    
}
