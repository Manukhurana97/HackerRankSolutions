package pack;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FraudactivityNotifications {

    // Complete the activityNotifications function below.
    static int activityNotifications(int[] expenditure, int d) {


        int sum = 0, count = 0;
        float mean = 0;
        for (int i = 0; i < expenditure.length; i++) {
            if (i + d < expenditure.length) {
                for (int j = i; j < d + i; j++) {
                    sum += expenditure[j];
                }

                mean = (float)sum / d;

                if (2 * mean <=expenditure[d + i]) {
                    count += 1;
                }

                sum = 0;
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] expenditure = new int[n];

        String[] expenditureItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int expenditureItem = Integer.parseInt(expenditureItems[i]);
            expenditure[i] = expenditureItem;
        }

        int result = activityNotifications(expenditure, d);

        System.out.println(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
