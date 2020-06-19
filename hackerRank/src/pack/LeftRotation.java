package pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LeftRotation {

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(); // Size of  an array
        int rotate = sc.nextInt(); // rotate no of element
        int[] arr = new int[size];

//   formula  (size-rotate + i)%size(remainder)

        for(int i=0; i<size; i++)
        {
            arr[(size-rotate+i)%size] = sc.nextInt();
        }

//   display data

        for(int i=0; i<size; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
