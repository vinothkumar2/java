import java.net.*;
import java.io.*;
import java.util.*;
public class DServer
{
public static void main(String args[])
{
try
{
ServerSocket server = new ServerSocket(5000);
System.out.println("Server started");
System.out.println("Waiting for a client ...");
Socket socket = server.accept();
System.out.println("Client accepted");
DataOutputStream out =new DataOutputStream(socket.getOutputStream());
while (true)
{
out.writeBytes("Server Date: " + (new Date()).toString() + "\n");
out.close(); socket.close();
}
}
catch(Exception i){ System.out.println(i);
}
}
}