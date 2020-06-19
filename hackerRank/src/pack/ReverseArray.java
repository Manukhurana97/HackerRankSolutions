package pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class ReverseArray {


    static void display(int no, String arr[])
    {

        for (int j=no-1; j>=0;j--)
        {
            System.out.print(arr[j]+" ");
        }
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int no = Integer.parseInt(br.readLine());

        String data = br.readLine();

        String[] arr = data.split(" ");


       display(no, arr);

    }

}
