package ss06_Inheritance.btap;

public class MovePoint extends Point{
    private float xSpeed=0.0f;
    private float ySpeed=0.0f;

    public MovePoint() {
    }

    public MovePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        return new float[]{this.xSpeed, this.ySpeed};
    }

    public void setSpeed(float x, float y){
        this.xSpeed=x;
        this.ySpeed=y;
    }

    @Override
    public String toString() {
        return "MovePoint{" +
                "xSpeed = " + xSpeed +
                ", ySpeed = " + ySpeed +
                ", x = " + getX() +
                ", y = " + getY() +
                '}';
    }
    public MovePoint move(){
        setXSpeed(getXSpeed()+xSpeed);
        setYSpeed(getYSpeed()+ySpeed);
        return this;
    }

}
