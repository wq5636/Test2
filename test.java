package comp1110.nestedClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by mac on 2018/8/20.
 */
public class test {
    public static void main(String[] args) {
//        int[][]  arr = {{5,7,9},{12,14,16,18},{23,25,36,47},{22,54,65,15},{22,34}};
//        System.out.println(arr[1][3]);

        Random ran = new Random();
        String []arr = new String[10];
        for(int i=0; i<10; ++i){
            arr[i] = Integer.toString(ran.nextInt(10));
            System.out.println(arr[i]);
        }
        System.out.println("");
        long count = Arrays.stream(arr).filter(s -> s.charAt(0) > '5').count();
        System.out.println(count);

        List <String> ls = new ArrayList<String>();
        ls.add("a");
        ls.add("b");
        ls.add("c");
        ls.add("d");
        ls.add("e");
        ls.add("f");
        List<String> lsSort = ls.stream().skip(2).limit(3).collect(Collectors.toList());
        System.out.println(ls);
        System.out.println(lsSort);


    }
}
