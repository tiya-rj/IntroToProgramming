package day25_constructors;

public class RectangleObjectsTesting {

    public static void main(String[] args) {

        Rectangle rec1 = new Rectangle(3,5);
        Rectangle rec2 = new Rectangle(4,9);
        /*better than use setInfo
        Rectangle rec2 = new Rectangle();
        Rec2.setInfo(4,9);
         */



        System.out.println(rec1);
        System.out.println(rec2);
    }


}
