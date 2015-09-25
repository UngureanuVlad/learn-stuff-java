package ro.learnstuff.interfaces.impl;

import ro.learnstuff.inheritance.children.Student;
import ro.learnstuff.interfaces.contract.StudentService;

public class JPAStudentServiceImpl implements StudentService{

	@Override
	public void saveStudent(Student student) {
		System.out.println("Save using JPA!");	
	}

	@Override
	public boolean updateStudent(Student student) {
		System.out.println("Update using JPA!");
		return false;
	}

}
