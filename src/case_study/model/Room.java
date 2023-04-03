package case_study.model;

public class Room extends Facility {
    private String freeServiceInclude;

    public Room() {
    }

    public Room(String idService, String serviceName, float usableAre, int rentalCosts, int maximumNumberOfPeople, String rentalType, String freeServiceInclude) {
        super(idService, serviceName, usableAre, rentalCosts, maximumNumberOfPeople, rentalType);
        this.freeServiceInclude = freeServiceInclude;
    }

    public String getFreeServiceInclude() {
        return freeServiceInclude;
    }

    public void setFreeServiceInclude(String freeServiceInclude) {
        this.freeServiceInclude = freeServiceInclude;
    }

    @Override
    public String toString() {
        return "Room{" +
                "IdService='" + idService + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", usableAre=" + usableAre +" m2"+ '\'' +
                ", rentalCosts=" + rentalCosts +" triệu"+ '\'' +
                ", maximumNumberOfPeople=" + maximumNumberOfPeople +" người"+ '\'' +
                ", rentalType='" + rentalType + '\'' +
                ", freeServiceInclude='" + freeServiceInclude + '\'' +
                '}';
    }

    @Override
    public String getToStringCSV() {
        return super.getToStringCSV() + "," + freeServiceInclude;
    }
}
