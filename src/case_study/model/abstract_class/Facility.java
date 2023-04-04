package case_study.model.abstract_class;


public abstract class Facility {
    protected String idService;
    protected String serviceName;
    protected float usableAre;
    protected int rentalCosts;
    protected int maximumNumberOfPeople;
    protected String rentalType;

    public Facility() {
    }

    public Facility(String idService, String serviceName, float usableAre, int rentalCosts, int maximumNumberOfPeople, String rentalType) {
        this.idService = idService;
        this.serviceName = serviceName;
        this.usableAre = usableAre;
        this.rentalCosts = rentalCosts;
        this.maximumNumberOfPeople = maximumNumberOfPeople;
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public float getUsableAre() {
        return usableAre;
    }

    public void setUsableAre(float usableAre) {
        usableAre = usableAre;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(int rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaximumNumberOfPeople() {
        return maximumNumberOfPeople;
    }

    public void setMaximumNumberOfPeople(int maximumNumberOfPeople) {
        this.maximumNumberOfPeople = maximumNumberOfPeople;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public String getRentaltype() {
        return rentalType;
    }

    public void setRentaltype(String rentaltype) {
        this.rentalType = rentaltype;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "idService='" + idService + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", UsableAre=" + usableAre +
                ", rentalCosts=" + rentalCosts +
                ", maximumNumberOfPeople=" + maximumNumberOfPeople +
                ", rentaltype='" + rentalType + '\'' +
                '}';
    }

    public String getToStringCSV() {
        return idService + "," + serviceName + "," + usableAre + "," + rentalCosts + "," + maximumNumberOfPeople + "," + rentalType;
    }
}
