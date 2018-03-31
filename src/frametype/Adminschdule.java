package frametype;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Adminschdule extends JFrame implements ActionListener
{
	//int flag = 0;
	Container c;
	String s1 = " ";
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JButton b1,b2,b3;
	JCheckBox c1,c2,c3,c4,c5,c6,c7;
	JTextField t1,t2;
	JComboBox cb1,cb2;
	JMenuBar mb1,mb2,mb3,mb4;
	public Adminschdule()
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
		l3 = new JLabel("Schdule");
		l3.setBounds(250, 80, 200, 60);
		l3.setForeground(Color.BLACK);
		l3.setFont(new Font("GILL SANS", Font.BOLD ,50));
		c.add(l3);
				l1 = new JLabel("course:");
		l1.setForeground(Color.BLACK);
		l1.setBounds(60,180, 200, 30);
		l1.setFont(new Font("forte", Font.BOLD , 24));
		l2 = new JLabel("Faculty Name:");
		l2.setForeground(Color.black);
		l2.setBounds(60, 240, 200, 30);
		l2.setFont(new Font("forte", Font.BOLD , 24));
		l5 = new JLabel("Days:");
		l5.setForeground(Color.black);
		l5.setBounds(60, 300, 200, 30);
		l5.setFont(new Font("forte", Font.BOLD , 24));
		l6= new JLabel("Timing:");
		l6.setForeground(Color.black);
		l6.setBounds(60, 360, 200, 30);
		l6.setFont(new Font("forte", Font.BOLD , 24));
		l7 = new JLabel("to");
		l7.setForeground(Color.black);
		l7.setBounds(400, 360, 50, 30);
		l7.setFont(new Font("forte", Font.BOLD , 24));
		
		c1 = new JCheckBox("M");
		c1.setForeground(Color.black);
		c1.setBounds(240, 300, 50, 30);
		c1.setFont(new Font("forte", Font.PLAIN , 20));
		c1.addActionListener(this);
		c.add(c1);
		
		c2 = new JCheckBox("T");
		c2.setForeground(Color.black);
		c2.setBounds(300, 300, 50, 30);
		c2.setFont(new Font("forte", Font.PLAIN, 20));
		c2.addActionListener(this);
		c.add(c2);

		c3 = new JCheckBox("W");
		c3.setForeground(Color.black);
		c3.setBounds(360, 300, 50, 30);
		c3.setFont(new Font("forte", Font.PLAIN , 20));
		c3.addActionListener(this);
		c.add(c3);

		c4 = new JCheckBox("TH");
		c4.setForeground(Color.black);
		c4.setBounds(420, 300, 50, 30);
		c4.setFont(new Font("forte", Font.PLAIN, 20));
		c4.addActionListener(this);
		c.add(c4);

		c5 = new JCheckBox("F");
		c5.setForeground(Color.black);
		c5.setBounds(480, 300, 50, 30);
		c5.setFont(new Font("forte", Font.PLAIN , 20));
		c5.addActionListener(this);
		c.add(c5);

		c6 = new JCheckBox("S");
		c6.setForeground(Color.black);
		c6.setBounds(540, 300, 50, 30);
		c6.setFont(new Font("forte", Font.PLAIN , 20));
		c6.addActionListener(this);
		c.add(c6);

		c7 = new JCheckBox("SU");
		c7.setForeground(Color.black);
		c7.setBounds(600, 300, 50, 30);
		c7.setFont(new Font("forte", Font.PLAIN , 20));
		c7.addActionListener(this);
		c.add(c7);
		

		
		cb1= new JComboBox();
		cb1.setBounds(240,180,200,30);
		cb1.addActionListener(this);
		c.add(cb1);
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","vishakha","cdac");
			PreparedStatement ps=con.prepareStatement("select course_name from course");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				cb1.addItem(rs.getString(1));
			}
			//int i=ps.executeUpdate();
			//System.out.println(" record updated!");
			//JOptionPane.showMessageDialog(this, "record updated!!");
			con.close();
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		cb2 = new JComboBox();
		cb2.setBounds(240,240,200,30);
		cb2.addActionListener(this);
		c.add(cb2);
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","vishakha","cdac");
			PreparedStatement ps=con.prepareStatement("select name from faculty");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				cb2.addItem(rs.getString(1));
			}
			//int i=ps.executeUpdate();
			//System.out.println(" record updated!");
			//JOptionPane.showMessageDialog(this, "record updated!!");
			con.close();
		}
		catch(Exception e2)
		{
			System.out.println(e2);
		}
		t1 = new JTextField();
		t1.setBounds(240,360,150,30);
		t2 = new JTextField();
		t2.setBounds(450,360,150,30);
				b1 = new JButton("insert");
		b1.setBackground(Color.orange);
		b1.setForeground(Color.black);
		b1.setBounds(40,450,200,50);
		b1.addActionListener(this);
		b1.setToolTipText("insert");
		b2 = new JButton("update");
		b2.setBackground(Color.orange);
		b2.setForeground(Color.black);
		b2.setBounds(250,450,200,50);
		b2.addActionListener(this);
		b2.setToolTipText("update using course and faculty");
		b3 = new JButton("delete");
		b3.setBackground(Color.orange);
		b3.setForeground(Color.black);
		b3.setBounds(460,450,180,50);
		b3.addActionListener(this);
		b3.setToolTipText("delete using course and faculty");

		c.add(l1);
		c.add(l2);
		c.add(l6);
		c.add(l5);
		c.add(l7);
		//c.add(l4);
		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(t1);
		c.add(t2);
		//c.add(t3);
		//c.add(t4);
	//	c.add(cb);
		c.setBackground(Color.WHITE);
		setSize(700,600);
		setTitle("Register");
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	public static void main(String[] args)
	{
		Adminschdule ob = new Adminschdule();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==c1)
		{
		if(c1.isSelected())
		{
			s1= s1.concat("mon ");
		}
		}
		if(e.getSource()==c2)
		{
		if(c2.isSelected())
		{
			s1= s1.concat("tues ");
		}
		}

		if(e.getSource()==c3)
		{
		if(c3.isSelected())
		{
			s1= s1.concat("wed ");
		}
		}
		if(e.getSource()==c4)
		{
		if(c4.isSelected())
		{
			s1= s1.concat("thur ");
		}
		}
		if(e.getSource()==c5)
		{
		if(c5.isSelected())
		{
			s1= s1.concat("fri ");
		}
		}
		if(e.getSource()==c6)
		{
			
		
		if(c6.isSelected())
		{
			s1= s1.concat("sat ");
		}
		}
		if(e.getSource()==c7)
		{
		if(c7.isSelected())
		{
			s1= s1.concat("sun ");
		}
		}

		if(e.getSource()==b1)
		{
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","vishakha","cdac");
				PreparedStatement ps=con.prepareStatement("insert into schdule values(?,?,?,?)");
				ps.setString(1,(String)cb1.getSelectedItem());
				ps.setString(2,(String)cb2.getSelectedItem());
				ps.setString(3,t1.getText()+" to " + t2.getText());
				ps.setString(4,s1);

				//ps.setString(4,(String)cb.getSelectedItem());
				//ps.setString(5,t4.getText());
				//ps.setInt(3,25000);
				int i=ps.executeUpdate();
				System.out.println("1 record updated!");
				JOptionPane.showMessageDialog(this,i+ "record updated!!");
				con.close();
			}
			catch(Exception e3)
			{
				System.out.println(e3);
			}

		}
		if(e.getSource()==b2)
		{
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","vishakha","cdac");
				PreparedStatement ps=con.prepareStatement("update schdule set timing = ?,days = ?  where course = ? and faculty_name=? ");
				ps.setString(1,t1.getText().trim() + " to " +  t2.getText().trim() );
				ps.setString(2,s1);
				ps.setString(3,(String)cb1.getSelectedItem());
				ps.setString(4,(String)cb2.getSelectedItem());
				int i = ps.executeUpdate();
				
				JOptionPane.showMessageDialog(this,i+ "record update!!");
				con.close();
			}
			catch(Exception e4)
			{
				System.out.println(e4);
			}
		}
		
		if(e.getSource()==b3)
		{
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","vishakha","cdac");
				PreparedStatement ps=con.prepareStatement("delete from schdule where course = ? and faculty_name = ?");
				ps.setString(1,(String)cb1.getSelectedItem());
				ps.setString(2,(String)cb2.getSelectedItem());
				int i = ps.executeUpdate();
				
				JOptionPane.showMessageDialog(this,i+ "record delete!!");
				con.close();
			}
			catch(Exception e2)
			{
				System.out.println(e2);
			}
		}
		
	}
}
		
			
		

