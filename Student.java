package comp1110.nestedClass;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mac on 2018/8/20.
 */
public class Student {
    int no;
    String name;
    String sex;
    float height;

    public Student(int no, String name, String sex, float height) {
        this.no = no;
        this.name = name;
        this.sex = sex;
        this.height = height;
    }
//
    public float getHeight() {
        return height;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString(){
        return "no: "+no+" name: "+name+" sex: "+sex+" height: "+height;
    }

    public static void main(String[] args) {
        Student stuA = new Student(1, "A", "M", 184);
        Student stuB = new Student(2, "B", "G", 163);
        Student stuC = new Student(3, "C", "M", 175);
        Student stuD = new Student(4, "D", "G", 158);
        Student stuE = new Student(5, "E", "M", 170);
        List<Student> Stulist = new ArrayList<Student>();
        Stulist.add(stuE);
        Stulist.add(stuD);
        Stulist.add(stuC);
        Stulist.add(stuB);
        Stulist.add(stuA);

        for(Student s:Stulist){
            if(s.height > 170){
                System.out.println(s);
            }
        }

        //using stream:
        Stulist.stream()
                .filter(s -> s.getHeight() > 170)
                .forEach(s -> System.out.println(s));

        //.count的返回值long类型
        long count = Stulist.stream()
                .filter(s -> s.getHeight()>170)
                .count();
        System.out.println(count);
    }
}