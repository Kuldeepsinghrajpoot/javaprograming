import java.io.*;
import java.util.Scanner;
class Line{
	public static void main(String[] args) {
		try{
			FileInputStream fi = new FileInputStream("in.txt");
			Scanner sc = new Scanner(fi);
			String s ="";
			String line;
			int a=0;
			while((line=sc.readline())!=null){
                //s= sc.nextLine();
				
				String[] wordList= line.split("\\+s");
				a+=wordList.length;
				
				
                System.out.print(s);
			}
		}catch(Exception e){

		}
	}
}