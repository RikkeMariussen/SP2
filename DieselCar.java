public class DieselCar extends AFuelCar {

    protected boolean particleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.particleFilter = particleFilter;
    }

    public boolean hasParticleFilter() {
        return this.particleFilter;
    }

    @Override
    public int getRegistrationFee() {
        int registrationFee = 330;
        int equalizationTax = 130;
        int sum = registrationFee + equalizationTax;

        if (20 <= getKmPrLitre() && getKmPrLitre() > 50) {
            sum = 330 + 130;
        } else if (15 <= getKmPrLitre() && getKmPrLitre() > 20) {
            sum = 1050 + 1390;
        } else if (10 <= getKmPrLitre() && getKmPrLitre() > 15) {
            sum = 2340 + 1850;
        } else if (5 <= getKmPrLitre() && getKmPrLitre() > 10) {
            sum = 5500 + 2770;
        } else if (5 > getKmPrLitre()) {
            sum = 10470 + 15260;
        }
        if (!hasParticleFilter()) {
            sum += 1000;
        }
        return sum;
    }

        @Override
        public String getFuelType () {
            return "Diesel";
        }


        @Override
        public String toString () {

            return "Registration number: " + getRegistrationNumber() + "\n Make and model: " + getMake() + " " + getModel() + "\n It has " + getNumberOfDoors() + " doors." + "\n It is a diesel fueled car."  + "\n On average it uses: " + getKmPrLitre() + " km/l." + "\n The registration fee is: " + getRegistrationFee() + " kr." + "\n";
        }
    }