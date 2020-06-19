package pack;

//    static int evenForest(int t_nodes, int t_edges, List<Integer> t_from, List<Integer> t_to) {
//        HashMap<Integer, ArrayList<Integer>> HM = new HashMap<Integer,ArrayList<Integer>>();
//
//        // Adding all the nodes
//        for(int i=1;i<=t_nodes;i++)
//        {
//            HM.put(i, new ArrayList<Integer>());
//        }
//
//        // key and value from arrylist and to nodes
//        for(int j=0;j<t_edges;j++)
//        {
//            int k = t_to.get(j);
//            int val = t_from.get(j);
//            HM.get(k).add(val);
//        }
//        // print values
//        for(Map.Entry m: HM.entrySet())
//        {
//            System.out.println(m.getKey()+" "+m.getValue());
//        }
//
//
//        int count=0;
//        for(int i=2;i<=t_nodes;i++)
//        {
//            if(HM.get(i).size()%2==1)
//                count++;
//        }
//        // System.out.println(HM.get(1).size());
//        return count;
//




import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class eventree {

    // Complete the evenForest function below.
    static int evenForest(int t_nodes, int t_edges, List<Integer> t_from, List<Integer> t_to) {
        LinkedHashMap<Integer, ArrayList<Integer>> HM = new LinkedHashMap<Integer, ArrayList<Integer>>();

        // Adding all the nodes

        for (int i = 1; i < t_edges; i++) {
            int k = t_to.get(i);
            HM.put(k, new ArrayList<Integer>());

        }

        // key and value from arrylist and to nodes
        List<Integer> ll = new LinkedList<>();
        for (int j = 0; j < t_edges; j++) {
            int k = t_to.get(j);
            int val = t_from.get(j);
            HM.get(k).add(val);
            if(k == 1)
            {
                ll.add(val);
            }
        }


        int count = 0;
        for (Map.Entry m : HM.entrySet()) {
            List<Integer> ll1 = (List<Integer>) m.getValue();
            if(ll.contains(m.getKey())) {
                if (ll1.size() % 2 == 0) {
                    count++;
                }
            }
        }


        // int count=0;
        // for(int i=2;i<=HM.size();i++)
        // {
        //     System.out.println(i);
        //     if(HM.get(i).size()%2==1)
        //         count++;
        // }
        // System.out.println(HM.get(1).size());
        return count - 1;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        String[] tNodesEdges = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int tNodes = Integer.parseInt(tNodesEdges[0]);
        int tEdges = Integer.parseInt(tNodesEdges[1]);

        List<Integer> tFrom = new ArrayList<>();
        List<Integer> tTo = new ArrayList<>();

        IntStream.range(0, tEdges).forEach(i -> {
            try {
                String[] tFromTo = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                tFrom.add(Integer.parseInt(tFromTo[0]));
                tTo.add(Integer.parseInt(tFromTo[1]));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int res = evenForest(tNodes, tEdges, tFrom, tTo);
        System.out.println(res);


        bufferedReader.close();

    }
}


