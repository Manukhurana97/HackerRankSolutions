package pack;

import java.util.*;
import java.util.stream.Collectors;

public class AlmostSorted {

    // Complete the almostSorted function below.
    static void almostSorted(int[] arr) {
        {


            ArrayList<Integer> list = new ArrayList<>();
            list.add(arr[1]);


            if (sorted(arr, arr.length)) {
                System.out.println("yes");
            } else {
                int min = 0, max = 0, minp = 0, maxp = 0;
                List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

                min = Collections.min(list);
                max = Collections.max(list);

                minp = list.indexOf(min);
                maxp = list.indexOf(max);
                System.out.println(minp+" "+ maxp);

                //  2 operation
                arr[minp] = max;
                arr[maxp] = min;
                if (sorted(arr, arr.length)) {
                    System.out.print("swap " + min + " " + max);

                }
                if (maxp > minp) {
                    for (int i = minp; i < maxp; i++) {
                        int temp = arr[maxp];
                        arr[maxp] = arr[minp];
                        arr[minp] = temp;
                        maxp = -1;
                    }
                } else {
                    for (int i = maxp; i < minp; i++) {
                        int temp = arr[maxp];
                        arr[maxp] = arr[minp];
                        arr[minp] = temp;
                        maxp = -1;
                    }
                }
                if (sorted(arr, arr.length)) {
                    System.out.println("yes");
                    System.out.println("reversed " + min + " " + max);

                } else {
                    System.out.println("no");

                }

            }
        }

    }

    static boolean sorted(int[] arr, int n) {
        int count = 0;
        boolean valid = true;

        if (n == 1 || n == 0)
            return true;

        if (arr[n - 2] > arr[n - 1]) {
//            System.out.println(n + " " + arr[n - 2] + " " + arr[n - 1]);
            return false;
        }


        return sorted(arr, n - 1);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        almostSorted(arr);

        scanner.close();
    }
}
