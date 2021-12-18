import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/* <applet code="Student" height=400 width=700></applet> */
public class Student extends Applet implements ActionListener
{
TextField t1,t2;
Label l1,l2;
Button b1;
TextArea ta;
public void init()
{
t1= new TextField(15);
t2= new TextField(15);
ta=new TextArea();
l1= new Label("NAME : ");
l2= new Label("ROLL NO : ");
b1= new Button("SUBMIT");
add(t1);
add(t2);
add(l1);
add(l2);
add(b1);
add(ta);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
String s1="NAME : "+t1.getText()+"\n ROLL NO : "+t2.getText();ta.setText(s1);
repaint();
}
public void paint(Graphics g)
{
l1.setBounds(5,5,100,25);
t1.setBounds(115,5,100,25);
l2.setBounds(5,31,100,25);
t2.setBounds(115,31,100,25);
b1.setBounds(5,57,100,25);
ta.setBounds(5,90,600,200);
}
}
