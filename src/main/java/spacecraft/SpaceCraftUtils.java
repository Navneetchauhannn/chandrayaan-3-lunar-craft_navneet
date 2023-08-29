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
	private Direction direction;
	
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

	
}
