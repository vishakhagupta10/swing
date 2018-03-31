package frametype;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminReceptionistdelete extends JFrame implements ActionListener
{
	Container c;
	int count=0;
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JButton b1;
	JTextField t1,t2,t3,t4;
	JComboBox cb;
	JMenuBar mb1,mb2,mb3,mb4;
	
	public AdminReceptionistdelete()
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
		l3 = new JLabel("Delete entry");
		l3.setBounds(100, 80, 500, 50);
		l3.setForeground(Color.BLACK);
		l3.setFont(new Font("GILL SANS", Font.BOLD ,40));
		c.add(l3);

		l1 = new JLabel("enter id");
		l1.setForeground(Color.black);
		l1.setBounds(100,180, 200, 30);
		l1.setFont(new Font("forte", Font.BOLD , 24));
		
		
		t1 = new JTextField();
		t1.setBounds(400,180,200,30);
		
				b1 = new JButton("delete");
		b1.setBackground(Color.orange);
		b1.setForeground(Color.black);
		b1.setBounds(300,400,200,30);
		b1.setFont(new Font("forte", Font.BOLD , 24));
		b1.addActionListener(this);
		c.add(l1);
		//c.add(l2);
		//c.add(l3);
		//c.add(l5);
		//c.add(l7);
		//c.add(l4);
		c.add(b1);
		c.add(t1);
		//c.add(t2);
		//c.add(t3);
		//c.add(t4);
		//c.add(cb);
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
			String s = t1.getText().trim();
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","vishakha","cdac");
				PreparedStatement ps=con.prepareStatement("select receptionist_id from receptionist");
				ResultSet rs = ps.executeQuery();
				while(rs.next())
				{
					if(s.equals(rs.getString(1).trim()))
					{
						
						try
						{
							
							Class.forName("oracle.jdbc.driver.OracleDriver");
							Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","vishakha","cdac");
							PreparedStatement ps1=con1.prepareStatement("delete from receptionist where receptionist_id= ?");
							ps1.setString(1, t1.getText().trim());
							int i = ps1.executeUpdate();
							count=1;
							
							JOptionPane.showMessageDialog(this,i+ "record delete!!");
							
							con1.close();
						}
						catch(Exception e3)
						{
							System.out.println(e3);
						}	

					}
				}
			
				
						if(count==0)
						{
							JOptionPane.showMessageDialog(this,"invalid!!");

						}
											
				
					con.close();
			}
			catch(Exception e2)
			{
				System.out.println(e2);
			}
		}
		
	}
}


