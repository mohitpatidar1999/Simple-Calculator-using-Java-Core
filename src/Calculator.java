import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;

public class Calculator extends JFrame  {

	private static final long serialVersionUID = 1L;
	private JTextField t;
	private double num1,num2,result;
	private String operations;
	private JButton b0,b1,b2,b3,b4,b5,b6,b7,b8 ,b9,plus,minus,mult,div,ac,del,back,sign,equals;
	

	Calculator(){}
	Calculator(String title){ super(title);	}
	
public void setScreen() {

		Font f=new Font("SansSerif",Font.BOLD,20);
		
		
		t=new JTextField();
		add(t);
		t.setFont(f);
		t.setBackground(Color.CYAN);
		t.setColumns(10);
		t.setBounds(10, 50, 250, 45);
		t.setBorder(new MatteBorder(new Insets(2,3,2,3),Color.black));
		t.setHorizontalAlignment(JTextField.RIGHT);
	}

public void setButtons(){

	//Setting default layout to null
	
		setLayout(null);
		Font f=new Font("SansSerif",Font.BOLD,20);

		//         ---Button 9---
	
		b9=new JButton("9");
		add(b9);
		b9.setBackground(Color.orange);
		b9.setBounds(140, 180, 50, 50);
		b9.setFont(f);
		b9.setBorder(BorderFactory.createLineBorder(Color.black,1));
		
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num=t.getText()+b9.getText();
				t.setText(num);
			}
		});

		
		//         ---Button 8---
		
		b8=new JButton("8");
		add(b8);
		b8.setBackground(Color.orange);
		b8.setBounds(80, 180, 50, 50);
		b8.setFont(f);
		b8.setBorder(BorderFactory.createLineBorder(Color.black,1));
		
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num=t.getText()+b8.getText();
				t.setText(num);
			}
		});
		
		
		//         ---Button 7---
		
		b7=new JButton("7");
		add(b7);
		b7.setBackground(Color.orange);
		b7.setBounds(20, 180, 50, 50);
		b7.setFont(f);
		b7.setBorder(BorderFactory.createLineBorder(Color.black,1));
		
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num=t.getText()+b7.getText();
				t.setText(num);
			}
		});

		
		//         ---Button 6---
		
		b6=new JButton("6");
		add(b6);
		b6.setBackground(Color.orange);
		b6.setBounds(140, 240, 50, 50);
		b6.setFont(f);
		b6.setBorder(BorderFactory.createLineBorder(Color.black,1));
		
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num=t.getText()+b6.getText();
				t.setText(num);
			}
		});

		
		//         ---Button 5---
		
		b5=new JButton("5");
		add(b5);
		b5.setBackground(Color.orange);
		b5.setBounds(80, 240, 50, 50);
		b5.setFont(f);
		b5.setBorder(BorderFactory.createLineBorder(Color.black,1));
		
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num=t.getText()+b5.getText();
				t.setText(num);
			}
		});
				
		
		//         ---Button 4---
		
		b4=new JButton("4");
		add(b4);
		b4.setBackground(Color.orange);
		b4.setBounds(20, 240, 50, 50);
		b4.setFont(f);
		b4.setBorder(BorderFactory.createLineBorder(Color.black,1));
		
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num=t.getText()+b4.getText();
				t.setText(num);
			}
		});
		

		//         ---Button 3---
		
		b3=new JButton("3");
		add(b3);
		b3.setBackground(Color.orange);
		b3.setBounds(140, 300, 50, 50);
		b3.setFont(f);
		b3.setBorder(BorderFactory.createLineBorder(Color.black,1));
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num=t.getText()+b3.getText();
				t.setText(num);
			}
		});
		

		//         ---Button 2---
		
		b2=new JButton("2");
		add(b2);
		b2.setBackground(Color.orange);
		b2.setBounds(80, 300, 50, 50);
		b2.setFont(f);
		b2.setBorder(BorderFactory.createLineBorder(Color.black,1));
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num=t.getText()+b2.getText();
				t.setText(num);
			}
		});
		

		//         ---Button 1---
		
		b1=new JButton("1");
		add(b1);
		b1.setBackground(Color.orange);
		b1.setBounds(20, 300, 50, 50);
		b1.setFont(f);
		b1.setBorder(BorderFactory.createLineBorder(Color.black,1));
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num=t.getText()+b1.getText();
				t.setText(num);
			}
		});
		

		//         ---Button 0---
		
		b0=new JButton("0");
		add(b0);
		b0.setBackground(Color.orange);
		b0.setBounds(20, 360, 110, 50);
		b0.setFont(f);
		b0.setBorder(BorderFactory.createLineBorder(Color.black,1));
		
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num=t.getText()+b0.getText();
				t.setText(num);
			}
		});
		
		
		//         ---Button "." OR Decimal Point ---
		
		del=new JButton(".");
		add(del);
		del.setBackground(Color.LIGHT_GRAY);
		del.setBounds(140, 360, 50, 50);
		del.setFont(f);
		del.setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.darkGray));
		
		del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				t.setText(t.getText()+".");
			}
		});
		

		//         ---Button "AC"---
		
		ac=new JButton("AC");
		add(ac);
		ac.setBackground(Color.GREEN);
		ac.setBounds(20, 120, 50, 50);
		ac.setBorder(BorderFactory.createLineBorder(Color.darkGray,2));
		
		ac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				t.setText("");
			}
		});
		

		//         ---Button "<--" ---
		
		back=new JButton("<--");
		add(back);
		back.setBackground(Color.LIGHT_GRAY);
		back.setBounds(80, 120, 50, 50);
		back.setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.darkGray));
		
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String bc=null;
				if(t.getText().length()>0) {
					StringBuilder sb=new StringBuilder(t.getText());
					sb.deleteCharAt(t.getText().length()-1);
					bc=sb.toString();
					t.setText(bc);
				}
				}
		});
		
		
		//         ---Button "+/-" ---
		
		sign=new JButton("+/-");
		add(sign);
		sign.setBackground(Color.LIGHT_GRAY);
		sign.setBounds(140, 120, 50, 50);
		sign.setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.darkGray));
		
		sign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int pm= Integer.parseInt(t.getText());
				pm=pm*(-1);
				t.setText(String.valueOf(pm));
				}
		});
		
		
		//         --- Button "/" --
		
		div=new JButton("/");
		add(div);
		div.setBackground(Color.LIGHT_GRAY);
		div.setBounds(200, 120, 50, 50);
		div.setFont(f);
		div.setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.darkGray));
		
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(t.getText());
				t.setText(null);
				operations = "/";
				}
		});
		

		//         --- Button "*" ---
		
		mult=new JButton("*");
		add(mult);
		mult.setBackground(Color.LIGHT_GRAY);
		mult.setBounds(200, 180, 50, 50);
		mult.setFont(f);
		mult.setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.darkGray));
		
		mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(t.getText());
				t.setText(null);
				operations = "*";
				}
		});

		//         ---Button "-" ---
		
		minus=new JButton("-");
		add(minus);
		minus.setBackground(Color.LIGHT_GRAY);
		minus.setBounds(200, 240, 50, 50);
		minus.setFont(f);
		minus.setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.darkGray));
		
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(t.getText());
				t.setText(null);
				operations = "-";
				}
		});
		
		
		//         ---Button "+" ---
		
		plus=new JButton("+");
		add(plus);
		plus.setBackground(Color.LIGHT_GRAY);
		plus.setBounds(200, 300, 50, 50);
		plus.setFont(f);
		plus.setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.darkGray));
		
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(t.getText());
				t.setText(null);
				operations = "+";
				}
		});
		
		//         ---Button "=" --- 

		equals=new JButton("=");
		add(equals);
		equals.setBackground(Color.LIGHT_GRAY);
		equals.setBounds(200, 360, 50, 50);
		equals.setFont(f);
		equals.setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.darkGray));
		
		equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				num2=Double.parseDouble(t.getText());
				if(operations=="+")
				{

					result=num1+num2;
					t.setText(String.valueOf(result));
				}
				else if(operations=="-")
				{

					result=num1-num2;
					t.setText(String.valueOf(result));
				}
				else if(operations=="*")
				{

					result=num1*num2;
					t.setText(String.valueOf(result));
				}
				else if(operations=="/")
				{

					result=num1/num2;
					t.setText(String.valueOf(result));
				}
				/*else if(operations=="%")
				{

					result=num1%num2;
					answer=String.format("%.0f", result);
					t.setText(answer);
				}*/
			}
		});

	}

public static void main(String []args) {

		Calculator jf=new Calculator("Mohit ka calculator");
		jf.setSize(300,480);
		jf.setScreen();
		jf.setButtons();
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
