package ro.learnstuff.model;

public class Student implements Comparable<Student> {

	private String name = "";
	private String surname = "";
	private int identificationNumber = 0;

	public Student(String name, String surname, int identificationNumber) {
		this.name = name;
		this.surname = surname;
		this.identificationNumber = identificationNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(int identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	@Override
	public int compareTo(Student o) {
		if (o.getIdentificationNumber() > this.identificationNumber) {
			return -1;
		}
		return 1;
	}

	@Override
	public String toString() {
		return this.identificationNumber + " - " + this.name + " " + this.surname;
	}
}
