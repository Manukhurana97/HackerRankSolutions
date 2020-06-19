package pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class graphds {


    static void addNode(int data) throws IOException {

        HashMap<Integer, ArrayList<Integer>> list = new HashMap<Integer, ArrayList<Integer>>();
        Scanner br = new Scanner(System.in);
        for (int i = 1; i <=data; i++) {
            list.put(i, new ArrayList<Integer>());
            while (true) {
                System.out.println("enter nodes for %s list: " + i);
                int d = br.nextInt();

                if (d == 0)
                    break;
                list.get(i).add(d);
            }
        }


//       breath first search



        boolean visit[] = new boolean[data+2];

        LinkedList<Integer> queue = new LinkedList<Integer>();

        for(Map.Entry m: list.entrySet())
        {
            int key = (int) m.getKey();

            visit[key]=true;
            queue.add(key);

            ArrayList<Integer> l = (ArrayList<Integer>) m.getValue();

//            System.out.println(queue+" "+ visit[key]);

            Iterator itr = l.iterator();
            while(itr.hasNext())
            {

                int n = (int) itr.next();
                System.out.println(visit[n]+" "+ n+" "+queue.contains(n));
                if(!visit[n])
                {
                    visit[n]=true;
                    queue.add(n);
                    System.out.println(queue);
                }


            } System.out.println();

        }







//        print data
//        for (Map.Entry m : list.entrySet()) {
//           System.out.println(m.getKey()+""+m.getValue());
//
//        }
    }






    public static void main(String[] args) throws IOException {
        addNode(3);
    }
}
