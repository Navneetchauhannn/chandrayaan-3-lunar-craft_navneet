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
	protected Direction prevDirection;
	
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
    
    public void turnLeft() {
        switch (direction) {
            case N:
                direction = Direction.W;
                break;
            case S:
                direction = Direction.E;
                break;
            case E:
                direction = Direction.N;
                break;
            case W:
                direction = Direction.S;
                break;
            case Up:
            case Down:
            	if(prevDirection!=null) {
            		if(prevDirection==Direction.N) {
                		direction = Direction.W;
                	} else if(prevDirection==Direction.E) {
                		direction = Direction.N;
                	} else if(prevDirection==Direction.W) {
                		direction = Direction.S;
                	} else if(prevDirection==Direction.S) {
                		direction = Direction.E;
                	}
            	}
            	break;
			default:
				break;
	        }
    }

    public void turnRight() {
        switch (direction) {
            case N:
                direction = Direction.E;
                break;
            case S:
                direction = Direction.W;
                break;
            case E:
                direction = Direction.S;
                break;
            case W:
                direction = Direction.N;
                break;
            case Up:
            case Down:
            	if(prevDirection!=null) {
            		if(prevDirection==Direction.N) {
                		direction = Direction.E;
                	} else if(prevDirection==Direction.E) {
                		direction = Direction.S;
                	} else if(prevDirection==Direction.S) {
                		direction = Direction.W;
                	} else if(prevDirection==Direction.W) {
                		direction = Direction.N;
                	}
            	}
            	break;
            default:
				break;
        }
    }
    
    public void turnUp() {
        prevDirection=direction;
        direction = Direction.Up;
    }

    public void turnDown() {
        prevDirection=direction;
        direction = Direction.Down;
    }

    
    public void executeCommands(String[] commands) {
        for (String command : commands) {
        	if(command=="f") {
        		moveForward();
        	} else if(command=="b") {
        		moveBackward();
        	} else if(command=="l") {
        		turnLeft();
        	} else if(command=="r") {
        		turnRight();
        	} else if(command=="u") {
        		turnUp();
        	} else if(command=="d") {
        		turnDown();
        	} 
        }
    }

	
}
