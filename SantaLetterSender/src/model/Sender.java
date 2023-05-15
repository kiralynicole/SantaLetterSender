package model;

import java.util.Set;
import java.util.TreeSet;

public class Sender {
	private String userName;
	private int age;
	private String location;
	private Set<Gift> gifts = new TreeSet<Gift>();


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Set<Gift> getGifts() {
		return gifts;
	}

	public void setGifts(Set<Gift> gifts) {
		this.gifts = gifts;
	}
	
	public void addGift(Gift g) {
		if(this.gifts.size() < 5) {
	       this.gifts.add(g);
		}
	}
	public int  SizeTree() {
		return this.gifts.size();
	}
}
