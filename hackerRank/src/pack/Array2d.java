package pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;


public class Array2d {

    static void Total(int arr[][])
    {

        int[] sum = new int[16];

        int m=0, n=0,o=2, p=2;
        int place=0;

        for (int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                int skip=0;
                for(int y=m; y<=o; y++)
                {
                    for(int z=n; z<=p; z++) {
                        skip += 1;
                        if (skip == 4 || skip == 6) // to skip 4 and 6 element
                        { }
                        else {
                            sum[place] += arr[y][z];
//
                        }
                    }
                }
                place+=+1;

                n+=+1;
                p+=1;
            }
            m+=1;
            o+=1;
            n=0;
            p=2;
        }

//        getting highest element from list
        int max=sum[0];
        for(int zz=1;zz<16;zz++) {
            if (max > sum[zz]) {
            }
            else {
                max = sum[zz];
            }
        }
        System.out.print(max);

    }


        public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int All[][] = new int[6][6];
// input data
        for(int i=0;i<6;i++)
        {
            String data = br.readLine();
            String[] arr = data.split(" ");
            for (int j = 0; j <= arr.length - 1; j++) {
                All[i][j] = Integer.parseInt(arr[j]);
            }
        }

        Total(All);


    }
}
