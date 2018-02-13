package scrap_gold_calculator;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;


public class ProcessorModel extends  JPanel {

	public JTextField textField_Model; 
	public JTable MTable;
	public JScrollPane ModelJScrollPane;
	public JButton SearchButton; 
	public JPanel ProJPanel;
	public JTextField SearchBox; 
	public JLabel lblModel_1;
	
	 public ProcessorModel () {
    	 
		setLayout(null);
		MTable = new JTable();
		MTable.setRowHeight(30);
		
		lblModel_1 = new JLabel("Model");
		add(lblModel_1);
		
		
		
		
		
		// tableModel.getColumnModel().getColumn(1).setPreferredWidth(10);
		
		ModelJScrollPane = new JScrollPane (MTable);
	    ModelJScrollPane.setBounds(20, 57, 398, 148);
		add(ModelJScrollPane); 
		
		
	 
		SearchBox = new JTextField();
		SearchBox.setBounds(20, 11, 216, 35);
		 add(SearchBox);
		 SearchBox.setColumns(10);
		
		
				 
		 SearchButton = new JButton("Search");
		 SearchButton.setBounds(246, 11, 116, 29);
		 add(SearchButton);
		
		 SearchButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
						
				findUsers();
	
				}
		 });
	    
		 
	     
		
		   
		// Object [] Mcolumns = {"Brand","Model","Yield Type","Yield Value"};
	
     }
 
	 public class User {

		  private String Brand;
		  private String Model;
		  private String Yield_Type;
		  private float Yield_Value;
		
	 public  User (String PBrand,String PModel, String YType,float Yvalue){
			 
			 this.Brand = PBrand;
			 this.Model = PModel;
		     this.Yield_Type = YType;
		     this.Yield_Value = Yvalue;
		
		 }
		
		 public String getPBrand() 
		 {
			 
			 return Brand;
		 }
		
		 public String getPModel() 
		 {
			 
			 return Model;
		 }
		 public String getYType() 
		 {
			 
			 return Yield_Type;
		 }
		 public float getYvalue() 
		 {
			 
			 return Yield_Value;
		 }
	}
		 
		 
	public Connection getConnection () 
	{
         
	
		Connection con = null;
        
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/processormodels","root","root"); // p@ssw0rd2254
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        return con;
		
	}
		 
	public ArrayList<User> ListUsers(String ValToSearch) {	 
	 
		ArrayList<User> processorList = new ArrayList <User> ();	 
	
	      Statement st;
	      ResultSet rs;
	 
	 
	      try{
	            Connection con = getConnection();
	            st = con.createStatement();
	            String searchQuery = "SELECT * FROM `processor_model` WHERE CONCAT(`brand`, `model`, `yield_Type`, `yield_Value`) LIKE '%"+ValToSearch+"%'";
	            rs = st.executeQuery(searchQuery);
	            
	            User user;
	            
	            while(rs.next())
	            {
	                user = new User(
	                                 rs.getString("Brand"),
	                                 rs.getString("Model"),
	                                 rs.getString("Yield_Type"),
	                                 rs.getFloat("Yield_Value")
	                                );
	                processorList.add(user);
	            }
	            
	        }catch(Exception ex){
	            System.out.println(ex.getMessage());
	        }
	        
	        return processorList;  
	      
	
	} 
	 
	public void findUsers()
    {
		 
		
		
		 ArrayList<User> users = ListUsers(SearchBox.getText());
//		 DefaultTableModel tableModel = new DefaultTableModel();
		
	
     
		 
//		 
//		 Object[] columns = {"no.","Type","Carat","Rate","Brand(CPU)","Weight","Conversion to 24K"};
//			DefaultTableModel model = new DefaultTableModel();
//			model.setColumnIdentifiers(columns);
		 
		 
		 
		 Object [] Col = {"Brand","Model","Yield Type","Yield Value"};
		 DefaultTableModel tableModel = new DefaultTableModel();
		 tableModel.setColumnIdentifiers(Col);
		 
		 
		 
		
			
			
			
		// tableModel.setColumnIdentifiers(new Object[]  {"Brand","Model","Yield Type","Yield Value"}  ); 
      	 Object [] MRow = new Object [4];
        
        for(int i = 0; i < users.size(); i++)
        {
        	MRow[0] = users.get(i).getPBrand();
        	MRow[1] = users.get(i).getPModel();
        	MRow[2] = users.get(i).getYType();
        	MRow[3] = users.get(i).getYvalue();
            tableModel.addRow(MRow);
        }
        MTable.setModel(tableModel);
        
  
    
       
		
    
    
    
    }

	public void setBorder(LineBorder lineBorder) {
		// TODO Auto-generated method stub
		
	} 
	
	
	 
	  
	  
	
	
	
	
	
	
	 
	 
		 
		 
	 }
	 
	
