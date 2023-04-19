package day27_accessModifiers;

    public class Car { // outer class

        public String make, model, color;
        public int year;
        public double price;

        public static int wheels = 4;

        public class CarEngine{ // Inner,, without car class (outer class). we cannot make CarEngine class

            public void method(){
                System.out.println(make);
                System.out.println(wheels);
            }

        }


        public static class StaticInnerClass{ //only the inner class can be static

            public void method(){
                //  System.out.println(make); static only accepts static
                System.out.println(wheels);
            }

        }




    }


