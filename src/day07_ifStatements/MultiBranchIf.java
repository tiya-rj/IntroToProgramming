package day07_ifStatements;

public class MultiBranchIf { // it's for non pre-condition

    public static void main(String[] args) {

        int num = -100;
        String result ="";

        if (num > 0 ){
            result = "Positive";
        } else if (num == 0) {
            result = "Zero";
        } else {
            result = "Negative";

        }
        System.out.println(result);
    }
}
