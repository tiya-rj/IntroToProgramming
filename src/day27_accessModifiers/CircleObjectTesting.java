package day27_accessModifiers;

public class CircleObjectTesting {


    public static void main(String[] args) {

        Circle circle1 = new Circle (3.5);
        Circle circle2 = new Circle((5));

        System.out.println(circle1);
        System.out.println(circle2);

        System.out.println(circle2.pi);// wrong way

        //right way to call static is through the class name not the object
        // but instance cannot
        System.out.println(Circle.pi);


    }


}
