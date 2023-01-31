import java.sql.*;
import java.util.Scanner;
import java.io.*;
class Update{
	public static void main(String[] args) throws Exception{
		/*Scanner scanner = new Scanner(System.in);
		String i,n;*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Update data set");
		String value =br.readLine();
		
		System.out.println("update set value");
		String i = br.readLine();
		
		System.out.println("Update data where");
		String value1=br.readLine();
		
		
		System.out.println("update where value");
		String n = br.readLine();
       
		try{
			System.out.println(i+n);
            Class.forName("com.mysql.jdbc.Driver");

            //Create connection method..

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/info","root","");

            Statement st = con.createStatement();
            st.executeUpdate("Update  info set "+value+" = ('"+i+"') where "+value1+" =('"+n+"')" );
            
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
