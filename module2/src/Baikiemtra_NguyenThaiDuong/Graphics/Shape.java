package Baikiemtra_NguyenThaiDuong.Graphics;

public class Shape implements draw{
    private String name;
    private boolean filled;
    private double radius=1.0;
    private String color="Red";
    private final double PI=3.14;

    public Shape() {
    }

    public Shape(double radius){
        this.radius=radius;
    }

    public Shape(boolean filled) {
        this.filled = filled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPI() {
        return PI;
    }

    public void draw(){
        System.out.println(" ve hinh shape ");
    }
    public double calcPerimeter(){
        return (radius*2.0)*PI;
    }

    public double calcArea(){
        return PI*radius*radius;
    }

    @Override
    public void drawSquare() {
        System.out.println(" ve hinh shape ");
    }

    @Override
    public void drawSquareEmpty() {

    }

    @Override
    public void drawCircle() {

    }

    @Override
    public void drawCircleEmpty() {

    }

    @Override
    public void drawTriangle() {

    }

    @Override
    public void drawReverseTriangle() {

    }
}
