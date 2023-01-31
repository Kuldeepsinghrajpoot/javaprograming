import java.util.*;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.IOException;
public class client{
	public static void main(String args[]) throws UnknownHostException, IOException{
		try (Socket s = new Socket("localhost",1234)) {
			try (Scanner sc = new Scanner(System.in)) {
				
				// first is ip address and second is port number
				
				Scanner sc1 = new Scanner(s.getInputStream());
				System.out.println("Send Message");
				String number = sc.nextLine();
				PrintStream p= new PrintStream(s.getOutputStream());
				p.println(number);
				int temp = sc1.nextInt();
				System.out.println(temp);
			}
		}
	}
	
}