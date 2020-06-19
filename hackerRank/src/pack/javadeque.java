package pack;


import java.util.*;
public class javadeque {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();
        int n = in.nextInt();
        int m = in.nextInt();

        int high=0;

        for (int i = 0; i < n; i++) {
            int no = in.nextInt();
            deque.add(no);
            set.add(no);
            if(deque.size()==m)
            {

                if(high<set.size())
                    high=set.size();
                int f = (int) deque.remove();
                if (!deque.contains(f)) set.remove(f);

            }

        }
        System.out.println(high);
    }
}
