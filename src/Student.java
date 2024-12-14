public class Student extends People {
    private Teacher tutor;

    public Student(String name, String surname){
        super(name, surname);
    }

    public void setTutor(Teacher tutor){
        if (this.tutor != null) {
            throw new IllegalStateException("Tutor has already been set");
        }else{
            this.tutor = tutor;
        }
    }

    public void setTutor(Teacher newTutor, Teacher previousTutor){
        if (this.tutor == previousTutor){
            this.tutor = newTutor;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "tutor=" + tutor +
                ", name='" + name + '\'' +
                ", surmame='" + surmame + '\'' +
                '}';
    }
}
