
public class Stuff extends Person {
    
    private String school;
    private double pay;
    
    public Stuff(String name, String address, String school, double pay){
        super(name, address);
        this.school = school;
        this.pay = pay;
    }
    
    public String getSchool(){
        return this.school;
    }
    
    public void setSchool(String school){
        this.school = school;
    }
    
    public double getPay(){
        return this.pay;
    }
    
    public void setPay(double pay){
        this.pay = pay;
    }
    
    public String toString(){
        return super.toString() + " school = " + this.school + " pay = " + this.pay;
    }
    
}
