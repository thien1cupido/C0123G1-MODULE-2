package case_study.repository.impl;

import case_study.model.Employee;
import case_study.repository.IEmployeeRepository;
import case_study.util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;


public class EmployeeRepository implements IEmployeeRepository {
    private static final String PATH_FILE = "src\\case_study\\data\\employee.csv";
    static List<String> stringList =new ArrayList<>();
    static List<Employee> employeeList = new ArrayList<>();
    static {
        stringList=ReadAndWrite.readFileToListString(PATH_FILE);
    }

    @Override
    public List<Employee> getAllEmployee() {
        for (int i = 0; i < stringList.size(); i++) {
            String string = stringList.get(i);
            String[] arr = string.split(",");
            Employee employee = new Employee(arr[0], arr[1], arr[2], Double.parseDouble(arr[3]), Double.parseDouble(arr[4]), arr[5], Integer.parseInt(arr[6]), arr[7], arr[8], Double.parseDouble(arr[9]));
            employeeList.add(employee);
        }
        return employeeList;
    }

    @Override
    public void add() {
//    employeeList.
//    ReadAndWrite.writeSringToFile(PATH_FILE,stringList,true);

    }

    @Override
    public void edit() {

    }
}


