package case_study.service;


import case_study.model.abstract_class.Facility;

import java.util.LinkedHashMap;

public interface IFacilityService {

    void add();

    void display();

    void increaseThenBooking(String idService,String nameService);

    LinkedHashMap<Facility, Integer> read();

    void displaylistFacilityMaintenance();
}
