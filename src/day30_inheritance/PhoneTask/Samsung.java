package day30_inheritance.PhoneTask;

public class Samsung extends MobilePhones{

    public Samsung (String model, String size, double price, String color){
        super("Samsung",model,size,price,color);

    }
    public void freeze(){
        System.out.println(getBrand()+" freezes a lot");
    }
}
/*
2.2 Samsung:
					Extra methods:
						freeze()
 */