package lam_them.model;

public abstract class Person {
    protected int id;
    protected String name;
    protected String birthOfDay;
    protected String gender;

    public Person() {
    }

    public Person(int id, String name, String birthOfDay, String gender) {
        this.id = id;
        this.name = name;
        this.birthOfDay = birthOfDay;
        this.gender = gender;
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

    public String getBirthOfDay() {
        return birthOfDay;
    }

    public void setBirthOfDay(String birthOfDay) {
        this.birthOfDay = birthOfDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthOfDay='" + birthOfDay + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
