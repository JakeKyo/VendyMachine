package vendingMachine;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.TransferHandler;

public class cash {

	private JTextField balancedisplay = new JTextField("Balance");
	private JButton coinslot = new JButton("Coin slot");
	private JButton onepoundbutton = new JButton("");
	private JButton fiftypencebutton = new JButton("");
	private JButton twentypencebutton = new JButton("");
	private float coinbalance = 0.0f;
	
	
	public cash() throws IOException {
		
		onepoundbutton.setText("£1.00 Accepted");
		onepoundbutton.setFont(new Font("Arial", Font.PLAIN, 0));
		
		twentypencebutton.setText("20p Accepted");
		twentypencebutton.setFont(new Font("Arial", Font.PLAIN, 0));
		
		fiftypencebutton.setText("50p Accepted");
		fiftypencebutton.setFont(new Font("Arial", Font.PLAIN, 0));
		
		balancedisplay.setEditable(false);
		Color color = new Color(39, 79, 44);
		balancedisplay.setBackground(color);
		
		coinslot.setForeground(Color.YELLOW);
		
		try {
		    Image poundimg = ImageIO.read(new File("E:\\yr2\\oop\\cw1\\code\\vendingMachine\\src\\vendingMachine\\resources\\Pound_coin.jpg"));
		    Image twentyimg = ImageIO.read(new File("E:\\yr2\\oop\\cw1\\code\\vendingMachine\\Assets\\20pence.png"));
		    Image fiftyimg = ImageIO.read(new File("E:\\yr2\\oop\\cw1\\code\\vendingMachine\\Assets\\50pence.png"));
		    
				Image newpoundcoinimg = poundimg.getScaledInstance(70, 70,  java.awt.Image.SCALE_SMOOTH);
				Image newtwentyimg = twentyimg.getScaledInstance(70, 70,  java.awt.Image.SCALE_SMOOTH);
				Image newfiftyimg = fiftyimg.getScaledInstance(70, 70,  java.awt.Image.SCALE_SMOOTH);
				
				onepoundbutton.setIcon(new ImageIcon(newpoundcoinimg));
				twentypencebutton.setIcon(new ImageIcon(newtwentyimg));
				fiftypencebutton.setIcon(new ImageIcon(newfiftyimg));
				
				onepoundbutton.setMargin(new Insets(0, 0, 0, 0));
				onepoundbutton.setBackground(null);
				onepoundbutton.setBorder(null);
				
				twentypencebutton.setMargin(new Insets(0, 0, 0, 0));
				twentypencebutton.setBackground(null);
				twentypencebutton.setBorder(null);
				
				fiftypencebutton.setMargin(new Insets(0, 0, 0, 0));
				fiftypencebutton.setBackground(null);
				fiftypencebutton.setBorder(null);
				
				onepoundbutton.addMouseListener(new DragMouseAdapter());
				onepoundbutton.setTransferHandler(new TransferHandler("text"));
				
				twentypencebutton.addMouseListener(new DragMouseAdapter());
				twentypencebutton.setTransferHandler(new TransferHandler("text"));
				
				fiftypencebutton.addMouseListener(new DragMouseAdapter());
				fiftypencebutton.setTransferHandler(new TransferHandler("text"));
				
				coinslot.setTransferHandler(new TransferHandler("text"));
				 coinslot.addActionListener(new ActionListener() {
				                public void actionPerformed(ActionEvent e) {
				                   
				                	coinslotclick();
				                	
				                }
				            }
				        );
			    
		  } catch (Exception ex) {
		    System.out.println(ex);
		  }
	}
	

	public void setBalanceDisplay (String balance) {
		this.balancedisplay.setText(balance);
	}
	
	
	public float getCoinBalance() {
		return this.coinbalance;
	}
	
	
	public void setCoinBalance(int balance) {
		this.coinbalance = balance;
	}
	
	
	public JTextField getBalanceDisplay () {
		return this.balancedisplay;
	}
	
	
	public JButton getCoinSlot () {
		return this.coinslot;
	}
	
	
	public JButton getOnePoundButton () {
		return this.onepoundbutton;
	}
	
	
	public JButton getTwentyPenceButton () {
		return this.twentypencebutton;
	}
	
	
	public JButton getFiftyPenceButton () {
		return this.fiftypencebutton;
	}
	
	
	public void coinslotclick() {
		
		String balance = coinslot.getText().replaceAll("\\D+","");
		
		if (balance.length() == 3) {
			StringBuilder sb = new StringBuilder(balance);
		    sb.insert(1, ".");
		    balance = sb.toString();
		}
		
		else if (balance.length() == 2) {
			StringBuilder sb = new StringBuilder(balance);
		    sb.insert(0, ".");
		    balance = sb.toString();
		}
		
		System.out.println(balance);
		this.coinbalance += Float.valueOf(balance);
		coinslot.setText("Balance Added");
		
		balancedisplay.setText(String.valueOf(this.coinbalance));
	}
}




