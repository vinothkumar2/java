import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class calculator implements ActionListener
{
public static JTextField t1,t2;
int i;
Float n1,n2,res;
public static void main(String[] args)
{
createWindow();
}
private static void createWindow()
{
JFrame j = new JFrame("MY CALCULATOR");
j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
j.setLayout(new GridLayout(5,4));
j.setSize(400,250);
j.setVisible(true);
createUI(j);
}
private static void createUI(JFrame j){
calculator c=new calculator();
t1=new JTextField(30);
t2=new JTextField(30);
JButton b1=new JButton("1"); j.add(b1);
JButton b2=new JButton("2"); j.add(b2);
JButton b3=new JButton("3"); j.add(b3);
JButton b4=new JButton("4"); j.add(b4);
JButton b5=new JButton("5"); j.add(b5);
JButton b6=new JButton("6"); j.add(b6);
JButton b7=new JButton("7"); j.add(b7);
JButton b8=new JButton("8"); j.add(b8);
JButton b9=new JButton("9"); j.add(b9);
JButton b0=new JButton("0"); j.add(b0);
JButton dot=new JButton("."); j.add(dot);
JButton equ=new JButton("="); j.add(equ);
JButton add=new JButton("+"); j.add(add);
JButton sub=new JButton("_"); j.add(sub);
JButton mul=new JButton("*"); j.add(mul);
JButton div=new JButton("/"); j.add(div);
JButton cle=new JButton("CLEAR"); j.add(cle);
j.add(t1); j.add(t2);
b1.addActionListener(c);
b2.addActionListener(c);
b3.addActionListener(c);
b4.addActionListener(c);
b5.addActionListener(c);
b6.addActionListener(c);
b7.addActionListener(c);
b8.addActionListener(c);
b9.addActionListener(c);b0.addActionListener(c);
add.addActionListener(c);
sub.addActionListener(c);
div.addActionListener(c);
mul.addActionListener(c);
equ.addActionListener(c);
cle.addActionListener(c);
dot.addActionListener(c);
}
public void actionPerformed(ActionEvent e)
{
String c= e.getActionCommand();
String d=t1.getText();
if(c==("1")){t1.setText(d+"1");}
if(c==("2")){t1.setText(d+"2");}
if(c==("3")){t1.setText(d+"3");}
if(c==("4")){t1.setText(d+"4");}
if(c==("5")){t1.setText(d+"5");}
if(c==("6")){t1.setText(d+"6");}
if(c==("7")){t1.setText(d+"7");}
if(c==("8")){t1.setText(d+"8");}
if(c==("9")){t1.setText(d+"9");}
if(c==("0")){t1.setText(d+"0");}
if(c==(".")){t1.setText(d+".");}
if(c==("CLEAR")){t1.setText(""); t2.setText("");}
if(c==("+"))
{
n1=Float.parseFloat(t1.getText());
t1.setText("");
i=1;
}
if(c==("_")){
n1=Float.parseFloat(t1.getText());
t1.setText("");
i=2;
}
if(c==("*"))
{
n1=Float.parseFloat(t1.getText());
t1.setText("");
i=3;
}
if(c==("/"))
{
n1=Float.parseFloat(t1.getText());
t1.setText("");
i=4;
}
if(c==("="))
{
n2=Float.parseFloat(t1.getText());
switch(i)
{
case 1:
res=n1+n2;
t1.setText(n1+" + "+n2);
t2.setText("= "+res);
break;
case 2:
res=n1-n2;
t1.setText(n1+" - "+n2);
t2.setText("= "+res);
break;case 3:
res=n1*n2;
t1.setText(n1+" * "+n2);
t2.setText("= "+res);
break;
case 4:
res=n1/n2;
t1.setText(n1+" / "+n2);
t2.setText("= "+res);
break;
}
}
}
}
