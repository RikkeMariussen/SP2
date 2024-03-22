public class ElectricCar extends ACar {

    private int batteryCapacity;
    private int maxRange;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    public int getBatteryCapacity() { // returns the battery capacity in kilowatt hours
        return batteryCapacity;
    }

    public int getMaxRangeKm() {
        // returns the maximum range in kilometres.
        return maxRange;
    }

    @Override
    public int getNumberOfDoors() {
        return super.numberOfDoors;
    }

    public double getWhPrKm() { // returns the power consumption in watt hours per driven kilometre.
        return (double) (getBatteryCapacity()*1000) /getMaxRangeKm();
    }

    @Override
    public int getRegistrationFee() {
double whPrLToKmL = (getWhPrKm() / 91.25) / 100.00;
        registrationFee = 330;
        if (20 <= whPrLToKmL && whPrLToKmL < 50) {
            return 330;
        } else if (15 <= whPrLToKmL && whPrLToKmL < 20) {
            return 1050;
        } else if (10 <= whPrLToKmL && whPrLToKmL < 15) {
            return 2340;
        } else if (5 <= whPrLToKmL && whPrLToKmL < 10) {
            return 5500;
        } else if (5 > whPrLToKmL) {
            return 10470;
        }
        return registrationFee;
    }

    public String toString() {
        return "Registration number: " + getRegistrationNumber() + "\n Make and model: " + getMake() + " " + getModel() + "\n It has " + getNumberOfDoors() + " doors." + "\n It is an electric car, with a max range of: " + getMaxRangeKm() + " km."  + "\n On average it uses: " + getWhPrKm() + " Wh/km." + "\n The registration fee is: " + getRegistrationFee() + " kr."  + "\n";
    }
}




