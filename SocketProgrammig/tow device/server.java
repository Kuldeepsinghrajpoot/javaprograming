import java.io.*;
import java.net.*;

public class server
{
    ServerSocket ss;
    Socket s;
    DataInputStream dis;
    DataOutputStream dos;
    public server()
    {
        try
        {
            System.out.println("Server Started");
            ss=new ServerSocket(1234);
            s=ss.accept();
            System.out.println(s);
            System.out.println("CLIENT CONNECTED");
            dis= new DataInputStream(s.getInputStream());
            dos= new DataOutputStream(s.getOutputStream());
            ServerChat();
        }
        catch(Exception e)
        {
             System.out.println(e);
        }
    }

    public static void main (String as[])
    {
         new server();
    }

    public void ServerChat() throws IOException
    {
         String str, s1;
         do
         {
             str=dis.readUTF();
             System.out.println("Client Message:"+str);
             BufferedReader br=new BufferedReader(new   InputStreamReader(System.in));
             s1=br.readLine();
             dos.writeUTF(s1);
             dos.flush();
         }
         while(!s1.equals("bye"));
    }
}