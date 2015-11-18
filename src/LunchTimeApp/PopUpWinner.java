package LunchTimeApp;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
//import java.lang.reflect.Array;
import java.util.ArrayList;

//import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListModel;

import Classes.Restaurant;
import javax.swing.JTextArea;
import java.awt.TextArea;
import javax.swing.JLabel;

public class PopUpWinner extends JPanel {

  JFrame frame;
  

  public PopUpWinner(final JFrame frame, String text) {
  	this.frame = frame;
  	
  	JLabel lblNewLabel = new JLabel(text + " is the winner!!");
  	add(lblNewLabel);
  	
  	JButton quitButton = new JButton("Quit");
  	
  	quitButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        	frame.dispose();
        }
      });
  	
  	 add(quitButton, BorderLayout.NORTH);
  }
  public static void main(String s[]) {
  }
}
