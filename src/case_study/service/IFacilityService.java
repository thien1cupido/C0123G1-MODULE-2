package case_study.service;

public interface IFacilityService extends IService {
    @Override
    void add();

    @Override
    void display();

    @Override
    void edit();

    void displaylistFacilityMaintenance();
}
