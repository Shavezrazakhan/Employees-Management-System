
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class ViewEmployee implements ActionListener{

	JFrame jf;
	JTextField t;
	JLabel l1,l2;
	JButton b1,b2;
	
	ViewEmployee(){
		jf=new JFrame("View");
		jf.setBackground(Color.green);
		jf.setLayout(null);
	
	l1=new JLabel();
	l1.setBounds(0,0,500,270);
	l1.setLayout(null);
	ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("icons/view.jpg"));
	l1.setIcon(img);
	
	l2=new JLabel("Employee Id");
	l2.setVisible(true);
	l2.setBounds(40,60,250,30);
     l2.setForeground(Color.white);
     Font f1=new Font("serif",Font.BOLD,30);
     l2.setFont(f1);
     l1.add(l2);
     jf.add(l1);
	
     t=new JTextField();
     t.setBounds(240,60,220,30);
     l1.add(t);
     
     b1=new JButton("Search");
     b1.setBounds(240,150,100,30);
     b1.addActionListener(this);
     l1.add(b1);
     
     b2=new JButton("Cancel");
     b2.setBounds(360,150,100,30);
     b2.addActionListener(this);
     l1.add(b2);
     
     jf.setSize(500,270);
     jf.setLocation(450,250);
     jf.setVisible(true);
     
     
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b2) {
			jf.setVisible(false);
			Details d=new Details();
		}
		
		if(ae.getSource()==b1) {
			jf.setVisible(false);
			PrintData p=new PrintData(t.getText());
		}
		
	}
	public static void main(String[] args) {

		ViewEmployee v=new ViewEmployee();
		
	}

}
