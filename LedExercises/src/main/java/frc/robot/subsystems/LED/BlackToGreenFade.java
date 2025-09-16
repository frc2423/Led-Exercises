package frc.robot.subsystems.LED;

import edu.wpi.first.wpilibj.AddressableLEDBuffer;

/**
 * Make the first LED fade from black to green over time.
 * 
 * Things you need to learn:
 * - variables (you'll probably want to use a class member variable to complete this challenge)
 */
public class BlackToGreenFade implements Led {
    int 

    public void start(AddressableLEDBuffer buffer, int length) {

    }

    public void run(AddressableLEDBuffer buffer, int length) {
    
        buffer.setRGB(0, 0, 0, 0);
    }

    public void end(AddressableLEDBuffer buffer, int length) {

    }
}
