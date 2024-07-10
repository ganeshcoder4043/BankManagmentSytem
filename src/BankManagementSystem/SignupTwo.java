package BankManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JRadioButton;
import javax.swing.JTextField;



public class SignupTwo extends JFrame implements ActionListener
{   JTextField panTextFeild,aadharTextFeild;
    
    JRadioButton eyes,eno,syes,sno;
    JButton next;
    
    JComboBox religion,category,occupation,educational,income;
    String formno;
    
    
	
	SignupTwo(String formno)
	{   
		this.formno = formno;
		setLayout(null);
		
		
		
		JLabel additionalDetails = new JLabel("Page 2: Additional Details");
		additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
		additionalDetails.setBounds(250, 50, 600, 30);
		add(additionalDetails);
		
		JLabel name = new JLabel("Religion:");
		name.setFont(new Font("Raleway", Font.BOLD, 20));
		name.setBounds(70, 120, 100, 30);
		add(name);
		
		String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Others"};
		religion = new JComboBox(valReligion);
		religion.setBounds(270, 118, 400, 30);
		religion.setBackground(Color.WHITE);
		add(religion);
		
		
		
		JLabel fname = new JLabel("Category:");
		fname.setFont(new Font("Raleway", Font.BOLD, 20));
		fname.setBounds(70, 160, 400, 30);
		add(fname);
		
		String valCategory[] = {"General", "OBC", "ST", "Other"   };
		category = new JComboBox(valCategory);
		category.setBounds(270, 158, 400, 30);
		category.setBackground(Color.WHITE);
		add(category);
		
		
		
		JLabel mname = new JLabel("Income:");
		mname.setFont(new Font("Raleway", Font.BOLD, 20));
		mname.setBounds(70, 200, 400, 30);
		add(mname);
		
		String valincomecategory[] = {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "upto 10,00,000" };
		income = new JComboBox(valincomecategory);
		income.setBounds(270, 198, 400, 30);
		income.setBackground(Color.WHITE);
		add(income);
	
		
		JLabel dob = new JLabel("Educational");
		dob.setFont(new Font("Raleway", Font.BOLD, 20));
		dob.setBounds(70, 240, 400, 30);
		add(dob);
		
		
		JLabel gender = new JLabel("Qualification:");
		gender.setFont(new Font("Raleway", Font.BOLD, 20));
		gender.setBounds(70, 265, 400, 30);
		add(gender);
		
		String valeducational[] = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Others"   };
		educational = new JComboBox(valeducational);
		educational.setBounds(270, 255, 400, 30);
		educational.setBackground(Color.WHITE);
		add(educational);
		
		
		
		
		JLabel mail = new JLabel("Occupation:");
		mail.setFont(new Font("Raleway", Font.BOLD, 20));
		mail.setBounds(70, 320, 400, 30);
		add(mail);
		
		String valoccupation[] = {"Salaried", "Self-Employed", "Bussiness", "Student", "Retired","Others"   };
		occupation = new JComboBox(valoccupation);
		occupation.setBounds(270, 318, 400, 30);
		occupation.setBackground(Color.WHITE);
		add(occupation);
		
		
		
		
		JLabel marital = new JLabel("Pan Number:");
		marital.setFont(new Font("Raleway", Font.BOLD, 20));
		marital.setBounds(70, 360, 400, 30);
		add(marital);
		
		panTextFeild = new JTextField(); //pan
		panTextFeild.setFont(new Font("Raleway", Font.BOLD, 14));
		panTextFeild.setBounds(270, 360, 400, 30);
		add(panTextFeild);
		
		
		JLabel address = new JLabel("Aadhar Number:");
		address.setFont(new Font("Raleway", Font.BOLD, 20));
		address.setBounds(70, 400, 400, 30);
		add(address);
		
		aadharTextFeild = new JTextField();
		aadharTextFeild.setFont(new Font("Raleway", Font.BOLD, 14));
		aadharTextFeild.setBounds(270, 398, 400, 30);
		add(aadharTextFeild);
		
		JLabel seniorcitizen = new JLabel("Senior Citizen:");
		seniorcitizen.setFont(new Font("Raleway", Font.BOLD, 20));
		seniorcitizen.setBounds(70, 440, 400, 30);
		add(seniorcitizen);
		
		syes = new JRadioButton("Yes");
		syes.setBackground(Color.WHITE);
		syes.setBounds(270, 438, 90, 30);
		add(syes);
		
		sno = new JRadioButton("No");
		sno.setBackground(Color.WHITE);
		sno.setBounds(365, 438, 100, 30);
		add(sno);
		
		ButtonGroup seniorcitizengroup = new ButtonGroup();
		seniorcitizengroup.add(syes);
		seniorcitizengroup.add(sno);
		
		
		
		
		JLabel existingaccount = new JLabel("Existing Account:");
		existingaccount.setFont(new Font("Raleway", Font.BOLD, 20));
		existingaccount.setBounds(70, 480, 400, 30);
		add(existingaccount);
		
		eyes = new JRadioButton("Yes");
		eyes.setBackground(Color.WHITE);
		eyes.setBounds(270, 480, 90, 30);
		add(eyes);
		
		eno = new JRadioButton("NO");
		eno.setBackground(Color.WHITE);
		eno.setBounds(365, 480, 100, 30);
		add(eno);
		
		ButtonGroup exixtingaccountGroup = new ButtonGroup();
		exixtingaccountGroup.add(eyes);
		exixtingaccountGroup.add(eno);
		
		
		
		
		
		
		next = new JButton("Next");
		next.setBackground(Color.DARK_GRAY);
		next.setForeground(Color.WHITE);
		next.addActionListener(this);
		next.setBounds(485, 610, 100, 30);
		add(next);
		
		
		
		
		
		
		
		
		
		getContentPane().setBackground(Color.WHITE);
		
		
		setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
		setSize(800, 710);
		setLocation(300, 15);
		setVisible(true);
	}
	
	 
	public void actionPerformed(ActionEvent ae)
	{
	 
     
	 String sreligion = (String) religion.getSelectedItem();
	 String scategory = (String) category.getSelectedItem();
	 String sincome = (String) income.getSelectedItem();
	 String seducation = (String) educational.getSelectedItem();
	 String soccupation = (String) occupation.getSelectedItem();
	 String seniorcitizen = null;
	 if (syes.isSelected()) {
		 seniorcitizen = "Yes";}
	 else if (sno.isSelected()) {
		 seniorcitizen = "No";
	 }
	 
	 
	 
	 
	 String existingaccount = null;
	 if (eyes.isSelected()) {
		 existingaccount = "Yes";
	 }else if (sno.isSelected()) {
		 existingaccount = "No";
	 }
	 
	 
	 String saadhar = aadharTextFeild.getText();
	 String span = panTextFeild.getText();
	 
	 
	try {
		
		
			Conn c = new Conn();
			String query = "insert into signupTwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
			c.s.executeUpdate(query);
			
			
			
			//Signup3 Object
			setVisible(false);
			new SignupThree(formno).setVisible(true);
			
		
	}
	
	catch (Exception e) {
		System.out.println(e);
		
	}
	 
	 
	 
}

	 
	 
	public static void main(String[] args) 
	{
		new  SignupTwo("");

	}

}
