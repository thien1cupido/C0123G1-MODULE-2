package case_study.util;

import case_study.model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteEmployee {
    public static void writeFileEmployee(String pathFile, List<Employee>employeeList, boolean append) {
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee e : employeeList
            ) {
                bufferedWriter.write(e.getInfoToCSV());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static List<Employee> readFileEmployee(String pathFile) {
        List<Employee> employeeList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String []arr=line.split(",");
                String name=arr[0];
                String birthOfDay=arr[1];
                String gender=arr[2];
                String citizenIdentification=arr[3];
                String phoneNumber=arr[4];
                String email=arr[5];
                int employeeCode= Integer.parseInt(arr[6]);
                String level=arr[7];
                String position=arr[8];
                double salary=Double.parseDouble(arr[9]);
                employeeList.add(new Employee(name,birthOfDay,gender,citizenIdentification,phoneNumber,email,employeeCode,level,position,salary));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return employeeList;
    }
}
