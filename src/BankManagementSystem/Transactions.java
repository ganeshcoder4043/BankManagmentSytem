package BankManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Transactions extends JFrame implements ActionListener {
	
	
	JButton deposit, withdrawl, ministatement, pinchange, fastcash, balanceenquiry, exit;
	String pinnumber;
	
	Transactions(String pinnumber) {
		this.pinnumber = pinnumber;
		
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2 = i1.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0, 0, 800, 800);
		add(image);
		
		
		JLabel text = new JLabel("Please select your transaction");
		text.setBounds(188, 250, 700, 35);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System" ,Font.BOLD, 16));
		image.add(text);
		
		deposit = new JButton("Deposit");
		deposit.setBounds(140, 370, 150, 28);
		deposit.addActionListener(this);
		image.add(deposit);
		
		fastcash = new JButton("Fast Cash");
		fastcash.setBounds(140, 400, 150, 28);
		fastcash.addActionListener(this);
		image.add(fastcash);
		
		pinchange = new JButton("Pin Change");
		pinchange.setBounds(140, 430, 150, 28);
		pinchange.addActionListener(this);
		image.add(pinchange);
		
		withdrawl = new JButton("Cash Withdrawl");
		withdrawl.setBounds(310, 370, 150, 28);
		withdrawl.addActionListener(this);
		image.add(withdrawl);
		
		ministatement = new JButton("Mini Statement");
		ministatement.setBounds(310, 400, 150, 28);
		ministatement.addActionListener(this);
		image.add(ministatement);
		
		balanceenquiry = new JButton("Balance Enquriy");
		balanceenquiry.setBounds(310, 430, 150, 28);
		balanceenquiry.addActionListener(this);
		image.add(balanceenquiry);
		
		exit = new JButton("Exit");
		exit.setBounds(310, 460, 150, 28);
		exit.addActionListener(this);
		image.add(exit);
		
		
		
		
	
		
		setSize(800, 800);
		setLocation(300, 0);
		setUndecorated(true);
		setVisible(true);
		
	}
	
	
	
	
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == exit) {
			System.exit(0);
		}else if (ae.getSource() == deposit) {
			setVisible(false);
			new Deposit(pinnumber).setVisible(true);
			
		}else if (ae.getSource() == withdrawl) {
			setVisible(false);
			new Withdrawl(pinnumber).setVisible(true);	
		} else if (ae.getSource() == fastcash) {
			setVisible(false);
			new FastCash(pinnumber).setVisible(true);
			
		} else if(ae.getSource() == pinchange) {
			setVisible(false);
			new PinChange(pinnumber).setVisible(true);
			
		} else if (ae.getSource() == balanceenquiry) {
			setVisible(false);
			new BalanceEnquiry(pinnumber).setVisible(true);
		} else if (ae.getSource() == ministatement) {
			
			new MiniStatement(pinnumber).setVisible(true);
		}
		
	}

	public static void main(String[] args) {
		new Transactions("");

	}

}
