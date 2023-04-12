package day25_constructors;

public class Rectangle {

    //without using setInfo method bc you have to call it to use everytime

    public double length,width;

    public Rectangle(double length,double width){ // setting constructor to run it automatic (needs to have the same name as class)
        this.length = length; // use this. to call length and width
        this.width = width;
    }
    public double area(){
        return  length*width;
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area() +
                '}';
    }
}
