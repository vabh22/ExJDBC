package test;
import java.sql.*;

public class DBCon1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("Oracle.jdbc.driver.OracleDriver"); //step-1
			Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","C##ORACLE11AM","ORACLE"); //step-2
			Statement stm =con.createStatement();//step-3
			ResultSet rs=stm.executeQuery("select * from Employee44");//step-4
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4));
				
			}//end of loop
			con.close();//step-5
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
			
		}

	}