import java.net.*;
import java.io.*;
public class DClient
{
public static void main(String args[])
{
try
{
Socket socket = new Socket("127.0.0.1", 5000);
System.out.println("Server Connected");
BufferedReader in=new BufferedReader(new
InputStreamReader(socket.getInputStream() ));
System.out.println(in.readLine());
in.close();
socket.close();
}
catch(Exception i)
{
System.out.println(i);
}
}
}