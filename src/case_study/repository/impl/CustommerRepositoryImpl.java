package case_study.repository.impl;

import case_study.model.Customer;
import case_study.repository.ICustommerRepository;
import case_study.util.ReadAndWrite;

import java.util.LinkedList;
import java.util.List;

public class CustommerRepositoryImpl implements ICustommerRepository {
    private static final String PATH_FILE = "src\\case_study\\data\\customer_data.csv";

    @Override
    public void add(Customer customer) {
        String stringSplit = customer.getInfoToCSV();
        ReadAndWrite.writeStringToFile(PATH_FILE, stringSplit, true);

    }

    @Override
    public LinkedList<Customer> display() {
        List<String> stringList = ReadAndWrite.readFileToListString(PATH_FILE);
        LinkedList<Customer> customerLinkedList = new LinkedList<>();
        for (String str : stringList) {
            String[] array = str.split(",");
            customerLinkedList.add(new Customer(array[0], array[1], array[2], array[3], array[4], array[5], Integer.parseInt(array[6]), array[7], array[8]));
        }
        return customerLinkedList;
    }

    @Override
    public void edit(int i, LinkedList<Customer> customerLinkedList) {
        Customer customer = customerLinkedList.get(i);
        String string = customer.getInfoToCSV();
        ReadAndWrite.writeStringToFile(PATH_FILE, string, i != 0);
    }
}
