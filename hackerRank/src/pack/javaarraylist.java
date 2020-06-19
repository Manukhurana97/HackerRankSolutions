package pack;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class javaarraylist {
    public static void main(String[] args) throws IOException {
        Scanner br = new Scanner(System.in);
        int no = br.nextInt();

        ArrayList[] ar = new ArrayList[no];
        for(int i=0;i<no;i++)
        {
            ar[i] = new ArrayList<>();
            int sec = br.nextInt();
            for(int j=0;j<sec;j++)
            {
                ar[i].add(br.nextInt());
            }
        }

//        [41, 77, 74, 22, 44]
//        [12]
//        [37, 34, 36, 52]
//        []
//        [20, 22, 33]

        int searchNo = br.nextInt();
        for(int j=0;j<searchNo;j++)
        {
            int key = br.nextInt();
            int value = br.nextInt();
            try{
                System.out.println(ar[key-1].get(value-1));
            }
            catch(Exception e)
            {
                System.out.println("ERROR!");
            }
        }
    }
}

