package pack;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulations {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int t = s.nextInt();


        long[] arr = new long[n + 2];

        while (t-- > 0) { // reverse loop
            int a = s.nextInt(); // from
            int b = s.nextInt(); // to
            int k = s.nextInt(); // value

//  Skip method
            arr[a] += k;
            arr[b + 1] -= k;

//  Brute force method
//            for(int i=a;i<=b;i++)
//            {
//                arr[i]+=k;
//            }

        }


        for (int i = 1; i <= n; i++) {
            arr[i] += arr[i - 1];  // sum
        }
        Arrays.sort(arr);
        System.out.println(arr[n+1]);



    }

}