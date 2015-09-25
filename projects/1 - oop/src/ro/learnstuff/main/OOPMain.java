package ro.learnstuff.main;

import ro.learnstuff.inheritance.children.Circle;
import ro.learnstuff.inheritance.children.Rectangle;
import ro.learnstuff.inheritance.children.Square;
import ro.learnstuff.inheritance.children.Student;
import ro.learnstuff.inheritance.parent.Shape;
import ro.learnstuff.interfaces.contract.StudentService;
import ro.learnstuff.interfaces.impl.JDBStudentServiceImpl;
import ro.learnstuff.interfaces.impl.JPAStudentServiceImpl;

public class OOPMain {

	public static void main(String[] args){
		
		// students
		Student student = new Student();
		
		// shapes
		Circle circle = new Circle();
		Shape shape = new Circle();
		Square square = new Square();
		Rectangle rectangle = new Rectangle();
		
		// this will not work as Shape is abstract
		// Shape shape = new Shape();
		
		student.setName("Vlad");
		student.setSerialNumber("12345");
		System.out.println("Student: " + student.toString());
		
		circle.setRadius(4);
		System.out.println(circle.calculatePerimeter());
		
		square.setSide(4);
		System.out.println(square.calculatePerimeter());
		
		// demonstrate shape behavior
		System.out.println(shape.calculatePerimeter());
		
		rectangle.setLength(2);
		rectangle.setHeight(2);
		System.out.println(rectangle.calculatePerimeter());
		
		// 
		StudentService serviceJDBC = new JDBStudentServiceImpl();
		StudentService serviceJPA = new JPAStudentServiceImpl();
		StudentService anonymousClass = new StudentService() {
			
			@Override
			public boolean updateStudent(Student student) {
				System.out.println("Update using other method.");
				return false;
			}
			
			@Override
			public void saveStudent(Student student) {
				System.out.println("Save using other method.");
			}
		};
		
		serviceJDBC.saveStudent(student);
		serviceJPA.saveStudent(student);
		anonymousClass.saveStudent(student);
		
	}
}
