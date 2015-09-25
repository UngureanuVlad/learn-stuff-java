package ro.learnstuff.inheritance.children;

import ro.learnstuff.inheritance.parent.Person;

public class Student extends Person {

	private String serialNumber = "";

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	@Override
	public String toString() {
		return new StringBuilder().append(this.getName())
				.append(" ").append(this.getSerialNumber()).toString();
	}
	
}
