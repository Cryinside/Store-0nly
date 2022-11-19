package ss04_ClassObject_java.btap;

public class ClassFan {
    public static final  int slow=1;
    public static final int medium=2;
    public static final int fast=3;
    private int speed=slow;
    private boolean on=false;
    private double radius=5;
    private String color="blue";
    public int getSpeed(){
        return this.speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }
    public void setOn(boolean on){
        this.on=on;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public void setColor(String color){
        this.color=color;
    }
    @Override
    public String toString() {
        return "ClassFan {" +
                "speed=" + speed +
                ", on=" + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public ClassFan(){};

}
