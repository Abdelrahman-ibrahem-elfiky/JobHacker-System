package task4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
       Map<Character, List<String>> Dictionary = new HashMap<>();

       // Populate the Dictionary with some values
       Dictionary.put('A', Arrays.asList("Apple", "Ape"));
       Dictionary.put('B', Arrays.asList("Banana", "Bear"));
       Dictionary.put('C', Arrays.asList("Cat", "Carrot"));

       for (Map.Entry<Character, List<String>> entry : Dictionary.entrySet()) {
          char key = entry.getKey();
          List<String> values = entry.getValue();

          System.out.println("Key: " + key);
          System.out.println("Values: " + values);
       }
       

    }
}
