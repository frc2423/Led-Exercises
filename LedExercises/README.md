
# FRC LED Programming Exercises

Welcome to the FRC LED Programming Exercises! This project is designed to help new students learn Java programming concepts through fun, visual LED challenges that can be tested in simulation.

## Getting Started

### Running the Simulation

1. Open this project in VS Code with the WPILib extension installed
2. Press `Ctrl+Shift+P` (or `Cmd+Shift+P` on Mac) to open the command palette
3. Type "WPILib: Simulate Robot Code" and select it
4. Choose "Sim GUI" when prompted and press OK
5. The simulation GUI will open, showing your robot's LED strip

### Testing Your LED Challenges

1. You'll see buttons for each LED challenge (e.g., "All Green", "First 3 Green", etc.)
2. Click any button to test your LED pattern
3. The "Addressable LEDs" section (under Hardware menu) will show your LED strip visually
4. Use the "Disable" button to turn off all LEDs

## Java Programming Resources

Before starting the challenges, familiarize yourself with these Java programming concepts:

### Essential Java Concepts
- **Variables**: [Java Variables - W3Schools](https://www.w3schools.com/java/java_variables.asp)
- **Functions/Methods**: [Java Tutorial - Oracle](https://docs.oracle.com/javase/tutorial/java/index.html)
- **For Loops**: [Java For Loop - W3Schools](https://www.w3schools.com/java/java_for_loop.asp)
- **If/Else Statements**: [Java Conditions - W3Schools](https://www.w3schools.com/java/java_conditions.asp)

### Additional Resources
- [Oracle Java Tutorials](https://docs.oracle.com/javase/tutorial/java/index.html) - Comprehensive Java learning
- [WPILib Documentation](https://docs.wpilib.org/en/stable/index.html) - FRC robot programming guide
- [WPILib Simulation GUI Guide](https://docs.wpilib.org/en/stable/docs/software/wpilib-tools/robot-simulation/simulation-gui.html)
- [Addressable LEDs Documentation](https://docs.wpilib.org/en/stable/docs/software/hardware-apis/misc/addressable-leds.html)

## LED Programming Challenges

Complete these challenges in order. Each challenge builds on concepts from previous ones.

### Challenge 1: All Green
**File**: `src/main/java/frc/robot/subsystems/LED/AllGreen.java`
**Goal**: Make all LEDs green
**Concepts**: For loops, RGB color values
**Hint**: Use `buffer.setRGB(i, red, green, blue)` where green=255, red=0, blue=0

### Challenge 2: First 3 Green
**File**: `src/main/java/frc/robot/subsystems/LED/First3Green.java`
**Goal**: Make only the first 3 LEDs green
**Concepts**: Functions, RGB colors, loop conditions
**Hint**: Limit your loop to only run 3 times

### Challenge 3: Even/Odd
**File**: `src/main/java/frc/robot/subsystems/LED/EvenOdd.java`
**Goal**: Make odd-numbered LEDs green and even-numbered LEDs blue
**Concepts**: If/else statements, modulo operator (%)
**Hint**: Use `i % 2 == 0` to check if a number is even

### Challenge 4: Black to Green Fade
**File**: `src/main/java/frc/robot/subsystems/LED/BlackToGreenFade.java`
**Goal**: Make the first LED fade from black to green over time
**Concepts**: Variables, time-based changes
**Hint**: You'll need a class member variable to track the fade progress

### Challenge 5: Rainbow
**File**: `src/main/java/frc/robot/subsystems/LED/Rainbow.java`
**Goal**: Make all LEDs transition through rainbow colors
**Concepts**: HSV color space, time-based animation
**Hint**: Use `buffer.setHSV(i, hue, saturation, value)` and change hue over time

### Challenge 6: Bouncy
**File**: `src/main/java/frc/robot/subsystems/LED/Bouncy.java`
**Goal**: Make 10 LEDs bounce back and forth from start to end
**Concepts**: Advanced variables, direction tracking, boundaries
**Hint**: Track position and direction, reverse direction at boundaries

## Understanding the Code Structure

Each LED challenge implements the `Led` interface with three methods:
- `start()`: Called once when the LED pattern begins
- `run()`: Called repeatedly (about 50 times per second) while the pattern is active
- `end()`: Called once when the LED pattern stops

The `AddressableLEDBuffer` represents your LED strip, and you can:
- Set individual LED colors with `buffer.setRGB(index, red, green, blue)`
- Set colors using HSV with `buffer.setHSV(index, hue, saturation, value)`
- Get the total number of LEDs with `buffer.getLength()`

## Tips for Success

1. **Start Simple**: Begin with Challenge 1 and work your way up
2. **Test Frequently**: Run the simulation after each small change
3. **Use Print Statements**: Add `System.out.println()` to debug your code
4. **Ask for Help**: Don't hesitate to ask mentors when you're stuck
5. **Experiment**: Try different colors and patterns once you complete a challenge
