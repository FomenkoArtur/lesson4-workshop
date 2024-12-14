import java.util.ArrayList;
import java.util.List;


public class Teacher  extends People{
    private List<String> courses;
    public Teacher(String name, String surmame, List<String> courses) {
        super(name, surmame);
        this.courses = new ArrayList<>(courses);
    }

    public void addCourse(String course){
        courses.add(course);
    }

    public void removeCourse(String course){
        courses.remove(course);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "courses=" + courses +
                ", name='" + name + '\'' +
                ", surmame='" + surmame + '\'' +
                '}';
    }
}
