package day36_polymorphismCasting;


import day30_inheritance.PhoneTask.Samsung;
import day30_inheritance.PhoneTask.Iphone;
import day30_inheritance.PhoneTask.MobilePhones;

public class MobilePhoneTask {

    public static void main(String[] args) {

        //   IPhone phone = new Phone("Iphone 11 Pro", "Large", "Black", 900);
        // cannot be Iphone bc it will run Iphone methods


        MobilePhones [] phones = {
                new Iphone("Iphone 11 Pro", "Large", 699,"Black"),
                new Iphone("Iphone 12 Pro Max", "Large", 799,"Black"),
                new Iphone("Iphone 9", "Medium", 399,"Gold"),
                new Samsung("Galaxy S19", "Medium",399, "Pink"),
                new Samsung("Galaxy S20", "Large", 599,"Silver"),
                new Samsung("Galaxy S21", "Large", 999,"Black"),
                new Iphone("Iphone 12 Pro", "Large",899, "Black"),
                new Iphone("Iphone 11 Pro Max", "Large", 799,"Silver"),
                new Samsung("Galaxy S18", "Medium", 899,"White"),
                new Samsung("Galaxy S17", "Large",677, "Silver"),
                new Iphone("Iphone 6", "Small", 299,"Gold"),
                new Iphone("Iphone 7", "Small", 366,"White")
        };

        for (MobilePhones each : phones) {

            System.out.println(each.getModel()+ "-"+ each.getColor()+ "-"+ each.getPrice());
        }

        int countIphone = 0;
        int countSamsung = 0;
        for (MobilePhones each : phones) {
            if( each instanceof Iphone){
                countIphone++;
            }

        } System.out.println(countIphone);

        for ( MobilePhones each : phones) {
            if(each instanceof Samsung){
                countSamsung++;
            }
        }
        System.out.println(countSamsung);

        for ( MobilePhones each : phones) {
            if (each instanceof Iphone || each instanceof Samsung) {
                if(each.getPrice() >= 700){
                    System.out.println(each.getModel());
                }
            }
        }



    }

}

/*
1. print the model, color and price of each phone object in the following format
    				model - color - price

	2. How many Iphones in the array of phones?

	3. How many Samsungs in the array of phones?

	4. Display the models of Iphones and samsung that has the price of 700 or greater
 */
