package DemoProject.Demo;
import java.sql.*;

import oracle.jdbc.OracleType;
import oracle.jdbc.OracleTypes;
public class JdbcEx {
public static void main(String[] args) {
	Connection Con=null;
	CallableStatement cstmt=null;
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		Con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Admin#123");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		cstmt=Con.prepareCall("{call sp_emp(?)}");
		cstmt.registerOutParameter (1, OracleTypes.CURSOR);
		
		
		cstmt.execute();
		ResultSet rset = (ResultSet)cstmt.getObject (1);
		rset.next();
		
		System.out.println(rset.getString(2));
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
