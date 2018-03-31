package frametype;
import javax.swing.*;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class CompleteForm extends JFrame implements ActionListener
{
	Container c;

	
	
	
	JMenuBar mb,mb1,mb2,mb3;
	JMenu m1,m2,m3,m4;
	JMenuItem exit,r1,r2,r3;
	JLabel la,lb;
	JMenu l1;

	public void clock()
	{
		Thread clock=new Thread()
				{
			public void run()
			{
				try {
					for(;;){
					Calendar cal=new GregorianCalendar();
					int day=cal.get(Calendar.DAY_OF_MONTH);
					int month=cal.get(Calendar.MONTH);
					int year=cal.get(Calendar.YEAR);
					int sec=cal.get(Calendar.SECOND);
					int minute=cal.get(Calendar.MINUTE);
					int hour=cal.get(Calendar.HOUR_OF_DAY);	
					la.setText("DATE  :"+day+"/"+(month+1)+"/"+year);
					lb.setText("TIME "+hour+":"+minute+":"+sec);
					sleep(1000);
				}
				} catch (InterruptedException e) {
				
					e.printStackTrace();
				}
			}
				};
				clock.start();
	}
	public CompleteForm()
	{
		c=this.getContentPane();
		c.setLayout(null);
		mb = new JMenuBar();
		mb.setBounds(0, 10, 1500,50);
		
		mb.setBackground(Color.orange);
		c.add(mb);
		mb1 = new JMenuBar();
		mb1.setBounds(250, 200, 850,300);
		
		mb1.setBackground(Color.black);
		c.add(mb1);
		mb2 = new JMenuBar();
		mb2.setBounds(300,60 , 30,200);
		
		mb2.setBackground(Color.black);
		c.add(mb2);
		mb3 = new JMenuBar();
		mb3.setBounds(1000,60 , 30,200);
		
		mb3.setBackground(Color.black);
		c.add(mb3);
		l1 = new JMenu(" ... CDAC...  ");
		l1.setForeground(Color.green);
		//l1.setBounds(280,300, 700, 200);
		l1.setFont(new Font("forte", Font.BOLD , 150));
		mb1.add(l1);

		m1 = new JMenu("     ADMIN LOGIN      ");
		m1.setFont(new Font("cooper", Font.BOLD, 24));
		m1.setForeground(Color.black);
		m1.setBackground(Color.green);
		mb.add(m1);
		m2 = new JMenu("   RECEPTIONIST LOGIN   ");
		m2.setFont(new Font("cooper", Font.BOLD, 24));
		m2.setForeground(Color.black);
		m2.setBackground(Color.green);
		mb.add(m2);
		m3 = new JMenu("       ABOUT US    ");
		m3.setFont(new Font("copper", Font.BOLD, 24));
		m3.setForeground(Color.black);
		m3.setBackground(Color.green);
		mb.add(m3);
		m4 = new JMenu("       HELP      ");
		m4.setFont(new Font("copper", Font.BOLD, 24));
		m4.setForeground(Color.black);
		m4.setBackground(Color.green);
		mb.add(m4);
		exit = new JMenuItem("       exit          ");
		exit.setFont(new Font("cooper", Font.BOLD, 24));
		exit.setForeground(Color.black);
		exit.setBackground(Color.yellow);
		
		exit.addActionListener(this);
		m4.add(exit);
		r3 = new JMenuItem("    about us      ");
		r3.setFont(new Font("cooper", Font.BOLD, 24));
		r3.setForeground(Color.black);
		r3.setBackground(Color.yellow);
		r3.addActionListener(this);
		m3.add(r3);
		r2 = new JMenuItem("      admin      ");
		r2.setFont(new Font("cooper", Font.BOLD, 24));
		r2.setForeground(Color.black);
		r2.setBackground(Color.yellow);
		r2.addActionListener(this);
		m1.add(r2);
        r1 = new JMenuItem("receptionist");
        r1.setFont(new Font("cooper", Font.BOLD, 24));
		r1.setForeground(Color.black);
		r1.setBackground(Color.yellow);
		r1.addActionListener(this);
		//r1.setBounds();
		m2.add(r1);
		la = new JLabel();
		la.setForeground(Color.black);
		la.setBounds(500,550, 500, 50);
		la.setFont(new Font("forte", Font.BOLD , 30));
		lb = new JLabel();
		lb.setForeground(Color.black);
		lb.setBounds(500,600, 500, 50);
		lb.setFont(new Font("forte", Font.BOLD , 30));
		c.add(la);
		c.add(lb);
		lb.revalidate();
		lb.repaint();
		c.setBackground(Color.yellow);
		c.setBounds(0, 0, 200, 1000);
		setUndecorated(false);
		setResizable(true);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		//setSize(1000,900);
		//setTitle("vishakha");
		setLocationRelativeTo(null);
		setVisible(true);
		clock();
		
	}

	public static void main(String[] args) 
	{
		CompleteForm ob = new CompleteForm();

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==exit)
		{
			System.exit(0);
			
		}
		if(e.getSource()== r1)
		{
		 new Registration();
		}
		if(e.getSource()== r2)
		{
		 new Adminsignin();
		}
		if(e.getSource()== r3)
		{
		 new aboutus();
		}
	
	
		
	}

}
