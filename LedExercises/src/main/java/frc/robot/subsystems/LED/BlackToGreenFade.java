package frc.robot.subsystems.LED;

import edu.wpi.first.wpilibj.AddressableLEDBuffer;

/**
 * Make the first LED fade from black to green over time.
 * 
 * Things you need to learn:
 * - variables (you'll probably want to use a class member variable to complete this challenge)
 */
public class BlackToGreenFade implements Led {
    int counter = 0;
    int ledValue = 0;

    public void start(AddressableLEDBuffer buffer, int length) {
        buffer.setRGB(0, 0, 0, 0);
    }

    public void run(AddressableLEDBuffer buffer, int length) { 

        counter++;

        if (counter % 5 == 0) {
            ledValue++;
            System.out.println("got to ln 25 :yay:");
        }

        buffer.setRGB(3, 0, ledValue, 0);
        
        System.out.println(counter + ", " + ledValue);

        if (counter >= 255 * 5) {
            counter = 0;
            ledValue = 0;
        }
    }

    public void end(AddressableLEDBuffer buffer, int length) {

    }
}
