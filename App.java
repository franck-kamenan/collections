package be.intecbrussel.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class App {

    public static void main(String[] args) {

        Integer[] intArray = new Integer[]{2, 5, 8, 11, 6, 10, 8};

        Collection<Integer> intCollection = new ArrayList<>();

        intCollection.addAll(Arrays.asList(intArray));
        System.out.println(intCollection);
        intCollection.add(8);
        intCollection.add(100);
        System.out.println(intCollection);
        intCollection.remove(8);
        System.out.println(intCollection);

        Collection<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(11);
        intCollection.removeAll(list);
        System.out.println(intCollection);
    }
}
