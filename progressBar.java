package vendingMachine;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JProgressBar;
import javax.swing.UIManager;
import javax.swing.border.Border;

public class progressBar extends JDialog {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	
	
	
	private JButton cancelbutton = new JButton("Cancel Order");
	private JProgressBar progressbar;
	
	
	
	public progressBar () {
		Color green = new Color(39, 79, 44);
		UIManager.put("ProgressBar.selectionForeground", Color.blue);
		UIManager.put("ProgressBar.selectionBackground", Color.yellow);
		UIManager.put("ProgressBar.background", Color.black);
		UIManager.put("ProgressBar.foreground", green);
		
		progressbar = new JProgressBar();

		
		Border border = BorderFactory.createTitledBorder("Dispencing. . .");
		progressbar.setBorder(border);
		progressbar.setBorderPainted(true);
		
		Dimension size = cancelbutton.getPreferredSize();
		setLayout(new FlowLayout());
		setSize(400, 200);
		size.width = 400;
		size.height = 45;
		
		progressbar.setPreferredSize(size);
		setLocationRelativeTo(null);
		add(progressbar);
		add(cancelbutton);
		pack();
	}
	
	
	public void setmax (int value) {
		
		progressbar.setMaximum(value);
	}
	
	
	public void setvalue (int value) {
		progressbar.setValue(value);
	}
	
	
	public int getvalue () {
		return progressbar.getValue();
	}
	
	
	public JProgressBar getProgressBar () {
		return this.progressbar;
	}

}
