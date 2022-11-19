package ss04_ClassObject_java.thuchanh;

public class ClassRectangular {
    double height,width;
    public ClassRectangular(){
    }
    public ClassRectangular(double height,double width){
        this.height=height;
        this.width=width;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return (this.width+this.height)*2;
    }
    public String display(){
        return "Rectangle { " + "width=" + width + ", height=" + height + " } ";
    }
}


