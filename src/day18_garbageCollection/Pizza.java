package day18_garbageCollection;

public class Pizza {

    public char size;
    public int numberOfCheeseTopping, numberOfPepperoniTopping;




    public double calcCost() { //we want to be able to use it again so don't use void. and we make it instance mathod bc every object has they own memory.
        double totalPrice = 0;

        switch (size){
            case 'S':
            case 's':
                totalPrice = 10 + 2 * (numberOfPepperoniTopping + numberOfCheeseTopping);
                break;

            case 'M':
            case 'm':
                totalPrice = 12 + 2 * (numberOfPepperoniTopping + numberOfCheeseTopping);
                break;

            case 'L':
            case 'l':
                totalPrice = 14 + 2 * (numberOfPepperoniTopping + numberOfCheeseTopping);
                break;

            default:
                System.out.println("Invalid size: " +size);

        }

        return totalPrice;
    } // calculates the total price of the pizza, returns it as double

    public String toString() { //use for display the pizza object.
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total price=" + calcCost() +
                '}';
    }

    public void setInfo(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }
}



/*

	1. Create a class named Pizza:
			Attributes:
				1. size
				2. numberOfCheeseTopping
				3. numberOfPepperoniTopping

			Actions:
				calcCost(): returns the total cost of the pizza
				toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

		Pizza cost is determined by:
		                S: $10 + $2 per topping
		                M: $12 + $2 per topping
		                L: $14 + $2 per topping
 */