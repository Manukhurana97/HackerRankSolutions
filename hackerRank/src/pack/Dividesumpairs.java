package pack;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Dividesumpairs {

    static int divisibleSumPairs(int n, int k, int[] ar) {
//        System.out.println(n+" "+k+" "+ Arrays.toString(ar));
        int count=0, i=0, z=1;
        for(i=0;i<n-1;i++)
        {
            for(int j=z;j<n;j++)
            {
//                System.out.println(ar[i]+":"+ar[j]+" "+(ar[i]+ar[j]));
                if(i<j) {
                    int a = ar[i] + ar[j];
                    if (a % k == 0) {
                        count += 1;

                    }
                }
            }
            z+=1;
        }
        return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
    }
}

