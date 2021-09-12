
import java.awt.*;
import javax.swing.*;
import java.lang.Thread;
import java.awt.event.*;
public class FrontPage implements ActionListener {

	JFrame jf;
	JLabel id,l1;
	JButton b;
	
	FrontPage(){
		
		jf=new JFrame("Employee Management System");
		jf.setBackground(Color.red);
		jf.setLayout(null);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
		Image i2=i1.getImage().getScaledInstance(1200, 700,Image.SCALE_DEFAULT);
	    ImageIcon i3=new ImageIcon(i2);
		JLabel l1=new JLabel(i3);
		
		l1.setBounds(-40,150,1360,530);
		jf.add(l1);

	b=new JButton("CLICK HERE TO CONTINUE");
	b.setBackground(Color.black);
	b.setForeground(Color.white);
	
	b.setBounds(500,600,300,70);
	b.addActionListener(this);
	
	id=new JLabel();
	id.setBounds(0,0,1360,750);
	id.setLayout(null);
	
	JLabel lid=new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
	lid.setBounds(50,30,1360,100);
	lid.setFont(new Font("serif",Font.PLAIN,70));
	lid.setForeground(Color.red);
	id.add(lid);
	
	id.add(b);
	jf.add(id);
	
	jf.getContentPane().setBackground(Color.white);
	
	jf.setVisible(true);
	jf.setSize(1360,750);
 
	
	while(true) {
		lid.setVisible(false);   //lid =  j label
		try {
			Thread.sleep(500);   //1000= 1 second
			
		}catch(Exception e) {}
		
		lid.setVisible(true);
		
		try {
			Thread.sleep(500);
			
			
		}catch(Exception e) {}
	
	}
	
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
if(ae.getSource()==b) {		
	jf.setVisible(false);
	
 new Login();
}
		
	}

	public static void main (String []args) {
FrontPage f=new FrontPage();
	}
}
