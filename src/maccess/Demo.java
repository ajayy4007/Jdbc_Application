package maccess;

import java.sql.Connection;
import java.sql.DriverManager;

public class Demo {
public static void main(String[] args) {
	try {
		//load a jdbc driver driver type 2
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Stabalish the connection
		Connection con=DriverManager.getConnection("jdbc:oracle:oci8:@orcl","system","tiger");
		System.out.println("Connection is Successfully Stabalish:");
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
