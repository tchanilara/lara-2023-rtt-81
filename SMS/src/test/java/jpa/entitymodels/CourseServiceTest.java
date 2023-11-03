package jpa.entitymodels;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import jpa.service.CourseService;


public class CourseServiceTest {
	
	private CourseService courseService;
	CourseServiceTest(){
		courseService = new CourseService();
		
	}
	
	@Test
	public void getAllCoursesTest() {
		List<Course> course = courseService.getAllCourses();
		Assertions.assertEquals(10,course.size());
	}
	
	@Test
	public void getCourseByIdTest() {
		Course course = courseService.getCourseById(1);
		Assertions.assertEquals("Anderea Scamaden",course.getCInstructor());
		Assertions.assertEquals("English",course.getCName());
		
	}

}
