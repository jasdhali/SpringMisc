package spring.aspects.simpledbcall;

import java.sql.Connection;
import java.sql.Statement;

public class LocalEmpDBUtility {

	public LocalEmpDBUtility() {
	}
	
	public void createEmployere(Connection conn) throws Exception{
		Statement st = conn.createStatement();
		st.execute("Insert into Dept(DeptNo,Dname,Loc) Values(11,'New Dept','Houston')");
	}
	
	public Connection getConn() throws Exception{
		Connection conn = null;
		//DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		//conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
		return conn;
	}
	
	public static void main(String[] args) {
		LocalEmpDBUtility dbUtility = new LocalEmpDBUtility();
		Connection connection = null;
			try {
				connection = dbUtility.getConn();
				if( connection!=null){
					System.out.println("Got connection");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
