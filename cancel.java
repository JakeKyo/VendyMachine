package vendingMachine;



import java.awt.Color;
import javax.swing.JButton;


public class cancel {
	
	private JButton canceltransaction = new JButton("Cancel");
	
	
	public cancel () {
		canceltransaction.setForeground(Color.YELLOW);
	}
	
	
	public JButton getCancelTransaction () {
		return this.canceltransaction;
	}
}
