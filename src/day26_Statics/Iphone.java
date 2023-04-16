package day26_Statics;

public class Iphone {


    public static String brand = "Apple"; //it's static, you can initialize it right away bc there is only 1 object

    public String model; // it's instance bc iphone has different model
    public String color;
    public int price;
    public static String OS = "iOS";
    public static String madeIn = "China";
    public static boolean hasBattery = true;
    public static boolean isTouchScreen = true;

    public Iphone(String model, String color, int price) { //initialize it by using constructor and the option was only for instance objects
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public void printPhoneInfo(){ //instance method accept both instance variable and static
        System.out.println("brand = " + brand);
        System.out.println("model = " + model);
        System.out.println("color = " + color);
        System.out.println("price = " + price);
    }
    public static void printOperatingSystem(){ //static variable use static method
        System.out.println("Operating System: " + OS);
    }


    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';


    }
}
