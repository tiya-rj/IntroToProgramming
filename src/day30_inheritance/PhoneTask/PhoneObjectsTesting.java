package day30_inheritance.PhoneTask;

public class PhoneObjectsTesting {

    public static void main(String[] args) {
         Iphone iphone = new Iphone("13pro","medium",999,"Pink");
         Samsung samsung = new Samsung("S22", "medium", 999, "Black");


        System.out.println(iphone);
        System.out.println(samsung);

        iphone.call(1234);
        samsung.call(1664);

        iphone.text(1996);

        iphone.faceTime(12345);
        //samsung.faceTime
    }
}
