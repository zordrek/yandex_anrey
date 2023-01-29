import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        try {
            int n = inputData.nextInt(); //how much tanks
            if (n >=1) {
                int in = 1;
                int not_one = 0;

                List<Integer> myList = new ArrayList<Integer>(); //new list myList
                for (int i = 1; i <= n; i++) {
                    int l = inputData.nextInt(); //how much liters
                    if (l >= 1) {
                        myList.add(l);
                    } if (l <= 0) {
                        System.out.println(-1);
                        System.exit(0);
                    }



                }
                int max = Collections.max(myList);
                if (max > n) {
                    System.out.println(-1);
                    System.exit(0);
                }

                //System.out.println(myList);

                not_one = myList.get(0);

                if (not_one != 1) {
                    System.out.println(-1);
                    System.exit(0);
                } else {
                    for (int i = 1; i <= n; i++) {
                        int sum = (n - i) + i;
                        myList.set( i - 1, sum);
                        in = i;
                    }
                    System.out.println(in - 1);
                }
                //System.out.println(myList);
            } else {
                System.out.println(-1);
                System.exit(0);
            }
        } catch (ArithmeticException e) {
            System.out.println(-1);
        }

    }
}