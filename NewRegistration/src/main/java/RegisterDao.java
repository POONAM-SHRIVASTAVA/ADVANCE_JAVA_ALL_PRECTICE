import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {
private String dbUrl="jdbc:mysql://localhost:3306/userdb";
private String dbUname="root";
private String dbPassword="cdac";
private String dbDriver="com.mysql.cj.jdbc.Driver";


public void loadDriver(String dbDriver) {
	try {
		Class.forName(dbDriver);
		
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	}
}
public  Connection getConnection() {
	Connection connection =null;
	try {
		connection =DriverManager.getConnection(dbUrl,dbUname,dbPassword);
		
	}catch(SQLException e){
		e.printStackTrace();
		
	}
	return connection;
	
}
public String insert( Member member) throws SQLException {
	loadDriver(dbDriver);
	Connection connection =getConnection();
	String result ="data entered successfully";
	
	String sql = "insert into member value(????)";
	
	
	PreparedStatement pStatement = connection.prepareStatement(sql);
	pStatement.setString(1,member.getUname());
	pStatement.setString(2,member.getPassword());
	pStatement.setString(3,member.getPhone());
	pStatement.executeUpdate();
	
	
	return result;
}
}
