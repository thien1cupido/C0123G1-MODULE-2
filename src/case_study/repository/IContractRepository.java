package case_study.repository;

import case_study.model.Contract;

import java.util.Queue;

public interface IContractRepository {
    void add(Contract contract);

    Queue<Contract> display();
}
