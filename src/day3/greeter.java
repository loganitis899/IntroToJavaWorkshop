package day3;

import javax.swing.JOptionPane;

public class greeter {
	public static void main(String[] args) {
		
		
		
String myName = JOptionPane.showInputDialog("what is your name?");
		JOptionPane.showMessageDialog(null, "why hullo there " + myName);
}
}