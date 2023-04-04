package case_study.repository.impl;

import case_study.model.House;
import case_study.repository.IHouseRepository;
import case_study.util.ReadAndWrite;

import java.util.LinkedHashMap;
import java.util.List;

public class HouseRepositoryImpl implements IHouseRepository {
    private static final String PATH_FILE = "src\\case_study\\data\\house_data.csv";

    @Override
    public void add(House house, Integer integer) {
        display();
        String string = house.getToStringCSV() + "," + integer;
        ReadAndWrite.writeStringToFile(PATH_FILE, string, true);
    }

    @Override
    public LinkedHashMap<House, Integer> display() {
        LinkedHashMap<House, Integer> houseIntegerLinkedHashMap = new LinkedHashMap<>();
        List<String> stringList = ReadAndWrite.readFileToListString(PATH_FILE);
        for (String s : stringList) {
            String[] arr = s.split(",");
            houseIntegerLinkedHashMap.put(new House(arr[0], arr[1], Float.parseFloat(arr[2]), Integer.parseInt(arr[3]),
                    Integer.parseInt(arr[4]), arr[5], arr[6], Integer.parseInt(arr[7])), Integer.parseInt(arr[8]));
        }
        return houseIntegerLinkedHashMap;
    }
}
