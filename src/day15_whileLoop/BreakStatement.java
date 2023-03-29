package day15_whileLoop;

public class BreakStatement {

    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {

            if(i==3){ // if the value reach 3 --> terminate
                break;
            } // wanted to stop the loop without changing the function


            System.out.println(i);


        }
    }
}
