package case_study.model;

public abstract class Person {
    protected String name;
    protected String birthOfDay;
    protected String gender;
    protected String citizenIdentification;
    protected String phoneNumber;
    protected String email;

    public Person() {
    }

    public Person(String name, String birthOfDay, String gender, String citizenIdentification, String phoneNumber, String email) {
        this.name = name;
        this.birthOfDay = birthOfDay;
        this.gender = gender;
        this.citizenIdentification = citizenIdentification;
        this.phoneNumber = phoneNumber;
        this.email = email;
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

    public String getCitizenIdentification() {
        return citizenIdentification;
    }

    public void setCitizenIdentification(String citizenIdentification) {
        this.citizenIdentification = citizenIdentification;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthOfDay='" + birthOfDay + '\'' +
                ", gender='" + gender + '\'' +
                ", citizenIdentification='" + citizenIdentification + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
    public String getInfoToCSV(){
        return this.name+","+this.birthOfDay+","+this.gender+","+this.citizenIdentification+","+this.phoneNumber+","+this.email;
    }
}
