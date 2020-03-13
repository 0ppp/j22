import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
public class SampleMenu3 extends JFrame implements ActionListener
{
JMenuItem accept,save,exit,GCD,Power;
JRadioButtonMenuItem b1,b2;
JMenuBar mb;
JTextArea tr;
JMenu m,New;
ButtonGroup bg;
JFileChooser  fc1;
JLabel lblnum;
public SampleMenu3() 
{
setSize(600,700) ;
initComponent();
setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);
}

public void initComponent()
{
bg=new ButtonGroup();
mb = new JMenuBar();
accept=new JMenuItem("  Accept    ");

exit=new JMenuItem("  Exit    ");
GCD=new JMenuItem("GCD");
Power=new JMenuItem("Power");


setJMenuBar(mb) ;

lblnum = new JLabel("Numbers :");
mb.add(m = new JMenu("Operation "));
m.add(accept);

m.addSeparator();		
m.add(exit);
mb.add(m = new JMenu("Compute"));
m.add(GCD);
m.add(Power);

add(lblnum);
JPanel p = new JPanel();
p.add(new JTextArea());
tr=new JTextArea(" ");
lblnum.setBounds(80,210,100,30);
tr.setBounds(50,250,500,300);
add(tr);
add(p);
	
accept.addActionListener(this);

exit.addActionListener(this);
GCD.addActionListener(this);
Power.addActionListener(this);
}
	
public void actionPerformed(ActionEvent e) 
{

Object src = e.getSource();
String fname="";
String num="";

if(src.equals(exit))
{
  setVisible(false);
  System.exit(0);
}
		
else if(src.equals(GCD))
{
System.out.println("GCD Button Clicked");

}

else if(src.equals(Power))
{
System.out.println("Power Button Clicked");

}

}

public static void main(String arg[]) 
{
new SampleMenu3();
}


}


