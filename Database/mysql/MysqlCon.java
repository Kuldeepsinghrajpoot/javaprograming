import java.sql.*;  
class MysqlCon
{  
	public static void main(String args[])
	{  
		try
		{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/school","root","");  
			//here student is database name, root is username and password is empty.  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select *from student where Email='kuldeepsingrajpoot4@gmail.com'");  
			
			
			while(rs.next())  
			{
				
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));  
			}
			con.close();  
		}
		catch(Exception e){ System.out.println(e);}  
	}  
}  