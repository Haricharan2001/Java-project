import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import project.Frame2;
import project.Frame3;
public abstract class Frame implements  ActionListener{
public static void main(String args[])  
    {  
    JFrame f= new JFrame();  
    JLabel l1;
  l1=new JLabel("*****Security Management System*****");  
    l1.setBounds(250,120, 250,80);  
    f.add(l1);
   Choice c=new Choice();  
        c.setBounds(200,200,130,30);  
        c.add("Block A");  
        c.add("Block B");  
        c.add("Block C");  
        c.add("Block D");  
         f.add(c);  
        f.setSize(1400,1400);  
        f.setLayout(null);  
        f.setVisible(true);  
         f.setSize(1400,1400);  
      Choice c1=new Choice();  
    c1.setBounds(400,200,140,30);  
    c1.add("Room-No:101");  
    c1.add("Room-No:201");  
    c1.add("Room-No:301");  
    c1.add("Room-No:401");  
     f.add(c1);  
   f.setLayout(null);  
    f.setVisible(true);  
JRadioButton r1=new JRadioButton(" Request "); 
 r1.setBounds(270,200,180,180);    
 ButtonGroup bg=new ButtonGroup();    
bg.add(r1);   
f.add(r1); 
f.setSize(1400,1400);
TextField t3;  
t3=new TextField();  
t3.setBounds(250,380, 200,30);  
f.add(t3); 
f.setLayout(null);  
f.setVisible(true);  
TextField t1,t2;
t1=new TextField();  
t1.setBounds(730,250, 200,30);  
t2=new TextField();
Label l3,l4,l5; 
l3=new Label(" NAME:  ");  
l3.setBounds(630,250, 100,30);  
l4=new Label(" MOBILENO:  ");  
l4.setBounds(620,350, 100,30); 
l5=new Label(" MOBILENO:  ");  
l5.setBounds(150,380, 100,30);  
f.add(l3); f.add(l4);f.add(l5);
f.setLayout(null);  
f.setVisible(true);  
t2.setBounds(730,350, 200,30);  
f.add(t1); f.add(t2);    
f.setLayout(null);  
f.setVisible(true); 
JButton b=new JButton("Submit");
b.setBounds(270,500,90, 40);    
f.add(b);
b.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String NAME=t1.getText();
		String MOBILENO=t2.getText();
		Frame2 f2=new Frame2(); 
		f2.setSize(1400,1400);
		JLabel l1,l2; 
		l1=new JLabel("NAME:");
		l1.setBounds(630,250, 100,30);
		l2=new JLabel("MOBILENO:");
		l2.setBounds(620,350, 100,30);
		f2.add(l1);
		f2.add(l2);
		l1=new JLabel(" * * * * * Outsiders Details sent to the Relatives * * * * * ");  
		l1.setBounds(250,120, 290,90);  
		f2.add(l1);
	JLabel l3; 
		l3=new JLabel("If they are related then:");  
		l3.setBounds(250,170, 250,80);  
		f2.add(l3);
		JLabel l4; 
		l4=new JLabel("If they are not related then:");  
		l4.setBounds(250,260, 250,80);  
		f2.add(l4);
		JTextField t1,t2;
		t1=new JTextField(NAME);
		t1.setBounds(730,250, 200,30);
		t1.setEditable(false);
		t2=new JTextField(MOBILENO);
		t2.setBounds(730,350, 200,30);
		t2.setEditable(false);
		f2.add(t1); f2.add(t2);
		JButton b=new JButton(" Accept ");
		JButton b1=new JButton(" Decline ");
		b.setBounds(440,190,90, 40);    
		b1.setBounds(440,280,90,40);    
		f2.add(b);f2.add(b1);
		b.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){  
		    	  JFrame f3= new JFrame();  
		    	    JLabel l1; 
		    	    l1=new JLabel("*****Security Management System*****");  
		    	    l1.setBounds(250,120, 250,80);  
		    	    f3.add(l1);
		    	    JLabel l2; 
		    	    l2=new JLabel("  WELCOME TO SRINADH  RESIDENCY ");  
		    	    l2.setBounds(260,300, 250,80);  
		    	    f3.add(l2);
		    	   Choice c=new Choice();  
		    	        c.setBounds(200,200,130,30);  
		    	        c.add("Block A");  
		    	        c.add("Block B");  
		    	        c.add("Block C");  
		    	        c.add("Block D");  
		    	         f3.add(c);  
		    	        f3.setSize(1400,1400);  
		    	        f3.setLayout(null);  
		    	        f3.setVisible(true);  
		    	         f3.setSize(900,900);  
		    	    f3.setLayout(null);  
		    	    f3.setVisible(true); 
		    	    Choice c1=new Choice();  
		    	    c1.setBounds(400,200,140,30);  
		    	    c1.add("Room-No:101");  
		    	    c1.add("Room-No:201");  
		    	    c1.add("Room-No:301");  
		    	    c1.add("Room-No:401");  
		    	     f3.add(c1);  
		    	   f3.setLayout(null);  
		    	    f3.setVisible(true);  
		    	     f3.setSize(1400,1400);
		    	JButton b=new JButton("Submit");
		    	b.setBounds(270,400,130, 40);    
		    	f3.add(b);
		    	f.dispose();
		    	TextField t1;  
		        t1=new TextField("Gates should be opened");  
		        t1.setBounds(230,450, 200,30);  
		        t1.setEditable(false);
		        f3.add(t1);
		        b.addActionListener(new ActionListener(){  
				    public void actionPerformed(ActionEvent e){  
				    	Frame3 f=new Frame3(); 
				    	JLabel l1; 
				    	l1=new JLabel("***** Vehicle Parking *****");  
				    	l1.setBounds(250,120, 250,80);  
				    	f.add(l1);
				    	l1=new JLabel(" ENTER INFO ");  
				    	l1.setBounds(350,170, 250,80);  
				    	f.add(l1);
				    	l1=new JLabel(" CAR ID# ");  
				    	l1.setBounds(270,210, 250,80);  
				    	f.add(l1);
				    	l1=new JLabel(" Token No# ");  
				    	l1.setBounds(270,250, 250,80);  
				    	f.add(l1);
				    	JButton b=new JButton("SUBMIT");
				    	b.setBounds(350,550,90, 40);    
				    	f.add(b);
				    	JLabel j13=new JLabel("DATE:");j13.setBounds(270,380,70,30);
				    	j13.setFont(new Font("Courier New",Font.ITALIC,20));
				    	String date1[]= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
				    	final JComboBox dm=new JComboBox(date1);
				    	dm.setBounds(450,380,70,30);
				    	dm.setFont(new Font("Courier New",Font.ITALIC,20));
				    	f.add(j13);
				    	f.add(dm);
				    	JLabel j14=new JLabel("MONTH:");j14.setBounds(270,320,90,30);
				    	j14.setFont(new Font("Courier New",Font.ITALIC,20));
				    		String num[]= {"jan","feb","mar","april","may","june","july","aug","sept","oct","nov","dec"};
				    		final JComboBox cm=new JComboBox(num);
				    		cm.setBounds(450,320,90,30);
				    		cm.setFont(new Font("Courier New",Font.ITALIC,20));	
				    	f.add(j14);
				    		f.add(cm);
				    	
				    	Checkbox checkbox1 = new Checkbox("Male");  
				    	checkbox1.setBounds(510, 450,50,50);  
				    	Checkbox checkbox2 = new Checkbox("Female");  
				    	checkbox2.setBounds(630,450, 50,50);  
				    	f.add(checkbox1);  
				    	f.add(checkbox2);  
				    	f.setSize(1400,1400);  
				    	f.setLayout(null);  
				    	f.setVisible(true);  
				    	TextField t1,t2;  
				    	t1=new TextField("");  
				    	t1.setBounds(600,240, 150,20);  
				    	t2=new TextField("");  
				    	t2.setBounds(600,280, 150,20);  
				    	f.add(t1); f.add(t2);  
				    	f.setSize(1400,1400);  
				    	f.setLayout(null);  
				    	f.setVisible(true);  
				    	TextField t3,t4,t5; 
				    	t3=new TextField("");  
				    	t3.setBounds(600,320, 150,20); 
				    	b.addActionListener(new ActionListener() {
				     		public void actionPerformed(ActionEvent e) {
				     		JFrame F;
				     		 JFrame f1= new JFrame();
				     		 JOptionPane.showMessageDialog(f1,"PLZ collect ur token");
           b1.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){  
		    	  JFrame f3= new JFrame();  
		    	    JLabel l1; 
		    	    l1=new JLabel("*****Security Management System*****");  
		    	    l1.setBounds(250,120, 250,80);  
		    	    f3.add(l1);
		    	    Choice c=new Choice();  
		    	        c.setBounds(200,200,130,30);  
		    	        c.add("Block A");  
		    	        c.add("Block B");  
		    	        c.add("Block C");  
		    	        c.add("Block D");  
		    	         f3.add(c);  
		    	        f3.setSize(1400,1400);  
		    	        f3.setLayout(null);  
		    	        f3.setVisible(true);  
		    	         f3.setSize(1400,1400);  
		    	    f3.setLayout(null);  
		    	    f3.setVisible(true); 
		    	    Choice c1=new Choice();  
		    	    c1.setBounds(400,200,140,30);  
		    	    c1.add("Room-No:101");  
		    	    c1.add("Room-No:201");  
		    	    c1.add("Room-No:301");  
		    	    c1.add("Room-No:401");  
		    	     f3.add(c1);  
		    	   f3.setLayout(null);  
		    	    f3.setVisible(true);  
		    	     f3.setSize(1400,1400);
		    	JButton b=new JButton("EXIT");
		    	b.setBounds(270,400,130, 40);    
		         f3.add(b);  
		         b.addActionListener(new ActionListener() {
		     		public void actionPerformed(ActionEvent e) {
		     		JFrame F;
		     		 JFrame f1= new JFrame();
		     		 JOptionPane.showMessageDialog(f1,"THANK YOU ");
		    	TextField t1;  
		        t1=new TextField("Gates should  not be opened");  
		        t1.setBounds(230,450, 200,30);  
		        t1.setEditable(false);
		        f3.add(t1);f2.dispose();
		   
	    }  
	    });  
		    }  
	    });  
		    }
		});
	}
});
    }
});
    }
});
    
}
}
    

