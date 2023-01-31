import java.io.IOException;
import java.net.ServerSocket;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
public class server{
	public static void main(String args[]) throws IOException{
		ServerSocket s1 = new ServerSocket(12345);
		// this is a port number inset in th breaket
		Socket ss =s1.accept();
		Scanner sc = new Scanner(ss.getInputStream());
		int number = sc.nextInt();
		int temp = number*2;
		PrintStream p  = new PrintStream(ss.getOutputStream());
		p.println(temp);
	}
}