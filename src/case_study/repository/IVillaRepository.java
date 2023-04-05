package case_study.repository;

import case_study.model.Villa;

import java.util.LinkedHashMap;


public interface IVillaRepository {
    void add(Villa villa, Integer integer);

    LinkedHashMap<Villa, Integer> display();

    void edit(Villa villa, Integer integer);
}
