package list_examples01;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedList05 {
    public static void main(String[] args) {
        LinkedList<String> names= (LinkedList<String>) Arrays.asList("Java", "C#", "Python");
        names.replaceAll(String::toUpperCase);
        System.out.println(names);
        for(String name: names){
            names.set(names.indexOf(name), name.toUpperCase());
        }
        System.out.println(names);

    }
}
