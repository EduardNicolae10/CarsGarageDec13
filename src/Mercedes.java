public class Mercedes extends Car{

    @Override
    void sound(){

        System.out.println("Accelereaza Mercedes, asa se aude un Mercedes");
        SoundOfCars.soundOfCar("MERCEDES.mp3");

    }

}
