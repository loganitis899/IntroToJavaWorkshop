package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		
		Robot giblits = new Robot();
		
		// 5. Set your robot's pen to the down position

		// 3. Set the robot to go at max speed (10)

		// 4. Do the following (steps 6-9) 75 times
for(int i=0; i<700005; i++){
	giblits.penDown();
	giblits.setPenWidth(i);
	giblits.setSpeed(10);
	giblits.setRandomPenColor();
	giblits.move(5*i);
	giblits.turn(360/3);
	
	
}
		
	
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
	
	

			// 8. Change the number of sides to 7 (don’t add a new line of code for this one!)
	
			// 9. Set the pen width to i

	}
}
