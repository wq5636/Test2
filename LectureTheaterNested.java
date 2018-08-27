package comp1110.nestedClass;

/**
 * Created by mac on 2018/8/11.
 */
public class LectureTheaterNested {
    String name;
    ProjectorNested projector;
    public class ProjectorNested {
        private String model;
        private boolean hd;
        private LectureTheaterNested room;

        ProjectorNested(String model, boolean hd, LectureTheaterNested room){
            this.model = model;
            this.hd = hd;
            this.room = room;
        }
        @Override
        public String toString(){
            return "model: "+model+" hd: "+hd+" room: "+room.name;
        }
    }

    public LectureTheaterNested(String name, String model, boolean hd){
        this.name = name;
        this.projector = new ProjectorNested(model, hd, this);
    }
    @Override
    public String toString(){
        return "name: "+name+" projector: "+projector.toString();
    }


    public static void main(String[] args) {
        LectureTheaterNested l = new LectureTheaterNested("copland","comp", true);
        System.out.println(l);
    }
}
