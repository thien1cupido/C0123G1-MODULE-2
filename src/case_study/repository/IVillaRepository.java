package case_study.repository;

import case_study.model.Villa;

import java.util.LinkedHashMap;

public interface IVillaRepository {
    void add(LinkedHashMap<Villa, Integer> villaLinkedHashMap);

    LinkedHashMap<Villa, Integer> display();
}
