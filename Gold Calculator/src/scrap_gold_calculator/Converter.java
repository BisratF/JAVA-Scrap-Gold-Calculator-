package scrap_gold_calculator;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Font;
import java.awt.BorderLayout;

public class Converter extends JFrame  {
	
	public JTextField InputTField;
	public JTextField OutputTField;
    public Object [] OInput;
     
    public static void main (String[] args){
    	SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				//try - catch block
				try 
				{
					//Create object of NewWindow
					Converter frame = new Converter();
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
    
    
    public Converter () {
      
    	setResizable(false);
    	setBounds(100, 100, 421, 300);
    	getContentPane().setLayout(null);
      //	setLayout(null);
      	
      	JLabel lblMeasurmentConverter = new JLabel("Gold Weight Converter");
      	lblMeasurmentConverter.setFont(new Font("Tahoma", Font.PLAIN, 18));
      	lblMeasurmentConverter.setBounds(151, 11, 190, 28);
      	getContentPane().add(lblMeasurmentConverter);
      	
      	JLabel lblFrom = new JLabel("From:");
      	lblFrom.setBounds(32, 50, 46, 14);
      	getContentPane().add(lblFrom);
      	
      	JLabel lblTo = new JLabel("To:");
      	lblTo.setBounds(245, 50, 46, 14);
      	getContentPane().add(lblTo);
      	
      	JComboBox FromComboBox = new JComboBox();
      	FromComboBox.addActionListener(new ActionListener() {
      		public void actionPerformed(ActionEvent e) {
      			OutputTField.setText(null);
      		}
      	});
      	FromComboBox.setModel(new DefaultComboBoxModel(new String[] {"Gram", "Kilogram", "oz (Ounce)", "ozt (Troy ounce)", "troy grain (grain.tr.)", "lb(Pound)"}));
      	FromComboBox.setBounds(32, 71, 141, 23);
      	getContentPane().add(FromComboBox);
      	
      	JComboBox ToComboBox = new JComboBox();
      	ToComboBox.setModel(new DefaultComboBoxModel(new String[] {"Gram", "Kilogram", "oz (Ounce)", "ozt (Troy ounce)", "troy grain (grain.tr.)", "lb(Pound)"}));
      	ToComboBox.setBounds(245, 71, 141, 23);
      	getContentPane().add(ToComboBox);
      	
      	InputTField = new JTextField();
      	InputTField.addKeyListener(new KeyAdapter() {
      		@Override
      		public void keyTyped(KeyEvent e) {
      			
    			    
  				  boolean ret = true;
  	                try {

  	                    Double.parseDouble(InputTField.getText()+e.getKeyChar());
  	                }
  	                catch (NumberFormatException ee) {
  	                    ret = false;
  	                }


  	            if (!ret) {
  	                e.consume();
  	            }
  			 
      		}
      	});
      	InputTField.setBounds(32, 142, 143, 23);
      	getContentPane().add(InputTField);
      	InputTField.setColumns(10);
      	
      	
      	OutputTField = new JTextField();
      	OutputTField.addKeyListener(new KeyAdapter() {
      		@Override
      		public void keyTyped(KeyEvent e) {
      			boolean ret = true;
	                try {

	                    Double.parseDouble(OutputTField.getText()+e.getKeyChar());
	                }
	                catch (NumberFormatException ee) {
	                    ret = false;
	                }


	            if (!ret) {
	                e.consume();
	            }
      		}
      	});
      	OutputTField.setColumns(10);
      	OutputTField.setBounds(245, 142, 143, 23);
      	getContentPane().add(OutputTField);
      	OutputTField.setEditable(true); 
      	
      	JButton CalculateButton = new JButton("Calculate");
      	CalculateButton.addActionListener(new ActionListener() {
      		public void actionPerformed(ActionEvent e) {
      		
      			String F = FromComboBox.getSelectedItem().toString();
      			String T = ToComboBox.getSelectedItem().toString();
      			String InPut = InputTField.getText().toString();
      			double D = Double.parseDouble(InPut);
      			//System.out.println(F + T);
      			
      			         //  From Gram Section 
      			if ((F == ("Gram")) && (T == ("Gram"))) {OutputTField.setText(String.valueOf(D));}
      			
      			if ((F == ("Gram")) && (T == ("Kilogram"))) { 
      				
      				double result = D*0.001;
      				OutputTField.setText(String.valueOf(result));
      			
      			}
      		 
      			if ((F == ("Gram")) && (T == ("ozt (Troy ounce)"))) {
      				
      				double result = D*0.03215;
      				OutputTField.setText(String.valueOf(result));
      			}
      			
               if ((F == ("Gram")) && (T == ("lb(Pound)"))) {
      				
      				double result = D*0.00220462262;
      				OutputTField.setText(String.valueOf(result));
      			}
      			
      		    
               // From Kilogram Section 
               
               if ((F == ("Kilogram")) && (T == ("Gram"))) {
            	   double result = D*1000;
   				OutputTField.setText(String.valueOf(result));
               }
     			
     			if ((F == ("Kilogram")) && (T == ("Kilogram"))) { OutputTField.setText(String.valueOf(D));}
     			
     			if ((F == ("Kilogram")) && (T == ("ozt (Troy ounce)"))) {
     				
     				double result = D*0.03215;
     				OutputTField.setText(String.valueOf(result));
     			}
     			
              if ((F == ("Kilogram")) && (T == ("lb(Pound)"))) {
     				
     				double result = D*2.20462;
     				OutputTField.setText(String.valueOf(result));
     			}
               
         
           // From Ounce Section 
              
              if ((F == ("oz (Ounce)")) && (T == ("Gram"))) {
           	   double result = D*28.3495;
  				OutputTField.setText(String.valueOf(result));
              }
    			
    			if ((F == ("oz (Ounce)")) && (T == ("Kilogram"))) {
    				double result = D*0.0283495;
      				OutputTField.setText(String.valueOf(result));
    			}
    			
    			if ((F == ("oz (Ounce)")) && (T == ("ozt (Troy ounce)"))) {
    				
    				double result = D*0.91146;
    				OutputTField.setText(String.valueOf(result));
    			}
    			
    			if ((F == ("oz (Ounce)")) && (T == ("oz (Ounce)"))) { OutputTField.setText(String.valueOf(D));}
    			
             if ((F == ("oz (Ounce)")) && (T == ("lb(Pound)"))) {
    				
    				double result = D*0.0625;
    				OutputTField.setText(String.valueOf(result));
    			}
              
              
            
              // From ozt (Troy ounce) Section 
              
                if ((F == ("ozt (Troy ounce)")) && (T == ("Gram"))) {
                	double result = D*31.1034768;
    				OutputTField.setText(String.valueOf(result));
                }
    			
    			if ((F == ("ozt (Troy ounce)")) && (T == ("Kilogram"))) { 
    				
    				double result = D*0.031103715338797;
    				OutputTField.setText(String.valueOf(result));
    			
    			}
    		 
    			if ((F == ("ozt (Troy ounce)")) && (T == ("ozt (Troy ounce)"))) {OutputTField.setText(String.valueOf(D));}
    				
    				
    			
             if ((F == ("ozt (Troy ounce)")) && (T == ("lb(Pound)"))) {
    				
    				double result = D*0.0685714286;
    				OutputTField.setText(String.valueOf(result));
    			} 
             
             // from Troy Grain section
             
             if ((F == ("troy grain (grain.tr.)")) && (T == ("Gram"))) {
             	double result = D*0.06479891;
 				OutputTField.setText(String.valueOf(result));
             }
             if ((F == ("troy grain (grain.tr.)")) && (T == ("Kilogram"))) {
              	double result =  D*0.000064799;
  				OutputTField.setText(String.valueOf(result));
              }
             
             if ((F == ("troy grain (grain.tr.)")) && (T == ("oz (Ounce)"))) { 
 				
 				double result = D*0.00228571429;
 				OutputTField.setText(String.valueOf(result));
 			
 			}
             
             
             
             
             if ((F == ("troy grain (grain.tr.)")) && (T == ("ozt (Troy ounce)"))) {
              	double result = D*0.0021;
  				OutputTField.setText(String.valueOf(result));
              }
             
             if ((F == ("troy grain (grain.tr.)")) && (T == ("troy grain (grain.tr.)"))) {
              	double result = D*1;
  				OutputTField.setText(String.valueOf(result));
              }
             
             if ((F == ("troy grain (grain.tr.)")) && (T == ("lb(Pound)"))) {
              	double result = D*0.06479891;
  				OutputTField.setText(String.valueOf(result));
              } 
             
             
             
             
             
             
             
             
             
             
             
             
             
               
          // From Pound Section 
             
             if ((F==("lb(Pound)"))&&(T==("Gram"))) {
            	 double result = D*453.59237;
    				OutputTField.setText(String.valueOf(result));
             }
   			
   			if ((F==("lb(Pound)"))&&(T==("Kilogram"))) { 
   				
   				double result = D*0.45359237;
   				OutputTField.setText(String.valueOf(result));
   			
   			}
   		 
   			if ((F==("lb(Pound)"))&&(T==("ozt (Troy ounce)"))) {
   				
   				double result = D*14.5832224562;
   				OutputTField.setText(String.valueOf(result));
   			}
   			
            if ((F==("lb(Pound)"))&&(T==("lb(Pound)"))) {OutputTField.setText(String.valueOf(D));}
   				
   				   
      		}
      	});
      	CalculateButton.setBounds(161, 201, 95, 34);
      	getContentPane().add(CalculateButton);
      	
      	JLabel lblInput = new JLabel("Input");
      	lblInput.setBounds(32, 118, 46, 13);
      	getContentPane().add(lblInput);
      	
      	JLabel lblOutput = new JLabel("Output");
      	lblOutput.setBounds(245, 122, 64, 14);
      	getContentPane().add(lblOutput);
    
      }


}
