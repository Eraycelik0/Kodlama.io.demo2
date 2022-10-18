package kodlama.io.demo.entities;

public class Courses {
	private int courseId;
	private String courseName;
	private int percentComplete;
	private String instructorName;
	private String categoryName;
	private int unitPrice;

	public Courses(int courseId, String courseName, String instructorName,int unitPrice) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.instructorName = instructorName;
		this.unitPrice = unitPrice;
	}
	public Courses() {
		
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getPercentComplete() {
		return percentComplete;
	}

	public void setPercentComplete(int percentComplete) {
		this.percentComplete = percentComplete;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

}
