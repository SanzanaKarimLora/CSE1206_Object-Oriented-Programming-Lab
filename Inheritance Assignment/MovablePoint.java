
public class MovablePoint extends Point {
    
    private float xSpeed;
    private float ySpeed;
    
    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    
    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    
    public MovablePoint(){
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }
    
    public float getXSpeed(){
        return this.xSpeed;
    }
    
    public void setXSpeed(float xSpeed){
        this.xSpeed = xSpeed;
    }
    
    public float getYSpeed(){
        return this.ySpeed;
    }
    
    public void setYSpeed(float ySpeed){
        this.ySpeed = ySpeed;
    }
    
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    
    public float[] getSpeed(){
        float[] a = {this.xSpeed, this.ySpeed};
        return a;
    }
    
    public MovablePoint move(){
        this.xSpeed += xSpeed;
        this.ySpeed += ySpeed;
        return this;
    }
    @Override
    public String toString(){
        return super.toString() + " , speed = (" + this.xSpeed + "," + this.ySpeed + ")";
    }
    
    
}
