
public class Point3D extends Point2D {
    
    private float z;
    
    public Point3D(float x, float y, float z){
        super(x, y);
        this.z = z;
    }
    
    public Point3D(){
        super();
        this.z = 0.0f;
    }
    
    public float getZ(){
        return this.z;
    }
    
    
    public void setZ(float z){
        this.z = z;
    }
    
    public void setXYZ(float x, float y, float z){
        super.getXY();
        this.z = z;
        
    }
    
    /*public float[] getXYZ(){
        float[] b = {super.getXY(), this.z};
        return b;
    }*/
    
    @Override
    public String toString(){
        return "(" + this.z + ")";
    }
    
}
