package case_study.model;

public class Contract {
    private int contractNumber;
    private String advanceDepositAmount;
    private String totalPaymentAmount;

    public Contract() {
    }

    public Contract(int contractNumber, String advanceDepositAmount, String totalPaymentAmount) {
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

    @Override
    public String toString() {
        return "Contract{" +
                "contractNumber=" + contractNumber +
                ", advanceDepositAmount='" + advanceDepositAmount + '\'' +
                ", totalPaymentAmount='" + totalPaymentAmount + '\'' +
                '}';
    }
}