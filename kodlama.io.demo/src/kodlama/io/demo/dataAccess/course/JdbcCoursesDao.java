package kodlama.io.demo.dataAccess.course;

import java.util.ArrayList;
import java.util.List;

import kodlama.io.demo.entities.Courses;

public class JdbcCoursesDao implements CourseDao {

	@Override
	public void addCourse(Courses courses) {
		System.out.println("Added course " + courses.getCategoryName());

	}

	@Override
	public void deleteCourse(Courses courses) {
		System.out.println("Deleted course " + courses.getCategoryName());

	}

	@Override
	public List<Courses> getList() {
		List<Courses> courses = new ArrayList<>();
		courses.add(new Courses(1,"Java","Engin Demirog",1000));
		courses.add(new Courses(2, "Pyhton","Engin Demirog",1400));
		return courses;
	}
}
