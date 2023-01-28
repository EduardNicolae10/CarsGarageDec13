public class Audi extends Car{

    @Override
    void sound(){

        System.out.println("Accelereaza Audi");
        SoundOfCars.soundOfCar("AUDI.mp3");

    }

}
