package magnus.test.git;

public class Course
{

	private int courseID;
	private int typeID;
	private String courseName;

	public int getCourseID()
	{
		return courseID;
	}

	public void setCourseID(int courseID)
	{
		this.courseID = courseID;
	}

	public int getTypeID()
	{
		return typeID;
	}

	public void setTypeID(int typeID)
	{
		this.typeID = typeID;
	}

	public String getCourseName()
	{
		return courseName;
	}

	public void setCourseName(String courseName)
	{
		this.courseName = courseName;
	}
}
