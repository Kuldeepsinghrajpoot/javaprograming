import java.sql.*;
class  Student {
 public static void main(String[] args) {
 	 try{
 	 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");//Stablish driver  here of odbc.
 	 System.out.println("stablish odbc driver");

       Connection  con = DriverManager.getConnection("jdbc:odbc:student");
       System.out.println("stablish odbc Connection");
 	 

       Statement st = con.createStatement();
       System.out.println("stablish odbc Statement");
 	 
       ResultSet rs = st.executeQuery("select *from information");
       String n,r,m;

       while(rs.next()){
       	n=rs.getString("student");
        r=rs.getString("roll");
        m=rs.getString("phone");
          System.out.println(n+" "+r+" "+m);
       }
      con.close();
       
          }catch(Exception e){
     	     System.out.println("generate some Error on code please check");
        }
    }       
}