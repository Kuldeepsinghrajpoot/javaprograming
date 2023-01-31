import java.io.*;
import java.util.Scanner;
class Word{
public static void main(String[] args)  throws IOException {
	int a=0;
	FileInputStream fi = new FileInputStream("in.txt");
	//FileOutputStream fo = new FileInputStream();
	Scanner sc = new Scanner(fi);
    String s ="";
    while(sc.hasNext()){
		
    	s= sc.next();
		a+=1;
    	System.out.print(s);
    }
	System.out.println("numer of count "+a);
  }
}  