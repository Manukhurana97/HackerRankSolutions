package pack;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class bomberMan {

    // Complete the pack.bomberMan function below.
    static String[] bomberMan(int n, String[] grid) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < grid.length; i++) {

            char[] arr = grid[i].toCharArray();
            map.put(i, new ArrayList<>());

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == 'O') {
                    if (map.containsKey(i)) {
                        map.get(i).add(j);
                    }
                }
                if (arr[j] == '.') {
                    arr[j] = 'O';
                }
            }
//            if no bomb in row remove it;
            if (map.get(i) == null)
                map.remove(i);

            String st = new String(arr);
            String bomb = bomb_explode(i, st, map);
            grid[i] = bomb;

        }
        return grid;
    }

    static String bomb_explode(int i, String arr, HashMap<Integer, ArrayList<Integer>> map) {
        char[] ch = arr.toCharArray();
        for (int j = 0; j < arr.length(); j++) {
            if (map.containsKey(i)) {
                List<Integer> val = map.get(i);
                for (Integer ii : val) {
                    ch[ii] = '.';
                }
            } else
                break;
        }
        String st = new String(ch);
        return st;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] rcn = scanner.nextLine().split(" ");

        int r = Integer.parseInt(rcn[0]);

        int c = Integer.parseInt(rcn[1]);

        int n = Integer.parseInt(rcn[2]);

        String[] grid = new String[r];

        for (int i = 0; i < r; i++) {
            String gridItem = scanner.nextLine();
            grid[i] = gridItem;
        }

        String[] result = bomberMan(n, grid);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);

            if (i != result.length - 1) {
                System.out.println("\n");
            }
        }


        scanner.close();
    }
}
