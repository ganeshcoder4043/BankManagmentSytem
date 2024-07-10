package BankManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class SignupOne extends JFrame implements ActionListener
{   JTextField nameTextFeild,fatherTextFeild,motherTextFeild,mialTextFeild,addressTextFeild,countryTextFeild,stateTextFeild,cityTextFeild,pincodeTextFeild;
    JDateChooser dateChooser;
    JRadioButton male,female,transgender,married,unmarried,others;
    JButton next;
    long random;
    
    
	
	SignupOne()
	{   
		setLayout(null);
		Random ran = new Random();
		this.random = Math.abs((ran.nextLong() % 9000L) + 1000L);
		
		JLabel formno = new JLabel("APPLICATION FORM NO. " + random);
		formno.setFont(new Font("Raleway", Font.BOLD, 34));
		formno.setBounds(125, 10, 600, 40);
		add(formno);
		
		JLabel person = new JLabel("Page 1: Personal Details");
		person.setFont(new Font("Raleway", Font.BOLD, 22));
		person.setBounds(250, 50, 600, 30);
		add(person);
		
		JLabel name = new JLabel("Name:");
		name.setFont(new Font("Raleway", Font.BOLD, 20));
		name.setBounds(70, 120, 100, 30);
		add(name);
		
		nameTextFeild = new JTextField();
		nameTextFeild.setFont(new Font("Raleway", Font.BOLD, 14));
		nameTextFeild.setBounds(270, 118, 400, 30);
		add(nameTextFeild);
		
		JLabel fname = new JLabel("Father's Name:");
		fname.setFont(new Font("Raleway", Font.BOLD, 20));
		fname.setBounds(70, 160, 400, 30);
		add(fname);
		
		fatherTextFeild = new JTextField();
		fatherTextFeild.setFont(new Font("Raleway", Font.BOLD, 14));
		fatherTextFeild.setBounds(270, 158, 400, 30);
		add(fatherTextFeild);
		
		JLabel mname = new JLabel("Mother's Name:");
		mname.setFont(new Font("Raleway", Font.BOLD, 20));
		mname.setBounds(70, 200, 400, 30);
		add(mname);
		
		motherTextFeild = new JTextField();
		motherTextFeild.setFont(new Font("Raleway", Font.BOLD, 14));
		motherTextFeild.setBounds(270, 198, 400, 30);
		add(motherTextFeild);
		
		JLabel dob = new JLabel("Date of Birth:");
		dob.setFont(new Font("Raleway", Font.BOLD, 20));
		dob.setBounds(70, 240, 400, 30);
		add(dob);
		
		dateChooser = new JDateChooser();
		dateChooser.setBounds(270, 238, 400, 30);
		dateChooser.setForeground(new Color(128, 128, 128));
		add(dateChooser);
		
		JLabel gender = new JLabel("Gander:");
		gender.setFont(new Font("Raleway", Font.BOLD, 20));
		gender.setBounds(70, 280, 400, 30);
		add(gender);
		
		male = new JRadioButton("Male");
		male.setBackground(Color.WHITE);
		male.setBounds(270, 278, 90, 30);
		add(male);
		
		female = new JRadioButton("Female");
		female.setBackground(Color.WHITE);
		female.setBounds(365, 278, 100, 30);
		add(female);
		
		transgender = new JRadioButton("Transgender");
		transgender.setBackground(Color.WHITE);
		transgender.setBounds(465, 278, 100, 30);
		add(transgender);
		
		ButtonGroup GenderGroup = new ButtonGroup();
		GenderGroup.add(female);
		GenderGroup.add(male);
		GenderGroup.add(transgender);
		
		
		JLabel mail = new JLabel("Email Address:");
		mail.setFont(new Font("Raleway", Font.BOLD, 20));
		mail.setBounds(70, 320, 400, 30);
		add(mail);
		
		mialTextFeild = new JTextField();
		mialTextFeild.setFont(new Font("Raleway", Font.BOLD, 14));
		mialTextFeild.setBounds(270, 318, 400, 30);
		add(mialTextFeild);
		
		JLabel marital = new JLabel("Marital Status:");
		marital.setFont(new Font("Raleway", Font.BOLD, 20));
		marital.setBounds(70, 360, 400, 30);
		add(marital);
		
		married = new JRadioButton("Married");
		married.setBackground(Color.WHITE);
		married.setBounds(270, 358, 90, 30);
		add(married);
		
		unmarried = new JRadioButton("Unmarried");
		unmarried.setBackground(Color.WHITE);
		unmarried.setBounds(365, 358, 100, 30);
		add(unmarried);
		
		others = new JRadioButton("Others");
		others.setBackground(Color.WHITE);
		others.setBounds(465, 358, 100, 30);
		add(others);
		
		ButtonGroup marriedgroup = new ButtonGroup();
		marriedgroup.add(married);
		marriedgroup.add(unmarried);
		marriedgroup.add(others);
		
		JLabel address = new JLabel("Address:");
		address.setFont(new Font("Raleway", Font.BOLD, 20));
		address.setBounds(70, 400, 400, 30);
		add(address);
		
		addressTextFeild = new JTextField();
		addressTextFeild.setFont(new Font("Raleway", Font.BOLD, 14));
		addressTextFeild.setBounds(270, 398, 400, 30);
		add(addressTextFeild);
		
		JLabel country = new JLabel("Country:");
		country.setFont(new Font("Raleway", Font.BOLD, 20));
		country.setBounds(70, 440, 400, 30);
		add(country);
		
		countryTextFeild = new JTextField();
		countryTextFeild.setFont(new Font("Raleway", Font.BOLD, 14));
		countryTextFeild.setBounds(270, 438, 400, 30);
		add(countryTextFeild);
		
		JLabel state = new JLabel("State:");
		state.setFont(new Font("Raleway", Font.BOLD, 20));
		state.setBounds(70, 480, 400, 30);
		add(state);
		
		stateTextFeild = new JTextField();
		stateTextFeild.setFont(new Font("Raleway", Font.BOLD, 14));
		stateTextFeild.setBounds(270, 478, 400, 30);
		add(stateTextFeild);
		
		JLabel city = new JLabel("City:");
		city.setFont(new Font("Raleway", Font.BOLD, 20));
		city.setBounds(70, 520, 400, 30);
		add(city);
		
		cityTextFeild = new JTextField();
		cityTextFeild.setFont(new Font("Raleway", Font.BOLD, 14));
		cityTextFeild.setBounds(270, 518, 400, 30);
		add(cityTextFeild);
		
		JLabel pincode = new JLabel("PinCode:");
		pincode.setFont(new Font("Raleway", Font.BOLD, 20));
		pincode.setBounds(70, 560, 400, 30);
		add(pincode);
		
		pincodeTextFeild = new JTextField();
		pincodeTextFeild.setFont(new Font("Raleway", Font.BOLD, 14));
		pincodeTextFeild.setBounds(270, 558, 400, 30);
		add(pincodeTextFeild);
		
		
		next = new JButton("Next");
		next.setBackground(Color.DARK_GRAY);
		next.setForeground(Color.WHITE);
		next.addActionListener(this);
		next.setBounds(485, 610, 100, 30);
		add(next);
		
		
		
		
		
		
		
		
		
		getContentPane().setBackground(Color.WHITE);
		
		
		setTitle("(SWISS BANK) Page 1: Personal Details");
		setSize(800, 710);
		setLocation(300, 15);
		setVisible(true);
	}
	
	 
	public void actionPerformed(ActionEvent ae)
	{
	 
	 String formno = "" + random;
	 String name = nameTextFeild.getText();
	 String fname = fatherTextFeild.getText();
	 String mname = motherTextFeild.getText();
	 String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
	 String gender = null;
	 if (male.isSelected()) {
	     gender = "Male";}
	 else if (female.isSelected()) {
		 gender = "Female";
	 }else if (transgender.isSelected()) {
		 gender = "Transgender";
	 }
	 
	 String email = mialTextFeild.getText();
	 
	 String marital = null;
	 if (married.isSelected()) {
		 marital = "Married";
	 }else if (unmarried.isSelected()) {
		 marital = "Unmarried";
	 }else if (others.isSelected()) {
		 marital = "Others";
	 }
	 
	 String address = addressTextFeild.getText();
	 String country = countryTextFeild.getText();
	 String state = stateTextFeild.getText();
	 String city = cityTextFeild.getText();
	 String pincode = pincodeTextFeild.getText();
	 
	try {
		if (name.equals("")) {
			JOptionPane.showMessageDialog(null, "Name is Most Required");
		}else {
			Conn c = new Conn();
			String query = "insert into signup values('"+formno+"', '"+name+"','"+fname+"','"+mname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+country+"','"+state+"','"+city+"','"+pincode+"')";
			c.s.executeUpdate(query);
			
			
			setVisible(false);
			new SignupTwo(formno).setVisible(true);
		}
	}
	
	catch (Exception e) {
		System.out.println(e);
		
	}
	 
	 
	 
}

	 
	 
	public static void main(String[] args) 
	{
		new  SignupOne();

	}

}
