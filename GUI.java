package vendingMachine;


import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import com.formdev.flatlaf.FlatDarculaLaf;


public class GUI {
	
	private static JFrame mainwindow = new JFrame();; 
	private static JTabbedPane tabs = new JTabbedPane();
	
	
	public static void main(String [] args) throws IOException {
		
		FlatDarculaLaf.setup();
		
		drinks drinks = new drinks();
		Inventory Inventory = new Inventory();
		menu menu = new menu();
		JPanel mainpanel = new JPanel();


		mainpanel.add(drinks.getDrinksPanel(), "push, grow");

		
		getTabs().add("Main", mainpanel);
		getTabs().add("Inventory", Inventory.getInventoryPanel());
		mainwindow.setJMenuBar(menu.getMenuBar());
		mainwindow.add(getTabs());
		
		mainwindow.setVisible(true);
		
		
		mainwindow.setLocationRelativeTo(null);
		mainwindow.pack();
	}
	
	
	public static JTabbedPane getTabs () {
		return tabs;
	}
	
	
	public static JFrame getMainWindow () {
		
		return GUI.mainwindow;
	}
}
