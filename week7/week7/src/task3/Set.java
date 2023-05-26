package task3;

import java.util.HashSet;
import java.util.Scanner;

public class Set {
    public static void main(String[] args) {
        java.util.Set<Integer> set = new HashSet<>();
        Scanner input = new Scanner(System.in);


        int number = input.nextInt();

        for (int i = 0; i < number; i++) {
            int testCase = input.nextInt();
            while (testCase != 0) {
                int query = input.next().charAt(0);
                if (query == 'a') {
                    int x = input.nextInt();
                    set.add(x);
                } else if (query == 'b') {

                    for (int l : set) {
                        System.out.print(l + " ");
                    }
                    System.out.println();

                } else if (query == 'c') {

                    int x = input.nextInt();
                    set.remove(x);
                } else if (query == 'd') {
                    int x = input.nextInt();
                    if (set.contains(x))
                        System.out.println(1);
                    else
                        System.out.println(-1);
                } else if (query == 'e') {
                    System.out.println(set.size());
                }
                testCase--;

            }
        }
    }
}
