package lam_them.model;

public class Instructor extends Person {
    private String specialize;

    public Instructor() {
    }


    public Instructor(int id, String name, String birthOfDay, String gender, String specialize) {
        super(id, name, birthOfDay, gender);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "id=" + id + '\'' +
                ", name='" + name + '\'' +
                ", birthOfDay='" + birthOfDay + '\'' +
                ", gender='" + gender + '\'' +
                ", specialize='" + specialize + '\'' +
                '}';
    }
}
