import java.io.*;

class Input{
	public static void main(String[] args) throws IOException {
		// Declaring the file here 
     FileInputStream fi = new FileInputStream ("in.txt");  
     FileOutputStream  out = new FileOutputStream("out.txt",true); 
	
	   
	   int i;
	   while((i=fi.read())!=-1){
	   
	   	System.out.println((char)i);
	   	out.write(i);
	   }	
	   fi.close();
	   out.close();
	/* }catch(Exception e){
	 	System.out.println(e);
	 }*/

	}
}