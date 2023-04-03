package case_study.repository.impl;

import case_study.model.Villa;
import case_study.repository.IVillaRepository;
import case_study.util.ReadAndReadVilla;

import java.util.LinkedHashMap;

public class VillaRepositoryImpl implements IVillaRepository {
    private static final String PATH_FILE="src\\case_study\\data\\villa_data.csv";
    static LinkedHashMap<Villa,Integer>villaIntegerLinkedHashMap =new LinkedHashMap<>();
    static {
        villaIntegerLinkedHashMap=ReadAndReadVilla.readFileToVilla(PATH_FILE);
    }
    @Override
    public void add(LinkedHashMap<Villa, Integer> villaLinkedHashMap) {
        villaIntegerLinkedHashMap=villaLinkedHashMap;
        ReadAndReadVilla.writeFileToVilla(PATH_FILE,villaIntegerLinkedHashMap,false);
    }

    @Override
    public LinkedHashMap<Villa, Integer> display() {
        return villaIntegerLinkedHashMap;
    }
}
