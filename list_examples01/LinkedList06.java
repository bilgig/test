package list_examples01;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedList06 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers= (LinkedList<Integer>) Arrays.asList(1,2,3,4);
        numbers.replaceAll(e -> e*2);
        System.out.println(numbers);
    }
}
