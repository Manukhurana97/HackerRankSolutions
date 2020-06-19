package pack;

import java.io.BufferedWriter;
import java.io.IOException;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class QueenAttack {

    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
        int move_count = 0;
        move_count = move_count+rowcount(n, r_q, c_q, obstacles);
        move_count = move_count+columnscount(n, r_q, c_q, obstacles);
        move_count = move_count+diagonalcount(n, r_q, c_q, obstacles);
        return move_count;
    }

    static int rowcount(int n, int r_q, int c_q, int[][] obstacles) {

        int move_count = 0;

        int row = r_q;
        while (row > 1) {
            row = row - 1;
            if (obstacles(row, c_q, obstacles)) {
                break;
            }
            move_count = move_count+1;
        }

        row = r_q;
        while (row < n) {
            row = row + 1;
            if (obstacles(row, c_q, obstacles)) {
                break;
            }
            move_count = move_count+1;
        }
        return move_count;
    }

    static int columnscount(int n, int r_q, int c_q, int[][] obstacles) {

        int move_count = 0;

        int col = c_q;
        while (col > 1) {
            col = col - 1;
            if (obstacles(r_q, col, obstacles)) {
                break;
            }
            move_count =move_count+1;

        }

        col = c_q;
        while (col<n) {
            col = col + 1;
            if (obstacles(r_q, col, obstacles))
                break;

            move_count += 1;
        }
        return move_count;
    }

    static int diagonalcount(int n, int r_q, int c_q, int[][] obstacles)
    {
        int move_count=0;

        int row = r_q;
        int col = c_q;

        while(row>1 && col>1)
        {
            row = row-1;
            col = col-1;

            if(obstacles(row, col, obstacles))
            {
                break;
            }
            move_count = move_count+1;

        }


        row = r_q;
        col = c_q;
        while(row>1 && col<n)
        {
            row = row - 1;
            col = col + 1;

            if(obstacles(row, col, obstacles))
            {
                break;
            }
            move_count = move_count+1;

        }



//        queen diagonal right Up
        row = r_q;
        col = c_q;
        while(n>row && col>1)
        {
            row = row+1;
            col = col-1;
            if(r_q == n || c_q == 1)
                break;
            if(obstacles(row, col, obstacles))
            {
                break;
            }
            move_count+=1;

        }

        row = r_q;
        col = c_q;
        while(n>col && n>row)
        {
            row = row+1;
            col = col+1;

            if(obstacles(row, col, obstacles))
            {
                break;
            }
            move_count+=1;
        }

        return move_count;
    }

    static boolean obstacles(int r, int c, int[][] obstacles) {
        for (int i = 0; i < obstacles.length; i++) {
            if ((r == obstacles[i][0]) && (c == obstacles[i][1]))
                return true;
        }
        return false;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        String[] r_qC_q = scanner.nextLine().split(" ");

        int r_q = Integer.parseInt(r_qC_q[0]);

        int c_q = Integer.parseInt(r_qC_q[1]);

        int[][] obstacles = new int[k][2];

        for (int i = 0; i < k; i++) {
            String[] obstaclesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int obstaclesItem = Integer.parseInt(obstaclesRowItems[j]);
                obstacles[i][j] = obstaclesItem;
            }
        }

        int result = queensAttack(n, k, r_q, c_q, obstacles);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
