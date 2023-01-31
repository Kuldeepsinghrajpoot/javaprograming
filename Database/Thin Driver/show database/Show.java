import java.sql.*;
class Show{
	public static void main(String[] args) {
		try{
		Class.forName("com.mysql.cj.jdbc.Driver"); //step 1

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/java","root",""); //step 2

		Statement st = con.createStatement();

		ResultSet rs = st.executeQuery("select *from javaconnection");

		while(rs.next()){
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t\t");
		}

		con.close();
    }catch(Exception e){
    	System.out.println(e);
    }

	}
}