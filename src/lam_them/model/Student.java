package lam_them.model;

public class Student extends Person {
    private String classes;
    private float scores;

    public Student() {
    }

    public Student(String classes, Float scores) {
        this.classes = classes;
        this.scores = scores;
    }

    public Student(int id, String name, String birthOfDay, String gender, String classes, float scores) {
        super(id, name, birthOfDay, gender);
        this.classes = classes;
        this.scores = scores;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public float getScores() {
        return scores;
    }

    public void setScores(float scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birtOfDay='" + birthOfDay + '\'' +
                ", class='" + classes + '\'' +
                ", scores='" + scores + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
