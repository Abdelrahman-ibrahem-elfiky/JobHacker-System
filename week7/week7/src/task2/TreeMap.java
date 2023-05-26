package task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class TreeMap {
    public static void main(String[] args) {
        java.util.TreeMap<Integer,Integer>map=new java.util.TreeMap<>();


        Scanner input = new Scanner(System.in);
        int number = input.nextInt();


        for (int i = 0; i < number; i++) {
            int testCase = input.nextInt();
            while (testCase != 0) {
                int query = input.next().charAt(0);
                if (query == 'a') {
                    int x, y;
                    x = input.nextInt();
                    y = input.nextInt();
                    map.put(x, y);
                } else if (query == 'b') {
                    int x = input.nextInt();
                    if (map.containsKey(x)) {
                        System.out.println(map.get(x));
                    }
                } else if (query == 'c') {
                    System.out.println(map.size());
                } else if (query == 'd') {
                    int x = input.nextInt();
                    map.remove(x);
                } else if (query == 'e') {
                    for (int l : map.keySet())
                        System.out.println(l);
                }
                testCase--;

            }

        }
    }

}

