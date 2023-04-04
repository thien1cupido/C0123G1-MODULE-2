package case_study.model;

import case_study.model.abstract_class.Facility;

public class Villa extends Facility {
    private String standardRoom;
    private float swimmingPoolArea;
    private int numberFloors;

    public Villa() {
    }

    public Villa(String idService, String serviceName, float usableAre, int rentalCosts, int maximumNumberOfPeople, String rentalType, String standardRoom, float swimmingPoolArea, int numberRoom) {
        super(idService, serviceName, usableAre, rentalCosts, maximumNumberOfPeople, rentalType);
        this.standardRoom = standardRoom;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberFloors = numberRoom;
    }

    public float getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(float swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public int getNumberRoom() {
        return numberFloors;
    }

    public void setnumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "IdService= '" + idService + '\'' +
                ", serviceName= '" + serviceName + '\'' +
                ", standardRoom= '" + standardRoom + '\'' +
                ", swimmingPoolArea= '" + swimmingPoolArea  + '\'' +
                ", numberRoom= '" + numberFloors + '\'' +
                ", usableAre= '" + usableAre  + '\'' +
                ", rentalCosts= '" + rentalCosts  + '\'' +
                ", maximumNumberOfPeople= '" + maximumNumberOfPeople + '\'' +
                ", rentalType= '" + rentalType + '\'' +
                '}';
    }

    @Override
    public String getToStringCSV() {
        return super.getToStringCSV() + "," + standardRoom + "," + swimmingPoolArea + "," + numberFloors;
    }
}
