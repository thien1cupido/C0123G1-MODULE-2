package case_study.repository.impl;

import case_study.model.Contract;
import case_study.repository.IContractRepository;
import case_study.util.ReadAndWrite;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class ContractRepositoryImpl implements IContractRepository {
    private final String PATH_FILE = "src\\case_study\\data\\contract_data.csv";

    @Override
    public void add(Contract contract) {
        String string = contract.getToCSV();
        ReadAndWrite.writeStringToFile(PATH_FILE, string, true);
    }

    @Override
    public Queue<Contract> display() {
        Queue<Contract> contractQueue = new ArrayDeque<>();
        List<String> stringList = ReadAndWrite.readFileToListString(PATH_FILE);
        for (String string : stringList) {
            String[] strings1 = string.split(",");
            contractQueue.add(new Contract(Integer.parseInt(strings1[0]), Integer.parseInt(strings1[1]), strings1[2], strings1[3], strings1[4]));
        }
        return contractQueue;
    }
}
