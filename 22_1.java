import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class s22_2 extends JFrame implements ActionListener
{
JMenuBar mb;
JMenu m1,m2;
JMenuItem i1,i2,i3,i4;
public int num1,num2;

public s22_2()
{
super("Slip 22");
setLayout(null);

mb= new JMenuBar();
m1= new JMenu("Operation");
m2= new JMenu("Compute");
i1=new JMenuItem("Accept");
i2=new JMenuItem("EXIT");
i3=new JMenuItem("GCD");
i4=new JMenuItem("Power");

m1.add(i1);
m1.addSeparator();
m1.add(i2);
m2.add(i3);
m2.add(i4);
mb.add(m1);
mb.add(m2);
setJMenuBar(mb);
add(mb);

i1.addActionListener(this);
i2.addActionListener(this);
i3.addActionListener(this);
i4.addActionListener(this);


setVisible(true);
setSize(300,200);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setLocation(400,200);
}

public void actionPerformed(ActionEvent ae)
{
		if(ae.getSource()==i1)
		{
            num1=Integer.parseInt(JOptionPane.showInputDialog("ENter n1"));
             num2=Integer.parseInt(JOptionPane.showInputDialog("ENter n2"));
		}

		else if(ae.getSource()==i2)
		{
			dispose();
		}


		else if(ae.getSource()==i3)
		{
			int gcd=1,max,min;
     if(num1<num2)
        {     
	     	min=num1;
	     	max=num2;
     	}
     	else
     	{
     		min=num2;
     	    max=num1;
     	}
     		for(int j=1;j<=min;j++)
     			if(max%j==0&&min%j==0) gcd=j;
     			
     			JOptionPane.showMessageDialog(this,""+gcd);
		}


		else if(ae.getSource()==i4)
		{
			
            JOptionPane.showMessageDialog(this,""+Math.pow((double)num1,(double)num2));  
		}
}
public static void main(String []args) 
{
new s22_2();
}

}