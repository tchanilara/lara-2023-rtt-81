package jpa.mainrunner;

import java.util.List;
import java.util.Scanner;

import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import jpa.service.CourseService;
import jpa.service.ErrorMessage;
import jpa.service.StudentService;

public class SMSRunner {

	private Scanner scan;

	private CourseService courseService;
	private StudentService studentService;
	private Student currentStudent;

	public SMSRunner() {
		scan = new Scanner(System.in);
		courseService = new CourseService();
		studentService = new StudentService();
	}

	public static void main(String[] args) {

		SMSRunner sms = new SMSRunner();
		sms.run();
	}

	private void run() {
		// Login or quit
		switch (menu1()) {
		case 1:
			if (studentLogin()) {
				registerMenu();
			}
			break;
		case 2:
			System.out.println(ErrorMessage.goodBye());
			break;

		default:
			System.out.println(ErrorMessage.goodBye());
			break;
		}
	}

	private int menu1() {
		System.out.println("\t********** Welcome **********");
		System.out.println("\n1. Student Login\n2. Quit Application\n\nPlease Enter Selection: ");

		return scan.hasNextInt()? scan.nextInt() : -1;
	}

	// check if student is validated and print his courses
	private boolean studentLogin() {

		System.out.println("Enter your email address: ");
		String email = scan.next();
		System.out.println("Enter your password: ");
		String password = scan.next();
		if (studentService.validateStudent(email, password)) {
			this.currentStudent = studentService.getStudentByEmail(email);
			List<Course> courses = studentService.getStudentCourses(currentStudent.getSEmail());
			if (courses.size() > 0) {
				System.out.println("\n\t\t************** My courses **************\n");
				System.out.printf("%5s%25S%30s\n", "ID", "Course", "Instructor");
				for (Course course : courses) {
					System.out.println(course);
				}
			}
			return true;
		}
		System.out.println(ErrorMessage.studentNotExist());
		return false;
	}

// just to allow to student to do a choice
	private void registerMenu() {
		System.out.println("\n1. Register a class\n2. Logout\n\nPlease Enter Selection: ");

		switch (scan.hasNextInt()? scan.nextInt() : -1) {
		case 1:
			studentRegister();
			break;
		case 2:
			System.out.println(ErrorMessage.goodBye());
			break;
		default:
			System.out.println(ErrorMessage.goodBye());
		}
	}

	// just allow to student to register a new course
	private void studentRegister() {
		List<Course> allCourses = courseService.getAllCourses();
		System.out.println("\n\t\t\t************** Liste of all the courses **************\n");
		System.out.printf("%5s%30s%25s\n", "ID", "Course", "Instructor");
		for (Course course : allCourses) {
			System.out.println(course);
		}

		System.out.print("\nEnter Course Number: ");
		int id = scan.hasNextInt()? scan.nextInt() : -1;

		studentService.registerStudentToCourse(currentStudent.getSEmail(), id);
		List<Course> courses = studentService.getStudentCourses(currentStudent.getSEmail());
		if (courses.size() > 0) {
			System.out.println("\n\t\t************** My updated courses **************\n");
			System.out.printf("%5s%30s%25s\n", "ID", "Course", "Instructor");
			for (Course course : courses) {
				System.out.println(course);
			}
			System.out.println(ErrorMessage.goodBye());
		}
	}

}
