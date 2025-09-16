package frc.robot.subsystems.LED;

import edu.wpi.first.wpilibj.AddressableLEDBuffer;

/**
 * Make 10 LEDs bounce back and forth from start to end
 */
public class Bouncy implements Led {
    
    public void start(AddressableLEDBuffer buffer, int length) {

    }

    public void run(AddressableLEDBuffer buffer, int length) {
        int z = 0;
        for (int i = 0; i < length; i++) {
            z++;

            buffer.setRGB(i, 0, 255, 0);
            buffer.setRGB(i, 0, 0, 0);
        }
    }

    public void end(AddressableLEDBuffer buffer, int length) {

    }
}
