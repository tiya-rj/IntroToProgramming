package day22_arrayList;

public class MaxMinNumsOfMultiDArray {

    public static void main(String[] args) {

        int[][] array = {{100,20,300},{10,1000,50},{-200,400,0}};

        int max = array[0][0];
        int min = array[0][0];

        for (int[]each1D : array) {
            for (int eachElement : each1D) {

                if (eachElement > max) {
                    max = eachElement;
                }

                if(eachElement<min){
                    min = eachElement;
                }


            }

        }
        System.out.println("max num is = " + max);

        System.out.println("min num is = " + min);
    }
}
