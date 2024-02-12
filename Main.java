import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
 public static void main(String[]args) {
	 JFrame frame = new JFrame();
	 frame.setSize(750,750);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.setVisible(true);
	 frame.setLayout(null);
	 
	 ImageIcon image = new ImageIcon("Cat.jpg");
	 frame.setIconImage(image.getImage());
	 frame.getContentPane().setBackground(new Color(170,120,65));
	 
	 JPanel darkBrown = new JPanel();
	 darkBrown.setBackground(new Color(150,100,50));
	 darkBrown.setBounds(0,0,250,250);
	 darkBrown.setLayout(new BorderLayout());
	 
	 JPanel lightBrown = new JPanel();
	 lightBrown.setBackground(new Color(190,140,80));
	 lightBrown.setBounds(0,250,300,250);
	 lightBrown.setLayout(new BorderLayout());
	 
	 JLabel label = new JLabel();
     label.setText("Hello! Welcome to the coffe shop.");
     
     JLabel love = new JLabel();
     love.setText("We would love to give you some coffee");
     ImageIcon image2 = new ImageIcon("cropped.jpg");
     love.setIcon(image2);
     
     darkBrown.add(label);
     frame.add(darkBrown);
     lightBrown.add(love);
     frame.add(lightBrown);
     
 }
}
