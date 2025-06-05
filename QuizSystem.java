import java.awt.event.*;
import javax.swing.*;
import java.util.*;

class Student
{
	String name;
	int regno;
	int sc,quiz;
	double avg;

	Student(int regno,int sc,int quiz,String name)
	{
		this.name = name;
		this.regno = regno;
		this.sc = sc;
		this.quiz = quiz;
		this.avg = sc/quiz;
	}

	public String toString()
	{
		return("Name : "+name+"\nReg No : "+regno+"\nScore : "+sc+"\nQuiz Count : "+quiz+"\nAverage : "+avg+"\n");
	}

}

class QuizManagement
{
	ArrayList<Student> stu;

	QuizManagement()
	{
	stu = new ArrayList<Student>();
	}

	void add(int regno,int sc,int quiz,String name)
	{
		Student s = new Student(regno,sc,quiz,name);
		stu.add(s);
	}

	Student search(int reg)
	{
		for(Student s1 : stu)
		{
			if(s1.regno == reg)
			{
				return s1;
			}
		}

		return null;
	}
}

class QuizSystem
{
	JFrame frm;
	JLabel l1,l2,l3,l4;
	JTextField tf1,tf2,tf3,tf4;
	JTextArea ta;
	JButton b1,b2,b3,b4,b5,b6,b7;
	QuizManagement q;
	
	int c,l;

	QuizSystem()
	{
		c = 0;
		l = 0;
		q = new QuizManagement();
		
		frm = new JFrame();
		frm.setVisible(true);
		frm.setLayout(null);
		frm.setTitle("Quiz Management");
		frm.setSize(700,400);

		l1 = new JLabel("Name : ");
		l2 = new JLabel("RegNo : ");
		l3 = new JLabel("No.Quiz : ");
		l4 = new JLabel("Scores : ");

		tf1 = new JTextField();
		tf2 = new JTextField();
		tf3 = new JTextField();
		tf4 = new JTextField();

		ta = new JTextArea();

		b1 = new JButton("ADD");
		b2 = new JButton("SEARCH");
		b3 = new JButton("DISPLAY");
		b4 = new JButton("FIRST");
		b5 = new JButton("LAST");
		b6 = new JButton("NEX");
		b7 = new JButton("PREV");
		
		frm.add(ta);
		ta.setBounds(250,50,350,220);

		frm.add(l1);
		l1.setBounds(50,50,75,25);
		frm.add(tf1);
		tf1.setBounds(115,50,80,25);

		frm.add(l2);
		l2.setBounds(50,100,75,25);
		frm.add(tf2);
		tf2.setBounds(115,100,80,25);

		frm.add(l3);
		l3.setBounds(50,150,75,25);
		frm.add(tf3);
		tf3.setBounds(115,150,80,25);

		frm.add(l4);
		l4.setBounds(50,200,75,25);
		frm.add(tf4);
		tf4.setBounds(115,200,80,25);

		frm.add(b1);
		b1.setBounds(40,250,60,20);
		frm.add(b2);
		b2.setBounds(110,250,100,20);
		frm.add(b3);
		b3.setBounds(70,290,100,20);
		frm.add(b4);
		b4.setBounds(250,290,80,20);
		frm.add(b5);
		b5.setBounds(340,290,80,20);
		frm.add(b6);
		b6.setBounds(430,290,80,20);
		frm.add(b7);
		b7.setBounds(520,290,80,20);


		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				String name = tf1.getText();// input from user
				int regno = Integer.parseInt(tf2.getText());// input
				int qu = Integer.parseInt(tf3.getText());//input
				int sc = Integer.parseInt(tf4.getText());//input


				// checking condition of all the input variables
				if(name == null || regno == 0 || sc == 0 || qu == 0)
				{
					ta.setText("Null Value");//text area - here is used for displaying either the output or some message or error
				}
				
				// add method
				q.add(regno,sc,qu,name);
				ta.setText("Added Successfully!");

				l++;// business logic

				// reseting the text fields (empty)
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
				tf4.setText("");
			}
		});

		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				int regno = Integer.parseInt(tf2.getText());
				Student s = q.search(regno);
				ta.setText(s+"");
			}
		});

		b3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				for(Student s : q.stu)
				{
					ta.setText(ta.getText()+s+"");
				}
			}
		});

		b4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				int check = 0;

				for(Student s : q.stu)
				{
					if(check == 0)
					{
						ta.setText(s+"");
					}
					check++;
				}
			}
		});

		b5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				int check = 0;

				for(Student s : q.stu)
				{
					if(check == l-1)
					{
						ta.setText(s+"");
					}
					check++;
				}
			}
		});

		b6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				int check = 0;

				if(c<l)
				{
					++c;
				}

				for(Student s : q.stu)
				{
					if(check == c)
					{
						ta.setText(s+"");
					}
					check++;
				}
			}
		});

		b7.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				int check = 0;

				if(c>0)
				{
					--c;
				}

				for(Student s : q.stu)
				{
					if(check == c)
					{
						ta.setText(s+"");
					}
					check++;
				}
			}
		});
		
	}
	public static void main(String args[])
	{
		new QuizSystem();
	}
}