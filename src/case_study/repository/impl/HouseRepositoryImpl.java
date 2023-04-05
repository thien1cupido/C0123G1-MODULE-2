package case_study.repository.impl;

import case_study.model.House;
import case_study.repository.IHouseRepository;
import case_study.util.ReadAndWrite;

import java.util.*;

public class HouseRepositoryImpl implements IHouseRepository {
    private static final String PATH_FILE = "src\\case_study\\data\\house_data.csv";

    @Override
    public void add(House house, Integer integer) {
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

    @Override
    public void edit(House house, Integer integer) {
        LinkedHashMap<House, Integer> houseIntegerLinkedHashMap = display();
        for (int i = 0; i < houseIntegerLinkedHashMap.size(); i++) {
            House house1=(House) houseIntegerLinkedHashMap.keySet().toArray()[i];
            if (house1.getIdService().equals(house.getIdService())){
                houseIntegerLinkedHashMap.remove(house1);
            }
        }
        houseIntegerLinkedHashMap.put(house, integer);
        Set<Map.Entry<House,Integer>> houseEntry = houseIntegerLinkedHashMap.entrySet();
        List<String> stringList = new ArrayList<>();
        for (Map.Entry<House,Integer> houseIntegerEntry : houseEntry) {
            String string =houseIntegerEntry.getKey().getToStringCSV() + "," + houseIntegerEntry.getValue();
            stringList.add(string);
        }
        ReadAndWrite.writeListToFile(PATH_FILE,stringList,false);
    }
}
