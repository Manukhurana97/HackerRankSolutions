package pack;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class gridSearch {


    static String gridSearch(String[] G, String[] P) {

        int count = 0;
        int index = 0, prev_index = 0, z = 0;
        ;
        for (int i = 0; i < G.length; i++) {
            for (int j = 0; j < P.length; j++) {
                String st = G[i];
                String st1 = P[j];
                index = st.indexOf(st1);

                System.out.println(st + ":" + st1 + " " + count + " " + st.contains(st1) + " " + index + ":" + prev_index + " " + z);
                if (count < P.length && st.contains(st1)) {
                    System.out.println(prev_index + ":" + index + ":" + z);
                    if ((prev_index == 0) || prev_index == index) {
                        z += 1;
                        System.out.println(z);
                        count += 1;
                        i += 1;
                    } else {
                        count = 0;
                        break;
                    }
                } else if (count < P.length) {
                    count = 0;
                    break;
                }
                prev_index = index;
            }
        }

        if (count == P.length)
            return "YES";
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] RC = scanner.nextLine().split(" ");

            int R = Integer.parseInt(RC[0]);

            int C = Integer.parseInt(RC[1]);

            String[] G = new String[R];

            for (int i = 0; i < R; i++) {
                String GItem = scanner.nextLine();
                G[i] = GItem;
            }

            String[] rc = scanner.nextLine().split(" ");

            int r = Integer.parseInt(rc[0]);

            int c = Integer.parseInt(rc[1]);

            String[] P = new String[r];

            for (int i = 0; i < r; i++) {
                String PItem = scanner.nextLine();
                P[i] = PItem;
            }

            String result = gridSearch(G, P);

            System.out.print(result);
            System.out.println();
        }

        scanner.close();
    }
}
