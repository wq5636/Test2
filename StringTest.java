package comp1110.nestedClass;

import java.util.Random;

/**
 * Created by mac on 27/8/18.
 */
public class StringTest {
    public static void main(String[] args) {
        Random ran = new Random();
        System.out.println(ran.nextFloat());
        String s = "sb2";
        System.out.println(Character.isLetter(s.charAt(0)));
        String v = Character.toString(s.charAt(0));
        System.out.println(v + " s");
        int a = Integer.parseInt(Character.toString(s.charAt(2)));
        System.out.println(a);
        char b = (char)(a + '0');
        System.out.println(b);
        String c = "";
        System.out.println(c+a+"s");
        String d = " sfsfs,sfsf ";
        d = d.trim();
        String []e= d.split(",");
        for(String ss:e){
            System.out.println(ss);
        }
        String sv = "";
        for(String i:e){
            sv += i+" ,";
        }
        sv = sv.substring(0, sv.length()-2);
        System.out.println(sv.indexOf(" "));
        System.out.println(sv);
        System.out.println(s.equals("sb2 "));
    }
}
