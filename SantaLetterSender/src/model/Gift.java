package model;

import java.util.Set;
import java.util.TreeSet;

import enums.GiftType;

public class Gift implements Comparable<Gift> {
	private String nameGift;
	private GiftType type;

	public Gift(String nameGift, GiftType type) {
		this.nameGift = nameGift;
		this.type = type;
	}

	public Gift() {

	}

	public String getNameGift() {
		return nameGift;
	}

	public void setNameGift(String nameGift) {
		this.nameGift = nameGift;
	}

	public GiftType getType() {
		return type;
	}

	public void setType(GiftType type) {
		this.type = type;
	}

	@Override
	public int compareTo(Gift o) {
		String s1 = this.getNameGift();
		String s2 = o.getNameGift();
		return s1.compareTo(s2);
	}

	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof Gift)) {
			return false;
		}
		return this.getNameGift().equals(((Gift) o).getNameGift());
	}

}
