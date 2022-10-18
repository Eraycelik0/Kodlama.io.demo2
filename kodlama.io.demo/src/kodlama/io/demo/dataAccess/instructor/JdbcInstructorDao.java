package kodlama.io.demo.dataAccess.instructor;

import kodlama.io.demo.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void addInstructor(Instructor instructor) {
		System.out.println("Added instructor name" + instructor.getInstructorName());
	}

	@Override
	public void deleteInstructor(Instructor instructor) {
		System.out.println("Deleted instructor name" + instructor.getInstructorName());

	}
}