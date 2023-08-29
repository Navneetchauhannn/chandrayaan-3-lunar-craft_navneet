package spacecraft;

enum Direction {
    N, S, E, W, Up, Down
}

public class SpaceCraftUtils {

    private static final int GALACTIC_UPPER_BOUND = 100;
    private static final int GALACTIC_LOWER_BOUND = -100;
    private static final int GALACTIC_RIGHT_BOUND = 100;
    private static final int GALACTIC_LEFT_BOUND = -100;

    private int x, y, z;
    protected Direction direction;

    public SpaceCraftUtils(int x, int y, int z, Direction direction) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public Direction getDirection() {
        return direction;
    }

    public void moveForward() {
        switch (direction) {
            case N:
                if (y + 1 <= GALACTIC_UPPER_BOUND) {
                    y += 1;
                }
                break;
            case S:
                if (y - 1 >= GALACTIC_LOWER_BOUND) {
                    y -= 1;
                }
                break;
            case E:
                if (x + 1 <= GALACTIC_RIGHT_BOUND) {
                    x += 1;
                }
                break;
            case W:
                if (x - 1 >= GALACTIC_LEFT_BOUND) {
                    x -= 1;
                }
                break;
            case Up:
                if (z + 1 <= GALACTIC_UPPER_BOUND) {
                    z += 1;
                }
                break;
            case Down:
                if (z - 1 >= GALACTIC_LOWER_BOUND) {
                    z -= 1;
                }
                break;
        }
    }

    public void moveBackward() {
        switch (direction) {
            case N:
                if (y - 1 >= GALACTIC_LOWER_BOUND) {
                    y -= 1;
                }
                break;
            case S:
                if (y + 1 <= GALACTIC_UPPER_BOUND) {
                    y += 1;
                }
                break;
            case E:
                if (x - 1 >= GALACTIC_LEFT_BOUND) {
                    x -= 1;
                }
                break;
            case W:
                if (x + 1 <= GALACTIC_RIGHT_BOUND) {
                    x += 1;
                }
                break;
            case Up:
                if (z - 1 >= GALACTIC_LOWER_BOUND) {
                    z -= 1;
                }
                break;
            case Down:
                if (z + 1 <= GALACTIC_UPPER_BOUND) {
                    z += 1;
                }
                break;
        }
    }

    public void executeCommands(String[] commands) {
        for (String command : commands) {
            if (command == "f") {
                moveForward();
            } else {
                moveBackward();
            }
        }
    }

}
