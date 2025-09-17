package frc.robot.subsystems.LED;

import edu.wpi.first.wpilibj.AddressableLEDBuffer;
import edu.wpi.first.wpilibj.Timer;

/**
 * Make the first LED fade from black to green over time.
 * 
 * Things you need to learn:
 * - variables (you'll probably want to use a class member variable to complete this challenge)
 */
public class BlackToGreenFade implements Led {
    Timer timer = new Timer();
    int i = 0;
    

    public void start(AddressableLEDBuffer buffer, int length) {
        
    }

    public void run(AddressableLEDBuffer buffer, int length) {
        timer.start();
        if (timer.get() > 0.05) {
            buffer.setRGB(1, 0, i, 0);
            i++;
            timer.reset();
        }
    }

    public void end(AddressableLEDBuffer buffer, int length) {

    }
}
