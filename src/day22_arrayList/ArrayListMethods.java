package day22_arrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(); //not support primitive type so have to use wrapper class

        System.out.println(list);
        System.out.println(list.size());//empty

        list.add(10); // ArrayList size ISNOT fixed.the more you add ,the big array list it get
        list.add(20);
        list.add(30);

        System.out.println(list);

        list.add(0,1); //ArrayList is listed in order. if want to add more element it will push the rest down in order

        System.out.println(list);

        System.out.println("--------------------------------");

        ArrayList<String > animalsList = new ArrayList<>();
        animalsList.add("Elephant");
        animalsList.add("Dolphin");
        animalsList.add("Tiger");

        System.out.println(animalsList);
        System.out.println(animalsList.size());

        System.out.println(animalsList.get(2));

        String lastAnimal = animalsList.get(animalsList.size()-1); //want the last animal
        System.out.println("lastAnimal = " + lastAnimal);


    }
}
