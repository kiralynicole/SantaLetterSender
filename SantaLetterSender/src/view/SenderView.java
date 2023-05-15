package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Canvas;

public class SenderView extends JFrame {

	private JPanel contentPane;
	private JTextField nameField;
	private JTextField ageField;
	private JTextField locationField;
	private JLabel nameLabel;
	private JLabel locationLabel;
	private JLabel ageLabel;
	public JCheckBox newCheckBox;
	private JButton continueButton;
	private JLabel lblNewLabel;

	
	public SenderView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nameLabel = new JLabel("Nume:");
		nameLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		nameLabel.setBounds(40, 20, 45, 15);
		contentPane.add(nameLabel);
		
		nameField = new JTextField();
		nameField.setBounds(108, 15, 115, 20);
		contentPane.add(nameField);
		nameField.setColumns(10);
		
		ageLabel = new JLabel("Varsta:");
		ageLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		ageLabel.setBounds(40, 65, 45, 15);
		contentPane.add(ageLabel);
		
		ageField = new JTextField();
		ageField.setBounds(108, 60, 115, 20);
		contentPane.add(ageField);
		ageField.setColumns(10);
		
		locationLabel = new JLabel("Locatie:");
		locationLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		locationLabel.setBounds(40, 110, 45, 13);
		contentPane.add(locationLabel);
		
		locationField = new JTextField();
		locationField.setBounds(108, 105, 115, 20);
		contentPane.add(locationField);
		locationField.setColumns(10);
		
		newCheckBox = new JCheckBox("Am fost cuminte");
		newCheckBox.setFont(new Font("Tahoma", Font.BOLD, 9));
		newCheckBox.setBounds(180, 179, 107, 20);
		contentPane.add(newCheckBox);
		
		continueButton = new JButton("Mai departe");
		continueButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		continueButton.setBounds(180, 205, 107, 20);
		contentPane.add(continueButton);
		
		lblNewLabel = new JLabel("");
		ImageIcon img = new ImageIcon("santa_claus.png");
		lblNewLabel.setIcon(img);
		lblNewLabel.setBounds(233, 0, 193, 137);
		contentPane.add(lblNewLabel);
	}
    public void addContinueListener(ActionListener actionListener) {
    	this.continueButton.addActionListener(actionListener);
    }
    
    public String getNameInput() {
    	return this.nameField.getText();
    }
    public String getAgeInput() {
    	return this.ageField.getText();
    }
    public String getLocationInput() {
    	return this.locationField.getText();
    }
    public void showErrorMessage(String errorMessage) {
    	JOptionPane.showMessageDialog(this, errorMessage);
    	}
}
