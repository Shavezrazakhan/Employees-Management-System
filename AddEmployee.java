
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.io.*;
public class AddEmployee implements ActionListener{

	JFrame jf;
	JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id15,id16,id17,lab,lab1;
	JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
	JButton b,b1,b2,b3;
	
	AddEmployee(int i){}
	AddEmployee(){
		
		jf=new JFrame("Add Employee");
		jf.setBackground(Color.white);
		jf.setLayout(null);
		
		id15=new JLabel();
		id15.setBounds(0,0,900,700);
		id15.setLayout(null);
		ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("icons/add_employee.jpg"));
		id15.setIcon(img);
		
		id8=new JLabel("New Employee Details");
		id8.setBounds(320,30,500,50);
		id8.setFont(new Font("serif",Font.ITALIC,25));
		id8.setForeground(Color.black);
		id15.add(id8);
		jf.add(id15);
		
		id1=new JLabel("Name");
		id1.setFont(new Font("serif",Font.BOLD,20));
		id1.setBounds(50,150,100,30);
		id15.add(id1);
		
	t1=new JTextField();
	t1.setBounds(200,150,150,30);
	id15.add(t1);
		
	id2=new JLabel("Fathers's Name");
	id2.setBounds(400,150,200,30);
	id2.setFont(new Font("serif",Font.BOLD,20));
	id15.add(id2);
	
t2=new JTextField();
t2.setBounds(600,150,150,30);
id15.add(t2);

id3=new JLabel("Age");
id3.setFont(new Font("serif",Font.BOLD,20));
id3.setBounds(50,200,100,30);
id15.add(id3);

t3=new JTextField();
t3.setBounds(200,200,150,30);
id15.add(t3);

id4=new JLabel("Date of Birth");
id4.setFont(new Font("serif",Font.BOLD,20));
id4.setBounds(400,200,200,30);
id15.add(id4);

t4=new JTextField();
t4.setBounds(600,200,150,30);
id15.add(t4);

id5=new JLabel("Address");
id5.setFont(new Font("serif",Font.BOLD,20));
id5.setBounds(50,250,100,30);
id15.add(id5);

t5=new JTextField();
t5.setBounds(200,250,150,30);
id15.add(t5);

id6=new JLabel("Phone");
id6.setFont(new Font("serif",Font.BOLD,20));
id6.setBounds(400,250,100,30);
id15.add(id6);

t6=new JTextField();
t6.setBounds(600,250,150,30);
id15.add(t6);

id7=new JLabel("Email Id");
id7.setFont(new Font("serif",Font.BOLD,20));
id7.setBounds(50,300,100,30);
id15.add(id7);

t7=new JTextField();
t7.setBounds(200,300,150,30);
id15.add(t7);

id9=new JLabel("Education");
id9.setFont(new Font("serif",Font.BOLD,20));
id9.setBounds(400,300,100,30);
id15.add(id9);

t8=new JTextField();
t8.setBounds(600,300,150,30);
id15.add(t8);

id10=new JLabel("Job Post");
id10.setFont(new Font("serif",Font.BOLD,20));
id10.setBounds(50,350,100,30);
id15.add(id10);

t9=new JTextField();
t9.setBounds(200,350,150,30);
id15.add(t9);

id11=new JLabel("Aadhar no.");
id11.setFont(new Font("serif",Font.BOLD,20));
id11.setBounds(400,350,100,30);
id15.add(id11);

t10=new JTextField();
t10.setBounds(600,350,150,30);
id15.add(t10);
	
id12=new JLabel("Employee Id");
id12.setFont(new Font("serif",Font.BOLD,20));
id12.setBounds(50,400,150,30);
id15.add(id12);

t11=new JTextField();
t11.setBounds(200,400,150,30);
id15.add(t11);
	
	lab=new JLabel();
	lab.setBounds(200,450,250,200);
	id15.add(lab);
	
	lab1=new JLabel();
	lab1.setBounds(200,450,250,200);
	id15.add(lab1);

	b=new JButton("Submit");
	b.setBackground(Color.black);
	b.setForeground(Color.white);
	b.setBounds(250,450,150,40);
	
	id15.add(b);
	
	b1=new JButton("Cancel");
	b1.setBackground(Color.black);
	b1.setForeground(Color.white);
	b1.setBounds(450,450,150,40);

	id15.add(b1);
	
	b.addActionListener(this);
	b1.addActionListener(this);
	
	jf.setVisible(true);
	jf.setSize(900,600);
	jf.setLocation(300,100);
	
	}
	@Override
	public void actionPerformed(ActionEvent ae) {

		String a=t1.getText();
		String bb=t2.getText();
		String c=t3.getText();
		String d=t4.getText();
		String e=t5.getText();
		String ff=t6.getText();
		String g=t7.getText();
		String h=t8.getText();
		String i=t9.getText();
		String j=t10.getText();
		String k=t11.getText();
		
		if(ae.getSource()==b) {
			try {
				Conn con=new Conn();
			    String q="insert into employee values('"+a+"','"+bb+"','"+c+"','"+d+"','"+e+"','"+ff+"','"+g+"','"+h+"','"+i+"','"+j+"','"+k+"')";
			con.s.executeUpdate(q);
			
			jf.setVisible(false);
			JOptionPane.showMessageDialog(null, "Details successfully Inserted");
			new Details();
			
			
			}catch(Exception ee) {
				ee.printStackTrace();
			}
			
		
		}		else if(ae.getSource()==b1) {
			jf.setVisible(false);
			new Details();
		}
	}
public static void main (String [] args) {
AddEmployee aaa=new AddEmployee();
}
}
