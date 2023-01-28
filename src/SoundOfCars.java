import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class SoundOfCars {

    public static void soundOfCar(String fileNameContainingSound){

        try{
            //primeste sunetele unui mp3 de pe disk
            FileInputStream fos = new FileInputStream(fileNameContainingSound);
            BufferedInputStream buf = new BufferedInputStream(fos);

            // play that file
            Player player = new Player(fos);
            player.play();
            //System.out.println("ruleaza");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        SoundOfCars.soundOfCar("BMW.mp3");
    }


}
