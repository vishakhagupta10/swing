package frametype;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class StudentDetail extends JFrame
{
	Container c;
	JTable t;
	JMenuBar mb1,mb2,mb3,mb4;

	StudentDetail()
	{
		c=this.getContentPane();
		c.setLayout(new BorderLayout());
				
		String heading[]={"Centre","course","student id","Name","gender","dob","Father's name","address","pincode","city","state","country","mobile no.","email","pan","date"};
		int sn = 1;
		String data[][]=new String[100][16];
		int r=0;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","vishakha","cdac");
			PreparedStatement ps=con.prepareStatement("select * from student");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				
				data[r][0]=rs.getString(1);
				data[r][1]=rs.getString(2);
				data[r][2]=rs.getString(3);
				data[r][3]=rs.getString(4);
				data[r][4]=rs.getString(5);
				data[r][5]=rs.getString(6);
				data[r][6]=rs.getString(7);
				data[r][7]=rs.getString(8);
				data[r][8]=rs.getString(9);
				data[r][9]=rs.getString(10);
				
				data[r][10]=rs.getString(11);
				data[r][11]=rs.getString(12);
				data[r][12]=rs.getString(13);
				data[r][13]=rs.getString(14);
				data[r][14]=rs.getString(15);
				data[r][15]=rs.getString(16);
				//data[r][16]=rs.getString(17);
				
				r++;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		t=new JTable(data,heading);
		//t.setFont(new Font("chiller", Font.BOLD ,80));
		//t.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		//t.getColumnModel().getColumn(0).setPreferredWidth(100);
		//t.getColumnModel().getColumn(1).setPreferredWidth(100);
		//t.getColumnModel().getColumn(1).setPreferredWidth(100);
		//t.getColumnModel().getColumn(1).setPreferredWidth(100);
		//t.setRowHeight(30);
		//t.setColumnWidth(30);
		//t.setColumnWidths(100,30,200,60);
		t.setBackground(Color.white);
		t.setForeground(Color.black);
		JScrollPane jsp=new JScrollPane(t);
		c.add(new JLabel("Student details"),BorderLayout.NORTH);
		c.add(jsp,BorderLayout.CENTER);
		setTitle("Student Detail");
		//setSize(700,600);
	//	setLocationRelativeTo(null);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(true);
	}
/*	public static void main(String arg[])
	{
		new Schduletable();
	}*/
	
}