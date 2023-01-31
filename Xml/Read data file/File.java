import javax.xml.parsers.DocumentBuilderFactory;  
import javax.xml.parsers.DocumentBuilder;  
import org.w3c.dom.Document;  
import org.w3c.dom.NodeList;  
import org.w3c.dom.Node;  
import org.w3c.dom.Element;  
import java.io.*;  
import java.sql.*;
public class File
{  
public static void main(String argv[]) throws Exception{  
String i,n,a;
try   
{  
 Class.forName("com.mysql.jdbc.Driver");
 Connection con = DriverManager.getConnection("jdbc:mysql://localhost/info","root","");
 Statement st = con.createStatement();

 
//creating a constructor of file class and parsing an XML file  
FileInputStream file = new FileInputStream("file.xml");

//an instance of factory that gives a document builder  
DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
//an instance of builder to parse the specified xml file  

DocumentBuilder db = dbf.newDocumentBuilder();  

Document doc = db.parse(file);  

doc.getDocumentElement().normalize(); 

//System.out.println("Root element: " + doc.getDocumentElement().getNodeName()); 

NodeList nodeList = doc.getElementsByTagName("student");  

// nodeList is not iterable, so we are using for loop  
for (int itr = 0; itr < nodeList.getLength(); itr++)   {  
        Node node = nodeList.item(itr);  
         System.out.println("\nNode Name :" + node.getNodeName());  
        if (node.getNodeType() == Node.ELEMENT_NODE){  
              Element eElement = (Element) node; 
                              i=  eElement.getElementsByTagName("id").item(0).getTextContent();  
                              n=  eElement.getElementsByTagName("name").item(0).getTextContent();  
                              a=  eElement.getElementsByTagName("age").item(0).getTextContent();  
                
                  String string = "INSERT INTO info VALUES('"+i+"','"+n+"','"+a+"')";
		          st.executeUpdate(string);
				 // String string ="INSERT INTO info VALUES('"+i+"', '"+n+"','"+g+"')";
			// st.executeUpdate(string);
       
//System.out.println("semester: "+ eElement.getElementsByTagName("semester").item(0).getTextContent());  
//System.out.println("Marks: "+ eElement.getElementsByTagName("marks").item(0).getTextContent());  
        } 
		con.close();		

		
    }  
}   
catch (Exception e)   
{  
e.printStackTrace();  
}  
}  
}