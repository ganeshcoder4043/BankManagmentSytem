package BankManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FastCash extends JFrame implements ActionListener {
	
	
	JButton deposit, withdrawl, ministatement, pinchange, fastcash, balanceenquriy, exit;
	String pinnumber;
	
	FastCash(String pinnumber) {
		this.pinnumber = pinnumber;
		
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2 = i1.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0, 0, 800, 800);
		add(image);
		
		
		JLabel text = new JLabel("SELECT WITHDRAWL AMOUNT");
		text.setBounds(188, 250, 700, 35);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System" ,Font.BOLD, 16));
		image.add(text);
		
		deposit = new JButton("100");
		deposit.setBounds(140, 370, 150, 28);
		deposit.addActionListener(this);
		image.add(deposit);
		
		fastcash = new JButton("500");
		fastcash.setBounds(140, 400, 150, 28);
		fastcash.addActionListener(this);
		image.add(fastcash);
		
		pinchange = new JButton("1000");
		pinchange.setBounds(140, 430, 150, 28);
		pinchange.addActionListener(this);
		image.add(pinchange);
		
		withdrawl = new JButton("2000");
		withdrawl.setBounds(310, 370, 150, 28);
		withdrawl.addActionListener(this);
		image.add(withdrawl);
		
		ministatement = new JButton("5000");
		ministatement.setBounds(310, 400, 150, 28);
		ministatement.addActionListener(this);
		image.add(ministatement);
		
		balanceenquriy = new JButton("10000");
		balanceenquriy.setBounds(310, 430, 150, 28);
		balanceenquriy.addActionListener(this);
		image.add(balanceenquriy);
		
		exit = new JButton("Back");
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
			setVisible(false);
			new Transactions(pinnumber).setVisible(true);
		}else {
			String amount = ((JButton)ae.getSource()).getText().substring(0);
			Conn conn = new Conn();
			try {
				ResultSet rs = conn.s.executeQuery("Select * from bank where pin = '"+pinnumber+"'");
				int balance = 0;
				while(rs.next()) {
					if (rs.getString("type").equals("Deposit")) {
						balance += Integer.parseInt(rs.getString("amount"));
					} else {
						balance -= Integer.parseInt(rs.getString("amount"));
					}
				}
				if (ae.getSource() != exit && balance < Integer.parseInt(amount)) {
					JOptionPane.showMessageDialog(null, "Insufficient Balance");
					return;
				}
				
				Date date = new Date(System.currentTimeMillis());
				String query = "insert into bank values('"+pinnumber+"', '"+date+"', 'Withdrawl', '"+amount+"')";
				conn.s.executeUpdate(query);
				JOptionPane.showMessageDialog(null, "Rs "+ amount + " Debited successfully");
				
				setVisible(false);
				new Transactions(pinnumber).setVisible(true);
				
			} catch (Exception e) {
				System.out.println(e);			}
		
		}
		
	}

	public static void main(String[] args) {
		new FastCash("");

	}

}
