package kodlama.io.demo;

import java.util.ArrayList;
import java.util.List;

import kodlama.io.demo.business.CategoryManager;
import kodlama.io.demo.business.CoursesManager;
import kodlama.io.demo.business.InstructorManager;
import kodlama.io.demo.core_logging.DatabaseLogger;
import kodlama.io.demo.core_logging.FileLogger;
import kodlama.io.demo.core_logging.Logger;
import kodlama.io.demo.core_logging.MailLogger;
import kodlama.io.demo.dataAccess.category.CategoryDao;
import kodlama.io.demo.dataAccess.category.HibernateCategoryDao;
import kodlama.io.demo.dataAccess.category.JdbcCategoryDao;
import kodlama.io.demo.dataAccess.course.CourseDao;
import kodlama.io.demo.dataAccess.course.HibernateCoursesDao;
import kodlama.io.demo.dataAccess.course.JdbcCoursesDao;
import kodlama.io.demo.dataAccess.instructor.HibernateInstructorDao;
import kodlama.io.demo.dataAccess.instructor.JdbcInstructorDao;
import kodlama.io.demo.entities.Category;
import kodlama.io.demo.entities.Courses;
import kodlama.io.demo.entities.Instructor;

public class Main {

	public static void main(String[] args) {
		List<Logger> loggers = new ArrayList<>();
		loggers.add(new DatabaseLogger());
		loggers.add(new MailLogger());
		loggers.add(new	FileLogger());
		
		Courses course1 = new Courses(1,"Java","Engin Demirog",1000);
		Courses course2 = new Courses(2, "Pyhton","Engin Demirog",1400);
		
	
		/*CoursesManager coursesManager = new CoursesManager(new JdbcCoursesDao(), loggers);
		coursesManager.saved(course1);
		coursesManager.saved(course2);
	
		coursesManager = new CoursesManager(new HibernateCoursesDao(), loggers);
		coursesManager.saved(course1);
		coursesManager.saved(course2);
		*/
		
		
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
		
		Category category1 = new Category("Software");
		Category category2 = new Category("Hardware");
		categoryManager.saved(category1);
		categoryManager.saved(category2);

		categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		Instructor instructor1 = new Instructor(1, "Engin");
		Instructor instructor2 = new Instructor(2, "Eray");
		instructorManager.saved(instructor1);
		instructorManager.saved(instructor2);
		
		instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
		instructorManager.saved(instructor1);
		instructorManager.saved(instructor2);
		
		
		
		
	
	
	}

}
