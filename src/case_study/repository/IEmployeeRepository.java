package case_study.repository;

import case_study.model.Employee;

import java.util.ArrayList;
import java.util.List;

public interface IEmployeeRepository {
    List<Employee> getAllEmployee();
    void add();
    void edit();
}
