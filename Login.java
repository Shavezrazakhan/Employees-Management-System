
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class Login implements ActionListener {
JFrame jf;
JTextField  t1;
JLabel l1,l2,l3;
JPasswordField t2;
JButton b1,b2;
Login(){
	jf=new JFrame("Login");
	
	jf.setBackground(Color.white);
	jf.setLayout(null);

l1=new JLabel("User name");
l1.setBounds(40, 20, 100, 30);
jf.add(l1);

l2=new JLabel("Password");
l2.setBounds(40, 70, 100, 30);
jf.add(l2);

t1=new JTextField();
t1.setBounds(150,20,150,30);
jf.add(t1);

t2=new JPasswordField();
t2.setBounds(150, 70, 150, 30);
jf.add(t2);

ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg"));
Image i2=i1.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
ImageIcon i3=new ImageIcon(i2);
l3=new JLabel(i3);
l3.setBounds(350,20,150,150);
jf.add(l3);

b1=new JButton("Login");
b1.setBounds(40,140,120,30);
b1.setFont(new Font("serif",Font.BOLD,15));
b1.addActionListener(this);
b1.setBackground(Color.BLACK);
b1.setForeground(Color.white);
jf.add(b1);

b2=new JButton("Cancel");
b2.setBounds(180,140,120,30);
b2.setFont(new Font("serif",Font.BOLD,15));
b2.setBackground(Color.BLACK);
b2.setForeground(Color.white);
jf.add(b2);

b2.addActionListener(this);

jf.getContentPane().setBackground(Color.white);

jf.setVisible(true);
jf.setSize(600,300);
jf.setLocation(400,300);
}
public void actionPerformed(ActionEvent ae) {
	
try {	
	Conn c1=new Conn();
	String u= t1.getText();
	String v= t2.getText();
	String q="select * from login where username='"+u+"' and password='"+v+"'";
	ResultSet rs=c1.s.executeQuery(q);
if(rs.next()) {
	new Details().jf.setVisible(true);
jf.setVisible(false);

}
else {
	JOptionPane.showMessageDialog(null, "Invalid login");
	jf.setVisible(false);
}
}
catch(Exception e) {
	e.printStackTrace();
	
}

}
public static void main(String[] arg) {
Login l=	new Login();
}
}

