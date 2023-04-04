package case_study.model;

import case_study.model.abstract_class.Person;

public class Customer extends Person {
    protected int customerCode;
    private String customerType;
    private String address;

    public Customer() {
    }

    public Customer(String name, String birthOfDay, String gender, String citizenIdentification, String phoneNumber, String email, int customerCode, String customerType, String address) {
        super(name, birthOfDay, gender, citizenIdentification, phoneNumber, email);
        this.customerCode = customerCode;
        this.customerType = customerType;
        this.address = address;
    }
    public Customer(int customerCode){
        this.customerCode=customerCode;
    }

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerCode=" + customerCode +
                ", customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", birthOfDay='" + birthOfDay + '\'' +
                ", gender='" + gender + '\'' +
                ", citizenIdentification='" + citizenIdentification + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public String getInfoToCSV() {
        return name+","+birthOfDay+","+gender+","+citizenIdentification+","+phoneNumber+","+email+","+customerCode+","+customerType+","+address;
    }
}
