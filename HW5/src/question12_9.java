import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class question12_9{
	
	//defining a constructor
	public question12_9() {
		JFrame frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//set the position and width and height of button using grid layout 
		JPanel button = new JPanel(new GridLayout(4,4,4,4));
		JTextField calculation = new JTextField();
		
		
		
		button.add(new JButton("7"));
		button.add(new JButton("8"));
		button.add(new JButton("9"));
		button.add(new JButton("/"));
		button.add(new JButton("4"));
		button.add(new JButton("5"));
		button.add(new JButton("6"));
		button.add(new JButton("*"));
		button.add(new JButton("1"));
		button.add(new JButton("2"));
		button.add(new JButton("3"));
		button.add(new JButton("-"));
		button.add(new JButton("0"));
		button.add(new JButton("."));
		button.add(new JButton("="));
		button.add(new JButton("+"));
		
		
		Container cont = frame.getContentPane();
		
		//adding a button to container 
        cont.add(button, BorderLayout.CENTER);
	    cont.add(calculation, BorderLayout.NORTH);
	    
	    frame.setSize(265, 235);
	    frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//call a constructor
		 new  question12_9();
		 

	}

}
