package case_study.repository.impl;

import case_study.model.Room;
import case_study.repository.IRoomRepository;
import case_study.util.ReadAndWrite;

import java.util.*;

public class RoomRepositoryImpl implements IRoomRepository {
    private static final String PATH_FILE="src\\case_study\\data\\room_data.csv";
    @Override
    public void add(Room room, Integer integer) {
        String string=room.getToStringCSV()+","+integer;
        ReadAndWrite.writeStringToFile(PATH_FILE,string,true);

    }

    @Override
    public LinkedHashMap<Room, Integer> display() {
        LinkedHashMap<Room,Integer>roomIntegerLinkedHashMap=new LinkedHashMap<>();
        List<String>stringList = ReadAndWrite.readFileToListString(PATH_FILE);
        for (String s: stringList) {
            String [] arr=s.split(",");
            roomIntegerLinkedHashMap.put(new Room(arr[0],arr[1],Float.parseFloat(arr[2]),
                    Integer.parseInt(arr[3]),Integer.parseInt(arr[4]),arr[5],arr[6]),Integer.parseInt(arr[7]));
        }
        return  roomIntegerLinkedHashMap;
    }

    public void edit(Room room, Integer integer) {
        LinkedHashMap<Room, Integer> roomIntegerLinkedHashMap = display();
        Set<Map.Entry<Room,Integer>> roomEntry = roomIntegerLinkedHashMap.entrySet();
        for (int i = 0; i <roomIntegerLinkedHashMap.size(); i++) {
            Room room1 =(Room) roomIntegerLinkedHashMap.keySet().toArray()[i];
            if (room1.getIdService().equals(room.getIdService())){
                roomIntegerLinkedHashMap.remove(room1);
            }
        }
        roomIntegerLinkedHashMap.put(room, integer+1);
        List<String> stringList = new ArrayList<>();
        for (Map.Entry<Room,Integer>room2:roomEntry) {
            String string = room2.getKey().getToStringCSV() + "," + room2.getValue();
            stringList.add(string);
        }
        ReadAndWrite.writeListToFile(PATH_FILE,stringList,false);
    }
}
