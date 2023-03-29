package day18_garbageCollection.day15_whileLoop;

public class RemoveDuplicateByUsingContinue {

    public static void main(String[] args) {

        String str = "xyzxyzxyz";

        String result = "";

        for (int i = 0; i < str.length(); i++) { //length --> find the end of index

            if(result.contains( ""+ str.charAt(i))){ //add ""+ to concate it to string.  if the character is already contain in the new string then-->
                continue; //skip it.
            }
            result +=str.charAt(i); // then add it to result

        }
        System.out.println(result);

    }
}
