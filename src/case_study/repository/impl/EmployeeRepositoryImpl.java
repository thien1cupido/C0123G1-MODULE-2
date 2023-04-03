package case_study.repository.impl;

import case_study.model.Employee;
import case_study.repository.IEmployeeRepository;
import case_study.util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;


public class EmployeeRepositoryImpl implements IEmployeeRepository {
    private static final String PATH_FILE = "src\\case_study\\data\\employee_data.csv";


    @Override
    public void add(Employee employee) {
        String stringSplit = employee.getInfoToCSV();
        ReadAndWrite.writeStringToFile(PATH_FILE, stringSplit, true);
    }

    @Override
    public List<Employee> display() {
        List<String> stringList1 = ReadAndWrite.readFileToListString(PATH_FILE);
        List<Employee> employeeList = new ArrayList<>();
        for (String str : stringList1) {
            String[] array = str.split(",");
            employeeList.add(new Employee(array[0], array[1], array[2], array[3], array[4], array[5], Integer.parseInt(array[6]), array[7], array[8], Double.parseDouble(array[9])));
        }
        return employeeList;
    }


    @Override
    public void edit(int i, List<Employee> employeeList) {
        Employee employee = employeeList.get(i);
        String stringSplit = employee.getInfoToCSV();
        if (i == 0) {
            ReadAndWrite.writeStringToFile(PATH_FILE, stringSplit, false);
        } else {
            ReadAndWrite.writeStringToFile(PATH_FILE, stringSplit, true);
        }
    }
}



