package be.intecbrussel.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class App2 {

    public static void main(String[] args) {

        Integer[] intArray = new Integer[]{2, 5, 8, 11, 6, 10, 8};

        Collection<Integer> intCollection = new ArrayList<>();

        intCollection.addAll(Arrays.asList(intArray));

        intCollection.stream()
                     .mapToInt(e -> e)
                     .filter(e -> e % 2 == 1)
                     .forEach(System.out::println);
    }
}
