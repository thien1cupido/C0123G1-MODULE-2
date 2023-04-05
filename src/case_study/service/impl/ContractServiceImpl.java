package case_study.service.impl;

import case_study.model.Contract;
import case_study.repository.IContractRepository;
import case_study.repository.impl.ContractRepositoryImpl;
import case_study.service.IBookingService;
import case_study.service.IContractService;

import java.util.Queue;
import java.util.Scanner;

public class ContractServiceImpl implements IContractService {
    static Scanner scanner = new Scanner(System.in);
    private final IContractRepository contractRepository = new ContractRepositoryImpl();
    private final IBookingService bookingService=new BookingServiceImpl();

    @Override
    public void add() {
        bookingService.display();
        System.out.print("Enter number contrac:");
        int contractNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter id booking:");
        int idBooking = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter advandce deposit amount: ");
        String advanceDepositAmount = scanner.nextLine();
        System.out.print("Enter total payment amount: ");
        String totalPaymentAmount = scanner.nextLine();
        System.out.print("Enter id customer amount: ");
        String idCustomer = scanner.nextLine();
        contractRepository.add(new Contract(contractNumber, idBooking, advanceDepositAmount, totalPaymentAmount, idCustomer));
    }

    @Override
    public void display() {
        Queue<Contract> contractQueue = contractRepository.display();
        if (contractQueue.size() == 0) {
            System.out.println("No contract");
        } else {
            for (Contract contract : contractQueue) {
                System.out.println(contract);
            }
        }

    }
}
