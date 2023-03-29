package day15_whileLoop;

public class ContinueStatement {

    public static void main(String[] args) {

        for (int i = 1; i < 6 ; i++) {

            if(i == 4){
                continue; // continue is for jumping to the next without exit.
            }

            System.out.println(i);

            System.out.println("---------------------------------------------");

        }

        for (int i = 0; i < 10; i++) {

            if( i %2 == 0){ // wanted to print out only odd number
                continue;
            }
            System.out.println(i);
            System.out.println("-------------------------------------------------");

        }

        for (char i = 'a'; i <= 'd' ; i++) {

            if( i == 'b' || i == 'e'){ // have to use || NOT && bc i has to be one char at a time                continue;
            }
            System.out.println(i);
        }


    }
}
