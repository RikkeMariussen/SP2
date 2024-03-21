import java.util.ArrayList;

public class FleetOfCars {

    ArrayList<Car> fleet = new ArrayList<>();

    int getTotalRegistrationFeeForFleet() {
        int totalRegistrationFee = 0;
        for (Car c : fleet) {
            totalRegistrationFee += c.getRegistrationFee();
        }
        return totalRegistrationFee;
    }

    public boolean addCar(Car car) {
        for (Car c : fleet) {
            if (c.getRegistrationNumber().equals(car.getRegistrationNumber())) {
                return false;
            }
        }
        fleet.add(car);
        return true;
    }


    @Override
    public String toString() {
        StringBuilder stringStarter = new StringBuilder();
        stringStarter.append("The fleet of cars:" + "\n" + "\n");
        for (Car c : fleet) {
            stringStarter.append(c.toString()).append("\n");
        }
            return stringStarter.toString() + "The total sum of registration fees are: " + getTotalRegistrationFeeForFleet() + " kr.";
        }





}