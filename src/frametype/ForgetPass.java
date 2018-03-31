package frametype;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ForgetPass extends JFrame implements ActionListener
{
	Container c;
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JButton b1;
	JTextField t1,t2,t3,t4;
	JComboBox cb;
	JMenuBar mb1,mb2,mb3,mb4;
	
	public ForgetPass()
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
		l3 = new JLabel("RETRIVE PASSWORD");
		l3.setBounds(100, 80, 500, 50);
		l3.setForeground(Color.BLACK);
		l3.setFont(new Font("GILL SANS", Font.BOLD ,40));
		c.add(l3);

		l1 = new JLabel("id:");
		l1.setForeground(Color.black);
		l1.setBounds(100,180, 200, 30);
		l1.setFont(new Font("forte", Font.BOLD , 24));
		l2 = new JLabel("username");
		l2.setForeground(Color.black);
		l2.setBounds(100, 240, 200, 30);
		l2.setFont(new Font("forte", Font.BOLD , 24));
		/*l5 = new JLabel("Security Answer:");
		l5.setForeground(Color.black);
		l5.setBounds(100, 300, 200, 30);
		l5.setFont(new Font("forte", Font.BOLD , 24));*/
		
				t1 = new JTextField();
		t1.setBounds(400,180,200,30);
		t2 = new JTextField();
		t2.setBounds(400,240,200,30); 
		
	/*	cb = new JComboBox();
		cb.setBounds(400,240,200,30);
		cb.addItem("who is your favourite movie");
		cb.addItem("who is your favourite actor/actress");
		cb.addItem("who is your favourite book");
		cb.addItem("what is your nickname");
		cb.addItem("what is your favourite colour");
		cb.addActionListener(this);*/
		b1 = new JButton("retrive");
		b1.setBackground(Color.orange);
		b1.setForeground(Color.black);
		b1.setBounds(300,400,200,30);
		b1.setFont(new Font("forte", Font.BOLD , 24));
		b1.addActionListener(this);
		c.add(l1);
		c.add(l2);
		c.add(l3);
		//c.add(l5);
		//c.add(l7);
		//c.add(l4);
		c.add(b1);
		c.add(t1);
		c.add(t2);
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
			String id = t1.getText().trim();
			//String q = ((String)cb.getSelectedItem()).trim();
			String name = t2.getText().trim();
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","vishakha","cdac");
				PreparedStatement ps=con.prepareStatement("select * from receptionist");
				ResultSet rs = ps.executeQuery();
				while(rs.next())
				{
					if(id.equals(rs.getString(1).trim()))
					{
						if(name.equals(rs.getString(2).trim()) )
						{
						//t2.setText(rs.getString(2));
							JOptionPane.showMessageDialog(this,rs.getString(5)+ "  was your password!");
							break;
						}
						else
						{
							JOptionPane.showMessageDialog(this, "incorrect name");
							break;
						}
					}
					else
					{
						JOptionPane.showMessageDialog(this, "incorrect id!!");
						break;
					}
				}
				
				con.close();
			}
			catch(Exception e3)
			{
				System.out.println(e3);
			}

		}
		
	}

}
