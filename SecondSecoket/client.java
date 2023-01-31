import java.util.Scanner;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.IOException;
public class client{
	public static void main(String args[]) throws UnknownHostException, IOException{
		Scanner sc = new Scanner(System.in);
		Socket s = new Socket("192.168.43.5",129);
		// first is ip address and second is port number
		
		Scanner sc1 = new Scanner(s.getInputStream());
		System.out.println("Enter the any number");
		int number = sc.nextInt();
		PrintStream p= new PrintStream(s.getOutputStream());
		p.println(number);
		int temp = sc1.nextInt();
		System.out.println(temp);
	}
	
}