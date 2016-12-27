package day5;
import org.jointheleague.graphical.robot.Robot;

/*** Teacher's note ***/
 /* Before beginning recipe: 
 * 1. ask students to find and explain the variable in this recipe. 
 * 2. ask students what robot commands they think they will use to make picture in the laminated hand-outs. */

public class FlamingNinjaStar {
	public static void main(String[] args) {

		int baseSize = 300;		//the size of the black part of the star
		int flameSize = 200;		//the length of the flaming arms

		// *14. Use the methods setX and setY to move the ninja star into the center of the screen
		
		// *15. Make some adjustments to see what other kinds of shapes you can make.

		
Robot turtle=new Robot();
for(int i=0; i<25; i++){ turtle.penDown();
turtle.setSpeed(10);
		// 12. Set the robot speed to 10

		// 13. Make all the code below repeat 25 times

			

turtle.turn(360/8);
turtle.move(64);
turtle.setPenColor(255, 255, 0);

			
turtle.turn(-40);			
			
turtle.move(200);
			
turtle.turn(170);


turtle.move(200);
			
turtle.turn(64);

turtle.move(300); 
			// 10. Check that your shape is the same as Figure 1. This is one arm of the ninja star.
			// 11. Color your ninja star like Figure 2.
		
}

	}

}
