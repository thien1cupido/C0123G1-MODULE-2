package case_study.model;

public class Contract extends Booking{
    private int contractNumber;
    private String advanceDepositAmount;
    private String totalPaymentAmount;

    public Contract() {
    }

    public Contract(int customerCode, int bookingCode, int contractNumber, String advanceDepositAmount, String totalPaymentAmount) {
        super(customerCode, bookingCode);
        this.contractNumber = contractNumber;
        this.advanceDepositAmount = advanceDepositAmount;
        this.totalPaymentAmount = totalPaymentAmount;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getAdvanceDepositAmount() {
        return advanceDepositAmount;
    }

    public void setAdvanceDepositAmount(String advanceDepositAmount) {
        this.advanceDepositAmount = advanceDepositAmount;
    }

    public String getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    public void setTotalPaymentAmount(String totalPaymentAmount) {
        this.totalPaymentAmount = totalPaymentAmount;
    }
}