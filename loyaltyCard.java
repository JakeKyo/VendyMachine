package vendingMachine;


import java.awt.Color;
import javax.swing.JButton;



public class loyaltyCard {
	
	private JButton scanner = new JButton("Scan card");
	
	
	public loyaltyCard () {
		scanner.setForeground(Color.YELLOW);
	}
	
	
	public JButton getScanner () {
		return this.scanner;
	}
}
