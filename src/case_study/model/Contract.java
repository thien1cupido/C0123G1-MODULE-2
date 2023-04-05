package case_study.model;

public class Contract {
    private int contractNumber;
    private int idBooking;
    private String advanceDepositAmount;
    private String totalPaymentAmount;
    private String idCustomer;

    public Contract() {
    }

    public Contract(int contractNumber, int idBooking, String advanceDepositAmount, String totalPaymentAmount, String idCustomer) {
        this.contractNumber = contractNumber;
        this.idBooking = idBooking;
        this.advanceDepositAmount = advanceDepositAmount;
        this.totalPaymentAmount = totalPaymentAmount;
        this.idCustomer = idCustomer;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
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

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractNumber=" + contractNumber +
                ", idBooking='" + idBooking + '\'' +
                ", advanceDepositAmount='" + advanceDepositAmount + '\'' +
                ", totalPaymentAmount='" + totalPaymentAmount + '\'' +
                ", idCustomer='" + idCustomer + '\'' +
                '}';
    }

    public String getToCSV(){
        return contractNumber+","+idBooking+","+advanceDepositAmount+","+totalPaymentAmount+","+idCustomer;
    }
}