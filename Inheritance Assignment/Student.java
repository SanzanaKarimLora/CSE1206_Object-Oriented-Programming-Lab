
public class Student extends Person {
    
    private String program;
    private int year;
    private double fee;
    
    public Student(String name, String address, int year, double fee){
        super(name, address);
        this.year = year;
        this.fee = fee;
        
    }
    
    public String getProgram(){
        return this.program;
    }
    
    public void setProgram(String program){
        this.program = program;
    }
    
    public int getYear(){
        return this.year;
    }
    
    public void setYear(int year){
        this.year = year;
    }
    
    public double getFee(){
        return this.fee;
    }
    
    public void setFee(double fee){
        this.fee = fee;
    }
    
    public String toString(){
        return super.toString() + "program = " + this.program + " year = " + this.year + " fee = " + this.fee;
    }
    
}
