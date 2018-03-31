package frametype;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class AdminReceptionist extends JFrame implements ActionListener
{
	Container c;
	int id = 0;
	JMenuBar mb1,mb2,mb3,mb4;
	JLabel l1,t1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,la;
	JTextField t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t13,t15,ta;
	JTextArea t12;
	JRadioButton r1,r2,r3,r4,r5,r6,r7;
	JCheckBox c1,c2,c3,c4,c5;
	JComboBox cb1,cb2,cb3,cb4;
	JButton b1,b2,b3;
	public AdminReceptionist()
	{
		c=this.getContentPane();
		c.setLayout(null);
		mb1 = new JMenuBar();
		
		mb1.setBounds(0,0,700,30);
		mb1.setBackground(Color.orange);
		c.add(mb1);
		
		mb2 = new JMenuBar();
		
		mb2.setBounds(0,30,30,700);
		mb2.setBackground(Color.orange);
		c.add(mb2);
		mb3 = new JMenuBar();
		
		mb3.setBounds(0,635,700,30);
		mb3.setBackground(Color.orange);
		c.add(mb3);
		mb4 = new JMenuBar();
		
		mb4.setBounds(655,30,30,640);
		mb4.setBackground(Color.orange);
		c.add(mb4);

		l1 = new JLabel("Receptionist id:");
		l1.setBounds(50,50,100,30);
		c.add(l1);
		t1 = new JLabel();
		t1.setBounds(150,50,200,30);
		c.add(t1);
		try
		{
			if(id ==0)
			{
							Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","vishakha","cdac");
			PreparedStatement ps=con.prepareStatement("select receptionist_id from receptionist");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				id= rs.getInt(1);
			}
			id++;
			t1.setText(""+id);
			}
		
		}
			catch(Exception e2)
			{
				System.out.println(e2);
			}
		l2 = new JLabel("name");
		l2.setBounds(50,90,50,30);
		c.add(l2);
		t2 = new JTextField();
		t2.setBounds(150,90,200,30);
		c.add(t2);
	
		l4 = new JLabel("Gender:");
		l4.setBounds(50,130,100,30);
		c.add(l4);
		
		r1 = new JRadioButton("Female");
		r1.setBounds(150,130,100,30);
		r1.addActionListener(this);
		r2 = new JRadioButton("Male");
		r2.setBounds(300,130,100,30);
		r2.addActionListener(this);
		
		c.add(r1);
		c.add(r2);
		ButtonGroup grp = new ButtonGroup();
		grp.add(r1);
		grp.add(r2);
		l3 = new JLabel("qualification:");
		l3.setBounds(50,170,100,30);
		c.add(l3);
		t3 = new JTextField();
		t3.setBounds(150,170,200,30);
		c.add(t3);
		l4 = new JLabel("password:");
		l4.setBounds(50,210,100,30);
		c.add(l4);
		t4 = new JTextField();
		t4.setBounds(150,210,200,30);
		c.add(t4);
						
		
		l7 = new JLabel("Address:");
		l7.setBounds(50,250,100,30);
		c.add(l7);
		t12 = new JTextArea();
		t12.setBounds(150,250,400,70);
		t12.setLineWrap(true);
		c.add(t12);
		l9 = new JLabel("salary");
		l9.setBounds(50,330,100,30);
		c.add(l9);
		t5 = new JTextField();
		t5.setBounds(150,330,150,30);
		c.add(t5);

		l11 = new JLabel("Mobile No.");
		l11.setBounds(50,370,100,30);
		c.add(l11);
		t7 = new JTextField();
		t7.setBounds(150,370,150,30);
		c.add(t7);
		l10 = new JLabel("Email:");
		l10.setBounds(50,410,100,30);
		c.add(l10);
		t6 = new JTextField();
		t6.setBounds(150,410,150,30);
		c.add(t6);
		
		
		l15 = new JLabel("PAN:");
		l15.setBounds(50,450,100,30);
		c.add(l15);
		t11 = new JTextField();
		t11.setBounds(150,450,150,30);
		c.add(t11);
		l12 = new JLabel("Date of joining");
		l12.setBounds(50,490,100,30);
		c.add(l12);
		t8 = new JTextField();
		t8.setBounds(150,490,150,30);
		c.add(t8);
		
		b1 = new JButton("insert");
		b1.setBackground(Color.orange);
		b1.setForeground(Color.black);
		b1.setBounds(50,550,180,50);
		b1.addActionListener(this);
		c.add(b1);
		b2 = new JButton("update");
		b2.setBackground(Color.orange);
		b2.setForeground(Color.black);
		b2.setBounds(250,550,180,50);
		b2.addActionListener(this);
		c.add(b2);
		b3 = new JButton("delete");
		b3.setBackground(Color.orange);
		b3.setForeground(Color.black);
		b3.setBounds(450,550,180,50);
		b3.addActionListener(this);
		c.add(b3);
		c.setBackground(Color.LIGHT_GRAY);
		setSize(700,700);
		setTitle("receptionist Details");
		setLocationRelativeTo(null);
		setVisible(true);
		
		
	}
	
	public static void main(String args[])
	{
	//Adminfaculty obj = new Adminfaculty();
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			if(t2.getText().trim().equals("")||t12.getText().trim().equals("")||t3.getText().trim().equals("")||t4.getText().trim().equals("")||t5.getText().trim().equals("")||t8.getText().trim().equals("")||t6.getText().trim().equals("")||t7.getText().trim().equals(""))
			{
				JOptionPane.showMessageDialog(this, "These  fields are compulsory!");
				//break;
			}
			else
			{
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","vishakha","cdac");
				PreparedStatement ps=con.prepareStatement("insert into receptionist values(?,?,?,?,?,?,?,?,?,?,?)");
				ps.setString(1,t1.getText().trim());
				if((t2.getText().trim()).matches("[A-Za-z]+")&& t2.getText().trim().length()>=3)
				{
					ps.setString(2,t2.getText().trim());
				}
				else
				{
					JOptionPane.showMessageDialog(this,"invalid  name");
				}

				
				
				if(r1.isSelected())
				{
					ps.setString(3,"female");
				}
				if(r2.isSelected())
				{
					ps.setString(3,"male");
				}
				ps.setString(4,t3.getText().trim());
				ps.setString(5,t4.getText().trim());
				
				
				//ps.setString(4,t.getNumb));//gender
				//ps.setString(6,(String)cb1.getSelectedItem()+"/"+(String)cb2.getSelectedItem()+"/"+(String)cb3.getSelectedItem());//dob
				ps.setString(6,t12.getText().trim());
				ps.setString(7,t5.getText().trim());
				if((t7.getText().trim()).matches("[0-9]+")&& t7.getText().trim().length()==10)
				{
					ps.setString(8,t7.getText().trim());//mob
				}
				else
				{
					JOptionPane.showMessageDialog(this,"invalid mobile");
				}
	
					String email_regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
					if((t6.getText().trim()).matches(email_regex))
					{
						ps.setString(9,t6.getText().trim());
					}
					else
					{
						JOptionPane.showMessageDialog(this,"invalid email");
					}
				
					if((t11.getText().trim()).matches("[A-Z]{3}[P]{1}[A-Z]{1}[0-9]{4}[A-Z]{1}")&& t11.getText().trim().length()==10&&(t2.getText().trim()).charAt(0)==(t10.getText().trim()).charAt(4))
				{
					ps.setString(10,t11.getText().trim());//pan
				}
				else
				{
					JOptionPane.showMessageDialog(this,"invalid pan");
				}
				
				if( t8.getText().trim().length()<=10&&t8.getText().trim().length()>=8)
				{
					ps.setString(11,t8.getText().trim());
				}
				else
				{
					JOptionPane.showMessageDialog(this,"invalid date");
				}


				
				//ps.setString(8,t7.getText().trim());//pin
				//ps.setString(9,t6.getText().trim());
			//	ps.setString(10,t11.getText().trim());
				//ps.setString(11,t8.getText().trim());
				
				//ps.setInt(3,25000);
				int i=ps.executeUpdate();
				JOptionPane.showMessageDialog(this,i+"Successfully registered");
				//System.out.println(i+" record updated!");
				//JOptionPane.showMessageDialog(this,i+ "record updated!!");
				con.close();
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
			}
			
		}	
										
					
		

				if(e.getSource()== b2)
				{
					new AdminReceptionistupdate();	
				}
				if(e.getSource()== b3)
				{
					new AdminReceptionistdelete();
				}



		}
		
	}

	
	
	

