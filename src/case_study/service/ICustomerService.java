package case_study.service;

public interface ICustomerService extends IService{
    @Override
    void add();

    void edit();

    @Override
    void display();
}
