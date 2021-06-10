import java.awt.*;
import javax.swing.*;
class swingComponents{
	JFrame f;
	JLabel email;
	JLabel pass;
	JTextField email_t;
	JPasswordField pwd;
	JButton btn;
	swingComponents(){
  
		f=new JFrame();
		email=new JLabel("E-mail");
		pass=new JLabel("Pass");
		email_t=new JTextField(15);
		pwd=new JPasswordField(15);
		btn=new JButton("Login");

		email.setBounds(15,20,50,20);
		email_t.setBounds(60,20,100,20); 
	  pass.setBounds(15,50,50,20);
		pwd.setBounds(60,50,100,20);
		btn.setBounds(25,90,80,20);
		f.setLayout(null);

		f.add(email);
		f.add(email_t);
		f.add(pass);
		f.add(pwd);
		f.add(btn);
		f.setVisible(true);
		f.setSize(300,300);
		f.setTitle("Login");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public static void main(String[] args) {
	swingComponents obj=new swingComponents();	
	}
}
