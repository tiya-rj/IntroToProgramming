package day26_Statics;

public class IphoneObjectsTesting {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("13pro", "blue",999);

        System.out.println(iphone.model);
        System.out.println(iphone.color);
        System.out.println(iphone.price);

        iphone.printPhoneInfo();

        System.out.println(iphone.brand);
        System.out.println(iphone.OS);

        System.out.println(Iphone.hasBattery); // calling static should call from class name (Iphone) not object(iPhone) otherwise will get warning (line15,16)

        System.out.println(Iphone.brand);


    }
}
