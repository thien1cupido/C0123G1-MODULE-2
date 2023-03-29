package case_study.repository.impl;

import case_study.model.Employee;
import case_study.repository.IEmployeeRepository;
import case_study.util.ReadAndWriteEmployee;

import java.util.ArrayList;
import java.util.List;


public class EmployeeRepository implements IEmployeeRepository {
    private static final String PATH_FILE = "src\\case_study\\data\\employee.csv";
    static List<Employee> employeeList = new ArrayList<>();
    static {
        employeeList= ReadAndWriteEmployee.readFileEmployee(PATH_FILE);
    }

    @Override
    public void add(List<Employee>employeeList) {
    ReadAndWriteEmployee.writeFileEmployee(PATH_FILE,employeeList,false);
    }

    @Override
    public void display() {

    }

    @Override
    public void edit() {

    }
}


