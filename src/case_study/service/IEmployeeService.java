package case_study.service;

public interface IEmployeeService extends IService {
    @Override
    void add();

    void edit();

    @Override
    void display();
}
