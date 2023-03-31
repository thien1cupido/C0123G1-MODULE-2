package case_study.repository;

import case_study.model.Employee;

import java.util.List;

public interface IEmployeeRepository {
    void add(List<Employee> employeeList);

    List<Employee> display();

    void edit(List<Employee> employeeList);
}
