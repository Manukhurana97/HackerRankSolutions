package pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.*;

public class stacktoqueue {

    static Stack<Integer> ST1 = new Stack<>();
    static Stack<Integer> ST2 = new Stack<>();

//    Push in list
    static void enqueue(int x)
    {
//        System.out.println("push: "+x);
        ST1.push(x);

    }

//    pop
    static void dequeue()
    {
        if(ST2.isEmpty())
        {
            while(!ST1.isEmpty())
            {
                ST2.push(ST1.pop());
            }
        }

//            System.out.println("S2: "+ST2.pop());
            ST2.pop();


    }

//    display
    static int display()
    {
        if(ST2.isEmpty())
        {
//            System.out.println("display st1: "+ST1);
            while(!ST1.isEmpty())
            {
                ST2.push(ST1.pop());
            }

        }
        return ST2.peek();
    }

    public static void main(String[] args) throws IOException {
        Scanner br = new Scanner(System.in);
        int no = br.nextInt();

        for(int i=0;i<no;i++)
        {
            int command = br.nextInt();
//            System.out.println(command);
            if(command == 1)
            {
                enqueue(br.nextInt());
            }
            else if (command == 2)
            {
                dequeue();
            }
            else if (command==3)
            {
                System.out.println(display());
            }

        }

     }
}

