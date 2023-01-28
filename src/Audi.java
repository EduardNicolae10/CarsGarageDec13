public class Audi extends Car{

    @Override
    void sound(){

        System.out.println("Accelereaza Audi, asa se aude un Audi");
        SoundOfCars.soundOfCar("AUDI.mp3");

    }

}
