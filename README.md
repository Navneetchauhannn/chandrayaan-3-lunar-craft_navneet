# Chandrayaan 3 Lunar Craft: Galactic Space Craft Control

## Description
As a scientist at ISRO controlling the latest lunar spacecraft Chandrayaan 3, this project involves developing a program that translates commands sent from Earth into instructions understood by the spacecraft. The spacecraft navigates through the galaxy using galactic coordinates (x, y, z), representing east-west, north-south, and distance above/below the galactic plane, respectively. The spacecraft's movement is guided by its initial direction (N, S, E, W, Up, Down).

## Features
The program includes the following functionalities:

- Move the spacecraft forward/backward (f, b): The spacecraft moves one step forward or backward based on its current direction.
- Turn the spacecraft left/right (l, r): The spacecraft rotates 90 degrees to the left or right, changing its facing direction.
- Turn the spacecraft up/down (u, d): The spacecraft changes its angle, rotating upwards or downwards.

## Constraints
- The spacecraft can't move or rotate diagonally; it adheres to cardinal directions.
- The spacecraft's movement and rotations are rigid, and it's confined within galactic boundaries.

## Usage
Instantiate the `Spacecraft` class with starting coordinates (x, y, z) and initial direction. Then execute commands to control the spacecraft's movement and direction. Example:

```java
Spacecraft craft = new Spacecraft(0, 0, 0, Direction.N);
String[] commands = {"f", "r", "u", "b", "l"};
craft.executeCommands(commands);

assertEquals(0, craft.getX(), "x fails");
assertEquals(1, craft.getY(), "y fails");
assertEquals(-1, craft.getZ(), "z fails");
assertEquals(Direction.N, craft.getDirection(), "not turned");
```
## Testing
Testing is an essential part of this project. The project follows a Test-Driven Development (TDD) approach to ensure that functionalities work as expected. Check out the testing section in the codebase for detailed examples of testing different scenarios.