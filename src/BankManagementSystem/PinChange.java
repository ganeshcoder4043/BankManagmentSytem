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
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PinChange extends JFrame implements ActionListener {
	
	JPasswordField pin, repin;
	JButton change, back;
	String pinnumber;
	
	PinChange(String pinnumber){
		this.pinnumber = pinnumber;
        setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2 = i1.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0, 0, 800, 800);
		add(image);
		
		JLabel text = new JLabel("CHANGE YOUR PIN");
		text.setBounds(215, 250, 700, 35);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System" ,Font.BOLD, 16));
		image.add(text);
		
		JLabel pintext = new JLabel("New PIN:");
		pintext.setBounds(150, 295, 180, 30);
		pintext.setForeground(Color.WHITE);
		pintext.setFont(new Font("System" ,Font.BOLD, 16));
		image.add(pintext);
		
		pin = new JPasswordField();
		pin.setFont(new Font("Raleway", Font.BOLD, 16));
		pin.setBounds(270, 295, 180, 25);
		image.add(pin);
		
		JLabel repintext = new JLabel("Re-Enter PIN:");
		repintext.setBounds(150, 330, 180, 30);
		repintext.setForeground(Color.WHITE);
		repintext.setFont(new Font("System" ,Font.BOLD, 16));
		image.add(repintext);
		
		repin = new JPasswordField();
		repin.setFont(new Font("Raleway", Font.BOLD, 16));
		repin.setBounds(270, 330, 180, 25);
		image.add(repin);
		
		change = new JButton("CHANGE");
		change.setBounds(310, 430, 150, 28);
		change.addActionListener(this);
		image.add(change);
		
		back = new JButton("BACK");
		back.setBounds(310, 460, 150, 28);
		back.addActionListener(this);
		image.add(back);
		
		
		setSize(800, 800);
		setLocation(300, 0);
		setUndecorated(true);
		setVisible(true);
		
		
	}
     
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == change) {
		try {
			String npin = pin.getText();
			String rpin = repin.getText();
			
			if (!npin.equals(rpin)) {
				JOptionPane.showMessageDialog(null, "Entered PIN does not match");
				return;
			}
			   if (npin.equals("")) {
				   JOptionPane.showMessageDialog(null, "Please Enter new PIN ");
					return; 
			   }
			   if (rpin.equals("")) {
				   JOptionPane.showMessageDialog(null, "Please re-enter new PIN");
					return;
			   }
			    
			   Conn conn = new Conn();
			   String query1 = " update bank set pin = '"+rpin+"' where pin='"+pinnumber+"'";
			   String query2 = " update login set pin = '"+rpin+"' where pin='"+pinnumber+"'";
			   String query3 = " update signupthree set pin = '"+rpin+"' where pin='"+pinnumber+"'";
               
			   conn.s.executeUpdate(query1);
			   conn.s.executeUpdate(query2);
			   conn.s.executeUpdate(query3);
			   
			   JOptionPane.showMessageDialog(null, "PIN changed successfully");
			   
			   setVisible(false);
			   new Transactions(rpin).setVisible(true);

			
	    	}catch (Exception e) {
			System.out.println(e);
			}
		} else {
			setVisible(false);
			new Transactions(pinnumber).setVisible(true);
			
		}
		
		}
	
	
	public static void main(String[] args) {
		new PinChange("").setVisible(true);
	}

}
