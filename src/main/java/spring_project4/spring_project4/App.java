package spring_project4.spring_project4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.MyConfiguration;
import com.dao.StudentDao;
import com.model.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
		StudentDao sd = context.getBean(StudentDao.class);

		//Student s = new Student();

//		<------inserting the student in table-------->
//		s.setName("David Warner");
//		s.setCity("Austrelia");
//		s.setPercentage(95.50);
		
//		<---------finding the student by id---------->
//		System.out.println(sd.findStudentById(2));
		
//      <----display all the student by ------>
//	    System.out.println(sd.findAllStudent());
		
		
//      <-----update student by using id------>
//		Student s=sd.findStudentById(2);
//		s.setName("wwwwwxxx");
//	    System.out.println(sd.updateStudent(s));
		
		
//		<----finding the student by name------>
		Student s=sd.findStudentByName("David Warner");
		System.out.println(s);

 }
}
