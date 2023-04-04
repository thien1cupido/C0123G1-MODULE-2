package case_study.model;

import case_study.model.abstract_class.Person;

public class Employee extends Person {
    private int employeeCode;
    private String level;
    private String position;
    private double salary;

    public Employee() {
    }

    public Employee(String name, String birthOfDay, String gender, String citizenIdentification, String phoneNumber, String email, int employeeCode, String level, String position, double salary) {
        super(name, birthOfDay, gender, citizenIdentification, phoneNumber, email);
        this.employeeCode = employeeCode;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeCode='" + employeeCode + '\'' +
                ", Name='" + name + '\'' +
                ", birthOfDay='" + birthOfDay + '\'' +
                ", gender='" + gender + '\'' +
                ", citizenIdentification='" + citizenIdentification + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    @Override
    public String getInfoToCSV(){
        return name+","+birthOfDay+","+gender+
                ","+citizenIdentification+","+phoneNumber +
                ","+email+","+ employeeCode+","+level+","+position+","+salary;
    }
}
