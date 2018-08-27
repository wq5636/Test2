package comp1110.nestedClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by mac on 23/8/18.
 */
public class Basic<T> {
    private T ob;
    Basic(T ob){
        this.ob = ob;
    }
    public static void main(String[] args) {
        String s = "ab123fsf";
        //Character c = s.charAt(2);
        System.out.println(Character.isDigit(s.charAt(2)));
        System.out.println(Character.isLetter(s.charAt(1)));
        System.out.println(s.substring(1,3));
        Basic<Integer> basic = new Basic<Integer>(88);
        System.out.println(basic.getClass().getName());
        List<String> l = new ArrayList<String>(){{
            add("a");
            add("b");
            add("c");
            add("d");
        }} ;
        l.stream()
                .filter(t -> t.charAt(0) > 'a')
                .forEach(t -> System.out.println(t));


    }
}
