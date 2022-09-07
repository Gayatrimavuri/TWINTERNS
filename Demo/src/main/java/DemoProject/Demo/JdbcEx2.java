package DemoProject.Demo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.OracleTypes;

public class JdbcEx2 {
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
	cstmt=Con.prepareCall("{call sp_fetchemp(?,?)}");
	cstmt.setInt(1, 10);
	cstmt.registerOutParameter(2, OracleTypes.CURSOR);
	cstmt.execute();
	ResultSet R= (ResultSet)cstmt.getObject(2);
	while(R.next())
	{
		System.out.println(R.getInt(1)+ " "+R.getString(2));
		
	}
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
try {
	Con.close();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}
