package java_foundations.data_structures;

import java.util.HashSet;
import java.util.Set;

public class SetsPlayground {
    public static void main(String[] args) {
        Set<String> studentNames = new HashSet<>();
        studentNames.add("Aayam");
        studentNames.add("Aaryan");
        studentNames.add("Aaryan");

        System.out.println(studentNames);

        System.out.println("Is Krish present in our class? " + studentNames.contains("Krish"));
        studentNames.add("Aman");

        studentNames.remove("Aaryan");
        System.out.println("Total size of class is: " + studentNames.size());

        Set<Integer> ids = Set.of(12,34,54,56,76,21);
//      ids.add(29); immutable, will give UnsupportedOperationException
        System.out.println(ids);
    }
}
