package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import enums.GiftType;
import model.Gift;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class GiftsView extends JFrame {

	private JPanel contentPane;
	private JTextField giftNameField;
	private JButton sendButton;
	private JLabel giftNameLabel;
	private JLabel giftTypeLabel;
	private JComboBox giftTypecomboBox;
	private JButton addButton;
	private JLabel giftLabel1;
	private JLabel giftLabel2;
	private JLabel giftLabel3;
	private JLabel giftLabel4;
	private JLabel giftLabel5;

	

	public GiftsView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		giftNameLabel = new JLabel("Nume cadou:");
		giftNameLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		giftNameLabel.setBounds(40, 35, 70, 20);
		contentPane.add(giftNameLabel);
		
		giftTypeLabel = new JLabel("Tip cadou: ");
		giftTypeLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		giftTypeLabel.setBounds(40, 85, 70, 15);
		contentPane.add(giftTypeLabel);
		
		giftNameField = new JTextField();
		giftNameField.setBounds(140, 36, 96, 19);
		contentPane.add(giftNameField);
		giftNameField.setColumns(10);
		
		GiftType[] giftChoiches = new GiftType[] {GiftType.CAR, GiftType.DOLL, GiftType.PCGAME};
		giftTypecomboBox = new JComboBox<GiftType>(giftChoiches);
		giftTypecomboBox.setBounds(140, 82, 96, 21);
		contentPane.add(giftTypecomboBox);
		
		addButton = new JButton("Adauga cadou");
		addButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		addButton.setBounds(150, 210, 118, 21);
		contentPane.add(addButton);
		
		addButton.addMouseListener(new MouseListener() {
		      @Override
		      public void mouseEntered(MouseEvent e) {
		        addButton.setBackground(Color.GREEN);
		      }

		      @Override
		      public void mouseExited(MouseEvent e) {
		        addButton.setBackground(null);
		      }

		      @Override
		      public void mouseClicked(MouseEvent e) 
		      {
		
		    	  
		      }

		      @Override
		      public void mousePressed(MouseEvent e) {}

		      @Override
		      public void mouseReleased(MouseEvent e) {}
		    });
		
		sendButton = new JButton("Trimite");
		sendButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		sendButton.setBounds(278, 210, 118, 21);
		contentPane.add(sendButton);
		sendButton.addMouseListener(new MouseListener() {
		      @Override
		      public void mouseEntered(MouseEvent e) {
		        sendButton.setBackground(Color.BLUE);
		      }

		      @Override
		      public void mouseExited(MouseEvent e) {
		        sendButton.setBackground(null);
		      }

		      @Override
		      public void mouseClicked(MouseEvent e) {}

		      @Override
		      public void mousePressed(MouseEvent e) {}

		      @Override
		      public void mouseReleased(MouseEvent e) {}
		    });
		
		
		    giftLabel1 = new JLabel();
		    giftLabel1.setFont(new Font("Tahoma", Font.BOLD, 10));
			giftLabel1.setBounds(300, 15, 200, 15);
			contentPane.add(giftLabel1);
			
			giftLabel2 = new JLabel();
		    giftLabel2.setFont(new Font("Tahoma", Font.BOLD, 10));
			giftLabel2.setBounds(300, 45, 200, 15);
			contentPane.add(giftLabel2);
			
			giftLabel3 = new JLabel();
		    giftLabel3.setFont(new Font("Tahoma", Font.BOLD, 10));
			giftLabel3.setBounds(300, 75, 200, 15);
			contentPane.add(giftLabel3);
			
			giftLabel4 = new JLabel();
		    giftLabel4.setFont(new Font("Tahoma", Font.BOLD, 10));
			giftLabel4.setBounds(300, 105, 200, 15);
			contentPane.add(giftLabel4);
			
			giftLabel5 = new JLabel();
		    giftLabel5.setFont(new Font("Tahoma", Font.BOLD, 10));
			giftLabel5.setBounds(300, 135, 200, 15);
			contentPane.add(giftLabel5);
			
	}
	
	public GiftType getGiftComboInput() {
		return (GiftType) this.giftTypecomboBox.getSelectedItem();
	}
	
	public String getgiftNameInput() {
    	return this.giftNameField.getText();
    }
	  public void showError(String errorMessage) {
	    	JOptionPane.showMessageDialog(this, errorMessage);
	    	}
	  public void addGiftChangeListener(ActionListener actionListener) {
	    	this.addButton.addActionListener(actionListener);
	    }
	  public void addSendListener(ActionListener actionListener) {
	    	this.sendButton.addActionListener(actionListener);
	    }
	  
	  public void addLabels(Set<Gift> gifts, int i) {
			 int j = 0;
			  for(Gift g:gifts) {
				  if(i == 0 && i == j) {
					  giftLabel1.setText(g.getType() + ": " + g.getNameGift());
				  }else if(i == 1 && i == j) {
					  giftLabel2.setText(g.getType() + ": " + g.getNameGift());
					  }else if(i == 2 && i == j) {
					  giftLabel3.setText(g.getType() + ": " + g.getNameGift());
				  }else if(i == 3 && i == j) {
					  giftLabel4.setText(g.getType() + ": " + g.getNameGift());
				  }else if(i == 4 && i == j){
					  giftLabel5.setText(g.getType() + ": " + g.getNameGift());
				  }
				  j++;
			  }
		  }
	  }
	  

