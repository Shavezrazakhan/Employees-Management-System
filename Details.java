
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Details implements ActionListener{

	JFrame jf;
	JLabel l1,l2;
	JButton b1,b2,b3,b4;
	
	Details(){
		jf=new JFrame("employee Details");
		jf.setBackground(Color.white);
		jf.setLayout(null);
	
	l1=new JLabel();
	l1.setBounds(0,0,700,500);
	l1.setLayout(null);
	ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/details.jpg"));
	l1.setIcon(i1);
	jf.add(l1);
	
	l2=new JLabel("Employee Details");
	l2.setBounds(430,20,200,40);
	l2.setFont(new Font("serif",Font.BOLD,15));
	l2.setForeground(Color.black);
	l1.add(l2);
	
	b1=new JButton("Add");
	b1.setBounds(420,80,100,40);
	b1.setFont(new Font("serif",Font.BOLD,15));
	b1.addActionListener(this);
	l1.add(b1);
	
	b2=new JButton("View");
	b2.setBounds(530,80,100,40);
	b2.setFont(new Font("serif",Font.BOLD,15));
	b2.addActionListener(this);
	l1.add(b2);
	
	b3=new JButton("Remove");
	b3.setBounds(420,140,100,40);
	b3.setFont(new Font("serif",Font.BOLD,15));
	b3.addActionListener(this);
	l1.add(b3);
	
	b4=new JButton("Update");
	b4.setBounds(530,140,100,40);
	b4.setFont(new Font("serif",Font.BOLD,15));
	b4.addActionListener(this);
	l1.add(b4);
	
	jf.setVisible(true);
	jf.setSize(700,500);
	jf.setLocation(450,200);
	
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1) {
			jf.setVisible(false);
			AddEmployee a=new AddEmployee();
		}
		if(ae.getSource()==b2) {
			jf.setVisible(false);
			ViewEmployee v=new ViewEmployee();
		}
		if(ae.getSource()==b3) {
			jf.setVisible(false);
		RemoveEmployee r=	new RemoveEmployee();
		}
		
		if(ae.getSource()==b4) {
			jf.setVisible(false);
		SearchEmployee s=	new SearchEmployee();
		}
	}
public static void main(String [] arg) {
	Details d= new Details();
}
}
