package day30_inheritance.PhoneTask;

public class Iphone extends MobilePhones {

    public Iphone(String model, String size, double price, String color){// can remove string brand out bc we set it on line 7

        super("Apple", model, size, price, color);//ask for the arguments when the data is unknown but if you know like brand is Apple you can set it.
        /*
        if parent class doesn't have default constructor( means there's arguments) to get rid of the error has to call constructor from the super class
         and only constructor can call another constructor. Also has to pass all the arguments here.

         */
    }
    public static boolean hasApplePay = true;
    public void faceTime(long phoneNumber){
        System.out.println(getModel()+" is face timing with "+phoneNumber);

    }
    public void faceTime (String email){
        System.out.println(getModel()+ " is face timing with "+ email);

    }


}

/*
2.1 Iphone:
					Extra methods:
						faceTime(phoneNumber)
						faceTile(email)
 */
