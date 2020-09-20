package be.intecbrussel.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class App2 {

    public static void main(String[] args) {

        Integer[] intArray = new Integer[]{2, 5, 8, 11, 6, 10, 8};

        List<Integer> intCollection = new ArrayList<>();

        intCollection.addAll(Arrays.asList(intArray));

        intCollection.stream()
                     .mapToInt(e -> e)
                     .filter(e -> e % 2 == 1)
                     .forEach(System.out::println);

        System.out.println(); // sauter une ligne

        Integer myNumber = intCollection.get(3);
        System.out.println(myNumber);







    }
}
