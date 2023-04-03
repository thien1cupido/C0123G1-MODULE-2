package case_study.repository;

import case_study.model.Employee;

import java.util.List;

public interface IEmployeeRepository {
    void add(Employee employee);

    List<Employee> display();

    void edit(int i,List<Employee>employeeList);
}
