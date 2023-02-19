package vendingMachine;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingWorker;
import javax.swing.UIManager;

import net.miginfocom.swing.MigLayout;

public class drinks {
	

	private JTextField selectionnumber = new JTextField("");;
	private JButton buttonone = new JButton("1");
	private JButton buttontwo = new JButton("2");
	private JButton buttonthree = new JButton("3");
	private JButton buttonfour = new JButton("4");
	private JButton buttonfive = new JButton("5");
	private JButton buttonsix = new JButton("6");
	private JButton buttonseven = new JButton("7");
	private JButton buttoneight = new JButton("8");
	private JButton buttonnine = new JButton("9");
	private JButton deletebutton = new JButton("Delete");
	private JButton buttonzero = new JButton("0");
	private JButton enterbutton = new JButton("Enter");
	
	
	JFrame orderframe = new JFrame();
	
	
	
	private JPanel drinkselectionpanel = new JPanel();
	
	
	private ImageIcon pepsiimg = new ImageIcon("E:\\yr2\\oop\\cw1\\code\\vendingMachine\\Assets\\pepsi.jpg");
	private ImageIcon cokeimg = new ImageIcon("E:\\yr2\\oop\\cw1\\code\\vendingMachine\\Assets\\coke.jpg");
	private ImageIcon fantaimg = new ImageIcon("E:\\yr2\\oop\\cw1\\code\\vendingMachine\\Assets\\fanta.jpg");
	
	
	private static Map<String, ArrayList<String>> multiValueMap = new HashMap<String, ArrayList<String>>();

	progressBar progressBar = new progressBar();

	public drinks () throws IOException {
		cash cash = new cash();
		loyaltyCard loyaltyCard = new loyaltyCard();
		cancel cancel = new cancel();
		
		

		buttonone.setPreferredSize(new Dimension(60, 60));
		buttonone.setForeground(Color.BLUE);
		buttontwo.setPreferredSize(new Dimension(60, 60));
		buttontwo.setForeground(Color.BLUE);
		buttonthree.setPreferredSize(new Dimension(60, 60));
		buttonthree.setForeground(Color.BLUE);
		buttonfour.setPreferredSize(new Dimension(60, 60));
		buttonfour.setForeground(Color.BLUE);
		buttonfive.setPreferredSize(new Dimension(60, 60));
		buttonfive.setForeground(Color.BLUE);
		buttonsix.setPreferredSize(new Dimension(60, 60));
		buttonsix.setForeground(Color.BLUE);
		buttonseven.setPreferredSize(new Dimension(60, 60));
		buttonseven.setForeground(Color.BLUE);
		buttoneight.setPreferredSize(new Dimension(60, 60));
		buttoneight.setForeground(Color.BLUE);
		buttonnine.setPreferredSize(new Dimension(60, 60));
		buttonnine.setForeground(Color.BLUE);
		enterbutton.setPreferredSize(new Dimension(124, 60));
		deletebutton.setPreferredSize(new Dimension(124, 60));
		enterbutton.setForeground(Color.YELLOW);
		buttonzero.setPreferredSize(new Dimension(60, 60));
		buttonzero.setForeground(Color.BLUE);
		deletebutton.setForeground(Color.YELLOW);
		Color color = new Color(39, 79, 44);
		selectionnumber.setBackground(color);
		selectionnumber.setEditable(false);
		

		drinkselectionpanel.setLayout(new MigLayout("debug"));
		drinkselectionpanel.add(selectionnumber, "center, width 200, height 50");
		drinkselectionpanel.add(cash.getBalanceDisplay(), "wrap, width 124, height 60");
		drinkselectionpanel.add(buttonone, "split3, center");
		drinkselectionpanel.add(buttontwo);
		drinkselectionpanel.add(buttonthree);
		drinkselectionpanel.add(cash.getCoinSlot(), "wrap, width 124, height 100");
		drinkselectionpanel.add(buttonfour, "split3, center");
		drinkselectionpanel.add(buttonfive, "id nogap");
		drinkselectionpanel.add(buttonsix);
		drinkselectionpanel.add(loyaltyCard.getScanner(), "wrap, width 124, height 150");
		drinkselectionpanel.add(buttonseven, "split3, center");
		drinkselectionpanel.add(buttoneight);
		drinkselectionpanel.add(buttonnine);
		drinkselectionpanel.add(cancel.getCancelTransaction(), "wrap, width 124, height 60");
		drinkselectionpanel.add(deletebutton, "split2, center");
		drinkselectionpanel.add(buttonzero);
		drinkselectionpanel.add(enterbutton, "wrap");
		drinkselectionpanel.add(cash.getOnePoundButton(), "split3");
		drinkselectionpanel.add(cash.getTwentyPenceButton());
		drinkselectionpanel.add(cash.getFiftyPenceButton());
		drinkselectionpanel.setVisible(true);
		
		
		buttonone.addActionListener(new ActionListener() {
				@Override
			    public void actionPerformed(ActionEvent evt) {
					setSelectionNumber(getSelectionNumber() + "1");
			    }}
		);
		
		
		buttontwo.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent evt) {
				setSelectionNumber(getSelectionNumber() + "2");
		    }}
	);
		
		
		buttonthree.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent evt) {
				setSelectionNumber(getSelectionNumber() + "3");
		    }}
	);
		
		
		buttonfour.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent evt) {
				setSelectionNumber(getSelectionNumber() + "4");
		    }}
	);
		
		
		buttonfive.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent evt) {
				setSelectionNumber(getSelectionNumber() + "5");
		    }}
	);
		
		
		buttonsix.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent evt) {
				setSelectionNumber(getSelectionNumber() + "6");
		    }}
	);
		
		
		buttonseven.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent evt) {
				setSelectionNumber(getSelectionNumber() + "7");
		    }}
	);
		
		
		buttoneight.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent evt) {
				setSelectionNumber(getSelectionNumber() + "8");
		    }}
	);
		
		
		buttonnine.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent evt) {
				setSelectionNumber(getSelectionNumber() + "9");
		    }}
	);
		
		
		buttonzero.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent evt) {
				setSelectionNumber(getSelectionNumber() + "0");
		    }}
	);
		
		
		deletebutton.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent evt) {
				selectionnumber.setText("" + selectionnumber.getText().substring(0, selectionnumber.getText ().length() - 1));
		    }}
	);
		
		
		enterbutton.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent evt) {
		        buttonpressenter();
		    }}
	);
		}
	
	
	
	public JPanel getDrinksPanel() {
		return this.drinkselectionpanel;
	}
	
	
	public String getSelectionNumber() {
		return this.selectionnumber.getText();
	}
	
	
	public void setSelectionNumber(String value) {
		this.selectionnumber.setText(value);
	}
	

	public void buttonpressenter() {
		

		System.out.println(multiValueMap.get(getSelectionNumber()));

		Iterator<String> iterator = multiValueMap.get(getSelectionNumber()).iterator();
		
		
		String quantity = "";
		while (iterator.hasNext() == true) {
			quantity = iterator.next();
		}
		

		quantity = Integer.toString((Integer.valueOf(quantity) -1));
		ArrayList<String> val = multiValueMap.get(getSelectionNumber());
		val.remove(2);
		val.add(quantity);
		multiValueMap.put(getSelectionNumber(), val);

	
		int row = 0;
		for (int i = 0; i < Inventory.getRowCount(); i++ ) {
			
			if (Inventory.getInventoryTableModel().getValueAt(i, 3).equals(getSelectionNumber())) {
				row = i;
				Inventory.getInventoryTableModel().setValueAt(quantity, row, 2);
			}

		}

	
		if (Integer.valueOf((String) Inventory.getInventoryTableModel().getValueAt(row, 2)) < 1) {
			Inventory.getInventoryTableModel().removeRow(row);
		}
		
	//	dispenseproduct();
		dispensethread ();
		
	//	JLabel yo = new JLabel();
	//	yo = dispensethread();
	//	System.out.println(yo.getText());
		
	//	dispensethread();
	
	//	setSelectionNumber("");
	
	}
	
	
	public static Map<String, ArrayList<String>> getMultiValueMap () {
		return multiValueMap;
	}
	
	
//	public void dispenseproduct() {
//		JFrame order = new JFrame();
//		JLabel imglabel = new JLabel();
//		

//		Iterator<String> imageiterator = multiValueMap.get(getSelectionNumber()).iterator();
//		String drink = imageiterator.next();
//		
//		
//		if (drink.equals("pepsi") || drink.equals("Pepsi") || drink.equals("PEPSI")) {
//			imglabel.setIcon(pepsiimg);
//			order.add(imglabel);
//			order.getContentPane().setSize(800,800);
//			order.setSize(800,800);
//			order.setVisible(true);
//		//	return order;
//		}
//		
//		else if (drink.equals("coke") || drink.equals("Coke") || drink.equals("COKE")) {
//			Image tempcokeimg = cokeimg.getImage().getScaledInstance(800, 700,  java.awt.Image.SCALE_SMOOTH);
//			ImageIcon cokeimgtouse = new ImageIcon(tempcokeimg);
//			imglabel.setIcon(cokeimgtouse);
//			order.add(imglabel);
//			order.getContentPane().setSize(800,800);
//			order.setSize(800,800);
//			order.setVisible(true);
//		//	return order;
//		}
//		
//		else if (drink.equals("fanta") || drink.equals("Fanta") || drink.equals("FANTA")) {
//			Image tempfantaimg = fantaimg.getImage().getScaledInstance(800, 700,  java.awt.Image.SCALE_SMOOTH);
//			ImageIcon fantaimgtouse = new ImageIcon(tempfantaimg);
//			imglabel.setIcon(fantaimgtouse);
//			order.add(imglabel);
//			order.getContentPane().setSize(800,800);
//			order.setSize(800,800);
//			order.setVisible(true);
//		//	return order;
//		}
//		
//		else {
//			
//		//	return order;
//		}
//	}
	
	
	public void dispensethreadresult (JLabel label) {
		JFrame order = new JFrame();
		
	//	String imagelabel = label.getText();
	//	System.out.println(imagelabel);
		
		order.add(label);
			order.getContentPane().setSize(800,800);
			order.setSize(800,800);
			order.setVisible(true);
		
	}
	

	public void dispensethread () {
//		JFrame window = new JFrame();
	//	JLabel label1 = new JLabel();
		
//		
//		
		@SuppressWarnings("rawtypes")
		SwingWorker <JLabel, JLabel> dispenseworker = new SwingWorker <JLabel, JLabel> () {

		//	JLabel label2 = new JLabel();
			
			@Override
			protected JLabel doInBackground() throws Exception {
			
				JLabel label3 = new JLabel();
				
				
				Iterator<String> imageiterator = multiValueMap.get(getSelectionNumber()).iterator();
				String drink = imageiterator.next();
				
				
				if (drink.equals("pepsi") || drink.equals("Pepsi") || drink.equals("PEPSI")) {
					label3.setIcon(pepsiimg);
		
					progressBar.setVisible(true);
					progressBar.getProgressBar().setStringPainted(true);
					progressBar.getProgressBar().setString("Dispencing Product . . .  " + progressBar.getvalue() + " % Complete");
					Thread.sleep(1000);
					progressBar.setvalue(20);
					progressBar.getProgressBar().setString("Dispencing Product . . .  " + progressBar.getvalue() + " % Complete");
					Thread.sleep(1000);
					progressBar.setvalue(40);
					progressBar.getProgressBar().setString("Dispencing Product . . .  " + progressBar.getvalue() + " % Complete");
					Thread.sleep(1000);
					progressBar.setvalue(60);
					progressBar.getProgressBar().setString("Dispencing Product . . .  " + progressBar.getvalue() + " % Complete");
					Thread.sleep(1000);
					progressBar.setvalue(80);
					progressBar.getProgressBar().setString("Dispencing Product . . .  " + progressBar.getvalue() + " % Complete");
					Thread.sleep(1000);
					progressBar.setmax(100);
					progressBar.setvalue(100);
					progressBar.getProgressBar().setString("Dispencing Product . . .  " + progressBar.getvalue() + " % Complete");
					
					if (progressBar.getvalue() == 100) {
						Thread.sleep(800);
					}
					
					progressBar.setvalue(0);
					progressBar.setVisible(false);
					return label3;
				}
				
				else if (drink.equals("coke") || drink.equals("Coke") || drink.equals("COKE")) {
					Image tempcokeimg = cokeimg.getImage().getScaledInstance(800, 700,  java.awt.Image.SCALE_SMOOTH);
					ImageIcon cokeimgtouse = new ImageIcon(tempcokeimg);
					label3.setIcon(cokeimgtouse);
					
					progressBar.setVisible(true);
					progressBar.getProgressBar().setStringPainted(true);
					progressBar.getProgressBar().setString("Dispencing Product . . .  " + progressBar.getvalue() + " % Complete");
					Thread.sleep(1000);
					progressBar.setvalue(20);
					progressBar.getProgressBar().setString("Dispencing Product . . .  " + progressBar.getvalue() + " % Complete");
					Thread.sleep(1000);
					progressBar.setvalue(40);
					progressBar.getProgressBar().setString("Dispencing Product . . .  " + progressBar.getvalue() + " % Complete");
					Thread.sleep(1000);
					progressBar.setvalue(60);
					progressBar.getProgressBar().setString("Dispencing Product . . .  " + progressBar.getvalue() + " % Complete");
					Thread.sleep(1000);
					progressBar.setvalue(80);
					progressBar.getProgressBar().setString("Dispencing Product . . .  " + progressBar.getvalue() + " % Complete");
					Thread.sleep(1000);
					progressBar.setmax(100);
					progressBar.setvalue(100);
					progressBar.getProgressBar().setString("Dispencing Product . . .  " + progressBar.getvalue() + " % Complete");
					
					if (progressBar.getvalue() == 100) {
						Thread.sleep(800);
					}
					
					progressBar.setvalue(0);
					progressBar.setVisible(false);
					return label3;
				}
				
				else if (drink.equals("fanta") || drink.equals("Fanta") || drink.equals("FANTA")) {
					Image tempfantaimg = fantaimg.getImage().getScaledInstance(800, 700,  java.awt.Image.SCALE_SMOOTH);
					ImageIcon fantaimgtouse = new ImageIcon(tempfantaimg);
					label3.setIcon(fantaimgtouse);
					
					progressBar.setVisible(true);
					progressBar.getProgressBar().setStringPainted(true);
					progressBar.getProgressBar().setString("Dispencing Product . . .  " + progressBar.getvalue() + " % Complete");
					Thread.sleep(1000);
					progressBar.setvalue(20);
					progressBar.getProgressBar().setString("Dispencing Product . . .  " + progressBar.getvalue() + " % Complete");
					Thread.sleep(1000);
					progressBar.setvalue(40);
					progressBar.getProgressBar().setString("Dispencing Product . . .  " + progressBar.getvalue() + " % Complete");
					Thread.sleep(1000);
					progressBar.setvalue(60);
					progressBar.getProgressBar().setString("Dispencing Product . . .  " + progressBar.getvalue() + " % Complete");
					Thread.sleep(1000);
					progressBar.setvalue(80);
					progressBar.getProgressBar().setString("Dispencing Product . . .  " + progressBar.getvalue() + " % Complete");
					Thread.sleep(1000);
					progressBar.setmax(100);
					progressBar.setvalue(100);
					progressBar.getProgressBar().setString("Dispencing Product . . .  " + progressBar.getvalue() + " % Complete");
					
					if (progressBar.getvalue() == 100) {
						Thread.sleep(800);
					}
					
					progressBar.setvalue(0);
					progressBar.setVisible(false);
					return label3;
				}
				
				else {
					return label3;
				}
			
			}

			
			@Override
			protected void done() {
				
				try {
					// this.label2 = get();
					JLabel result = get();
					dispensethreadresult(result);
				} catch (HeadlessException e) {
					
					e.printStackTrace();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				} catch (ExecutionException e) {
					
					e.printStackTrace();
				}
			}
		};


		dispenseworker.execute();

		// https://stackoverflow.com/questions/782265/how-do-i-use-swingworker-in-java
	}
	
	
}
		