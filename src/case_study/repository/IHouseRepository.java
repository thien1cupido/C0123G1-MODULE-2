package case_study.repository;

import case_study.model.House;

import java.util.LinkedHashMap;

public interface IHouseRepository {
    void add(House house, Integer integer);

    LinkedHashMap<House, Integer> display();
    void edit(House house,Integer integer);
}
