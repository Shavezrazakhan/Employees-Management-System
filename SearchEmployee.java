
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class SearchEmployee implements ActionListener{

	JFrame jf;
	JTextField t;
	JLabel l1,l5;
	JButton b,b2;
	SearchEmployee(){
		jf=new JFrame("Search");
		jf.setBackground(Color.green);
		jf.setLayout(null);
		
		l5=new JLabel();
		l5.setBounds(0,0,500,270);
		l5.setLayout(null);
		ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("icons/view.jpg"));
		l5.setIcon(img);
		
		l1=new JLabel("Employee Id");
		l1.setVisible(true);
		l1.setBounds(40,50,250,30);
		l1.setForeground(Color.white);
		Font f1=new Font("serif",Font.BOLD,25);
		l1.setFont(f1);
		l5.add(l1);
		jf.add(l5);
		
		t=new JTextField();
		t.setBounds(240,50,220,30);
		l5.add(t);
		
		b=new JButton("Search");
		b.setBounds(240,150,100,30);
		b.addActionListener(this);
		l5.add(b);
		
		b2=new JButton("Cancel");
		b2.setBounds(360,150,100,30);
		b2.addActionListener(this);
		l5.add(b2);
		
		jf.setSize(500,270);
		jf.setLocation(450,250);
		jf.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource()==b2) {
		jf.setVisible(false);
		Details d=new Details();
		
	}
	if(e.getSource()==b) {	
		new UpdateEmployee(t.getText());
		jf.setVisible(false);
		
	}
	
	}
public static void main(String args[]) {
	new SearchEmployee();
}
}
