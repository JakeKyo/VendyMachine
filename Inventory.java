package vendingMachine;


import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.miginfocom.swing.MigLayout;


public class Inventory {

	private JPanel inventorypanel = new JPanel(new MigLayout("debug"));
	private JLabel adddrinkname = new JLabel("Enter the product name:     ");
	private JLabel adddrinkprice = new JLabel("Enter the product price:     ");
	private JTextField drinknametextfield = new JTextField();
	private JTextField drinkpricetextfield = new JTextField();
	private JSlider quantityslider = new JSlider( 1,  15, 1);
	private JButton addtoinventory = new JButton("Add product to inventory");
	private JLabel selectionnumberlabel = new JLabel("Enter the product number: ");
	private JTextField selectionnumbertextfield = new JTextField();
	
	private static DefaultTableModel inventorytablemodel = new DefaultTableModel();
	private JTable inventorytable = new JTable(inventorytablemodel);
	private JScrollPane paneforinventory = new JScrollPane(inventorytable);
	private String [] columnheadings = {"Product", "Price", "Quantity", "Selection number"};
	
	private JButton plusquantitybutton = new JButton();
	private Image plussignimage = null;
	
	private JButton minusquantitybutton = new JButton();
	private Image minussignimage = null;
	
	public Inventory () {
		
		try {
			plussignimage = ImageIO.read(new File("E:\\yr2\\oop\\cw1\\code\\vendingMachine\\Assets\\PlusSign.png"));
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		
		plusquantitybutton.setIcon(new ImageIcon(plussignimage));
		plusquantitybutton.setMargin(new Insets(0, 0, 0, 0));
		plusquantitybutton.setBackground(null);
		plusquantitybutton.setBorder(null);
		
		
		try {
			minussignimage = ImageIO.read(new File("E:\\yr2\\oop\\cw1\\code\\vendingMachine\\Assets\\MinusSign.png"));
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		
		minusquantitybutton.setIcon(new ImageIcon(minussignimage));
		minusquantitybutton.setMargin(new Insets(0, 0, 0, 0));
		minusquantitybutton.setBackground(null);
		minusquantitybutton.setBorder(null);
		

		for (int i = 0; i < columnheadings.length; i++) {
			inventorytablemodel.addColumn(columnheadings[i]);
		}
		
		
		adddrinkname.setFont(new Font("Serif", Font.PLAIN, 19));
		adddrinkprice.setFont(new Font("Serif", Font.PLAIN, 19));
		selectionnumberlabel.setFont(new Font("Serif", Font.PLAIN, 19));
		

		inventorypanel.add(selectionnumberlabel, "split2, gaptop 13, center");
		inventorypanel.add(selectionnumbertextfield, "wrap, width 200, height 35, gapbottom 5");
		inventorypanel.add(adddrinkname, "split2, center");
		inventorypanel.add(drinknametextfield, "width 200, height 35, wrap, gapbottom 5");
		inventorypanel.add(adddrinkprice, "split2, center");
		inventorypanel.add(drinkpricetextfield, "width 200, height 35, wrap, gapbottom 20");
		inventorypanel.add(quantityslider, "wrap, grow, gapbottom 15");
		inventorypanel.add(addtoinventory, "grow, height 35, wrap");
		inventorypanel.add(paneforinventory, "gaptop 20, wrap, height 280");
		inventorypanel.add(plusquantitybutton, "split2, center");
		inventorypanel.add(minusquantitybutton, "wrap");
		
		
		quantityslider.setPaintTicks(true);
		quantityslider.setMajorTickSpacing(1);
		quantityslider.setSnapToTicks(true);
		quantityslider.setBorder(BorderFactory.createTitledBorder("Quantity To Add"));
		quantityslider.setPaintLabels(true);
		
		
		inventorypanel.setVisible(true);

		
		addtoinventory.addActionListener(new ActionListener(  ) {
		    public void actionPerformed(ActionEvent e) {
		        addtotable();
		        }
		});
		
		
		plusquantitybutton.addActionListener(new ActionListener() { 
		  public void actionPerformed(ActionEvent e) { 
			  plusquantity();
		  } 
		} );
		
		
		minusquantitybutton.addActionListener(new ActionListener(  ) {
		    public void actionPerformed(ActionEvent e) {
		    	minusquantity();
		        }
		});
	}
	

	public JPanel getInventoryPanel () {
		return this.inventorypanel;
	}
	
	
	public JTextField getDrinkNameTextField () {
		return this.drinknametextfield;
	}
	
	
	public JTextField getDrinkPriceTextField () {
		return this.drinkpricetextfield;
	}
	
	
	public JButton getAddToInventory () {
		return this.addtoinventory;
	}
	
	
	public static DefaultTableModel getInventoryTableModel () {
		return Inventory.inventorytablemodel;
	}
	
	
	public void setInventoryTableModel (String [] val) {
		Inventory.inventorytablemodel.addRow(val);
		Inventory.inventorytablemodel.fireTableDataChanged();
	}
	
	
	public static int getRowCount() {
		return inventorytablemodel.getRowCount();
	}
	
	
	public JTable getInventoryTable () {
		return this.inventorytable;
	}
	
	
	public void addtotable () {
		
		drinks.getMultiValueMap().put(selectionnumbertextfield.getText(), new ArrayList<String>());
		drinks.getMultiValueMap().get(selectionnumbertextfield.getText()).add(drinknametextfield.getText());
		drinks.getMultiValueMap().get(selectionnumbertextfield.getText()).add(drinkpricetextfield.getText());
		drinks.getMultiValueMap().get(selectionnumbertextfield.getText()).add(Integer.toString(quantityslider.getValue()));
		

		System.out.println(drinks.getMultiValueMap());
		

		String[] datatoadd = {drinknametextfield.getText(), drinkpricetextfield.getText(), Integer.toString(quantityslider.getValue()), selectionnumbertextfield.getText()};

		setInventoryTableModel(datatoadd);
		
		quantityslider.setValue(0);
	}
	
	
	public void plusquantity () {

		int result = Integer. parseInt((String) inventorytable.getModel().getValueAt(inventorytable.getSelectedRow(), 2));
		result = result +1;
		inventorytablemodel.setValueAt(Integer.toString(result), inventorytable.getSelectedRow(), 2);
	}

	
	public void minusquantity () {

		int result = Integer. parseInt((String) inventorytable.getModel().getValueAt(inventorytable.getSelectedRow(), 2));
		result = result -1;
		inventorytablemodel.setValueAt(Integer.toString(result), inventorytable.getSelectedRow(), 2);
		
		
		if (result == 0) {
			String data = (String) inventorytablemodel.getValueAt(inventorytable.getSelectedRow(), 3);
			((DefaultTableModel)inventorytable.getModel()).removeRow(inventorytable.getSelectedRow());
			drinks.getMultiValueMap().remove(data);
			System.out.println(data);
			     }
			        }
}
	

