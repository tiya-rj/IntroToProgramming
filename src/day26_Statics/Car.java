package day26_Statics;

public class Car {

    public String make, model;
    public int year;
    public double price;
    public String color;

    public Car(String make) {
        this.make = make;
    }

    public Car(String make, String model) {
        this(make);//calling the first constructor =>this.make = make;
        this.model = model;
    }

    public Car(String make, String model, int year) {
        this(make,model);//from 2nd constructor the only constructor that have 2 string argument
        this.year = year;
    }

    public Car(String make, String model, int year, double price) {
        this(make,model,year);
        this.price = price;
    }

    public Car(String make, String model, int year, double price, String color) {
        this(make, model, year, price);
        this.color = color;


    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

}
