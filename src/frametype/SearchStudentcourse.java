package frametype;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SearchStudentcourse extends JFrame implements ActionListener
{
	Container c;
	int count=0;
	int flag =0;
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JButton b1;
	JTextField t1,t2,t3,t4;
	JComboBox cb;
	JMenuBar mb1,mb2,mb3,mb4;
	String id;
	public SearchStudentcourse()
		{
		c = this.getContentPane();
		c.setLayout(null);
		mb1 = new JMenuBar();
		
		mb1.setBounds(0,0,700,30);
		mb1.setBackground(Color.orange);
		c.add(mb1);
		
		mb2 = new JMenuBar();
		
		mb2.setBounds(0,30,30,600);
		mb2.setBackground(Color.orange);
		c.add(mb2);
		mb3 = new JMenuBar();
		
		mb3.setBounds(0,535,700,30);
		mb3.setBackground(Color.orange);
		c.add(mb3);
		mb4 = new JMenuBar();
		
		mb4.setBounds(655,30,30,540);
		mb4.setBackground(Color.orange);
		c.add(mb4);
		l3 = new JLabel("Search Entry");
		l3.setBounds(100, 80, 500, 50);
		l3.setForeground(Color.BLACK);
		l3.setFont(new Font("GILL SANS", Font.BOLD ,40));
		c.add(l3);

		l1 = new JLabel("enter course");
		l1.setForeground(Color.black);
		l1.setBounds(100,180, 200, 30);
		l1.setFont(new Font("forte", Font.BOLD , 24));
		
		
		t1 = new JTextField();
		t1.setBounds(400,180,200,30);
		
				b1 = new JButton("Search");
		b1.setBackground(Color.orange);
		b1.setForeground(Color.black);
		b1.setBounds(300,400,200,30);
		b1.setFont(new Font("forte", Font.BOLD , 24));
		b1.addActionListener(this);
		c.add(l1);
		
		c.add(b1);
		c.add(t1);
		
		c.setBackground(Color.WHITE);
		setSize(700,600);
		setTitle("Register");
		setLocationRelativeTo(null);
		setVisible(true);
		


	}
/*	public static void main(String[] args)
	{
		ForgetPass ob = new ForgetPass();
	}*/

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			id=t1.getText().trim();
			
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","vishakha","cdac");
				PreparedStatement ps=con.prepareStatement("select course_name from student ");
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					if(id.equals(rs.getString(1).trim()))
					{
						flag=1;
						
						break;						
					}
					
				}
				con.close();
				
				
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
			
			if(flag==1)
			{
				new SearchStudentcoursedisp(id);
				flag=0;
			}
			else
			{
				JOptionPane.showMessageDialog(null,"User not found !");
				flag=0;
			}
		}
		// TODO Auto-generated method stub
				}
		
	}



