public class Mercedes extends Car{

    @Override
    void sound(){

        System.out.println("Accelereaza Mercedes");
        SoundOfCars.soundOfCar("MERCEDES.mp3");

    }

}
