package frametype;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class NewRegister extends JFrame implements ActionListener
{
	Container c;
	int id = 100;
	JMenuBar mb1,mb2,mb3,mb4;
	JLabel t1,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,la;
	JTextField t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t15,ta;
	//JTextArea t4;
	JRadioButton r1,r2,r3,r4,r5,r6,r7;
	JCheckBox c1,c2,c3,c4,c5;
	JComboBox cb1,cb2,cb3,cb4;
	JButton b1;
	public NewRegister()
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

		l1 = new JLabel("Centre Name:");
		l1.setBounds(50,50,100,30);
		c.add(l1);
		t1 = new JLabel("CDAC");
		t1.setBounds(150,50,200,30);
		c.add(t1);
		l2 = new JLabel("Course:");
		l2.setBounds(50,90,50,30);
		c.add(l2);
		t2 = new JTextField();
		t2.setBounds(150,90,200,30);
		c.add(t2);
		
		ta = new JTextField();
		ta.setBounds(150,130,200,30);
		c.add(ta);
		try
		{
			if(id ==100)
			{
				
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","vishakha","cdac");
			PreparedStatement ps=con.prepareStatement("select Student_id from student");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				id= rs.getInt(1); 
			}
			id++;
			ta.setText(""+id);
			}
		
		}
			catch(Exception e2)
			{
				System.out.println(e2);
			}
		//id++;
		
		la = new JLabel("Student Id:");
		la.setBounds(50,130,100,30);
		c.add(la);
		
		l3 = new JLabel("Name:");
		l3.setBounds(50,170,100,30);
		c.add(l3);
		t3 = new JTextField();
		t3.setBounds(150,170,200,30);
		c.add(t3);
		l4 = new JLabel("Gender:");
		l4.setBounds(50,210,100,30);
		c.add(l4);
		
		r1 = new JRadioButton("Female");
		r1.setBounds(150,210,100,30);
		r1.addActionListener(this);
		r2 = new JRadioButton("Male");
		r2.setBounds(300,210,100,30);
		r2.addActionListener(this);
		
		c.add(r1);
		c.add(r2);
		ButtonGroup grp = new ButtonGroup();
		grp.add(r1);
		grp.add(r2);
		
		/*l18 = new JLabel("Female:");
		l18.setBounds(5,5,50,30);
		c.add(l18);
		l19 = new JLabel("Male:");
		l19.setBounds(5,5,50,30);
		c.add(l19);*/
		l5 = new JLabel("Date Of Birth:");
		l5.setBounds(50,250,100,30);
		c.add(l5);
		cb1 = new JComboBox();
		cb1.setBounds(150,250,100,30);
		for(int i = 1;i<=31;i++)
		{
			cb1.addItem(" "+i);
		}
		c.add(cb1);
		cb2 = new JComboBox();
		cb2.setBounds(300,250,100,30);
		for(int i = 1;i<=12;i++)
		{
			cb2.addItem(" "+i);
		}
		cb2.addActionListener(this);
		c.add(cb2);
		cb3 = new JComboBox();
		cb3.setBounds(450,250,100,30);
		for(int i = 1990;i<=2017;i++)
		{
			cb3.addItem(" "+i);
		}
		cb3.addActionListener(this);
		c.add(cb3);
	
		l6 = new JLabel("Father's Name:");
		l6.setBounds(50,290,100,30);
		c.add(l6);
		t4 = new JTextField();
		t4.setBounds(150,290,200,30);
		c.add(t4);
				
		l7 = new JLabel("Address:");
		l7.setBounds(50,330,100,30);
		c.add(l7);
		t12 = new JTextField();
		t12.setBounds(150,330,400,60);
		//t4.setLineWrap(true);
		c.add(t12);
		l9 = new JLabel("pincode");
		l9.setBounds(50,410,100,30);
		c.add(l9);
		t5 = new JTextField();
		t5.setBounds(150,410,150,30);
		c.add(t5);

		l11 = new JLabel("city");
		l11.setBounds(350,410,100,30);
		c.add(l11);
		t7 = new JTextField();
		t7.setBounds(450,410,150,30);
		c.add(t7);
		l10 = new JLabel("State:");
		l10.setBounds(50,450,100,30);
		c.add(l10);
		t6 = new JTextField();
		t6.setBounds(150,450,150,30);
		c.add(t6);
		
		
		l15 = new JLabel("Country:");
		l15.setBounds(350,450,100,30);
		c.add(l15);
		t11 = new JTextField();
		t11.setBounds(450,450,150,30);
		c.add(t11);
		l12 = new JLabel("Mobile No. :");
		l12.setBounds(50,490,100,30);
		c.add(l12);
		t8 = new JTextField();
		t8.setBounds(150,490,150,30);
		c.add(t8);
		l13 = new JLabel("Email");
		l13.setBounds(350,490,100,30);
		c.add(l13);
		t9 = new JTextField();
		t9.setBounds(450,490,200,30);
		c.add(t9);
		l14 = new JLabel("Pan NO. :");
		l14.setBounds(50,530,100,30);
		c.add(l14);
		t10 = new JTextField();
		t10.setBounds(150,530,200,30);
		c.add(t10);
		
		l16 = new JLabel("Date:");
		l16.setBounds(50,570,100,30);
		c.add(l16);
		t15 = new JTextField();
		t15.setBounds(150,570,200,30);
		c.add(t15);
		b1 = new JButton("SUBMIT");
		b1.setBackground(Color.orange);
		b1.setForeground(Color.black);
		b1.setBounds(400,600,200,30);
		b1.addActionListener(this);
		c.add(b1);
		c.setBackground(Color.WHITE);
		setSize(700,700);
		setTitle("Student's Details");
		setLocationRelativeTo(null);
		setVisible(true);
		
		
	}
	
	public static void main(String args[])
	{
	NewRegister obj = new NewRegister();
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			if(t1.getText().trim().equals("")||t2.getText().trim().equals("")||t3.getText().trim().equals("")||t4.getText().trim().equals("")||t5.getText().trim().equals("")||t8.getText().trim().equals("")||t9.getText().trim().equals("")||t10.getText().trim().equals(""))
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
				PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
				ps.setString(1,t1.getText());
				if((t2.getText().trim()).matches("[A-Za-z]+"))
				{
					ps.setString(2,t2.getText());
				}
				else
				{
					JOptionPane.showMessageDialog(this,"invalid ccourse name");
				}
				ps.setString(3,ta.getText());
				if((t3.getText().trim()).matches("[A-Za-z]+")&& t3.getText().trim().length()>=3)
				{
					ps.setString(4,t3.getText());
				}
				else
				{
					JOptionPane.showMessageDialog(this,"invalid  name");
				}
				
				if(r1.isSelected())
				{
					ps.setString(5,"female");
				}
				if(r2.isSelected())
				{
					ps.setString(5,"male");
				}

				
				//ps.setString(4,t.getNumb));//gender
				ps.setString(6,(String)cb1.getSelectedItem()+"/"+(String)cb2.getSelectedItem()+"/"+(String)cb3.getSelectedItem());//dob
				if((t4.getText().trim()).matches("[A-Za-z]+")&& t4.getText().trim().length()>=3)
				{
					ps.setString(7,t4.getText());
				}
				else
				{
					JOptionPane.showMessageDialog(this,"invalid father name");
				}
				ps.setString(8,t12.getText());
				if((t5.getText().trim()).matches("[0-9]+")&& t5.getText().trim().length()==6)
				{
					ps.setString(9,t5.getText());
				}
				else
				{
					JOptionPane.showMessageDialog(this,"invalid pincode");
				}
				//pin
				if((t7.getText().trim()).matches("[A-Za-z]+")&& t7.getText().trim().length()>1)
				{
					ps.setString(10,t7.getText());
				}
				else
				{
					JOptionPane.showMessageDialog(this,"invalid city");
				}
				if((t6.getText().trim()).matches("[A-Za-z]+")&& t6.getText().trim().length()>1)
				{
					ps.setString(11,t6.getText());
				}
				else
				{
					JOptionPane.showMessageDialog(this,"invalid state");
				}
				if((t11.getText().trim()).matches("[A-Za-z]+")&& t11.getText().trim().length()>2)
				{
					ps.setString(12,t11.getText());
				}
				else
				{
					JOptionPane.showMessageDialog(this,"invalid country");
				}
				if((t8.getText().trim()).matches("[0-9]+")&& t8.getText().trim().length()==10)
				{
					ps.setString(13,t8.getText());//mob
				}
				else
				{
					JOptionPane.showMessageDialog(this,"invalid mobile");
				}
	
					String email_regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
					if((t9.getText().trim()).matches(email_regex))
					{
						ps.setString(14,t9.getText());//mob
					}
					else
					{
						JOptionPane.showMessageDialog(this,"invalid email");
					}
				
				if((t10.getText().trim()).matches("[A-Z]{3}[P]{1}[A-Z]{1}[0-9]{4}[A-Z]{1}")&& t10.getText().trim().length()==10&&(t3.getText().trim()).charAt(0)==(t10.getText().trim()).charAt(4))
				{
					ps.setString(15,t10.getText());//pan
				}
				else
				{
					JOptionPane.showMessageDialog(this,"invalid pan");
				}
				
				if( t15.getText().trim().length()<=10&&t15.getText().trim().length()>=8)
				{
					ps.setString(16,t15.getText());
				}
				else
				{
					JOptionPane.showMessageDialog(this,"invalid date");
				}
				
				//ps.setInt(3,25000);
				int i=ps.executeUpdate();
				System.out.println(i+" record updated!");
				JOptionPane.showMessageDialog(this,i+ "record updated!!");
				con.close();
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
						
				
				
		}
		
	}
	
	
	}
}
