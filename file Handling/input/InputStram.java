import java.io.*;
class InputStram{
	public static void main(String[] args) {
		// Declaring the file here 
     FileInputStream fi  =null; 
     FileOutputStream out=null; 
	try{
	    fi = new FileInputStream ("in.txt");
	   out = new FileOutputStream("out.txt");
	   int i=0;
	   while(i!=0){
	   	i=fi.read();
	   	System.out.println((char)i);
	   	out.write(i);
	   }	
	   fi.close();
	   out.close();
	 }catch(Exception e){
	 	System.out.println(e);
	 }

	}
}