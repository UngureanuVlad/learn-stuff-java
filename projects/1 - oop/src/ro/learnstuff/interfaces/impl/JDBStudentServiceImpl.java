package ro.learnstuff.interfaces.impl;

import ro.learnstuff.inheritance.children.Student;
import ro.learnstuff.interfaces.contract.StudentService;

public class JDBStudentServiceImpl implements StudentService {

	@Override
	public void saveStudent(Student student) {
		System.out.println("Save using JDBC!");
	}

	@Override
	public boolean updateStudent(Student student) {
		System.out.println("Update using JDBC!");
		return false;
	}

}
