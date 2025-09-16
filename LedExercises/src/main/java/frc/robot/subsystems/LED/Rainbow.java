package frc.robot.subsystems.LED;

import edu.wpi.first.wpilibj.AddressableLEDBuffer;

/**
 * Make all LEDs transition through the rainbow
 * 
 * Things you need to learn:
 * - HSV
 */
public class Rainbow implements Led {

    int i = 0;
    int h = 0;

    public void start(AddressableLEDBuffer buffer, int length) {

    }
    
    public void run(AddressableLEDBuffer buffer, int length) {

        for (int i = 0; i < length; i++) {
            h++;
    
            // if (i == length) {
            // //     i = 0;
            // //     h = 0;
            // // }
            
            if (h >= 180) {
                i = 0;
                h = 0;
            }
    
            buffer.setHSV(i, h, 255, 255);
        }

    }
    

    public void end(AddressableLEDBuffer buffer, int length) {

    }
}
