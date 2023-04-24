package day30_inheritance.PhoneTask;

import java.util.Arrays;

public class MobilePhones {

    private String brand,model,size;
    private double price;
    private String color;

    public MobilePhones(String brand, String model, String size, double price, String color) {
        setBrand(brand);
        setColor(color);
        setModel(model);
        setPrice(price);
        setSize(size);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<=0){
            System.err.println("invalid price: "+price);
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        String[] colors = {"Black", "White", "Silver", "Gold", "Pink"}; // array for colors
        if(Arrays.asList(colors).contains(color)){
            this.color = color;
        } else{
            System.err.println("invalid color: "+color);
            System.exit(1);
        }

    }

    public void call (long phoneNumber){
        System.out.println(getBrand()+ " is calling" +phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println(getBrand()+" is texting" +phoneNumber);
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
1. Create a named Phone:
				Variables:
					brand, model, size, price, color
				Encapsulate all the fields
					Conditions:
						1. price can not be zero or negative
						2. color can only be set to:
								{"Black", "White", "Silver", "Gold", "Pink"}
				Add a constructor that can set all the fields
				Methods:
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */