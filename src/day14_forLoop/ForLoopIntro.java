package day14_forLoop;

public class ForLoopIntro { // for  loop use when you know how many time you want to run

    public static void main(String[] args) {

        for(int i =1; i <=10; i+=1){ //want to print "hi" 10 times or <11; i++
            System.out.println("hi");
        }

        /* for(int i =5; i <= 10; i--){  i = 5-1 =4 ,3 ,2... infinite
            System.out.println("mom");  this is wrong condition that's why it run infinitive */

        for(int i=10; i>=5; i--) { //i=10,9,8,7,6,5 = 6 printout
            System.out.println("woohoo");
        }

        int sum =0;
        for(int i =1; i <=100; i++) {
            sum += i;
        }
            System.out.println(sum);

        System.out.println("--------------------------------------------------");



        for (char letter = 'A'; letter <= 'Z'; letter ++ ){
            System.out.print(letter+" ");
        }


    }




}
