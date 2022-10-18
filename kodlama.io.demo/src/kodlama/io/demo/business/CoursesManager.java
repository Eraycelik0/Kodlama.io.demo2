package kodlama.io.demo.business;

import java.util.List;

import kodlama.io.demo.core_logging.Logger;
import kodlama.io.demo.dataAccess.course.CourseDao;
import kodlama.io.demo.entities.Courses;

public class CoursesManager {
	private CourseDao courseDao;
	private List<Logger> loggers;

	public CoursesManager(CourseDao courseDao, List<Logger> loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void saved(Courses course) throws Exception {
		if (course.getUnitPrice() <= 0) {
			System.out.println("course price cannot be less than zero");
			return;
		}

		List<Courses> courses1 = courseDao.getList();
		for (Courses courses : courses1) {
			if (courses.getCourseName().equals(courses.getCourseName())) {
				System.out.println("course name must be undefined");
				return;
			}
		}
		courseDao.addCourse(course);

		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}

}
