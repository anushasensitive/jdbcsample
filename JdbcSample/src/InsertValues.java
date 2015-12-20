import java.sql.*;
public class InsertValues {
	public static void main(String args[])throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String user="system";
		String password="Amar-143";
		Connection con=DriverManager.getConnection(url, user, password);
		PreparedStatement ps=con.prepareStatement("insert into emp values(?,?,?)");
		ps.setString(1, "bulli");
		ps.setInt(2,11);
		ps.setString(3, "manager");
		int count=ps.executeUpdate();
		System.out.println("updated values is:"+count);
		con.close();
	}

}
