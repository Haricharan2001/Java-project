package project;
import java.awt.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;  
public class Frame2 extends Frame{  
public Frame2(){
setSize(300,300); 
setLayout(null);  
setVisible(true);
}  
public static void main(String args[]){  
Frame2 f=new Frame2(); 

JLabel l1; 

l1=new JLabel(" * * * * * Outsiders Details  sent to the Relatives* * * * * ");  
l1.setBounds(250,120, 290,90);  
f.add(l1);
JLabel l2; 
l2=new JLabel("If they are related then:");  
l2.setBounds(250,170, 250,80);  
f.add(l2);
JLabel l3; 
l3=new JLabel("If they are not related then:");  
l3.setBounds(250,260, 250,80);  
f.add(l3);
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
LocalDateTime now = LocalDateTime.now();  
System.out.println(dtf.format(now));  
JButton b=new JButton(" Accept ");
b.setBounds(440,190,90, 40);    
f.add(b);
JButton b1=new JButton(" Decline ");
b1.setBounds(440,280,90,40);
f.add(b1);



	
}

	
	
}

	
	
