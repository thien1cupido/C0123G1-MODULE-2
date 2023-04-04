package case_study.repository.impl;

import case_study.model.Room;
import case_study.repository.IRoomRepository;
import case_study.util.ReadAndWrite;

import java.util.LinkedHashMap;
import java.util.List;

public class RoomRepositoryImpl implements IRoomRepository {
    private static final String PATH_FILE="src\\case_study\\data\\room_data.csv";
    @Override
    public void add(Room room, Integer integer) {
        display();
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
}
