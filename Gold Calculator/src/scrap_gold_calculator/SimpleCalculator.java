package scrap_gold_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.Font;



public class SimpleCalculator extends JFrame   {
	private JTextField NumberEntry;
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	
	
	public static void main (String []args0)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				//try - catch block
				try 
				{
					//Create object of NewWindow
					SimpleCalculator frame = new SimpleCalculator();
					//set frame visible true
					frame.setVisible(true);					
				}
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
		
		
		
		
	}
	    
	    
	    SimpleCalculator () {
	    	setResizable(false);
	    	getContentPane().setLayout(null);
     	setBounds(548, 584, 292, 382);
     	
     	
     	NumberEntry = new JTextField();
     	NumberEntry.setHorizontalAlignment(SwingConstants.RIGHT);
     	NumberEntry.setBounds(10, 45, 248, 37);
     	getContentPane().add(NumberEntry);
     	NumberEntry.setColumns(10);
     	
     	JButton seven = new JButton("7");
     	seven.setBounds(10, 93, 51, 37);
     	getContentPane().add(seven);
     	
     	JButton eight = new JButton("8");
     	eight.setBounds(71, 93, 51, 37);
     	getContentPane().add(eight);
     	
     	JButton nine = new JButton("9");
     	nine.setBounds(132, 93, 51, 37);
     	getContentPane().add(nine);
     	
     	JButton divide = new JButton("/");
     	divide.setBounds(132, 237, 51, 37);
     	getContentPane().add(divide);
     	
     	JButton four = new JButton("4");
     	four.setBounds(10, 141, 51, 37);
     	getContentPane().add(four);
     	
     	JButton five = new JButton("5");
     	five.setBounds(71, 141, 51, 37);
     	getContentPane().add(five);
     	
     	JButton six = new JButton("6");
     	six.setBounds(132, 141, 51, 37);
     	getContentPane().add(six);
     	
     	JButton Times = new JButton("*");
     	Times.setBounds(193, 141, 66, 37);
     	getContentPane().add(Times);
     	
     	JButton one = new JButton("1");
     	one.setBounds(10, 189, 51, 37);
     	getContentPane().add(one);
     	
     	JButton two = new JButton("2");
     	two.setBounds(71, 189, 51, 37);
     	getContentPane().add(two);
     	
     	JButton three = new JButton("3");
     	three.setBounds(132, 189, 51, 37);
     	getContentPane().add(three);
     	
     	JButton minus = new JButton("-");
     	minus.setBounds(193, 189, 66, 37);
     	getContentPane().add(minus);
     	
     	JButton zero = new JButton("0");
     	zero.setBounds(10, 237, 51, 37);
     	getContentPane().add(zero);
     	
     	JButton dot = new JButton(".");
     	dot.setBounds(71, 237, 51, 37);
     	getContentPane().add(dot);
     	
     	JButton clear = new JButton("\uF0E7");
     	clear.setBounds(193, 93, 65, 37);
     	getContentPane().add(clear);
     	
     	JButton plus = new JButton("+");
     	plus.setBounds(193, 237, 66, 37);
     	getContentPane().add(plus);
     	
     	JButton ClearEverything = new JButton("CE");
     	ClearEverything.setBounds(57, 285, 66, 37);
     	getContentPane().add(ClearEverything);
     	
     	JButton isEqualTo = new JButton("=");
     	isEqualTo.setBounds(142, 285, 51, 37);
     	getContentPane().add(isEqualTo);
     	
     	JLabel lblCalculator = new JLabel("Calculator");
     	lblCalculator.setFont(new Font("Tahoma", Font.PLAIN, 18));
     	lblCalculator.setBounds(100, 11, 135, 23);
     	getContentPane().add(lblCalculator);
    
    	///////////////////////////////////////////////// Numbers from 0 -9 ///////////////////////
     	one.addActionListener(new ActionListener() {
     		public void actionPerformed(ActionEvent e) {
     		  	String EnterNumber = NumberEntry.getText()+ one.getText();
     			
     			NumberEntry.setText(EnterNumber);
     		}
     	});
     	two.addActionListener(new ActionListener() {
     		public void actionPerformed(ActionEvent e) {
     		  	String EnterNumber = NumberEntry.getText()+ two.getText();
     			
     			NumberEntry.setText(EnterNumber);
     		}
     	});
	    three.addActionListener(new ActionListener() {
     		public void actionPerformed(ActionEvent e) {
     		  	String EnterNumber = NumberEntry.getText()+ three.getText();
     			
     			NumberEntry.setText(EnterNumber);
     		}
     	});
	    four.addActionListener(new ActionListener() {
     		public void actionPerformed(ActionEvent e) {
     		  	String EnterNumber = NumberEntry.getText()+ four.getText();
     			
     			NumberEntry.setText(EnterNumber);
     		}
     	});
	    five.addActionListener(new ActionListener() {
     		public void actionPerformed(ActionEvent e) {
     		  	String EnterNumber = NumberEntry.getText()+ five.getText();
     			
     			NumberEntry.setText(EnterNumber);
     		}
     	});
	    six.addActionListener(new ActionListener() {
     		public void actionPerformed(ActionEvent e) {
     		  	String EnterNumber = NumberEntry.getText()+ six.getText();
     			
     			NumberEntry.setText(EnterNumber);
     		}
     	});
	    seven.addActionListener(new ActionListener() {
     		public void actionPerformed(ActionEvent e) {
     		  	String EnterNumber = NumberEntry.getText()+ seven.getText();
     			
     			NumberEntry.setText(EnterNumber);
     		}
     	});
	    eight.addActionListener(new ActionListener() {
     		public void actionPerformed(ActionEvent e) {
     		  	String EnterNumber = NumberEntry.getText()+ eight.getText();
     			
     			NumberEntry.setText(EnterNumber);
     		}
     	});
	    nine.addActionListener(new ActionListener() {
     		public void actionPerformed(ActionEvent e) {
     		  	String EnterNumber = NumberEntry.getText()+ nine.getText();
     			
     			NumberEntry.setText(EnterNumber);
     		}
     	});
	    zero.addActionListener(new ActionListener() {
     		public void actionPerformed(ActionEvent e) {
     		  	String EnterNumber = NumberEntry.getText()+ zero.getText();
     			
     			NumberEntry.setText(EnterNumber);
     		}
     	});
	    dot.addActionListener(new ActionListener() {
     		public void actionPerformed(ActionEvent e) {
     		  	String EnterNumber = NumberEntry.getText()+ dot.getText();
     			
     			NumberEntry.setText(EnterNumber);
     		}
     	});
	    
///////////////////////////////////////////////// end of  Numbers from 0 -9 ///////////////////////    
	    
	    divide.addActionListener(new ActionListener() {
     		public void actionPerformed(ActionEvent e) {
     			firstnum =Double.parseDouble(NumberEntry.getText());
     		  	NumberEntry.setText("");
     		  	operations = "/";
     		}
     	});
	    Times.addActionListener(new ActionListener() {
     		public void actionPerformed(ActionEvent e) {
     			firstnum =Double.parseDouble(NumberEntry.getText());
     		  	NumberEntry.setText("");
     		  	operations = "*";
     		}
     	});
	    plus.addActionListener(new ActionListener() {
     		public void actionPerformed(ActionEvent e) {
     		  	firstnum =Double.parseDouble(NumberEntry.getText());
     		  	NumberEntry.setText("");
     		  	operations = "+";
     		}
     	});
	    minus.addActionListener(new ActionListener() {
     		public void actionPerformed(ActionEvent e) {
     			firstnum =Double.parseDouble(NumberEntry.getText());
     		  	NumberEntry.setText("");
     		  	operations = "-";
     		}
     	});
	   
	    clear.addActionListener(new ActionListener() {
     		public void actionPerformed(ActionEvent e) {
     		  	String BackSpace = null;
     		  	 if (NumberEntry.getText().length() > 0) {
     		  		 StringBuilder Back = new StringBuilder (NumberEntry.getText());
     		  		 Back.deleteCharAt(NumberEntry.getText().length() - 1);
     		  		 BackSpace = Back.toString();
     		  		 NumberEntry.setText(BackSpace);
     		  	 }
     		}
     	});
	    ClearEverything.addActionListener(new ActionListener() {
     		public void actionPerformed(ActionEvent e) {
     		 
     			NumberEntry.setText(null);
     		}
     	});
	    
	    isEqualTo.addActionListener(new ActionListener() { 
	        public void actionPerformed (ActionEvent e)	{
	  
	            String answer ;
	            secondnum = Double.parseDouble(NumberEntry.getText());
	          
	             if (operations == "+") {
	            	 
	            	 result = firstnum + secondnum;
	            	 answer = (String.valueOf(result));
	            	 NumberEntry.setText(answer);
	             }
	             else if (operations == "-") {
	            	 result = firstnum - secondnum;
	            	 answer = (String.valueOf(result));
	            	 NumberEntry.setText(answer);
	             }
	             else if (operations == "*") {
	            	 result = firstnum * secondnum;
	            	 answer = (String.valueOf(result));
	            	 NumberEntry.setText(answer);
	            	 
	             }
	             else if (operations == "/") {
	            	 result = firstnum / secondnum;
	            	 answer = (String.valueOf(result));
	            	 NumberEntry.setText(answer);
	             }
	        
	        
	        
	        }
	    
	    });
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    }
	    
	    
	    
	    }
     	
      







/* public void actionPerformed (ActionEvent e)
        {
            if(e.getSource()== one)
            	NumberEntry.setText(NumberEntry.getText().concat("1")); 
            
            if(e.getSource()==two)
            	NumberEntry.setText(NumberEntry.getText().concat("2"));
            
            if(e.getSource()==three)
            	NumberEntry.setText(NumberEntry.getText().concat("3"));
            
            if(e.getSource()==four)
            	NumberEntry.setText(NumberEntry.getText().concat("4"));
            
            if(e.getSource()==five)
            	NumberEntry.setText(NumberEntry.getText().concat("5"));
            
            if(e.getSource()==six)
            	NumberEntry.setText(NumberEntry.getText().concat("6"));
            
            if(e.getSource()==seven)
            	NumberEntry.setText(NumberEntry.getText().concat("7"));
            
            if(e.getSource()==eight)
            	NumberEntry.setText(NumberEntry.getText().concat("8"));
            
            if(e.getSource()==nine)
            	NumberEntry.setText(NumberEntry.getText().concat("9"));
            
            if(e.getSource()==zero)
            	NumberEntry.setText(NumberEntry.getText().concat("0"));
            
            if(e.getSource()==dot)
            	NumberEntry.setText(NumberEntry.getText().concat("."));
            
            if(e.getSource()==plus)
            {
                a=Double.parseDouble(NumberEntry.getText());
                operator=1;
                NumberEntry.setText("");
            } 
            
            if(e.getSource()==minus)
            {
                a=Double.parseDouble(NumberEntry.getText());
                operator=2;
                NumberEntry.setText("");
            }
            
            if(e.getSource()==Times)
            {
                a=Double.parseDouble(NumberEntry.getText());
                operator=3;
                NumberEntry.setText("");
            }
            
            if(e.getSource()==divide)
            {
                a=Double.parseDouble(NumberEntry.getText());
                operator=4;
                NumberEntry.setText("");
            }
            
            if(e.getSource()==isEqualTo)
            {
                b=Double.parseDouble(NumberEntry.getText());
            
                switch(operator)
                {
                    case 1: result=a+b;
                        break;
            
                    case 2: result=a-b;
                        break;
            
                    case 3: result=a*b;
                        break;
            
                    case 4: result=a/b;
                        break;
            
                    default: result=0;
                }
            
                NumberEntry.setText(""+result);
            }
            
            if(e.getSource()==clear)
            	NumberEntry.setText("");
            
            if(e.getSource()==ClearEverything)
            {
                String s=NumberEntry.getText();
                NumberEntry.setText("");
                for(int i=0;i<s.length()-1;i++)
                	NumberEntry.setText(NumberEntry.getText()+s.charAt(i));
            }        
     	
     	
   */
     	
    	 
     

