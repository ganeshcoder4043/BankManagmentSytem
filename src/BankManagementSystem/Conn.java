package BankManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
	
	Connection c;
	Statement s;
	public Conn() {
		try {
			
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem", "root", "ganesh");
			s= c.createStatement();
			
			
			
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
