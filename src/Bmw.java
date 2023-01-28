public class Bmw extends Car{

    @Override
    void sound(){

        System.out.println("Accelereaza Bmw, asa se aude un Bmw");
        SoundOfCars.soundOfCar("BMW.mp3");

    }

}
