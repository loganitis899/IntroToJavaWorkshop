package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
Robot mrPickles=new Robot();	

	void go() {
	
mrPickles.setSpeed(1000000000);

mrPickles.penDown();
mrPickles.setPenWidth(5);

int length=300;
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	{mrPickles.setSpeed(1000000000);
int length=100;
for (int i=0; i<4; i++){
	mrPickles.penDown();
		mrPickles.move(length);
		mrPickles.turn(90);
}
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
