package day26_Statics;

public class CarObjectsTesting {

    public static void main(String[] args) {

        Car car1 = new Car("Lexus");

        System.out.println(car1);

        Car car2 = new Car ("Honda", "fit");

        System.out.println(car2);

        Car car3 = new Car("Honda", "fit",2011,6700, "black");

        System.out.println(car3);
    }



}
