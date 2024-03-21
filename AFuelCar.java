public abstract class AFuelCar extends ACar{

    protected int kmPrLitre; //Måske skal den kun stå i constructoren

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }

    public String getFuelType(){
        //String getFuelType(); -- should return “Gasoline” or “Diesel”
        return "";
    }

    public int getKmPrLitre() { // should return how many kilometres the car can drive on 1 litre of fuel
        return kmPrLitre;
    }

}
