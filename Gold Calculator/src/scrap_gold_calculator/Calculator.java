package scrap_gold_calculator;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;




public class Calculator extends JFrame {
  
	public JFrame MainFrame;
	public JComboBox  BrandcomboBox_1 ;
	public JComboBox CaratcomboBox_1;
	public JTextField textField_Model;
	public JTextField weightAmount;
   
	
	public JRadioButton radioScrapJewels;
	public JRadioButton Processorsbtn;
	public JRadioButton MeltedBarsbtn;
	public ButtonGroup  InputGroup;
	
	public JRadioButton PrintedComputerCircuitbtn;
	public JRadioButton ComputerboardPinsbtn;
	public JRadioButton CellPhoneBoardsbtn;
	public JRadioButton RamFingersbtn;
	public ButtonGroup  PcbGroup;
	public JLabel       lblBrand;
	public JLabel lblModel;
	public JLabel lblCarat;
	public JButton InputJpanel;
	public JTextArea InsertiontextArea;
	public JTable table;
	public JTable InsertionTable;
	public JPanel CalculationJPanel_1;
	public JTable  InputTable_1;
	public JButton  btnAdd_1;
	public JCheckBox chBT;
	public JCheckBox chemical;
	public  JCheckBox chckbxMiscellaneousCosts;
	public  JCheckBox ckbECE;
	public JTextField Result;
	public JButton Evaluate;
	public Object row [] ;
	public  JRadioButton ChipCards;
	public JRadioButton GoldPins;
  
    private ProcessorModel ProcessorModel;
    private JTextField textField;
    public String ProBrand;
    private String ProYieldValue;
	/**
	 * Launch the application.
	 */
	
	
	public Calculator() {
		
		initialize ();
	    
	
	}  
	
	
	
	
	public void initialize() {
		
		
		MainFrame = new JFrame (" Scrap Gold Calculator");
		MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MainFrame.setSize(933, 711);
		MainFrame.getContentPane().setLayout(null);
		MainFrame.setResizable(false);
		
		
		
		JLabel TitleOfTheProgram = new JLabel("Scrap Gold Calculator");
		TitleOfTheProgram.setBounds(346, 11, 250, 21);
		TitleOfTheProgram.setFont(new Font("Tahoma", Font.PLAIN, 18));
		TitleOfTheProgram.setHorizontalAlignment(SwingConstants.CENTER);
		MainFrame.getContentPane().add(TitleOfTheProgram);
		
		ButtonGroup InputGroup = new ButtonGroup();
		  //setup the buttons 
		
				ButtonGroup PcbGroup = new ButtonGroup();
		      
	
		
		// Calculation  Panel //
		
				
			Object[] columns = {"no.","Type","Carat","Rate","Brand(CPU)","Weight/Amount","Conversion to 24K"};
			DefaultTableModel model = new DefaultTableModel();
			model.setColumnIdentifiers(columns);
			
			//InputTable.setBackground(Color.BLACK);
			//InputTable.setForeground(Color.WHITE);
			Font font = new Font (" ",1 ,15);
			MainFrame.setLocationRelativeTo(null);
			
		
			Object [] row = new Object [7];
			 
			 
			 
			 
		///////// Calculation Evaluate ///////////	
			
			 /*(( row [1]).equals("9 Carat"))) */
			
			
			
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(353, 583, 97, 35);
		MainFrame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(460, 583, 97, 35);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		MainFrame.getContentPane().add(btnExit);
		
		JButton btnCalculator = new JButton("Calculator");
		btnCalculator.setBounds(662, 583, 97, 35);
		btnCalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SimpleCalculator frame = new SimpleCalculator();
				frame.setVisible(true);
				//set default close operation
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
			}
		});
		MainFrame.getContentPane().add(btnCalculator);
		
		JButton btnWeightConvertor = new JButton("Weight Converter");
		btnWeightConvertor.setBounds(769, 583, 136, 35);
		btnWeightConvertor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Converter frame = new Converter();
				frame.setVisible(true);
				//set default close operation
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
			}
		});
		MainFrame.getContentPane().add(btnWeightConvertor);
			  
			  			  
			  
			  JButton deleteRow = new JButton("Delete Row");
			  deleteRow.setBounds(37, 583, 103, 35);
			  MainFrame.getContentPane().add(deleteRow);
			  
			  
			  
			   
//			  JButton Evaluate_1 = new JButton("Evaluate");
//			  Evaluate_1.setBounds(222, 722, 100, 23);
//			  MainFrame.getContentPane().add(Evaluate_1);
			  
			  
			  
			  ////////// Table Content /////
			  	
			     
			  	JTable InputTable_1_1 = new JTable();
			  	InputTable_1_1.setModel(model);
			  	InputTable_1_1.setFont(font);
			  	InputTable_1_1.setRowHeight(30);
			  	
			  	InputTable_1_1.getColumnModel().getColumn(0).setMaxWidth(15);
			  	InputTable_1_1.getColumnModel().getColumn(0).setMinWidth(10);
			  	InputTable_1_1.getColumnModel().getColumn(2).setPreferredWidth(15);
			  	InputTable_1_1.getColumnModel().getColumn(3).setPreferredWidth(15);
			  	InputTable_1_1.getColumnModel().getColumn(4).setPreferredWidth(15);
			  	InputTable_1_1.getColumnModel().getColumn(5).setPreferredWidth(15);
			  	
			  	
			  	
			  	
			  	JScrollPane pane = new JScrollPane(InputTable_1_1);
			  	pane.setBounds(22, 411, 883, 161);
			  	MainFrame.getContentPane().add(pane);
			  	
			  	JLabel lblCheckTodaysGold = new JLabel("Click here to check today's Gold value  http://www.scrapgolduk.co.uk/");
			  	lblCheckTodaysGold.setFont(new Font("Tahoma", Font.PLAIN, 14));
			  	lblCheckTodaysGold.addMouseListener(new MouseAdapter() {
			  		@Override
			  		public void mouseClicked(MouseEvent e) {
			  			Desktop d = Desktop.getDesktop();
			  			try {
							d.browse(new URI ("http://www.scrapgolduk.co.uk/"));
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (URISyntaxException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
			  		}
			  	});
			  	lblCheckTodaysGold.setBounds(37, 638, 491, 24);
			  	MainFrame.getContentPane().add(lblCheckTodaysGold);
			  	
	
			  	//   Calculation Panel //
			  	
			  	JPanel CalculationJPanel_1_1 = new JPanel();
			  	CalculationJPanel_1_1.setLocation(22, 36);
			  	MainFrame.getContentPane().add(CalculationJPanel_1_1);
			  	CalculationJPanel_1_1.setSize(new Dimension(883, 364));
			  	CalculationJPanel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
			  	CalculationJPanel_1_1.setLayout(null);
			  	
			  	
			  	
			  	        // PCB Section//
			  	JPanel PcbPanel = new JPanel();
			  	PcbPanel.setBounds(514, 162, 343, 103);
			  	CalculationJPanel_1_1.add(PcbPanel);
			  	PcbPanel.setLayout(null);
			  	
			  	JRadioButton CellPhoneBoardsbtn_1 = new JRadioButton("Cell Phone Boards");
			  	CellPhoneBoardsbtn_1.setBounds(6, 37, 168, 23);
			  	CellPhoneBoardsbtn_1.addActionListener(new ActionListener() {
			  		public void actionPerformed(ActionEvent e) {
			  			weightAmount.setText(null);;
			  		}
			  	});
			  	PcbPanel.add(CellPhoneBoardsbtn_1);
			  	PcbGroup.add(CellPhoneBoardsbtn_1);
			  	CellPhoneBoardsbtn_1.setEnabled(false);
			  	
			  	
			  	JRadioButton RamFingersbtn_1 = new JRadioButton("Fingers From (Ram,PCI cards,etc)");
			  	RamFingersbtn_1.setBounds(6, 63, 223, 23);
			  	PcbPanel.add(RamFingersbtn_1);
			  	PcbGroup.add(RamFingersbtn_1);
			  	RamFingersbtn_1.setEnabled(false);
			  	RamFingersbtn_1.addActionListener(new ActionListener() {
			  		public void actionPerformed(ActionEvent e) {
			  			weightAmount.setText(null);;
			  		}
			  	});
			  	
			  	JRadioButton GoldPins_1 = new JRadioButton("Gold Plated Pins (CPU Socket pins,Connector pins, etc)");
			  	GoldPins_1.setBounds(6, 7, 335, 23);
			  	PcbPanel.add(GoldPins_1);
			  	PcbGroup.add(GoldPins_1);
			  	GoldPins_1.setEnabled(false);
			  	GoldPins_1.addActionListener(new ActionListener() {
			  		public void actionPerformed(ActionEvent e) {
			  			weightAmount.setText(null);;
			  		}
			  	});
			  	
		
		////////////////////////// PCB Group//////////////////////
		JRadioButton PcbRadio = new JRadioButton("Printed Computer Circuit Board (PCB)");
		PcbRadio.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				 JRadioButton pcbbutton = (JRadioButton)e.getSource();
				 CellPhoneBoardsbtn_1.setEnabled( pcbbutton.isSelected() );
				 GoldPins_1.setEnabled( pcbbutton.isSelected() );
				 RamFingersbtn_1.setEnabled(pcbbutton.isSelected());		
			}
		});
		
				PcbRadio.setBounds(481, 132, 247, 23);
				CalculationJPanel_1_1.add(PcbRadio);
				InputGroup.add(PcbRadio);
				
				
				  
					
					
				
				JRadioButton MeltedBarsbtn_1 = new JRadioButton("Melted Bars (Military Grade )");
				MeltedBarsbtn_1.setBounds(481, 19, 194, 23);
				CalculationJPanel_1_1.add(MeltedBarsbtn_1);
				InputGroup.add(MeltedBarsbtn_1);
				

				
				JComboBox BrandcomboBox_1_1 = new JComboBox();
				BrandcomboBox_1_1.setBounds(101, 104, 163, 20);
				CalculationJPanel_1_1.add(BrandcomboBox_1_1);
				BrandcomboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"Please Choose a Brand", "Intel", "AMD", "Toshiba", "NEC", "Cyrix", "IBM", "Alpha DEC", "Winchip"}));
				BrandcomboBox_1_1.setEnabled(false);   
				
				
				
				
				
				
				
				
				JLabel lblBrand_1 = new JLabel("Brand");
				lblBrand_1.setBounds(33, 107, 60, 14);
				CalculationJPanel_1_1.add(lblBrand_1);
				lblBrand_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblBrand_1.setEnabled(false);   
				
				JRadioButton Processorsbtn_1 = new JRadioButton("Processors (CPU)");
				
				Processorsbtn_1.setBounds(23, 74, 139, 23);
				CalculationJPanel_1_1.add(Processorsbtn_1);
				InputGroup.add(Processorsbtn_1);
				
				JComboBox CaratcomboBox_1_1 = new JComboBox();
				CaratcomboBox_1_1.setBounds(106, 42, 156, 20);
				CalculationJPanel_1_1.add(CaratcomboBox_1_1);
				CaratcomboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"Please Choose Carat", "9 Carat", "14 Carat", "18 Carat", "21 Carat", "22 Carat", "24 Carat"}));
				CaratcomboBox_1_1.setEnabled(false);   
				

				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				JLabel lblCarat_1 = new JLabel("Carat");
				lblCarat_1.setBounds(55, 41, 37, 23);
				CalculationJPanel_1_1.add(lblCarat_1);
				lblCarat_1.setEnabled(false);    
				
				
				
				
				      // 4 input radio button//////
				JRadioButton radioScrapJewels_1 = new JRadioButton("Scrap Jewels");
				radioScrapJewels_1.setBounds(22, 19, 109, 23);
				CalculationJPanel_1_1.add(radioScrapJewels_1);
				InputGroup.add(radioScrapJewels_1);
				
				
				
				////////////////////////// end of  PCB Group//////////////////////
				
				JButton SubmittButton = new JButton ("Submitt");
				
				SubmittButton.setBounds(757, 308, 100, 25);
				CalculationJPanel_1_1.add(SubmittButton);
				SubmittButton.setEnabled(false);
				
				
				JLabel lblWeightPerGram = new JLabel("Weight Per Gram");
				lblWeightPerGram.setBounds(514, 297, 109, 14);
				CalculationJPanel_1_1.add(lblWeightPerGram);
				lblWeightPerGram.setHorizontalAlignment(SwingConstants.CENTER);
				
				weightAmount = new JTextField();
				weightAmount.setBounds(633, 308, 100, 25);
				weightAmount.addKeyListener(new KeyAdapter() {
					
					public void keyReleased(KeyEvent e) {
						
						if (weightAmount.getText().length() == 0) {
							SubmittButton.setEnabled(false);
						}
						else {SubmittButton.setEnabled(true);}
						
					} 
					
					public void keyTyped (KeyEvent e) {
					    
						  boolean ret = true;
	                try {

	                    Double.parseDouble(weightAmount.getText()+e.getKeyChar());
	                }catch (NumberFormatException ee) {
	                    ret = false;
	                }


	            if (!ret) {
	                e.consume();
	            }
					}  

					
				});
				
					CalculationJPanel_1_1.add(weightAmount);
					weightAmount.setColumns(10);
					
					JRadioButton ChipCards_1 = new JRadioButton("Chip Cards (GSM,Payphone,Banking, etc.)");
					ChipCards_1.setBounds(481, 65, 272, 40);
					CalculationJPanel_1_1.add(ChipCards_1);
					InputGroup.add(ChipCards_1);
					
		
					
 			   
 			  
 			  // lblModel_1.setHorizontalAlignment(SwingConstants.CENTER);
 			   
 			   
					
					
					
					
					
					
					
					ProcessorModel = new  ProcessorModel ();
					
					
					
			
					
					
					
					ProcessorModel.SearchBox.setLocation(87, 11);
					ProcessorModel.setBounds(33, 144, 399, 210);
					CalculationJPanel_1_1.add(ProcessorModel);
					ProcessorModel.SearchButton.setSize(76, 29);
					ProcessorModel.ModelJScrollPane.setBounds(10, 57, 379, 142);
					ProcessorModel.SearchButton.setLocation(313, 14);
					
					   ProcessorModel.lblModel_1.setBounds(32, 21, 45, 14);
					   
					     
					     ProcessorModel.lblModel_1.setEnabled(false);
					     ProcessorModel.SearchBox.setEnabled(false);
					     ProcessorModel.SearchButton.setEnabled(false);
					     ProcessorModel.MTable.setEnabled(false);
					     
					     
					     ProcessorModel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
					     ProcessorModel.setLayout(null);	  
					     
					      			  Processorsbtn_1.addItemListener(new ItemListener() {
					      					public void itemStateChanged(ItemEvent e) {
					      					
					      						 JRadioButton button = (JRadioButton)e.getSource();
					      						ProcessorModel.SearchButton.setEnabled( button.isSelected() );
					      						 ProcessorModel.lblModel_1.setEnabled( button.isSelected() );
					      						 ProcessorModel.MTable.setEnabled(button.isSelected());
					      					}
					      				});
					      			  
					      			    
					      			    
					      			    
					      			    
					      			    
					      			    
					      			    
					      			    
					      			    Processorsbtn_1.addChangeListener(new ChangeListener() {
 					public void stateChanged(ChangeEvent e) {

				  		 if (Processorsbtn_1.isSelected()) 
			  {
				  ProcessorModel.SearchBox.setEnabled(true);
				 
				  
				    ProcessorModel.ModelJScrollPane.setEnabled(true);
				  }

				  		 else 
				  			ProcessorModel.SearchBox.setEnabled(false);
				  		
				  		ProcessorModel.ModelJScrollPane.setEnabled(false); 
 					}
 				});
					      			    
					      			    			  BrandcomboBox_1_1.addActionListener(new ActionListener() {
					      			    					public void actionPerformed(ActionEvent e) {
					      			    						if (BrandcomboBox_1_1.getSelectedItem().equals("Intel")) {ProcessorModel.SearchBox.setText("Intel");}
					      			    		 				if (BrandcomboBox_1_1.getSelectedItem().equals("AMD")) {ProcessorModel.SearchBox.setText("AMD");}
					      			    		 				if (BrandcomboBox_1_1.getSelectedItem().equals("Toshiba")) {ProcessorModel.SearchBox.setText("Toshiba");}
					      			    		 				if (BrandcomboBox_1_1.getSelectedItem().equals("NEC")) {ProcessorModel.SearchBox.setText("NEC");}
					      			    		 				if (BrandcomboBox_1_1.getSelectedItem().equals("Cyrix")) {ProcessorModel.SearchBox.setText("Cyrix");}
					      			    		 				if (BrandcomboBox_1_1.getSelectedItem().equals("IBM")) {ProcessorModel.SearchBox.setText("IBM");}
					      			    		 				if (BrandcomboBox_1_1.getSelectedItem().equals("Alpha DEC")) {ProcessorModel.SearchBox.setText("Alpha DEC");}
					      			    		 				if (BrandcomboBox_1_1.getSelectedItem().equals("Winchip")) {ProcessorModel.SearchBox.setText("Winchip");}
					      			    					
					      			    
					      			    					}
					      			    				});
					      			    			  

			  
			///////// End of table Content /////
			
			
	
			SubmittButton.addActionListener(new ActionListener (){
					
					@Override
					public void actionPerformed (ActionEvent e){
				         
						// "no. [0]","Type"[1],"Carat"[2],"Rate"[3],"Brand(CPU)"[4],"Weight"[5],"Conversion to 24K[6]"
						 
						//int  i = model.getRowCount();
						 
						
						
						
						
						if (Processorsbtn_1.isSelected()) {
							
							 int index = ProcessorModel.MTable.getSelectedRow();
							    
							    TableModel TModel = ProcessorModel.MTable.getModel();
							    
							    String ProModel = TModel.getValueAt(index,1).toString(); 
							    String ProBrand = TModel.getValueAt(index,0).toString();
							    String ProYieldValue = TModel.getValueAt(index,3).toString();
							
							
							
							row [1] = Processorsbtn_1.getText();
						    row [2] = ("N/A");
						   
						    row [3] = ProYieldValue +""+"g/cpu";
						    row [4] = ProBrand + ProModel;
						    
						              String r5 = weightAmount.getText();
						    row [5] = r5 +" "+ "Units";
						   
						    double p = Double.parseDouble(ProYieldValue);
						    String Value = weightAmount.getText().toString();
						    double d = Double.parseDouble(Value);
						    
						    double result = p * d;
						    
						    row [6] = (result + "gm");
						}
						
						 if ((PcbRadio.isSelected() && CellPhoneBoardsbtn_1.isSelected())) {
							
							
							
							row [1] = CellPhoneBoardsbtn_1.getText();
							row [2] = ("N/A");
							row [3] = ("in avg. 24mg/board");
							row [4] = ("N/A");
							 row [5] = "Qt."+" "+ weightAmount.getText();   
							 
							 
							 String Value = weightAmount.getText().toString();
							  double d = Double.parseDouble(Value);  
							        
							  double convert = d*0.024;
							        
							        
							         
							  row [6] = (convert);   
						
						}
						 if ((PcbRadio.isSelected() && RamFingersbtn_1.isSelected())){ 
							
							
							row [1] = RamFingersbtn_1.getText();
						    row [2] = ("N/A");
						    row [3] = ("0.006/gram");
						    row [4] = ("N/A");
						    row [5] =  weightAmount.getText()+"grams"; 
						    
						    String Value = weightAmount.getText().toString();
							  double d = Double.parseDouble(Value);  
							  
							        double FAmt = d * 0.006;
							        
							         
							  row [6] = (FAmt);    
						    
						 } 
						 
						 
						 if ((PcbRadio.isSelected() && GoldPins_1.isSelected())){ 
								
								
								row [1] = GoldPins_1.getText();
							    row [2] = ("N/A");
							    row [3] = ("2-6g/lb");
							    row [4] = ("N/A");
							    row [5] = weightAmount.getText() +" gram"; 
							    
							    String Value = weightAmount.getText().toString();
								  double d = Double.parseDouble(Value);  
								        
								  double convert = d*0.002205;
								        double FAmt = convert * 4;
								        
								         
								  row [6] = (FAmt);    
							    
							 } 
						    
						    
						    
					  
					 if (radioScrapJewels_1.isSelected()) {
						 
						
						 row [1] = radioScrapJewels_1.getText();
						 row [2] = CaratcomboBox_1_1.getSelectedItem().toString(); 
						 row [4] = ("N/A");
						 row [5] = weightAmount.getText() + "gm";   	
					 
						 
						  if (row [2].equals("9 Carat")) { row [3] = ("37.5 % Pure");  // for 9 CARAT
						  
						       
						  String Value = weightAmount.getText().toString();
						  double d = Double.parseDouble(Value);  
						  
						         double Convert = d*0.0321507;
						         double Amt = (Convert*375)/1000;
						         double FAmt = Amt*31.1034768;
						         
						  row [6] = (FAmt)+""+"gm";
						  
						  } 
					
						  if (row [2].equals("14 Carat")) {row [3] = ("58.3 % Pure");  // for 14 CARAT
						  
						  String Value = weightAmount.getText().toString();
						  double d = Double.parseDouble(Value);  
						  
						         double Convert = d*0.0321507;
						         double Amt = (Convert*583)/1000;
						         double FAmt = Amt*31.1034768;
						         
						  row [6] = (FAmt)+""+"gm";
						  
						  }
					   
						  if (row [2].equals("18 Carat")) {row [3] = ("75 % Pure");  // for 18 CARAT
						  
						  String Value = weightAmount.getText().toString();
						  double d = Double.parseDouble(Value);  
						  
						         double Convert = d*0.0321507;
						         double Amt = (Convert*750)/1000;
						         double FAmt = Amt*31.1034768;
						         
						  row [6] = (FAmt)+""+"gm";
						  }	 
						  
                          if (row [2].equals("21 Carat")) {row [3] = ("87.5 % Pure");  // for 21 CARAT
						  
						  String Value = weightAmount.getText().toString();
						  double d = Double.parseDouble(Value);  
						  
						         double Convert = d*0.0321507;
						         double Amt = (Convert*875)/1000;
						         double FAmt = Amt*31.1034768;
						         
						  row [6] = (FAmt)+""+"gm";
						  }	  
						  
						  if (row [2].equals("22 Carat")) {row [3] = ("91.6 % Pure");  // for 22 CARAT
						  String Value = weightAmount.getText().toString();
						  double d = Double.parseDouble(Value);  
						  
						         double Convert = d*0.0321507;
						         double Amt = (Convert*916)/1000;
						         double FAmt = Amt*31.1034768;
						         
						  row [6] = (FAmt)+""+"gm";
						  }	 
						  
						  if (row [2].equals("24 Carat")) {row [3] = ("99.9 % Pure"); //  // for 24 CARAT
						  String Value = weightAmount.getText().toString();
						  double d = Double.parseDouble(Value);  
						  
						         double Convert = d*0.0321507;
						         double Amt = (Convert*999)/1000;
						         double FAmt = Amt*31.1034768;
						         
						  row [6] = (FAmt)+""+"gm";
						  }
						  
					 }
						  
					 if (ChipCards_1.isSelected())  {
					    	row [1] = ChipCards_1.getText();
					    	 row [2] = ("N/A");
					    	 row [3] = ("6 to 12g per lb");
					    	 row [4] = ("N/A");
					    	 row [5] = weightAmount.getText() +" gram";   
					   
					    	 String Value = weightAmount.getText().toString();
							  double d = Double.parseDouble(Value); 
					 
					        double convert = 0.002205 * d; // gram to pound rate conversion 
					        double calc = convert * 9 ;
					 
					 row [6] = ("in Average"+" " +calc);
					 }  
						
						  
						  
						  
						  
						  if (MeltedBarsbtn_1.isSelected()){
					    	row [1] = MeltedBarsbtn_1.getText();
					    	 row [2] = ("N/A");
					    	 row [3] = ("0.5-4g/lb");
					    	 row [4] = ("N/A");
					    	 row [5] = weightAmount.getText() +" gram";  
					    	 
					    	 String Value = weightAmount.getText().toString();
							  double d = Double.parseDouble(Value); 
					 
					        double convert = 0.002205 * d;
					        double calc = convert * 2.25 ;
					 
					 row [6] = ("in Average"+" " +calc); 
					    	 
					    	 
					    	 
					    	 
					    	 
					    	 
					    }
					 
					
					 
					
					model.addRow(row);
					
			
					}});
			
			JLabel lblOr = new JLabel("or");
			lblOr.setBounds(538, 313, 61, 14);
			lblOr.setHorizontalAlignment(SwingConstants.CENTER);
			CalculationJPanel_1_1.add(lblOr);
			
			JLabel lblAmount = new JLabel("Amount");
			lblAmount.setBounds(546, 322, 63, 20);
			CalculationJPanel_1_1.add(lblAmount);
			
			JLabel lblcellPhoneBoard = new JLabel("(Cell phone board and CPU Only)");
			lblcellPhoneBoard.setBounds(467, 339, 194, 14);
			lblcellPhoneBoard.setHorizontalAlignment(SwingConstants.RIGHT);
			CalculationJPanel_1_1.add(lblcellPhoneBoard);
			
			JLabel MyLink = new JLabel("By Bisrat F");
			MyLink.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
				Desktop browse = Desktop.getDesktop();
				try {
					browse.browse(new URI ("http://www.bisrat.co.uk/"));
				    } 
				catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				     } 
				catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				    }
								
				}
			});
			MyLink.setFont(new Font("Segoe Marker", Font.PLAIN, 14));
			MyLink.setBounds(853, 648, 64, 24);
			MainFrame.getContentPane().add(MyLink);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			// Processor JTable stuff Ends Here .......................
			 
			 
			 
				  radioScrapJewels_1.addActionListener(new ActionListener() {
		 				public void actionPerformed(ActionEvent e) {
		 				
		 					if(radioScrapJewels_1.isSelected())
		 					{
		 						lblCarat_1.setEnabled(true);
		 						CaratcomboBox_1_1.setEnabled(true);
		 						BrandcomboBox_1_1.setEnabled(false);
		 						lblBrand_1.setEnabled(false);
		 						BrandcomboBox_1_1.setEnabled(false);
		 						//lblModel_1.setEnabled(false);
		 						 textField_Model.setEnabled(false);
		 						
		 						CellPhoneBoardsbtn_1.setEnabled(false);
		 						RamFingersbtn_1.setEnabled(false);
		 				    	  weightAmount.setText(null);
		 				    	 SubmittButton.setEnabled(false);
						    	  GoldPins_1.setEnabled(false);
						    	  ProcessorModel.SearchBox.setEnabled(false);
						    	  weightAmount.setText(null);
		 					}
		 	
		 				}
		 			     
		 		       });
				  
				      
				      
				          ChipCards_1.addActionListener(new ActionListener() {
	 				public void actionPerformed(ActionEvent e) {
	 				
	 					if(ChipCards_1.isSelected())
	 					{
	 						 lblCarat_1.setEnabled(false);
				      					CaratcomboBox_1_1.setEnabled(false);
				      					CaratcomboBox_1_1.setSelectedItem("Please Choose Carat");
				      					lblBrand_1.setEnabled(false);
				      					BrandcomboBox_1_1.setEnabled(false);
				      					lblBrand_1.setEnabled(false);
				      					BrandcomboBox_1_1.setEnabled(false);
				      				//	lblModel_1.setEnabled(false);
				      					 textField_Model.setEnabled(false);
				      					
				      					 CellPhoneBoardsbtn_1.setEnabled(false);
				      					 RamFingersbtn_1.setEnabled(false);
				      					 weightAmount.setText(null);
				      			    	  SubmittButton.setEnabled(false);
				      			    	  GoldPins_1.setEnabled(false);
								    	  weightAmount.setText(null);

	 					}
	 	
	 				}
	 			     
	 		       });
				          
			   MeltedBarsbtn_1.addActionListener(new ActionListener() {
				          		public void actionPerformed(ActionEvent e) {
				          			
				          			  if (MeltedBarsbtn_1.isSelected()) {
				          				  
				          				  lblCarat_1.setEnabled(false);
				          					CaratcomboBox_1_1.setEnabled(false);
				          					CaratcomboBox_1_1.setSelectedItem("Please Choose Carat");
				          					lblBrand_1.setEnabled(false);
				          					BrandcomboBox_1_1.setEnabled(false);
				          					lblBrand_1.setEnabled(false);
				          					BrandcomboBox_1_1.setEnabled(false);
				          				//	lblModel_1.setEnabled(false);
				          					 textField_Model.setEnabled(false);
				          					
				          					 CellPhoneBoardsbtn_1.setEnabled(false);
				          					 RamFingersbtn_1.setEnabled(false);
				          					 weightAmount.setText(null);
				          			    	  SubmittButton.setEnabled(false);
				          			    	  GoldPins_1.setEnabled(false);
				          			    	 
				          			  }
				          		}
				          	});
			   
			   	   
			   PcbRadio.addActionListener(new ActionListener() {
			   			public void actionPerformed(ActionEvent e) {
			   			      if(PcbRadio.isSelected()) {
			   			    	  GoldPins_1.setEnabled(true);
			   			    	 CellPhoneBoardsbtn_1.setEnabled(true);
			   			    	  RamFingersbtn_1.setEnabled(true);
			   			    	  
			   			    	  lblCarat_1.setEnabled(false);
			   						CaratcomboBox_1_1.setEnabled(false);
			   						CaratcomboBox_1_1.setSelectedItem("Please Choose Carat");
			   						lblBrand_1.setEnabled(false);
			   						BrandcomboBox_1_1.setEnabled(false);
			   					//	lblModel_1.setEnabled(false);
			   						 textField_Model.setEnabled(false);
			   						 weightAmount.setText(null);
			   						 SubmittButton.setEnabled(false);
			   						
			   			      }
			   			    
			   			
			   			
			   			
			   			}
			   		});	
			   
			   
  			   
  			  
  			  
  			   
  			   
  			   
  			   Processorsbtn_1.addActionListener(new ActionListener() {
			  		public void actionPerformed(ActionEvent e) {
			  			if (Processorsbtn_1.isSelected()){
			  				
			  				 lblCarat_1.setEnabled(false);
			  					CaratcomboBox_1_1.setEnabled(false);
			  					CaratcomboBox_1_1.setSelectedItem("Please Choose Carat");
			  					lblBrand_1.setEnabled(true);
			  					BrandcomboBox_1_1.setEnabled(true);
			  					//lblModel_1.setEnabled(true);
			  					 textField_Model.setEnabled(true);
			  					ProcessorModel.SearchBox.setEnabled(true);
			  				
			  					ProcessorModel.lblModel_1.setEnabled(true);
			  					 CellPhoneBoardsbtn_1.setEnabled(false);
			  					 RamFingersbtn_1.setEnabled(false);
			  					 weightAmount.setText(null);
			  			    	  SubmittButton.setEnabled(false);
			  			    	  GoldPins_1.setEnabled(false);
			  			    	
			  			}
			  		}
			  	});
			  	
			  	
			 
			  	
			  	
			  	
			  	
//			  	JPanel Propanel = new JPanel();
//			  	Propanel.
//			  	Propanel.setBounds(1032, 43, 307, 271);
//			  	MainFrame.getContentPane().add(Propanel);
			  
			  
			  
			      
			   deleteRow.addActionListener(new ActionListener() {
			  	  	public void actionPerformed(ActionEvent e) {
			  	  		//
			  	  		int i = InputTable_1_1.getSelectedRow();
			  	  		 if( i >= 0) {
			  	  			model.removeRow(i);
			  	  		 }
			  	  	}
			  	  });
			   
			   
			   
			   
			   
			   
			   
			  
//			  JButton SearButton = new JButton("S");
//			  
//			  CalculationJPanel_1.add(SearButton);
//			  
			
			  
			  // Processor JTable stuff Starts Here 
			   
			   btnReset.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

				
						
						DefaultTableModel ClearModel = (DefaultTableModel)InputTable_1_1.getModel();
						while (ClearModel.getRowCount() > 0) {
							for (int i = 0; i< ClearModel.getRowCount(); i++) {
								ClearModel.removeRow(i);
							}
						}
						
						DefaultTableModel ClearProcessor = (DefaultTableModel)ProcessorModel.MTable.getModel();
						while (ClearProcessor.getRowCount() > 0) {
							for (int i = 0; i< ClearProcessor.getRowCount(); i++) {
								ClearProcessor.removeRow(i);
							}
						}	
						
						weightAmount.setText(null);
						SubmittButton.setEnabled(false);
						BrandcomboBox_1_1.setSelectedItem("Please Choose a Brand");
						ProcessorModel.SearchBox.setText(null);
						CaratcomboBox_1_1.setSelectedItem("Please Choose Carat");
						radioScrapJewels_1.setSelected(true);
					}
				});  
  			  
  			   
			   
			   
			   
			   
			   
			   
		
		
		
		

	    
			
	}
}

             
























