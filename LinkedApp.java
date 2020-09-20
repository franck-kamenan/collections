package be.intecbrussel.collections;

import java.util.*;

public class LinkedApp {

    public static void main(String[] args) {

        Integer[] intArray = new Integer[]{2, 5, 8, 11, 6, 10, 8};
        LinkedList<Integer> intCollection = new LinkedList<>();
        intCollection.addAll(Arrays.asList(intArray));

        intCollection.add(15);

        System.out.println(intCollection.getFirst());
        System.out.println(intCollection.getLast());


    }
}
