package comp1110.nestedClass;

/**
 * Created by mac on 2018/8/11.
 */
public class Projector {
    private String model;
    private boolean hd;
    private LectureTheater room;

    Projector(String model, boolean hd, LectureTheater room){
        this.model = model;
        this.hd = hd;
        this.room = room;
    }
}
