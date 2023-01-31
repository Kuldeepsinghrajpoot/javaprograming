import java.util.Scanner;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.IOException;
public class client{
	public static void main(String args[]) throws UnknownHostException, IOException{
		Socket s = new Socket("localhost",1234);
		// first is ip address and second is port number
		
		Scanner sc = new Scanner(s.getInputStream());
		System.out.println("send message");
		int number = sc.nextInt();
		PrintStream p= new PrintStream(s.getOutputStream());
		p.println(number);
		int temp = sc.nextInt();
		System.out.println(temp);
	}
	
}