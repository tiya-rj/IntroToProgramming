package day06_ifStatements;

public class OperatorPrecedence {

    public static void main(String[] args) {

        System.out.println( 5 + 2 * 3); // 5 + 6 = 11

        System.out.println( -5 + 3); // -2

        System.out.println( 10 > 9 == 8 < 7 );
                            // true == false ==> false

        System.out.println( 7 + 3 - 2 / 2); // 9

        System.out.println( 10 > 9 == 8< 7 && "Jave" == "Python" || 'a'== 'A');
        //                    true == false && false             || false
        //                                 false || false
        //                                       ==> false
    }
}
