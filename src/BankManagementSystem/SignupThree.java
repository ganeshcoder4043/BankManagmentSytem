package BankManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class SignupThree extends JFrame  implements ActionListener{
	JRadioButton r1,r2,r3,r4;
	JCheckBox c1, c2, c3, c4, c5, c6, c7;
	JButton submit, cancel;
	String formno;
	
	
	SignupThree(String formno) {
	this.formno = formno;
	setLayout(null);
	
	JLabel l1 = new JLabel ("Page 3: Account Details");
	l1.setFont(new Font("Raleway", Font.BOLD, 22));
	l1.setBounds(250, 20, 400, 40);
	add(l1);
	
	JLabel type = new JLabel ("Account Type:-");
	type.setFont(new Font("Raleway", Font.BOLD, 20));
	type.setBounds(100, 70, 400, 30);
	add(type);
	
	r1 = new JRadioButton("Savinh Account");
	r1.setFont(new Font("Raleway", Font.BOLD,16));
	r1.setBackground(Color.WHITE);
	r1.setBounds(100, 110, 200 , 21);
	add(r1);
	
	r2 = new JRadioButton("Fixed Deposit Account");
	r2.setFont(new Font("Raleway", Font.BOLD,16));
	r2.setBackground(Color.WHITE);
	r2.setBounds(340, 110, 250 , 21);
	add(r2);
	
	r3 = new JRadioButton("Current Account");
	r3.setFont(new Font("Raleway", Font.BOLD,16));
	r3.setBackground(Color.WHITE);
	r3.setBounds(100, 150, 200 , 21);
	add(r3);
	
	r4 = new JRadioButton("Recurring Deposit Account");
	r4.setFont(new Font("Raleway", Font.BOLD,16));
	r4.setBackground(Color.WHITE);
	r4.setBounds(340, 150, 250 , 21);
	add(r4);
	
	ButtonGroup groupaccount = new ButtonGroup();
	groupaccount.add(r1);
	groupaccount.add(r2);
	groupaccount.add(r3);
	groupaccount.add(r4);
	
	
	
	JLabel card = new JLabel ("Card Number:-");
	card.setFont(new Font("Raleway", Font.BOLD, 20));
	card.setBounds(100, 190, 400, 30);
	add(card);
	
	JLabel number = new JLabel ("XXXX-XXXX-XXXX-4043");
	number.setFont(new Font("Raleway", Font.BOLD, 18));
	number.setBounds(340, 190, 400, 30);
	add(number);
	
	JLabel carddetail = new JLabel ("(Your 16 Digit Card Number)");
	carddetail.setFont(new Font("Raleway", Font.BOLD, 12));
	carddetail.setBounds(100, 210, 400, 20);
	add(carddetail);
	
	
	JLabel pin = new JLabel ("PIN:-");
	pin.setFont(new Font("Raleway", Font.BOLD, 20));
	pin.setBounds(100, 250, 400, 30);
	add(pin);
	
	JLabel pnumber = new JLabel ("XXXX");
	pnumber.setFont(new Font("Raleway", Font.BOLD, 18));
	pnumber.setBounds(340, 250, 400, 30);
	add(pnumber);
	
	JLabel pindetails = new JLabel ("(Your 4 Digit Password)");
	pindetails.setFont(new Font("Raleway", Font.BOLD, 12));
	pindetails.setBounds(100, 270, 400, 20);
	add(pindetails);
	
	JLabel services = new JLabel ("Services Requried:-");
	services.setFont(new Font("Raleway", Font.BOLD, 20));
	services.setBounds(100, 300, 400, 20);
	add(services);
	
	c1 = new JCheckBox("ATM CARD");
	c1.setFont(new Font("Raleway", Font.BOLD, 16));
	c1.setBackground(Color.WHITE);
	c1.setBounds(100, 330, 200, 21);	
	add(c1);
	
	c2 = new JCheckBox("Internet Banking");
	c2.setFont(new Font("Raleway", Font.BOLD, 16));
	c2.setBackground(Color.WHITE);
	c2.setBounds(340, 330, 250, 21);	
	add(c2);
	
	c3 = new JCheckBox("Mobile Banking");
	c3.setFont(new Font("Raleway", Font.BOLD, 16));
	c3.setBackground(Color.WHITE);
	c3.setBounds(100, 369, 200, 21);	
	add(c3);
	
	c4 = new JCheckBox("EMAIL & SMS Alerts");
	c4.setFont(new Font("Raleway", Font.BOLD, 16));
	c4.setBackground(Color.WHITE);
	c4.setBounds(340, 369, 250, 21);	
	add(c4);
	
	c5 = new JCheckBox("Cheque Book ");
	c5.setFont(new Font("Raleway", Font.BOLD, 16));
	c5.setBackground(Color.WHITE);
	c5.setBounds(100, 408, 200, 21);	
	add(c5);
	
	c6 = new JCheckBox("E-Statement");
	c6.setFont(new Font("Raleway", Font.BOLD, 16));
	c6.setBackground(Color.WHITE);
	c6.setBounds(340, 408, 250, 21);	
	add(c6);
	
	c7 = new JCheckBox("I hereby declares that the above details are corect to the best of my knowledge");
	c7.setFont(new Font("Raleway", Font.BOLD, 12));
	c7.setBackground(Color.WHITE);
	c7.setBounds(100, 447, 600, 21);	
	add(c7);
	
	submit = new JButton("Submit");
	submit.setBackground(Color.DARK_GRAY);
	submit.setForeground(Color.WHITE);
	submit.setFont(new Font("Raleway", Font.BOLD, 14));
	submit.addActionListener(this);
	submit.setBounds(330, 510, 100, 30);
	add(submit);
	
	cancel = new JButton("Cancel");
	cancel.setBackground(Color.DARK_GRAY);
	cancel.setForeground(Color.WHITE);
	cancel.setFont(new Font("Raleway", Font.BOLD, 14));
	cancel.addActionListener(this);
	cancel.setBounds(180, 510, 100, 30);
	add(cancel);
	
	
	
	
	setTitle("page 3");
	getContentPane().setBackground(Color.WHITE);
	setSize(800, 710);
	setLocation(300, 15);
	setVisible(true);
	
	}
	
	
	public void actionPerformed(ActionEvent ae) {
		
		if (ae.getSource() == submit) {
			String accountType = null;
			if (r1.isSelected()) {
				accountType = "Saving Account";
			} if (r2.isSelected()) {
				accountType = "Fixed Deposit Account";
			} if (r3.isSelected()) {
				accountType = "Current Account";
			} if (r4.isSelected()) {
				accountType = "Reccuring Deposit Account";
			}
			
			Random random = new Random();
			String cardnumber = "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
			
			String pinnumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
			
			String facility = "";
			if (c1.isSelected()) {
				facility = facility + " ATM Card";
			} else if (c2.isSelected()) {
				facility = facility + " Internet Banking";
			}if (c3.isSelected()) {
				facility = facility + " Mobile Banking";
			}if (c4.isSelected()) {
				facility = facility + " EMAIL & SMS Alerts";
			}if (c1.isSelected()) {
				facility = facility + " Cheque Books";
			}if (c1.isSelected()) {
				facility = facility + " E-Statement";
			}
			
			try {
				if (accountType.equals("")) {
					JOptionPane.showMessageDialog(null, "Account type is Most Requried");
				}else {
					Conn conn = new Conn();
					String query1 = "insert into signupthree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
					String query2 = "insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
					
					
					
					conn.s.executeUpdate(query1);
					conn.s.executeUpdate(query2);
					
					JOptionPane.showMessageDialog(null, "Card Number: " + cardnumber + "\n Pin: " + pinnumber);

					setVisible(false);
					new Deposit(pinnumber).setVisible(true);
					
					
				}
			}catch (Exception e) {
				System.out.println(e);
			}
			
			
		}else if (ae.getSource() == cancel) {
			setVisible(false);
			new Login().setVisible(true);
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		new SignupThree("");

	}

}
