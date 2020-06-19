package pack;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class climbingLeaderboard {

    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int position = 0;
        int arr[] = new int[alice.length];

        for (int i = 0; i < alice.length; i++) {
            for (int j = 0; j < scores.length; j++) {
                if (j == 0)
                    position = 1;
                else if (scores[j - 1] > scores[j])
                    position += 1;

                if (alice[i] > scores[j]) {
                    arr[i] = position;
                    break;
                } else if (alice[i] > scores[j] && alice[i] < scores[j - 1]) {
                    arr[i] = position;
                    break;
                } else if (alice[i] == scores[j]) {
                    arr[i] = position;
                    break;
                } else if ((j == scores.length - 1) && scores[j] > alice[i]) {
                    System.out.println(j + " " + arr.length + " " + scores[j] + " " + alice[i]);
                    arr[i] = position + 1;
                    System.out.print(position + 1 + " ");
                    break;
                }
            }
            position = 0;

        }
        return arr;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int scoresCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[scoresCount];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < scoresCount; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int aliceCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] alice = new int[aliceCount];

        String[] aliceItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < aliceCount; i++) {
            int aliceItem = Integer.parseInt(aliceItems[i]);
            alice[i] = aliceItem;
        }

        int[] result = climbingLeaderboard(scores, alice);

        for (int i = 0; i < result.length; i++) {
            System.out.println(String.valueOf(result[i]));

            if (i != result.length - 1) {
                System.out.println("\n");
            }
        }

        scanner.close();
    }
}
