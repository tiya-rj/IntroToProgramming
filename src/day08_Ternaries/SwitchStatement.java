package day08_Ternaries;

public class SwitchStatement {

    public static void main(String[] args) {
        // CANNOT be boolean, float, long and double
        // switch statement is faster than if statement
        // ONLY compare to the exact match

      /*
        char grade = 'A';

        String result = "";

        if (grade == 'A' ){
            result = "Excellent";
        } else if (grade == 'B') {
            result = "Great job";
        } else if (grade == 'C') {
            result = "Good";
        } else if ( grade == 'D') {
            result = " Passed";
        }else {
            result = "Failed";
        }
        System.out.println( result);

         */
        System.out.println("--------------------------------------------------------");

        char grade = 'B';

        switch (grade) {

            case 'A': // the case value has to match the date type (in this case is char)
                System.out.println("Excellent");
                break; // as to close the case to go forward to next case or exit if already found the answer
            case 'B':
                System.out.println("Great Job");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
                break;

            default: // ONLY run when NONE if the casing are failed
                System.out.println("Invalid");
                break;
            // default block can be place anywhere but very recommended to place it at the very end and don't need break
        }
        System.out.println("--------------------------------------------------");


            int n = 7;

            String day = "";

                switch (n){

                    case 1: day = "Monday";
                        break;
                    case 2: day = "Tuesday";
                        break;
                    case 3: day = "Wednesday";
                        break;
                    case 4: day = "Thursday";
                        break;
                    case 5: day = "Friday";
                        break;
                    case 6: day = "Saturday";
                        break;
                    case 7: day = "Sunday";
                        break;

                    default: day = "Invalid";

                }
                System.out.println(day);




        }




    }

