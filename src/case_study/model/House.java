package case_study.model;

import case_study.model.abstract_class.Facility;

public class House extends Facility {
    private String roomStandard;
    private int numberOfFloors;

    public House() {
    }


    public House(String idService, String serviceName, float usableAre, int rentalCosts, int maximumNumberOfPeople, String rentalType, String roomStandard, int numberOfFloors) {
        super(idService, serviceName, usableAre, rentalCosts, maximumNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "idService='" + idService + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", UsableAre=" + usableAre  + '\'' +
                ", rentalCosts=" + rentalCosts  + '\'' +
                ", maximumNumberOfPeople=" + maximumNumberOfPeople  + '\'' +
                ", rentaltype='" + rentalType + '\'' +
                ", roomStandard='" + roomStandard + '\'' +
                ", numberOfFloors='" + numberOfFloors + '\'' +
                '}';
    }

    @Override
    public String getToStringCSV() {
        return idService + "," + serviceName + "," + usableAre + "," + rentalCosts + "," + maximumNumberOfPeople + "," + rentalType + "," + roomStandard + "," + numberOfFloors;
    }
}
