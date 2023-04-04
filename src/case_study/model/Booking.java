package case_study.model;

public class Booking {
    protected int bookingCode;
    private String startDay;
    private String endDay;
    private int idCustomer;
    private String serviceName;
    private String serviceType;

    public Booking() {
    }

    public Booking(int bookingCode, String startDate, String endDate, int idCustomer, String serviceName, String serviceType) {
        this.bookingCode = bookingCode;
        this.startDay = startDate;
        this.endDay = endDate;
        this.idCustomer = idCustomer;
        this.serviceName = serviceName;
        this.serviceType = serviceType;
    }

    public int getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(int bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
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

    @Override
    public String toString() {
        return "Booking{" +
                "bookingCode=" + bookingCode +
                ", startDate='" + startDay + '\'' +
                ", endDay='" + endDay + '\'' +
                ", idService='" + idCustomer + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", serviceType='" + serviceType + '\'' +
                '}';
    }
}