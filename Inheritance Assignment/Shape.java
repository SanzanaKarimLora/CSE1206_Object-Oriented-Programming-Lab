
public class Shape {
    
    private String color;
    private boolean filled;
    
    public Shape(){
        this.color = "green";
        this.filled = true;
    }
    
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public boolean isFilled(){
        return this.filled;
    }
    
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    
    public String toString(){
        return "A Shape with color of " + this.color + " and " + this.filled;
    }
    
}
