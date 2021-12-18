importjava.sql.*;
import java.io.*;
public class {
public static void main(String arg[])
{
DataInputStream in=new DataInputStream(System.in);
intx,roll,ch;
String sql="",url="",name="";
try{
url="jdbc:ucanaccess://E:\\JAVA\\MyData.accdb";
Connection con = DriverManager.getConnection(url,"","");
PreparedStatementpstm = null;
ResultSetrs=null;
do
{
System.out.println("\n 1)INSERT \t 2) VIEW \n 3)DELETE \t 4)UPDATE \n \t 5) EXIT \n");
x=Integer.parseInt(in.readLine());
System.out.println("------------------------------- \n");
switch (x) {
case 1:
System.out.println("\n Enter Student Name : ");
name=in.readLine();
System.out.println("\n Enter Student Roll No : ");
roll=Integer.parseInt(in.readLine());
sql = "Insert into student(NAME,ROLL) values(?,?)";
pstm = con.prepareStatement(sql);pstm.setString(1, name)
pstm.setInt(2, roll);
ch=pstm.executeUpdate();
if (ch>0)
System.out.println("Inserted Successfully");
else
System.out.println("insertion Failed");
break;
case 2:
System.out.println("STUDENT DETAILS \n");
sql = "select * from student";
pstm = con.prepareStatement(sql);
rs = pstm.executeQuery();
while (rs.next())
{
System.out.println("Name : "+rs.getString("Name"));
System.out.println("Roll No : "+rs.getInt("Roll")+"\n");
}
break;
case 3:
System.out.println("Enter the Student ID to Delete : ");
roll=Integer.parseInt(in.readLine());
sql="delete from student where ROLL='"+roll+"'";
pstm = con.prepareStatement(sql);
ch=pstm.executeUpdate();
if (ch>0)
System.out.println("Deleted Successfully");
else
System.out.println("Failed to Delete");
break;case 4:
System.out.println("Enter the Student ID to Update : ");
roll=Integer.parseInt(in.readLine());
System.out.println("Enter the Student Name : ");
name=in.readLine();
sql="update student set NAME='"+name+"' where ROLL='"+roll+"'";
pstm = con.prepareStatement(sql);
ch=pstm.executeUpdate();
if (ch>0)
System.out.println("Updated Successfully");
else
System.out.println("Failed to Update");
break;
case 5:
pstm.close();
con.close();
break;
}
}while(x!=5);
}catch(Exception e)
{ System.out.println("\n"+e); }
}
}importjava.sql.*;
import java.io.*;
public class {
public static void main(String arg[])
{
DataInputStream in=new DataInputStream(System.in);
intx,roll,ch;
String sql="",url="",name="";
try{
url="jdbc:ucanaccess://E:\\JAVA\\MyData.accdb";
Connection con = DriverManager.getConnection(url,"","");
PreparedStatementpstm = null;
ResultSetrs=null;
do
{
System.out.println("\n 1)INSERT \t 2) VIEW \n 3)DELETE \t 4)UPDATE \n \t 5) EXIT \n");
x=Integer.parseInt(in.readLine());
System.out.println("------------------------------- \n");
switch (x) {
case 1:
System.out.println("\n Enter Student Name : ");
name=in.readLine();
System.out.println("\n Enter Student Roll No : ");
roll=Integer.parseInt(in.readLine());
sql = "Insert into student(NAME,ROLL) values(?,?)";
pstm = con.prepareStatement(sql);pstm.setString(1, name)
pstm.setInt(2, roll);
ch=pstm.executeUpdate();
if (ch>0)
System.out.println("Inserted Successfully");
else
System.out.println("insertion Failed");
break;
case 2:
System.out.println("STUDENT DETAILS \n");
sql = "select * from student";
pstm = con.prepareStatement(sql);
rs = pstm.executeQuery();
while (rs.next())
{
System.out.println("Name : "+rs.getString("Name"));
System.out.println("Roll No : "+rs.getInt("Roll")+"\n");
}
break;
case 3:
System.out.println("Enter the Student ID to Delete : ");
roll=Integer.parseInt(in.readLine());
sql="delete from student where ROLL='"+roll+"'";
pstm = con.prepareStatement(sql);
ch=pstm.executeUpdate();
if (ch>0)
System.out.println("Deleted Successfully");
else
System.out.println("Failed to Delete");
break;case 4:
System.out.println("Enter the Student ID to Update : ");
roll=Integer.parseInt(in.readLine());
System.out.println("Enter the Student Name : ");
name=in.readLine();
sql="update student set NAME='"+name+"' where ROLL='"+roll+"'";
pstm = con.prepareStatement(sql);
ch=pstm.executeUpdate();
if (ch>0)
System.out.println("Updated Successfully");
else
System.out.println("Failed to Update");
break;
case 5:
pstm.close();
con.close();
break;
}
}while(x!=5);
}catch(Exception e)
{ System.out.println("\n"+e); }
}
}
