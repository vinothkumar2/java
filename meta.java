import java.sql.*;
class meta
{
public static void main(String arg[])
{
try
{
String url="jdbc:ucanaccess://D:\\Java\\login.mdb";
Connection con = DriverManager.getConnection(url,"","");
DatabaseMetaData dbmd = con.getMetaData();
System.out.println("Drive Name : "+dbmd.getDriverName());
System.out.println("Drive Version : "+dbmd.getDriverVersion());
System.out.println("User Version : "+dbmd.getUserName());
System.out.println("Database Product Name : "+dbmd.getDatabaseProductName());
System.out.println("Database Product Version : "+dbmd.getDatabaseProductVersion());
con.close();
}
catch(Exception e){ System.out.println(e);}
}
}
