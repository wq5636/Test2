package comp1110.nestedClass;

/**
 * Created by mac on 2018/8/11.
 */
public class LectureTheater {
    String name;
    Projector projector;

    public LectureTheater(String name, String model, boolean hd){
        this.name = name;
        this.projector = new Projector(model, hd, this);
    }
}
