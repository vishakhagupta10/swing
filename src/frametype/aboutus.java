package frametype;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.*;
public class aboutus extends JFrame
{
	Container c;
	JMenuBar mb1,mb2,mb3,mb4;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26;
	public aboutus()
	{
		c = this.getContentPane();
		c.setLayout(null);
		
		mb1 = new JMenuBar();
		mb1.setBounds(0,0,900,30);
		mb1.setBackground(Color.orange);
		c.add(mb1);
		
		mb2 = new JMenuBar();		
		mb2.setBounds(0,30,30,700);
		mb2.setBackground(Color.orange);
		c.add(mb2);

		mb3 = new JMenuBar();
		mb3.setBounds(0,635,900,30);
		mb3.setBackground(Color.orange);
		c.add(mb3);
		
		mb4 = new JMenuBar();
		mb4.setBounds(755,30,30,640);
		mb4.setBackground(Color.orange);
		c.add(mb4);
		
		l1 = new JLabel("Project's Title :    C-DAC Training Management System");
		l1.setForeground(Color.BLACK);
		l1.setBounds(50,70, 800, 30);
		l1.setFont(new Font("Century", Font.BOLD, 22));
		c.add(l1);
		
		l2 = new JLabel("Group No. :  3");
		l2.setForeground(Color.BLACK);
		l2.setBounds(50,130, 800, 30);
		l2.setFont(new Font("Century", Font.BOLD, 22));
		c.add(l2);
		
		l3 = new JLabel("Faculty Name :  Aman");
		l3.setForeground(Color.BLACK);
		l3.setBounds(50,100, 800, 30);
		l3.setFont(new Font("Century", Font.BOLD, 22));
		c.add(l3);
		
		l4 = new JLabel("Member Name        College                  Mobile No.           Email Id");
		l4.setForeground(Color.BLACK);
		l4.setBounds(50,180, 800, 30);
		l4.setFont(new Font("Century", Font.BOLD, 18));
		c.add(l4);
		
		l5 = new JLabel("Manisha Mukul");
		l5.setForeground(Color.BLACK);
		l5.setBounds(50,220, 800, 30);
		l5.setFont(new Font("Century",  Font.PLAIN, 16));
		c.add(l5);
		
		l6 = new JLabel("Vishakha Gupta");
		l6.setForeground(Color.BLACK);
		l6.setBounds(50,250, 800, 30);
		l6.setFont(new Font("Century",  Font.PLAIN, 16));
		c.add(l6);
		
		l7 = new JLabel("Shatamjeev Sinha");
		l7.setForeground(Color.BLACK);
		l7.setBounds(50,280, 800, 30);
		l7.setFont(new Font("Century",  Font.PLAIN, 16));
		c.add(l7);
		
		l8 = new JLabel("Tushar Tanay");
		l8.setForeground(Color.BLACK);
		l8.setBounds(50,310, 800, 30);
		l8.setFont(new Font("Century",  Font.PLAIN, 16));
		c.add(l8);
		
		l9 = new JLabel("Ananya");
		l9.setForeground(Color.BLACK);
		l9.setBounds(50,340, 800, 30);
		l9.setFont(new Font("Century",  Font.PLAIN, 16));
		c.add(l9);
		
		l10 = new JLabel("M.I.T. , Manipal");
		l10.setForeground(Color.BLACK);
		l10.setBounds(210,220, 800, 30);
		l10.setFont(new Font("Century",  Font.PLAIN, 16));
		c.add(l10);
		
		l11 = new JLabel("M.I.T. , Manipal");
		l11.setForeground(Color.BLACK);
		l11.setBounds(210,280, 800, 30);
		l11.setFont(new Font("Century", Font.PLAIN, 16));
		c.add(l11);
		
		l12 = new JLabel("M.I.T. , Manipal");
		l12.setForeground(Color.BLACK);
		l12.setBounds(210,310, 800, 30);
		l12.setFont(new Font("Century", Font.PLAIN, 16));
		c.add(l12);
		
		l13 = new JLabel("D.I.T. , Dehradun");
		l13.setForeground(Color.BLACK);
		l13.setBounds(210,340, 800, 30);
		l13.setFont(new Font("Century", Font.PLAIN, 16));
		c.add(l13);
		
		l14 = new JLabel("A.B.V.-I.I.I.T.M. ,Gwailor");
		l14.setForeground(Color.BLACK);
		l14.setBounds(210,250, 800, 30);
		l14.setFont(new Font("Century", Font.PLAIN, 16));
		c.add(l14);
		
		l15 = new JLabel("8959655323");
		l15.setForeground(Color.BLACK);
		l15.setBounds(410,250, 800, 30);
		l15.setFont(new Font("Century", Font.PLAIN, 16));
		c.add(l15);
		
		l16 = new JLabel("8296374511");
		l16.setForeground(Color.BLACK);
		l16.setBounds(410,220, 800, 30);
		l16.setFont(new Font("Century", Font.PLAIN, 16));
		c.add(l16);
		
		l17 = new JLabel("8296539133");
		l17.setForeground(Color.BLACK);
		l17.setBounds(410,280, 800, 30);
		l17.setFont(new Font("Century", Font.PLAIN, 16));
		c.add(l17);
		
		l18 = new JLabel("8296539927");
		l18.setForeground(Color.BLACK);
		l18.setBounds(410,310, 800, 30);
		l18.setFont(new Font("Century", Font.PLAIN, 16));
		c.add(l18);
		
		l19 = new JLabel("9835806366");
		l19.setForeground(Color.BLACK);
		l19.setBounds(410,340, 800, 30);
		l19.setFont(new Font("Century", Font.PLAIN, 16));
		c.add(l19);
		
		l20 = new JLabel("manisha21mukul@gmail.com");
		l20.setForeground(Color.BLACK);
		l20.setBounds(530,220, 800, 30);
		l20.setFont(new Font("Century", Font.PLAIN, 16));
		c.add(l20);
		
		l21 = new JLabel("vishakhadstar@gmail.com");
		l21.setForeground(Color.BLACK);
		l21.setBounds(530,250, 800, 30);
		l21.setFont(new Font("Century", Font.PLAIN, 16));
		c.add(l21);
		
		l22 = new JLabel("shatamjeevsinha@gmail.com");
		l22.setForeground(Color.BLACK);
		l22.setBounds(530,280, 800, 30);
		l22.setFont(new Font("Century", Font.PLAIN, 16));
		c.add(l22);
		
		l23 = new JLabel("tushartanay@gmail.com");
		l23.setForeground(Color.BLACK);
		l23.setBounds(530,310, 800, 30);
		l23.setFont(new Font("Century", Font.PLAIN, 16));
		c.add(l23);
		
		l24 = new JLabel("ananya.sghs96@gmail.com");
		l24.setForeground(Color.BLACK);
		l24.setBounds(530,340, 800, 30);
		l24.setFont(new Font("Century", Font.PLAIN, 16));
		c.add(l24);
		
		setSize(800,700);
		setTitle("Participant's Information");
		c.setBackground(Color.white);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String arg[])
	{
		//new aboutus();
	}
}	
