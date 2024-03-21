public class Main {
    public static void main(String[] args) {

        FleetOfCars fleetOfCars = new FleetOfCars();

        //Describe the cars in the fleet
        DieselCar car1 = new DieselCar("CD20548", "Fiat", "Ducato", 5, 17, false);
        GasolinCar car2 = new GasolinCar("DM43010", "Skoda", "Fabia", 5, 19);
        ElectricCar car3 = new ElectricCar("AA99999","Tesla", "X1", 5, 84, 400);

        //This car can not be added as the registration number already exists.
        GasolinCar car4 = new GasolinCar("CD20548", "Skoda", "Ducato", 5, 17);

        //Adding the cars to the arraylist
        fleetOfCars.addCar(car1);
        fleetOfCars.addCar(car2);
        fleetOfCars.addCar(car3);

        //The "fake" car which already is in the fleet.
        fleetOfCars.addCar(car4);

        System.out.println(fleetOfCars);
        }
}
/*1. Done
2.    Done
3.    Mangler a.

4.    Mangler reg.afgift udregningen

5.    Mangler reg.afgift udregningen og yderligere metode til boolean

6.    Mangler: Beregn watt-timer per kilometer ud fra disse to attributter.



De tre konkrete (ikke-abstrakte) klasser, GasolineCar, DieselCar og ElectricCar skal overskrive toString() metoden,
    så den returnerer en String, der repræsenterer bilen på en overskuelig måde.

Du kan evt. overskrive toString() i Acar klassen, så den returnerer en String med de attributter, der er fælles for alle biler og overskrive toString() i FuelCar klassen så den bruger super klassens toString() og tilføjer km/l.

Herefter kan de tre konkrete klasser kalde deres super-klassers toString() metode og blot tilføje de ekstra attributter, der er i den konkrete biltype.



Flåden af biler


Der skal en klasse FleetOfCars, der indeholder en ArrayList<Car>, der kan indeholde alle bilerne, som udlejningsfirmaet råder over. Klassen skal indeholde en metode til at tilføje en bil til flåden. Den skal overskrive toString(), så den returnerer en String, der lister alle bilerne i flåden. Sidst men ikke mindst skal den have en metode, getTotalRegistrationFeeForFleet(), der beregner den samlede registreringsafgift for hele bilflåden.



Skriv en main-metode der instantierer et FleetOfCars-objekt og et antal bil-objekter af de 3 konkrete typer. Tilføj bilerne til flåden. Skriv alle bilerne ud, og kald også getTotalRegistrationFeeForFleet() -metoden og skriv resultatet ud.*/