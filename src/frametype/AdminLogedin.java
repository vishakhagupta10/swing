package frametype;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AdminLogedin extends JFrame implements ActionListener
{
	Container c;
	JLabel l1;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
	//JTextField t1,t2,t3,t4;
	//JComboBox cb;
	JMenuBar mb1,mb2,mb3,mb4;

	public AdminLogedin(String s)
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
		l1 = new JLabel("HELLO " + s);
		l1.setBounds(150, 70, 400, 60);
		l1.setFont(new Font("GILL SANS", Font.BOLD ,40));
		l1.setBackground(Color.black);
		
		c.add(l1);
		b1 = new JButton("Receptionist registration");
		b1.setBackground(Color.orange);
		b1.setForeground(Color.black);
		b1.setBounds(60,180,270,30);
		b1.setFont(new Font("Forte", Font.BOLD , 20));
		b1.addActionListener(this);
		b2 = new JButton("Receptionist details");
		b2.setBackground(Color.orange);
		b2.setForeground(Color.black);
		b2.setBounds(370,180,270,30);
		b2.setFont(new Font("Forte", Font.BOLD , 20));
		b2.addActionListener(this);
		b3 = new JButton("course management");
		b3.setBackground(Color.orange);
		b3.setForeground(Color.black);
		b3.setBounds(60,240,270,30);
		b3.setFont(new Font("Forte", Font.BOLD , 20));
		b3.addActionListener(this);
		b4 = new JButton("Course Details");
		b4.setBackground(Color.orange);
		b4.setForeground(Color.black);
		b4.setBounds(370,240,270,30);
		b4.setFont(new Font("Forte", Font.BOLD , 20));
		b4.addActionListener(this);
		b5 = new JButton("Faculty Registration");
		b5.setBackground(Color.orange);
		b5.setForeground(Color.black);
		b5.setBounds(60,300,270,30);
		b5.setFont(new Font("Forte", Font.BOLD , 20));
		b5.addActionListener(this);
		b6= new JButton("Faculty Details");
		b6.setBackground(Color.orange);
		b6.setForeground(Color.black);
		b6.setBounds(370,300,270,30);
		b6.setFont(new Font("Forte", Font.BOLD , 20));
		b6.addActionListener(this);
		b7 = new JButton("Schdule Management");
		b7.setBackground(Color.orange);
		b7.setForeground(Color.black);
		b7.setBounds(60,360,270,30);
		b7.setFont(new Font("Forte", Font.BOLD , 20));
		b7.addActionListener(this);
		b8 = new JButton("Display of Schdule");
		b8.setBackground(Color.orange);
		b8.setForeground(Color.black);
		b8.setBounds(370,360,270,30);
		b8.setFont(new Font("Forte", Font.BOLD , 20));
		b8.addActionListener(this);
		b9 = new JButton("Student Details");
		b9.setBackground(Color.orange);
		b9.setForeground(Color.black);
		b9.setBounds(60,420,270,30);
		b9.setFont(new Font("Forte", Font.BOLD , 20));
		b9.addActionListener(this);
		b10 = new JButton("Search");
		b10.setBackground(Color.orange);
		b10.setForeground(Color.black);
		b10.setBounds(370,420,270,30);
		b10.setFont(new Font("Forte", Font.BOLD , 20));
		b10.addActionListener(this);
		b11 = new JButton("Faculty & course");
		b11.setBackground(Color.orange);
		b11.setForeground(Color.black);
		b11.setBounds(60,480,270,30);
		b11.setFont(new Font("Forte", Font.BOLD , 20));
		b11.addActionListener(this);
		c.add(b11);
		

		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(b4);
		c.add(b5);
		c.add(b6);
		c.add(b7);
		c.add(b8);
		c.add(b9);
		c.add(b10);
		setSize(700,600);
		c.setBackground(Color.white);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	/*public static void main(String args[])
	{
		Login oj = new Login();
	}*/
	

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()== b1)
		{
			 new AdminReceptionist();
		}
		if(e.getSource()==b2)
		{
			new Receptionistdetial();
		}
			
		
					
		if(e.getSource()== b3)
		{
			new Admininsertcourse();
			
					}
		if(e.getSource()== b4)
		{
			new Coursedisplay();
			
					}
		if(e.getSource()== b5)
		{
			new Adminfaculty();
			
		}
		if(e.getSource()== b6)
		{
			new FacultyDisplay();
			
					}
		if(e.getSource()== b7)
		{
			new Adminschdule();
			
					}
		if(e.getSource()== b8)
		{
			new Schduletable();
			
					}
		if(e.getSource()== b9)
		{
			new StudentDetail();
			
		}
		if(e.getSource()== b10)
		{
			new AdminSearch();
			
		}
		if(e.getSource()== b11)
		{
			new AdminFacultySearch();
			
		}

		

		
	}

}
