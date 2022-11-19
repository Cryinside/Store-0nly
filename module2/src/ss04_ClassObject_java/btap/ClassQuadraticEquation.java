package ss04_ClassObject_java.btap;

public class ClassQuadraticEquation {
    double a,b,c;
    public ClassQuadraticEquation(){};
    public ClassQuadraticEquation(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getDiscriminant(){
        return  b*b-4*a*c;
    }
    public double getRoot1(){
        return (-b+Math.sqrt(b*b-4*a*c))/2*a;
    }
    public double getRoot2(){
        return (-b-Math.sqrt(b*b-4*a*c))/2*a;
    }
}
