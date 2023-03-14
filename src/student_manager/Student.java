package student_manager;

public class Student {
    private int id;
    private String name;
    static String classes;
    private boolean gender;
    static {
        classes = "C0123G1";
    }

    public Student(int id, String name, boolean gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
    public Student(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getClasses() {
        return classes;
    }

    public static void setClasses(String classes) {
        Student.classes = classes;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", classes=" +classes+
                '}';
    }
}
