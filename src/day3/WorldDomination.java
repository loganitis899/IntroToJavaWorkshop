package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.

		String ans = JOptionPane.showInputDialog("do you know how to code?");
		// 2. If they say "yes", tell them they will rule the world.
if(ans.equals("yes")){
	JOptionPane.showMessageDialog(null, "you will rule teh world");}
else{
	JOptionPane.showMessageDialog(null, "good luck with the dishes");}
}
		// 3. Otherwise, wish them good luck washing dishes.

	}


