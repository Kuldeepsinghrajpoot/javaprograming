import java.io.IOException;
import java.net.ServerSocket;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
public class server{
	public static void main(String args[]) throws IOException{
		ServerSocket s1 = new ServerSocket(1234);
		// this is a port number inset in th breaket
		Socket ss =s1.accept();
		Scanner sc = new Scanner(ss.getInputStream());
		int temp = sc.nextLine();
		
		PrintStream p  = new PrintStream(ss.getOutputStream());
		p.println(temp);
	}
}