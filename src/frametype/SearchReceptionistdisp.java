package frametype;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class SearchReceptionistdisp extends JFrame
{
	Container c;
	JTable t;
	JMenuBar mb1,mb2,mb3,mb4;

	SearchReceptionistdisp(int id1)
	{
		c=this.getContentPane();
		c.setLayout(new BorderLayout());
				
		String heading[]={"Receptionist id","name","gender","qualification","password","address","salary","mobile no","email","pan","Date of joining" };
		int sn = 1;
		String data[][]=new String[17][11];
		int r=0;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","vishakha","cdac");
			PreparedStatement ps=con.prepareStatement("select * from Receptionist where receptionist_id = "+id1);
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
				//data[r][9]=rs.getString(10);
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
		t.setRowHeight(30);
		//t.setColumnWidth(30);
		//t.setColumnWidths(100,30,200,60);
		t.setBackground(Color.white);
		t.setForeground(Color.black);
		JScrollPane jsp=new JScrollPane(t);
		c.add(new JLabel("Schdule of classes"),BorderLayout.NORTH);
		c.add(jsp,BorderLayout.CENTER);
		setTitle("Recruiters");
		setSize(1000,800);
		setLocationRelativeTo(null);
		//setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(true);
	}
/*	public static void main(String arg[])
	{
		new Schduletable();
	}*/
	
}