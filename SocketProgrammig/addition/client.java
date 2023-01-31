import java.util.Scanner;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.IOException;
public class client{
	public static void main(String args[]) throws UnknownHostException, IOException{
		Socket s = new Socket("localhost",12345);
		// first is ip address and second is port number
		
		Scanner sc1 = new Scanner(s.getInputStream());
		System.out.println("send message");
		int number = sc1.nextInt();
		PrintStream p= new PrintStream(s.getOutputStream());
		p.println(number);
		int temp = sc1.nextInt();
		System.out.println(temp);
	}
	
}