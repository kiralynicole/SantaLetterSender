package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.JLabel;

import exceptions.InvalidInputException;
import model.Gift;
import model.Sender;
import view.GiftsView;
import view.SenderView;

public class Controller {
	private SenderView senderView;
	private GiftsView giftsView;
	private Gift g;

	public Controller(SenderView senderView, GiftsView giftsView) {
		this.senderView = senderView;
		this.giftsView = giftsView;
		Sender sender = new Sender();
		this.senderView.addContinueListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String nameInput = "";
				String locationInput = "";
				String ageInput = "";
				int age = 0;
				try {
					nameInput = senderView.getNameInput();
					locationInput = senderView.getLocationInput();
					if (locationInput.trim().isEmpty()) {
						throw new InvalidInputException(
								"Te rog introdu o locatie, altfel Mos Craciun nu o sa te gaseasca!!");
					}
					if (!nameInput.contains(" ") || nameInput.length() < 5) {
						throw new InvalidInputException(
								"Te rog introdu numele complet! Ar trebui sa contina minim 5 caractere si un spatiu, altfel Mos Craciun nu o sa te gaseasca!!");
					}
					ageInput = senderView.getAgeInput();
					age = Integer.parseInt(ageInput);
					if (age < 0) {
						age = Math.abs(age);
					}
					 sender.setAge(age);
					 sender.setLocation(locationInput);
					 sender.setUserName(nameInput);
					
					giftsView.setVisible(true);
					senderView.setVisible(false);
					

				} catch (InvalidInputException ex) {
					senderView.showErrorMessage(ex.getMessage());
				} catch (NumberFormatException ex) {
					senderView.showErrorMessage("Te rog introdu un Integer, altfel Mos Craciun nu va stii cat de mare esti!!");
				}
			}

		});
		
		
		this.giftsView.addGiftChangeListener(new ActionListener() {
			
			 

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String giftName = "";
				
				try {
					giftName = giftsView.getgiftNameInput();
					if(giftName.length() < 10) {
						throw new InvalidInputException ("Numele unui cadou trebuie să aibă cel puțin 10 caractere. Te rog introdu din nou numele.");
					}
					g=new Gift();
					
					g.setNameGift(giftName);
					g.setType(giftsView.getGiftComboInput());
					
					sender.addGift(g);
					
					for(int j = 0; j < sender.getGifts().size(); j++) {
						giftsView.addLabels(sender.getGifts(), j);
						
					}
					
				}catch(InvalidInputException ex2) {
					giftsView.showError(ex2.getMessage());
				}
				
			}
			
		});
		
	
		
		this.giftsView.addSendListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(senderView.newCheckBox.isSelected()) {
				giftsView.showError("Scrisoarea lui " + sender.getUserName() + " avand varsta de " + sender.getAge() + " a fost trimisa! Acest/ Aceasta a fost cuminte in acest an!" );
				}else {
					giftsView.showError("Scrisoarea lui " + sender.getUserName() + " avand varsta de " + sender.getAge() + " a fost trimisa! Acest/ Aceasta nu a fost cuminte in acest an!" );
				}
			}
			
		});
		
		
		

	}

}
