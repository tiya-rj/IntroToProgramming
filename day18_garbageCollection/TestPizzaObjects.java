package day18_garbageCollection;

public class TestPizzaObjects {

    public static void main(String[] args) {

        Pizza order1 = new Pizza();
        order1.setInfo('S',1,2);

        System.out.println(order1);


        System.out.println("------------------------------------------------------");
        // what if we want 20 of each?

        double total = 0;

        for (int i = 0; i < 20; i++) {

            Pizza small = new Pizza();
            small.setInfo('s',2,2);
            total += small.calcCost();

            Pizza medium = new Pizza();
            medium.setInfo('m',3,4);
            total += medium.calcCost();

            Pizza large = new Pizza();
            large.setInfo('l',4,5);
            total += large.calcCost();

        }

        System.out.println("total = " + total);



    }
}
