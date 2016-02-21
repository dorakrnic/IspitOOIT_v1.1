package ispit;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorChooser {
	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;
	
	public ColorChooser(){
		  mainFrame = new JFrame("Color chooser");
	      mainFrame.setSize(400,400);
	      mainFrame.setLayout(new GridLayout(3, 1));
	      mainFrame.addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent windowEvent){
	            System.exit(0);
	         }        
	      });    
	      headerLabel = new JLabel("", JLabel.CENTER);        
	      statusLabel = new JLabel("",JLabel.CENTER);    

	      statusLabel.setSize(350,100);

	      controlPanel = new JPanel();
	      controlPanel.setLayout(new FlowLayout());

	      mainFrame.add(headerLabel);
	      mainFrame.add(controlPanel);
	      mainFrame.add(statusLabel);
	      mainFrame.setVisible(true);  
	}
	
	 public static void main(String[] args){
		 ColorChooser  swingControl = new ColorChooser();      
	     swingControl.showColorChooser();
	   }
	 
	 
	 
	 private void showColorChooser(){
	      headerLabel.setText("Control in action: JColorChooser"); 
	      Color backgroundColor = JColorChooser.showDialog(mainFrame, "Izaberi boju", Color.white);
	      
	      /*JButton chooseButton = new JButton("Izaberi boju");        
	      chooseButton.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            Color backgroundColor = JColorChooser.showDialog(mainFrame,
	               "Choose background color", Color.white);
	            if(backgroundColor != null){
	               controlPanel.setBackground(backgroundColor);
	               mainFrame.getContentPane().setBackground(backgroundColor);
	            }
	         }
	      });
	      controlPanel.add(chooseButton);*/
	      
	      mainFrame.setVisible(true);  
	   }
}
