package kodlama.io.demo.dataAccess.instructor;

import kodlama.io.demo.entities.Instructor;

public interface InstructorDao {

	public void addInstructor(Instructor instructor);

	public void deleteInstructor(Instructor instructor);
}
