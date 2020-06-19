package pack;

import java.io.BufferedReader;

import java.util.Scanner;

public class SparseMatrix {

    static void count(String arrs[], String arrq[])
    {
        int count=0;

        for(int i=0;i<arrq.length;i++)
        {
            for(int j=0;j<arrs.length;j++) {
                if (arrq[i].equals(arrs[j])) {
                    count+=1;
                }
            }
            System.out.println(count);
            count=0;

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sos = sc.nextInt();
        String[] arrs = new String[sos];
        for (int i=0;i<sos;i++)
        {
            arrs[i]=sc.next();
        }

        int soq = sc.nextInt();
        String[] arrq = new String[soq];
        for (int i=0;i<soq;i++)
        {
            arrq[i]=sc.next();
        }


        count(arrs, arrq);
    }
}
