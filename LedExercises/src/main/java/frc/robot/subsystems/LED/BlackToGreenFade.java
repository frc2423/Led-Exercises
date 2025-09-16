package frc.robot.subsystems.LED;

import edu.wpi.first.wpilibj.AddressableLEDBuffer;

/**
 * Make the first LED fade from black to green over time.
 * 
 * Things you need to learn:
 * - variables (you'll probably want to use a class member variable to complete this challenge)
 */
public class BlackToGreenFade implements Led {
    
    int greeness=0;
    
    public void start(AddressableLEDBuffer buffer, int length) {
        // greeness = 0;
        buffer.setRGB(0,0, 0, 0);

    }
    
    public void run(AddressableLEDBuffer buffer, int length) {
    //    float i = 0;
        System.out.println(greeness);
        greeness = buffer.getGreen(0) + 1;
        
        buffer.setRGB(0,0, greeness, 0);
        // if (i%100==0){
            // greeness++;
        // }
        // if ((int)greeness >= 255){
            // greeness = 0;
        // }
        // i++;
        System.out.println(buffer.getGreen(0));
            
        // }
    }

    public void end(AddressableLEDBuffer buffer, int length) {

    }
}
