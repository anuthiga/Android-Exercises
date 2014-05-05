import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

public class LayoutTest{ 
	JTextArea text;
	
	public static void main (String[] args) { 
		LayoutTest gui = new LayoutTest(); 
		gui.go();
	}
	
	public void go() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel(); 
		panel.setBackground(Color.darkGray);
		JButton button = new JButton("tesuji");
		JButton buttonTwo = new JButton("watari"); 		
		
		/*frame.getContentPane().add(BorderLayout.NORTH,panel); 
		panel.add(buttonTwo); 
		frame.getContentPane().add(BorderLayout.CENTER,button);*/
		
		/*panel.add(buttonTwo); 
		frame.getContentPane().add(BorderLayout.CENTER,button); 
		frame.getContentPane().add(BorderLayout.EAST, panel);*/
		
		/*panel.add(button); 
		frame.getContentPane().add(BorderLayout.NORTH,buttonTwo); 
		frame.getContentPane().add(BorderLayout.EAST, panel);*/
		
		/*frame.getContentPane().add(BorderLayout.SOUTH,panel); 
		panel.add(buttonTwo); 
		frame.getContentPane().add(BorderLayout.NORTH,button);*/
		
		panel.add(buttonTwo);
		frame.getContentPane().add(BorderLayout.CENTER,panel);
		frame.getContentPane().add(BorderLayout.SOUTH,button);
		
		frame.setSize(350,300);
		frame.setVisible(true); 
		
	}
}
