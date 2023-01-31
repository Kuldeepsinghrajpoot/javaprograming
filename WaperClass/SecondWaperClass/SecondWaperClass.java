import java.io.*;
//import java.util.Scanner;
class SecondWaperClass{
	public static void main(String[] args) {
       Float floats = new Float(0);
        try{
        	 DataInputStream in = new DataInputStream(System.in);
        	 System.out.println("Enter your name here : ");
        	 System.out.flush();
             String principal = in.readLine();
             //here converting the value sting to float data type.
             floats =Float.parseFloat(principal);
             //It is defining two tye 1. Float.valueOf(), second is Float.parseFloat();
             System.out.println("Converting the value of string to flaot :"+floats);

             //System.out.println("This is principal Rate :"+principal);
    }catch(IOException e){
    	System.out.println("Error"+e);
    }
   function();
    //printline();
    }
 static void function(){
    	System.out.println("This is a method ");
    }

}