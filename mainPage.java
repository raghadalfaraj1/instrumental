import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.*;

public class mainPage extends JFrame implements ActionListener {
	login login = new login();
	signup signup = new signup();
	test test = new test();
	
	public mainPage(){
		
//		setUndecorated(true);
		ImageIcon image = new ImageIcon("1.jpg"); //ADD IMAGE
		JLabel l1 = new JLabel("Instrumental");
		JLabel background = new JLabel(image);
		JButton b1 = new JButton("Login");
		JButton b2 = new JButton("Sign Up");
		JButton b3 = new JButton("Compatibility Test");
		
		
		
		
		Font sty1 = new Font("Courier New",Font.BOLD,50);

		
		l1.setFont(sty1);
		l1.setBounds(70,15,400,70);
		b1.setBounds(270,105,100,40);
		b2.setBounds(270,190,100,40);
		b3.setBounds(220,260,200,40);
		
		b1.setBorderPainted(false);	
		b2.setBorderPainted(false);
		b3.setBorderPainted(false);
		
		b1.setToolTipText("already have an account");
		b2.setToolTipText("Create new account");
		b3.setToolTipText("Test your compatibility now");
		
		
		
	    
		add(background);
		background.add(l1);
		background.add(b1);	
		background.add(b2);
		background.add(b3);
	
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae){
		
		String s = ae.getActionCommand();	

		if(s.equals("Login"))
		{login.pack();
	    login.setLocationRelativeTo(null);
		login.setVisible(true);
    	login.setSize(699,357);}
		
		else if(s.equals("Sign Up"))
		{signup.pack();
	    signup.setLocationRelativeTo(null);
		signup.setVisible(true);
    	signup.setSize(699,357);}
		
		else if(s.equals("Compatibility Test"))
		{test.pack();
		test.setLocationRelativeTo(null);
		test.setVisible(true);
    	test.setSize(699,357);}
		
		else
			System.exit(0);
	}
	
	public class login extends JFrame implements ActionListener {
		
		public login() {
			
			//setUndecorated(true);
			JLabel background = new JLabel(new ImageIcon("2.jpg"));
			JLabel l1 = new JLabel("Username or Email");
			JLabel l2 = new JLabel("Password");
			JLabel l3 = new JLabel("Instrumental");
			JLabel l4 = new JLabel("Login");
			JButton b1 =new JButton("Submit");
			JTextField t1 = new JTextField(25);
			JPasswordField t2 = new JPasswordField(25);
	
			
			Font sty1 = new Font("Courier New",Font.BOLD,18);
			Font sty2 = new Font("Casual",Font.BOLD,15);
			Font sty3 = new Font("Casual",Font.BOLD,30);
			
			l1.setFont(sty2);
			l2.setFont(sty2);
			l3.setFont(sty1);
			l4.setFont(sty3);
			b1.setFont(sty2);
			
		
			l1.setBounds(100,100,200,30); //username
			l2.setBounds(100,180,200,30); //password
			l3.setBounds(0,0,200,50); //title
			t1.setBounds(250,100,200,30); //username field
			t2.setBounds(250,180,200,30); //password field
			b1.setBounds(460,260,200,30);
			l4.setBounds(270,40,200,50);
			
			b1.setBorderPainted(false);	
			
			
			b1.setToolTipText("Submit Entry");
			
			add(background);
			background.add(l1);
			background.add(l2);
			background.add(l3);
			background.add(l4);
			background.add(b1);
			background.add(t1);
			background.add(t2);
			
			
			
			b1.addActionListener(this);
			
			
		}
		public void actionPerformed(ActionEvent ae){}
	}
	public class signup extends JFrame implements ActionListener {
		public signup() {
			

			//setUndecorated(true);
			JLabel background = new JLabel(new ImageIcon("2.jpg"));
			JLabel l1 = new JLabel("First Name");
			JLabel l2 = new JLabel("Last Name");
			JLabel l3 = new JLabel("Email");
			JLabel l4 = new JLabel("Password");
			JLabel l5 = new JLabel("Confirm Password");
			JLabel l6 = new JLabel("Perior Experience");
			JLabel l7 = new JLabel("Phone # (Optional)");
			JLabel l8 = new JLabel("Sign Up");
			JLabel l9 = new JLabel("Instrumental");
			JButton b1 =new JButton("Submit");
			JTextField t1 = new JTextField(25);
			JTextField t2 = new JTextField(25);
			JTextField t3 = new JTextField(25);
			JTextField t4 = new JTextField(25);
			JPasswordField t6 = new JPasswordField(25);
			JPasswordField t7 = new JPasswordField(25);
			JRadioButton rb1=new JRadioButton("Yes");
			JRadioButton rb2=new JRadioButton("No");
			
			
			Font sty1 = new Font("Courier New",Font.BOLD,18);
			Font sty2 = new Font("Casual",Font.BOLD,30);
			
			
			l8.setFont(sty2);
			l9.setFont(sty1);
		
			
			l1.setBounds(100,100,200,30); //Firstname
			t1.setBounds(250,100,200,30); // field
			
			l2.setBounds(100,130,200,30); //LastName
			t2.setBounds(250,130,200,30); 
			
			l3.setBounds(100,160,200,30); //Email
			t3.setBounds(250,160,200,30); 
			
			l4.setBounds(100,190,200,30); //pass
			t6.setBounds(250,190,200,30);  
			
			l5.setBounds(100,220,200,30); //confirm pass
			t7.setBounds(250,220,200,30); //password field
			
		
			l6.setBounds(100,250,200,30); //prior expercien
			rb1.setBounds(250,250,200,30);
			rb2.setBounds(300,250,200,30);
			
			l7.setBounds(100,280,200,30); //phone number
			t4.setBounds(250,280,200,30); 
			
			l8.setBounds(250,50,200,50); //sign up 
			
		
			b1.setBounds(460,260,200,30);
			l9.setBounds(0,0,200,50); //title
			
			b1.setBorderPainted(false);	
			
			b1.setToolTipText("Submit Entry");
		
			
			add(background);
			background.add(l1);
			background.add(l2);
			background.add(l3);
			background.add(l4);
			background.add(l5);
			background.add(l6);
			background.add(l7);
			background.add(l8);
			background.add(l9);
			
			background.add(b1);
			background.add(t1);
			background.add(t2);
			background.add(t3);
			background.add(t4);
			background.add(t6);
			background.add(t7);
			background.add(rb1);
			background.add(rb2);
		
			b1.addActionListener(this);
			
			
		}
		public void actionPerformed(ActionEvent ae){}
	}
	public class test extends JFrame implements ActionListener {
		public test() {
			
			//setUndecorated(true);
			JLabel background = new JLabel(new ImageIcon("2.jpg"));
			JLabel l1 = new JLabel("1-Do you like being the center of attention?");
			JLabel l2 = new JLabel("2-Do you like practicing for long hours?");
			JLabel l3 = new JLabel("3-Do you prefer sitting or standing?");
			JLabel l4 = new JLabel("4-Are you a Natural leader?");
			JLabel l5 = new JLabel("5-What genre of music is your favorite?");
			JLabel l6 = new JLabel("6-What is your favorite season");
			JLabel l7 = new JLabel("7-What instrument sound is your favorite?");
			JLabel l8 = new JLabel("Compatability Test");
			JLabel l9 = new JLabel("Instrumental");
			JButton b1 =new JButton("Submit");
		
			JRadioButton rb1=new JRadioButton("Yes");
			JRadioButton rb2=new JRadioButton("No");
			JRadioButton rb3=new JRadioButton("Yes");
			JRadioButton rb4=new JRadioButton("No");
			JRadioButton rb5=new JRadioButton("Yes");
			JRadioButton rb6=new JRadioButton("No");
			JRadioButton rb7=new JRadioButton("Yes");
			JRadioButton rb8=new JRadioButton("No");
			JRadioButton rb9=new JRadioButton("Yes");
			JRadioButton rb10=new JRadioButton("No");
			JRadioButton rb11=new JRadioButton("Yes");
			JRadioButton rb12=new JRadioButton("No");
			JRadioButton rb13=new JRadioButton("Yes");
			JRadioButton rb14=new JRadioButton("No");
			
			
			Font sty1 = new Font("Courier New",Font.BOLD,18);
			Font sty2 = new Font("Casual",Font.BOLD,30);
			
			
			l8.setFont(sty2);
			l9.setFont(sty1);
		
			
			l1.setBounds(50,100,500,30); //q1
			rb1.setBounds(350,100,200,30);
			rb2.setBounds(400,100,200,30);
			
			l2.setBounds(50,130,500,30); //q2
			rb3.setBounds(350,130,200,30);
			rb4.setBounds(400,130,200,30);
			
			l3.setBounds(50,160,500,30); //q3
			rb5.setBounds(350,160,200,30);
			rb6.setBounds(400,160,200,30);
			
			l4.setBounds(50,190,500,30); //q4
			rb7.setBounds(350,190,200,30);
			rb8.setBounds(400,190,200,30); 
			
			l5.setBounds(50,220,500,30); //q5
			rb9.setBounds(350,220,200,30);
			rb10.setBounds(400,220,200,30);
			
		
			l6.setBounds(50,250,500,30); //q6
			rb11.setBounds(350,250,200,30);
			rb12.setBounds(400,250,200,30);
			
			l7.setBounds(50,280,500,30); //7q
			rb13.setBounds(350,280,200,30);
			rb14.setBounds(400,280,200,30);
			
			l8.setBounds(170,40,500,50); //test
			
			
		
			b1.setBounds(460,260,200,30);
			l9.setBounds(0,0,200,50); //title
			
			b1.setBorderPainted(false);	
			
			b1.setToolTipText("Submit Entry");
			
			
			add(background);
			background.add(l1);
			background.add(l2);
			background.add(l3);
			background.add(l4);
			background.add(l5);
			background.add(l6);
			background.add(l7);
			background.add(l8);
			background.add(l9);
			
			background.add(rb1);
			background.add(rb2);
			background.add(rb3);
			background.add(rb4);
			background.add(rb5);
			background.add(rb6);
			background.add(rb7);
			background.add(rb8);
			background.add(rb9);
			background.add(rb10);
			background.add(rb11);
			background.add(rb12);
			background.add(rb13);
			background.add(rb14);
			background.add(b1);
			
			b1.addActionListener(this);
			
		}
		public void actionPerformed(ActionEvent ae){}
	}
	
	public static void main (String[] args)  { 
		
		mainPage mainPage = new mainPage();
		mainPage.pack();
	    mainPage.setLocationRelativeTo(null);
    	mainPage.setVisible(true);
    	mainPage.setTitle("INSTRUMENTAL");
    	mainPage.setSize(699,357);
		
	}
	
}
