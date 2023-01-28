public class CarsGarage {
    private int MAXCARS = 10;
    private Car[] carsParkedInTheGarage = new Car[MAXCARS];


    public static void main(String[] args) {

        CarsGarage cg = new CarsGarage();
        cg.addCars();
        cg.playCarSounds();

    }

    private void addCars(){

        carsParkedInTheGarage[0] = new Audi();
        carsParkedInTheGarage[1] = new Bmw();
        carsParkedInTheGarage[2] = new Mercedes();

    }

    private void playCarSounds() {

        for (int i = 0; i < carsParkedInTheGarage.length; i++) {
            if (carsParkedInTheGarage[i] != null) {
                carsParkedInTheGarage[i].move();
                carsParkedInTheGarage[i].sound();
            }
        }

    }

}
