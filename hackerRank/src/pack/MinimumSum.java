package pack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinimumSum {
    public static int minimalSum(List<Integer> data, int k) {

        if (data.size() == 0) {
            return 0;
        }


        int index = 0;
        int max = Integer.MAX_VALUE; // 2^31-1

        while (k > 0) {

            int currentValue = data.get(index);
                        System.out.println(" Currentval: "+currentValue+" Max: "+max+" Key: "+k+" Index: "+index);
            if (currentValue <= max) {
                data.sort(Comparator.reverseOrder());
                        System.out.println("data: "+data);
                index = 0;
                max = data.get(0) / 2;
                        System.out.println("max: "+max);

                continue;
            }
            k--;

//            int roundUp = currentValue & 1  ;
//                      System.out.println("roundUP: "+roundUp);
//            currentValue /= 2;
//                      System.out.println("currentValue: "+currentValue);
//            currentValue += roundUp;
//                      System.out.println("currentValue + roundup : "+currentValue);

            if (currentValue % 2 == 0) {
                currentValue /= 2;
            } else {
                currentValue /= 2;
                currentValue += 1;
            }

            data.set(index, currentValue);
                        System.out.println(data.set(index, currentValue));
            if (index + 1 < data.size()) {
                index++;
            }
                        System.out.println(data);
        }

        return data.stream().mapToInt(b -> b).sum();
    }

    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(10);
        lst.add(20);
        lst.add(7);
        int aa = minimalSum(lst, 4);
        System.out.print(String.valueOf(aa));

    }
}


