public abstract class ACar implements Car {

    protected String registrationNumber;
    protected String make;
    protected String model;
    protected int numberOfDoors;

    protected int registrationFee;

    public ACar(String registrationNumber, String make, String model, int numberOfDoors) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }


    //Possible not supposed to be there
    @Override
    public int getRegistrationFee() {
        return 0;
    }
}
