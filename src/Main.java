import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Object {
    public static void main(String[] args) {
        Student student1 = new Student("Bob", "Smith");
        Student student2 = new Student("John", "Smith");
        Teacher teacher1 = new Teacher("Bob", "Smith", new ArrayList<>());
        Teacher teacher2 = new Teacher("John", "Smith", new ArrayList<>());
        teacher1.addCourse("Math");
        teacher1.addCourse("CS");
        student1.setTutor(teacher1);
        student1.setTutor(teacher2, teacher1);
        System.out.println(teacher1);

        System.out.println(student1);

        List<People> peopleList = new ArrayList<>();
        peopleList.add(student1);
        peopleList.add(student2);
        peopleList.add(teacher1);
        peopleList.add(teacher2);

        for (People p:peopleList) {
            if (p instanceof Student) {
                student2.setTutor(teacher1);
            }
            System.out.println(p);
        }
    }
}