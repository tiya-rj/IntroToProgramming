package day25_constructors;

public class ConstructorsIntro {
    //any constructor cannot have any return type like void
    public ConstructorsIntro(){
        System.out.println("Constructor can be executed automatically ");
    }

    public ConstructorsIntro(int a){ //can be override with different variable
        System.out.println("Constructor can be executed automatically ");
    }

    public void add(){

    }
    public static void main(String[] args) {

        ConstructorsIntro obj1 = new ConstructorsIntro();
        ConstructorsIntro obj2 = new ConstructorsIntro(10); //if you are gonna pass the object. it has to be the same parameter.

    }

}
