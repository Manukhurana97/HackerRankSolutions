package pack;

import java.io.*;
import java.util.*;

public class bfs {


    static int[] bfs(int n, int m, int[][] edges, int Start) {



        LinkedHashMap<Integer, ArrayList<Integer>> map = new LinkedHashMap<>();
        map.put(n, new ArrayList<Integer>());
        map.get(n).add(m);


// Creating gra ph
//
        for (int i = 0; i < m; i++) {
            map.put(edges[i][0], new ArrayList<Integer>());

        }

//        adding values

        for (int i = 0; i < m; i++) {
            map.get(edges[i][0]).add(edges[i][1]);
        }




//        traversing data
        HashSet<Integer> hs = new HashSet<Integer>();
        int arr[] = new int[n-1];
        int count=0;
        for (Map.Entry<Integer, ArrayList<Integer>> d : map.entrySet()) {
            int key = d.getKey();

            if (key == Start) {

                List<Integer> s = d.getValue();
                for (int i = 0; i < s.size(); i++) {
                    hs.add(s.get(i));
//                    System.out.print(" 6 ");
                    arr[count]=6;
                    count+=1;

                }
            }
            else if (hs.contains(key)) {
                List<Integer> s = d.getValue();
                for (int i = 0; i < s.size(); i++) {
//                    System.out.println(" 12 ");
                    arr[count]=12;
                    count+=1;
                }
            } else {
                List<Integer> s = d.getValue();
                for (int i = 0; i < s.size(); i++) {
//                    System.out.println(" -1 ");
                    arr[count]=-1;
                    count+=1;
                }
            }

        }

        return arr;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] nm = scanner.nextLine().split("");

            int n = Integer.parseInt(nm[0]);

            int m = Integer.parseInt(nm[1]);

            int[][] edges = new int[m][2];

            for (int i = 0; i < m; i++) {
                String[] edgesRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < 2; j++) {
                    int edgesItem = Integer.parseInt(edgesRowItems[j]);
                    edges[i][j] = edgesItem;
                }
            }

            int s = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] result = bfs(n, m, edges, s);

            for (int i = 0; i < result.length; i++) {
                System.out.println(result[i]);
            }


        }

        scanner.close();
    }
}
