package BankManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Withdrawl extends JFrame  implements ActionListener {
	
	JTextField amount;
	JButton withdraw, back;
	String pinnumber;
	
	Withdrawl(String pinnumber) {
		this.pinnumber = pinnumber;
		
		
        setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2 = i1.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0, 0, 800, 800);
		add(image);
		
		JLabel text = new JLabel("Enter the amount you want to Withdrawl");
		text.setBounds(160, 250, 700, 35);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System" ,Font.BOLD, 16));
		image.add(text);
		
		amount = new JTextField();
		amount.setFont(new Font ("Raleway", Font.BOLD, 20));
		amount.setBounds(160, 300, 284, 25);
		image.add(amount);
		
		withdraw = new JButton("Withdraw");
		withdraw.setBounds(310, 430, 150, 28);
		withdraw.addActionListener(this);
		image.add(withdraw);
		
		back = new JButton("Back");
		back.setBounds(310, 460, 150, 28);
		back.addActionListener(this);
		image.add(back);
		
		
		
		
		
		
		
		
		
		setSize(800, 800);
		setLocation(300, 0);
		//setUndecorated(true);
		setVisible(true);
		
		
	}

	
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == withdraw) {
			String number = amount.getText();
			Date date = new Date(System.currentTimeMillis());
			if(number.equals("")) {
				JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdrawl");
			} else {
				try {
				Conn conn = new Conn();
				String query = "insert into bank values('"+pinnumber+"','"+date+"','Withdrawl', '"+number+"')";
				conn.s.executeUpdate(query);
				JOptionPane.showMessageDialog(null, "Rs "+number+" Withdraw Successfully");
				setVisible(false);
				new Transactions(pinnumber).setVisible(true);
				
				} catch (Exception e) {
					System.out.println(e);
				}
			}
			
			
		}else if (ae.getSource() == back ) {
			setVisible(false);
			new Transactions(pinnumber).setVisible(true);
		}
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new Withdrawl("");
		

	}

}
