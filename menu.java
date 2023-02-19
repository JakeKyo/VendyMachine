package vendingMachine;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class menu {

	private JMenuBar menu = new JMenuBar();
    private JMenu x = new JMenu("preferences");
    static JMenuItem m1 = new JMenuItem("Accessability");
    
    
    public menu () {
    	
    	x.add(m1);
    	menu.add(x);
    }
    
    
    public JMenuBar getMenuBar () {
    	return this.menu;
    }
}
