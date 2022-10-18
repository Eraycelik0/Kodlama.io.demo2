package kodlama.io.demo.business;

import java.util.List;

import kodlama.io.demo.core_logging.Logger;
import kodlama.io.demo.dataAccess.instructor.InstructorDao;
import kodlama.io.demo.entities.Instructor;

public class InstructorManager {
	private InstructorDao instructorDao;
	private List<Logger> loggers;

	public InstructorManager(InstructorDao instructorDao, List<Logger> loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	public InstructorManager(InstructorDao instructorDao, Logger loggers) {
		this.instructorDao = instructorDao;
	}

	public void saved(Instructor instructor) {
		instructorDao.addInstructor(instructor);
		for (Logger logger : loggers) {
			logger.log(instructor.getInstructorName());
		}
	}

}
