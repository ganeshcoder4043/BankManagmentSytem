package BankManagementSystem;

import java.awt.Color;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MiniStatement extends JFrame {
	
	String Pinnumber;
	
	MiniStatement(String pinnumber) {
		this.Pinnumber = pinnumber;
		setTitle("Mini Statement");
		
		setLayout(null);
		
		JLabel mini = new JLabel();
		mini.setBounds(20, 140, 400,200);
		add(mini);
		
		JLabel bank = new JLabel("SWISS Bank");
		bank.setBounds(160, 20, 100, 40);
		add(bank);
		
		JLabel card = new JLabel("");
		card.setBounds(20, 80, 300, 40);
		add(card);
		
		JLabel balance = new JLabel();
		balance.setBounds(20, 400, 300, 20);
		add(balance);
		
		
		try {
			Conn conn = new Conn();
			ResultSet rs = conn.s.executeQuery("Select * from login where pin = '"+pinnumber+"'");
			while(rs.next()) {
				card.setText("Card Number: " + rs.getString("cardNumber").substring(0, 4) + "XXXXXXXX" + rs.getString("cardNumber").substring(12));
			}
		
		} catch (Exception e) {
			System.out.println(e);
			
		}
		
		try {
			Conn conn = new Conn();
			int bal = 0;
			ResultSet rs = conn.s.executeQuery("Select * from bank where pin = '"+pinnumber+"'");
			while(rs.next()) {
				mini.setText(mini.getText()  + "<html>" + rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br><br><html>");
			
				if (rs.getString("type").equals("Deposit")) {
					bal += Integer.parseInt(rs.getString("amount"));
				} else {
					bal -= Integer.parseInt(rs.getString("amount"));
				}
			}
			balance.setText("Your Current Balance id Rs " + bal);
		}  catch (Exception e) {
			System.out.println(e);
			
		}
		
		
		setSize(400, 600);
		setLocation(20, 20);
		getContentPane().setBackground(Color.WHITE);
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		   
		new MiniStatement("");
		

	}

}
