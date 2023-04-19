package day27_accessModifiers;

public class CarNestedClassObjectTesting {

        public static void main(String[] args) {

            Car obj1 = new Car(); // Car object
            Car.CarEngine obj2 = obj1.new CarEngine(); // CarEngine object

            Car.StaticInnerClass obj3 =  new Car.StaticInnerClass();
            //to use static class, you don't need an object
            //can call the inner class static through the outer class name



        }

    }
