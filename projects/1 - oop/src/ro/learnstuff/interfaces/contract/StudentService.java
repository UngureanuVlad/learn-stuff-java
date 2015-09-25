package ro.learnstuff.interfaces.contract;

import ro.learnstuff.inheritance.children.Student;

public interface StudentService {

	public void saveStudent(Student student);
	
	public boolean updateStudent(Student student);
}
