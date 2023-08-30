package spacecraft;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SpaceCraftUtilsTest {

	@Test
	void move() {
		SpaceCraftUtils craft = new SpaceCraftUtils(0, 0, 0, Direction.N);
		
        String[] commands = {"f", "f", "b", "b", "b"};
        craft.executeCommands(commands);

        assertEquals(-1, craft.getY(), "y coordinate is not ture");
        
        // checking for directions
        craft = new SpaceCraftUtils(0, 0, 0, Direction.S);
        craft.executeCommands(commands);
        
        assertEquals(1, craft.getY(), "y coordinate is not ture");
        

        craft = new SpaceCraftUtils(0, 0, 0, Direction.E);
        craft.executeCommands(commands);
        
        assertEquals(-1, craft.getX(), "x coordinate is not ture");
        
        craft = new SpaceCraftUtils(0, 0, 0, Direction.W);
        craft.executeCommands(commands);
        
        assertEquals(1, craft.getX(), "x coordinate is not ture");
        
        craft = new SpaceCraftUtils(0, 0, 0, Direction.Up);
        craft.executeCommands(commands);
        
        assertEquals(-1, craft.getZ(), "z coordinate is not ture");
        
        craft = new SpaceCraftUtils(0, 0, 0, Direction.Down);
        craft.executeCommands(commands);
        
        assertEquals(1, craft.getZ(), "z coordinate is not ture");
        
        // checking for positions
        craft = new SpaceCraftUtils(100, 100, 100, Direction.N);
        craft.executeCommands(commands);

        assertEquals(97, craft.getY(), "y coordinate is not ture");
	}
	
	@Test	
	void turnLeftRight() {
		SpaceCraftUtils craft = new SpaceCraftUtils(0, 0, 0, Direction.Down);
		
		 String[] commands = {"r", "l", "r"};
		 craft.executeCommands(commands);
		 
		 assertEquals(Direction.N, craft.getDirection(), "not turned");
		 
		 craft = new SpaceCraftUtils(0, 0, 0, Direction.E);

		 craft.executeCommands(commands);
		 
		 assertEquals(Direction.S, craft.getDirection(), "not turned");
	}
}
