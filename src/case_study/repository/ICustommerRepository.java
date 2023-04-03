package case_study.repository;

import case_study.model.Customer;

import java.util.LinkedList;


public interface ICustommerRepository {
    void add(Customer customer);

    LinkedList<Customer> display();

    void edit(int i, LinkedList<Customer>customerLinkedList);
}
