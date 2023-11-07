package jpa.entitymodels;

import java.util.List;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import jpa.service.StudentService;

public class StudentServiceTest {

	private StudentService studentService;
	StudentServiceTest(){
		studentService = new StudentService();
		
	}
	
	@Test
	public void getAllStudentsTest() {
		List<Student> students = studentService.getAllStudents();
		Assertions.assertEquals(11,students.size());
	}
	
	@Test
	@Order(2)
	public void getStudentByEmailTest() {
		Student student = studentService.getStudentByEmail("tchanilara@gmail.com");
		Assertions.assertEquals("Tchani Larissa",student.getSName());
		Assertions.assertEquals("Asdfg2023",student.getSPass());
		Assertions.assertEquals(11,student.getSId());
		
	}
	
	@Test
	@Order(1)
	public void validateStudentTest() {
		Assertions.assertEquals(false, studentService.validateStudent("tchanilara@gmail.fr", "Asdfg2023" ));
		Assertions.assertEquals(false, studentService.validateStudent("tchanilara@gmail.com", "Asdfg2024" ));
		Assertions.assertEquals(true, studentService.validateStudent("tchanilara@gmail.com", "Asdfg2023" ));
	}
	
	@Test
	public void registerStudentToCourseTest() {
		int numbreCourse = studentService.getStudentCourses("sbowden1@yellowbook.com").size();
		studentService.registerStudentToCourse("sbowden1@yellowbook.com", 10);
		Assertions.assertEquals(numbreCourse + 1, studentService.getStudentCourses("sbowden1@yellowbook.com").size());
	}

}
