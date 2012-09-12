package magnus.test.git;

import java.util.Date;

public class Participant
{
	private User user;
	private Course course;
	private Date completed;

	public User getUser()
	{
		return user;
	}

	public Course getCourse()
	{
		return course;
	}

	public Date getCompleted()
	{
		return completed;
	}

	public void setUser(User user)
	{
		this.user = user;
	}

	public void setCourse(Course course)
	{
		this.course = course;
	}

	public void setCompleted(Date completed)
	{
		this.completed = completed;
	}

}
