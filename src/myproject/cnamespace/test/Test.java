package myproject.cnamespace.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import myproject.cnamespace.beans.Student;

public class Test {

public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("/myproject/cnamespace/resources/applicationContext.xml");
	Student student = (Student) context.getBean("stdBean");
	student.getStudentDetails();
}
}
