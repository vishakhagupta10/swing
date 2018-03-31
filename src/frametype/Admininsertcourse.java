package frametype;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Admininsertcourse extends  JFrame implements ActionListener
{
	Container c;
	int count = 0;
	int id =0;
	JLabel l1,l2,l3,l5, l0;
	JButton b1,b2,b3;
	JTextField  t0,t1,t2,t3;
	JMenuBar mb1,mb2,mb3,mb4;
	Admininsertcourse()
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
		l0 = new JLabel("Faculty_id:");
		l0.setForeground(Color.black);
		l0.setBounds(150,150, 200, 30);
		l0.setFont(new Font("Forte", Font.PLAIN , 30));
		c.add(l0);
		
		t0 = new JTextField();
		t0.setForeground(Color.black);
		t0.setBounds(300,150, 200, 30);
		t0.setFont(new Font("Forte", Font.PLAIN , 30));
		c.add(t0);
		try
		{
			if(id ==0)
			{
							Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","vishakha","cdac");
			PreparedStatement ps=con.prepareStatement("select course_id from course");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				id= rs.getInt(1);
			}
			id++;
			t0.setText(""+id);
			}
		
		}
			catch(Exception e2)
			{
				System.out.println(e2);
			}
		l1 = new JLabel("course:");
		l1.setForeground(Color.black);
		l1.setBounds(150,240, 200, 30);
		l1.setFont(new Font("Forte", Font.PLAIN , 30));
		l2 = new JLabel("Fees:");
		l2.setForeground(Color.black);
		l2.setBounds(150, 330, 200, 30);
		l2.setFont(new Font("Forte", Font.BOLD , 30));
		l3 = new JLabel("Period:");
		l3.setForeground(Color.black);
		l3.setBounds(150, 420, 200, 30);
		l3.setFont(new Font("Forte", Font.BOLD , 30));
		c.add(l3);
		b3 = new JButton("insert");
		b3.setBounds(70, 480, 150, 50);
		b3.setForeground(Color.BLACK);
		b3.setBackground(Color.ORANGE);

		b3.setFont(new Font("Forte", Font.BOLD , 30));
		b3.addActionListener(this);
		b2 = new JButton("update");
		b2.setBounds(270, 480, 150, 50);
		b2.setForeground(Color.BLACK);
		b2.setBackground(Color.ORANGE);
		b2.setFont(new Font("Forte", Font.BOLD , 30));
		b2.addActionListener(this);
		b1 = new JButton("Delete");
		b1.setBounds(470, 480, 150, 50);
		b1.setForeground(Color.BLACK);
		b1.setBackground(Color.ORANGE);
		b1.setFont(new Font("Forte", Font.BOLD , 30));
		b1.addActionListener(this);

		l5 = new JLabel("COURSE Mangement");
		l5.setBounds(100, 60, 480, 50);
		l5.setForeground(Color.black);
		l5.setFont(new Font("gill sans", Font.BOLD ,30));
		c.add(l5);
		t1 = new JTextField();
		t1.setBounds(300,240,200,30);
		t2 = new JTextField();
		t2.setBounds(300,330,200,30);
		t3 = new JTextField();
		//b1.setBackground(Color.ORANGE);
		//b1.setForeground(Color.BLACK);
		//b1.setFont(new Font("Forte", Font.BOLD , 30));
		t3.setBounds(300,420,200,30);
		//b1.addActionListener(this);
		c.add(l1);
		c.add(l2);
		c.add(b2);
		c.add(b3);
		c.add(b1);
		c.add(t3);
		c.add(t1);
		c.add(t2);
		c.setBackground(Color.WHITE);
		setSize(700,600);
		setTitle("course");
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
public static void main(String arg[])
{
	Admininsertcourse ob = new Admininsertcourse();
}
	

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		if(e.getSource()== b3)
		{
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","vishakha","cdac");
				PreparedStatement ps=con.prepareStatement("insert into course values(?,?,?,?)");
				ps.setString(1,t0.getText());
				ps.setString(2,t1.getText());
				ps.setString(3,t2.getText());
				ps.setString(4,t3.getText());

				//ps.setInt(3,25000);
				int i=ps.executeUpdate();
				System.out.println(i+" record updated!");
				JOptionPane.showMessageDialog(this,i+ "record inserted!!");
				t1.setText(" ");
				t2.setText(" ");
				t3.setText(" ");
				con.close();
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
		}
		if(e.getSource()== b2)
		{
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","vishakha","cdac");
				PreparedStatement ps=con.prepareStatement("update course set fees = ? , period = ? where course_id = ? ");
				ps.setString(1,t2.getText().trim());
				ps.setString(2,t3.getText().trim());
				ps.setString(3,t0.getText().trim());
				int i = ps.executeUpdate();
				
				JOptionPane.showMessageDialog(this,i+ "record update!!");
				con.close();
			}
			catch(Exception e4)
			{
				System.out.println(e4);
			}	
		}
		if(e.getSource()== b1)
		{
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","vishakha","cdac");
				PreparedStatement ps=con.prepareStatement("delete from course where course_id = ?");
				ps.setString(1,t0.getText().trim());
				int i = ps.executeUpdate();
				
				JOptionPane.showMessageDialog(this,i+ "record delete!!");
				count =1;
				con.close();
			}
			catch(Exception e2)
			{
				System.out.println(e2);
			}
			if(count ==0)
			{
				JOptionPane.showMessageDialog(this, "invalid id!!");
			}

		}
		

		
		
		
	}

}
