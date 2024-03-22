public class GasolinCar extends AFuelCar {

    public GasolinCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);

    }

    @Override
    public String getFuelType() {
        return "Gasoline";
    }

    @Override
    public int getKmPrLitre() {
        return super.getKmPrLitre();
    }

    @Override
    public int getRegistrationFee() {
    registrationFee = 10470;
        if (20 <= getKmPrLitre() && getKmPrLitre() > 50) {
            return 330;
        } else if (15 <= getKmPrLitre() && getKmPrLitre() > 20) {
            return 1050;
        } else if (10 <= getKmPrLitre() && getKmPrLitre() > 15) {
            return 2340;
        } else if (5 <= getKmPrLitre() && getKmPrLitre() > 10) {
            return 5500;
        } else if (5 > getKmPrLitre()) {
            return 10470;
        }
        return registrationFee;
    }

    @Override
    public String toString(){
        return "Registration number: " + getRegistrationNumber() +"\n Make and model: " + getMake() + " " + getModel() + "\n It has "
                + getNumberOfDoors() + " doors." + "\n It is a gasoline fueled car." + "\n On average it uses: " + getKmPrLitre() + " km/l." + "\n The registration fee is: " + getRegistrationFee() + " kr."  + "\n";
    }
}