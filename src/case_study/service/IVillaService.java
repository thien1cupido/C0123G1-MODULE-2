package case_study.service;

import case_study.model.Villa;

import java.util.LinkedHashMap;

public interface IVillaService {

    void addVilla();

    LinkedHashMap<Villa,Integer> displayVilla();
}
