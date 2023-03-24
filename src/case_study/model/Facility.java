package case_study.model;

public abstract class Facility {
    protected String serviceName;
    protected float UsableAre;
    protected double rentalCosts;
    protected int maximumNumberOfPeople;
    protected String rentaltype;

    public Facility() {
    }

    public Facility(String serviceName, float usableAre, double rentalCosts, int maximumNumberOfPeople, String rentaltype) {
        this.serviceName = serviceName;
        this.UsableAre = usableAre;
        this.rentalCosts = rentalCosts;
        this.maximumNumberOfPeople = maximumNumberOfPeople;
        this.rentaltype = rentaltype;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public float getUsableAre() {
        return UsableAre;
    }

    public void setUsableAre(float usableAre) {
        UsableAre = usableAre;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaximumNumberOfPeople() {
        return maximumNumberOfPeople;
    }

    public void setMaximumNumberOfPeople(int maximumNumberOfPeople) {
        this.maximumNumberOfPeople = maximumNumberOfPeople;
    }

    public String getRentaltype() {
        return rentaltype;
    }

    public void setRentaltype(String rentaltype) {
        this.rentaltype = rentaltype;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", UsableAre=" + UsableAre +
                ", rentalCosts=" + rentalCosts +
                ", maximumNumberOfPeople=" + maximumNumberOfPeople +
                ", rentaltype='" + rentaltype + '\'' +
                '}';
    }
}
