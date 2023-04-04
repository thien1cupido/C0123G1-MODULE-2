package case_study.repository.impl;

import case_study.model.Villa;
import case_study.repository.IVillaRepository;
import case_study.util.ReadAndWrite;

import java.util.LinkedHashMap;
import java.util.List;

public class VillaRepositoryImpl implements IVillaRepository {
    private static final String PATH_FILE="src\\case_study\\data\\villa_data.csv";

    @Override
    public void add(Villa villa,Integer integer) {
        display();
        String str=villa.getToStringCSV()+","+integer;
        ReadAndWrite.writeStringToFile(PATH_FILE,str,true);
    }

    @Override
    public LinkedHashMap<Villa, Integer> display() {
        LinkedHashMap<Villa,Integer>villaIntegerLinkedHashMap =new LinkedHashMap<>();
        List<String>stringList= ReadAndWrite.readFileToListString(PATH_FILE);
        for (String s:stringList
              ) {
            String []arr=s.split(",");
            villaIntegerLinkedHashMap.put(new Villa(arr[0],arr[1],Float.parseFloat(arr[2]),Integer.parseInt(arr[3]),
                    Integer.parseInt(arr[4]),arr[5],arr[6],Float.parseFloat(arr[7]),Integer.parseInt(arr[8])),Integer.parseInt(arr[9]));
        }
        return villaIntegerLinkedHashMap;
    }
}
