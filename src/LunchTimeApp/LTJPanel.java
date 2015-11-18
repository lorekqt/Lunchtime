package LunchTimeApp;
import VotingController.*;

import java.awt.BorderLayout;
import java.awt.Dialog;
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

public class LTJPanel extends JPanel {

  JFrame frame;
  
  VotingController vc = new VotingController();
	
  JList list;

  ArrayList<Restaurant> model;

  public LTJPanel(final JFrame frame) {
	  
	this.frame = frame;
	setLayout(new BorderLayout());
	
    model = new ArrayList<Restaurant>();
    model = vc.getRestaurants();
    list = new JList(model.toArray());
    
    JScrollPane pane = new JScrollPane(list);
    JButton voteButton = new JButton("Vote");

    voteButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
    	vc.incrementVotes(list.getSelectedValue().toString());
    	frame.dispose();
    	JFrame frame2 = new JFrame("Results");
	    frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame2.setContentPane(new PopUpWinner(frame2, vc.winner()));
	    frame2.setSize(300, 250);
	    frame2.setVisible(true);
      }
    });
    
    add(pane, BorderLayout.NORTH);
    add(voteButton, BorderLayout.CENTER);
    
 
	
  }
  public static void main(String s[]) {
    JFrame frame = new JFrame("Restaurant voting");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setContentPane(new LTJPanel(frame));
    frame.setSize(300, 250);
    frame.setVisible(true);
  }
}
