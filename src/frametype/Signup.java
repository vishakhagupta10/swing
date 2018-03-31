package frametype;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Signup extends JFrame implements ActionListener
{
	//int flag = 0;
	Container c;
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JButton b1;
	JTextField t1,t2,t3,t4;
	JComboBox cb;
	JMenuBar mb1,mb2,mb3,mb4;
	public Signup()
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
		l3 = new JLabel("SIGNUP");
		l3.setBounds(250, 80, 200, 60);
		l3.setForeground(Color.BLACK);
		l3.setFont(new Font("GILL SANS", Font.BOLD ,50));
		c.add(l3);
				l1 = new JLabel("username:");
		l1.setForeground(Color.BLACK);
		l1.setBounds(100,180, 200, 30);
		l1.setFont(new Font("forte", Font.BOLD , 24));
		l2 = new JLabel("password:");
		l2.setForeground(Color.black);
		l2.setBounds(100, 240, 200, 30);
		l2.setFont(new Font("forte", Font.BOLD , 24));
		l5 = new JLabel("Confirm Password:");
		l5.setForeground(Color.black);
		l5.setBounds(100, 300, 250, 30);
		l5.setFont(new Font("forte", Font.BOLD , 24));
		l6= new JLabel("Security Question:");
		l6.setForeground(Color.black);
		l6.setBounds(100, 360, 250, 30);
		l6.setFont(new Font("forte", Font.BOLD , 24));
		l7 = new JLabel("Security Answer:");
		l7.setForeground(Color.black);
		l7.setBounds(100, 420, 250, 30);
		l7.setFont(new Font("forte", Font.BOLD , 24));
				t1 = new JTextField();
		t1.setBounds(400,180,200,30);
		t2 = new JTextField();
		t2.setBounds(400,240,200,30);
		t3 = new JTextField();
		t3.setBounds(400,300,200,30);
		t4 = new JTextField();
		t4.setBounds(400,420,200,30);
		cb = new JComboBox();
		cb.setBounds(400,360,200,30);
		cb.addItem("who is your favourite movie");
		cb.addItem("who is your favourite actor/actress");
		cb.addItem("who is your favourite book");
		cb.addItem("what is your nickname");
		cb.addItem("what is your favourite colour");
		cb.addActionListener(this);
		b1 = new JButton("next");
		b1.setBackground(Color.orange);
		b1.setForeground(Color.black);
		b1.setBounds(400,480,200,30);
		b1.addActionListener(this);
		c.add(l1);
		c.add(l2);
		c.add(l6);
		c.add(l5);
		c.add(l7);
		//c.add(l4);
		c.add(b1);
		c.add(t1);
		c.add(t2);
		c.add(t3);
		c.add(t4);
		c.add(cb);
		c.setBackground(Color.WHITE);
		setSize(700,600);
		setTitle("Register");
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	public static void main(String[] args)
	{
		Signup ob = new Signup();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","vishakha","cdac");
				PreparedStatement ps=con.prepareStatement("insert into log_in values(?,?,?,?,?)");
				ps.setString(1,t1.getText());
				ps.setString(2,t2.getText());
				ps.setString(3,t3.getText());
				ps.setString(4,(String)cb.getSelectedItem());
				ps.setString(5,t4.getText());
				//ps.setInt(3,25000);
				int i=ps.executeUpdate();
				//System.out.println(" record updated!");
				//JOptionPane.showMessageDialog(this, "record updated!!");
				con.close();
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}

		
			
			if(t1.getText().trim().equals("")||t2.getText().trim().equals("")||t3.getText().trim().equals("")||t4.getText().trim().equals(""))
			{
				JOptionPane.showMessageDialog(this, "all fields compulsory!");
				//break;
			}
			else
			{
				if((t2.getText()).equals(t3.getText()))
				{
										
					JOptionPane.showMessageDialog(this,"Successfully signed in");
					
				}
				else
				{
					JOptionPane.showMessageDialog(this, "incorrect password! retry!");
					//break;
				}	
			}
			
			
				
				//int i=ps.executeUpdate();
				//System.out.println(i+" record updated!");
				//JOptionPane.showMessageDialog(this,i+ "record updated!!");
				
				//con.close();
			}
			/*catch(Exception e1)
			{
				System.out.println(e1);
			}*/
			//new NewRegister();
		}
		
		
	}


