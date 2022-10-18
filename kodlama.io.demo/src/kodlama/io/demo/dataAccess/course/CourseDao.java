package kodlama.io.demo.dataAccess.course;

import java.util.List;

import kodlama.io.demo.entities.Courses;

public interface CourseDao {
	public void addCourse(Courses courses);
	public void deleteCourse(Courses courses);
	List<Courses> getList();
	
}
