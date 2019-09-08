import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JavaExam extends JFrame implements ActionListener
{
	JLabel l;
	JRadioButton jb[]=new JRadioButton[5];
	JButton b1;
	ButtonGroup bg;
	int count=0,current=0,x=1,y=1,now=0;
	int m[]=new int[10];	
	Font font,font1;
	JavaExam(String s)
	{
		super(s);
		ImageIcon img = new ImageIcon("test.png");
	

		setIconImage(img.getImage());
		l=new JLabel();
		

		font=new Font(Font.SERIF,Font.BOLD,16);
		font1=new Font(Font.SERIF,Font.BOLD,18);
		add(l);			
		
		bg=new ButtonGroup();
		for(int i=0;i<5;i++)
		{
			jb[i]=new JRadioButton();	
			add(jb[i]);
			bg.add(jb[i]);
		}
		b1=new JButton("Next");
		
		b1.addActionListener(this);
		
		
		add(b1);
		set();
		l.setFont(font);
		jb[0].setFont(font1);
		jb[1].setFont(font1);
		jb[2].setFont(font1);
		jb[3].setFont(font1);
		l.setBounds(10,40,600,40);
		
		
		b1.setBackground(Color.YELLOW);

		jb[0].setBackground(Color.WHITE);
		jb[1].setBackground(Color.WHITE);
		jb[2].setBackground(Color.WHITE);
		jb[3].setBackground(Color.WHITE);
		
		jb[0].setBounds(90,100,200,50);
		jb[1].setBounds(90,130,200,50);
		jb[2].setBounds(90,160,200,50);
		jb[3].setBounds(90,190,200,50);
		b1.setBounds(190,280,100,50);
		setBackground(Color.WHITE);
	
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setLocation(400,300);
		setVisible(true);
		setSize(500,440);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			if(check())
				count=count+1;
			current++;
			set();	
			if(current==9)
			{
				b1.setEnabled(true);
				b1.setText("Result");
			}
		}
		
	
		if(e.getActionCommand().equals("Result"))
		{
			if(check())
				count=count+1;
			current++;
			//System.out.println("correct ans="+count);
			JOptionPane.showMessageDialog(this,"correct ans="+count);
			System.exit(0);
		}
	}
	void set()
	{
		jb[4].setSelected(true);
		if(current==0)
		{
			l.setText("Que1: Which one among these is not a datatype");
			jb[0].setText("int");jb[1].setText("Float");jb[2].setText("boolean");jb[3].setText("char");	
		}
		if(current==1)
		{
			l.setText("Que2: Which class is available to all the class automatically");
			jb[0].setText("Swing");jb[1].setText("Applet");jb[2].setText("Object");jb[3].setText("ActionEvent");
		}
		if(current==2)
		{
			l.setText("Que3: Which package is directly available to in class without import");
			jb[0].setText("swing");jb[1].setText("applet");jb[2].setText("net");jb[3].setText("lang");
		}
		if(current==3)
		{
			l.setText("Que4: String class is defined in which package");
			jb[0].setText("lang");jb[1].setText("Swing");jb[2].setText("Applet");jb[3].setText("awt");
		}
		if(current==4)
		{
			l.setText("Que5: What is the size of int");
			jb[0].setText("2 byte");jb[1].setText("1 byte");jb[2].setText("32 bit");jb[3].setText("8 byte");
		}
		if(current==5)
		{
			l.setText("Que6: Which one among these is not a keyword");
			jb[0].setText("class");jb[1].setText("int");jb[2].setText("get");jb[3].setText("if");
		}
		if(current==6)
		{
			l.setText("Que7: Which one among these is not a class ");
			jb[0].setText("Swing");jb[1].setText("Frame");jb[2].setText("ActionEvent");jb[3].setText("Button");
		}
		if(current==7)
		{
			l.setText("Que8: which one among these is not a function of Object class");
			jb[0].setText("toString");jb[1].setText("finalize");jb[2].setText("equals");jb[3].setText("getDocumentBase");		
		}
		if(current==8)
		{
			l.setText("Que9: which function is not present in Applet class");
			jb[0].setText("init");jb[1].setText("main");jb[2].setText("start");jb[3].setText("destroy");
		}
		if(current==9)
		{
			l.setText("Que10: Which one among these is not a valid component");
			jb[0].setText("JButton");jb[1].setText("JList");jb[2].setText("JButtonGroup");jb[3].setText("JTextArea");
		}
		l.setBounds(10,40,450,20);
		for(int i=0,j=0;i<=90;i+=30,j++)
			jb[j].setBounds(50,80+i,200,40);
	}
	boolean check()
	{
		if(current==0)
			return(jb[1].isSelected());
		if(current==1)
			return(jb[2].isSelected());
		if(current==2)
			return(jb[3].isSelected());
		if(current==3)
			return(jb[0].isSelected());
		if(current==4)
			return(jb[2].isSelected());
		if(current==5)
			return(jb[2].isSelected());
		if(current==6)
			return(jb[1].isSelected());
		if(current==7)
			return(jb[3].isSelected());
		if(current==8)
			return(jb[1].isSelected());
		if(current==9)
			return(jb[2].isSelected());
		return false;
	}
	public static void main(String s[])
	{
		new JavaExam("JavaExam 2.0");
	}


}
