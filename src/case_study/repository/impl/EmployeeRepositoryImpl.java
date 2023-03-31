package case_study.repository.impl;

import case_study.model.Employee;
import case_study.repository.IEmployeeRepository;
import case_study.util.ReadAndWriteEmployee;

import java.util.ArrayList;
import java.util.List;


public class EmployeeRepositoryImpl implements IEmployeeRepository {
    private static final String PATH_FILE = "src\\case_study\\data\\employee_data.csv";
    static List<Employee>employeeList=new ArrayList<>();
    static {
        employeeList=ReadAndWriteEmployee.readFileEmployee(PATH_FILE);
    }


    @Override
    public void add(List<Employee> employeeList) {
        ReadAndWriteEmployee.writeFileEmployee(PATH_FILE, employeeList, false);
    }

    @Override
    public List<Employee> display() {
        List<Employee> employeeList1=ReadAndWriteEmployee.readFileEmployee(PATH_FILE);
        return employeeList1;
    }


    @Override
    public void edit(List<Employee> employeeList) {
        ReadAndWriteEmployee.writeFileEmployee(PATH_FILE, employeeList, false);
    }
}


