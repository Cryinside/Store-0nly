package ss06_Inheritance.btap;

public class Point3D extends Point2D{
    private float z=0.0f;

    public Point3D(){}
    public Point3D(float x ,float y, float z){
        super(x,y);
        this.z=z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ(){
        float[] arr1={getX(), getY(), this.z };
        return arr1;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x = " + getX() +
                "y = " + getZ() +
                "z = " + this.z +
                '}';
    }
}
