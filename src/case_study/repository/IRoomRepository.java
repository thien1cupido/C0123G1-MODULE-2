package case_study.repository;

import case_study.model.Room;

import java.util.LinkedHashMap;

public interface IRoomRepository {
    void add(Room room, Integer integer);

    LinkedHashMap<Room, Integer> display();

    void edit(Room room, Integer integer);
}
