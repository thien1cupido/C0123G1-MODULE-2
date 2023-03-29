package case_study.model;

public class Booking extends Customer {
    protected int bookingCode;
    private String startDate;
    private String endDate;
    private String serviceName;
    private String serviceType;

    public Booking() {
    }

    public Booking(int customerCode, int bookingCode, String startDate, String endDate, String serviceName, String serviceType) {
        super(customerCode);
        this.bookingCode = bookingCode;
        this.startDate = startDate;
        this.endDate = endDate;
        this.serviceName = serviceName;
        this.serviceType = serviceType;
    }
    public Booking(int customerCode,int bookingCode){
        super(customerCode);
        this.bookingCode = bookingCode;
    }

    public int getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(int bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
}