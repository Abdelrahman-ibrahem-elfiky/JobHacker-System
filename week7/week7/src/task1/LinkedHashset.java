package task1;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Collections;

public class LinkedHashset {
    public static void main(String[] args) {
        LinkedHashSet<Integer> list = new LinkedHashSet<>();
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();


        for (int i = 0; i < number; i++) {
            int testCase = input.nextInt();
            while (testCase != 0) {
                int query = input.next().charAt(0);
                if (query == 'a') {
                    int x = input.nextInt();
                    list.add(x);
                } else if (query == 'b') {
                    List<Integer> sort = new ArrayList<>(list);
                    Collections.sort(sort);
                    for (int loop : sort) {
                        System.out.print(loop + " ");
                    }
                } else if (query == 'c') {
                    int x = input.nextInt();
                    list.remove(x);
                } else if (query == 'd') {
                    int x = input.nextInt();
                    if (list.contains(x))
                        System.out.println(1);
                    else
                        System.out.println(-1);

                } else if (query == 'e') {
                    System.out.println(list.size());
                } else {
                    for (int loop : list) {
                        System.out.print(loop + " ");
                    }
                    System.out.println();
                }
                testCase--;

            }
        }
    }
}
