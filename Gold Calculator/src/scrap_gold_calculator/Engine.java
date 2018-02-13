package scrap_gold_calculator;

import javax.swing.SwingUtilities;

public class Engine extends Calculator {
	public Engine() {
	}

   public static void main (String []args){
	   
	   SwingUtilities.invokeLater(new Runnable(){
		  public void run() {
			  new Calculator();
			  
			  try {
					Calculator window = new Calculator();
					window.MainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			  
			  
			  			  
			  
			  
		  } 
		   
	   });
	   
	   
	   
	   
	   
   }





}



