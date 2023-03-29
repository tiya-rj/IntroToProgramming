package day18_garbageCollection.day15_whileLoop;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "aabbbcccc";
        String new_str = "";

        for(int i =0; i < str.length(); i++){

            char each = str.charAt(i);

            if(!new_str.contains(""+ each)){ //contains accept boolean, so boolean is string, so concate char to string by added empty space.
                new_str += each;

            }

        }
        System.out.println(new_str);

    }
}
