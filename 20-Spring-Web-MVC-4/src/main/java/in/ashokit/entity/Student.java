package in.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "student")
public class Student {

	@Id
	@Column(name="Student_id")
	private Integer StudentId;
	
	@Column(name="Student_name")
	private String StudentName;
	
	@Column(name="Student_emil")
	private String StudentEmail;
	
	@Column(name="Student_age")
	private Integer StudentAge;
	
	
	public Integer getStudentId() {
		return StudentId;
	}

	public void setStudentId(Integer studentId) {
		StudentId = studentId;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getStudentEmail() {
		return StudentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		StudentEmail = studentEmail;
	}

	public Integer getStudentAge() {
		return StudentAge;
	}

	public void setStudentAge(Integer studentAge) {
		StudentAge = studentAge;
	}

	public Student() {
		
	}
	
	public Student(Integer studentId, String studentName, String studentEmail, Integer studentAge) {
		
		StudentId = studentId;
		StudentName = studentName;
		StudentEmail = studentEmail;
		StudentAge = studentAge;
	}

	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", StudentEmail=" + StudentEmail
				+ ", StudentAge=" + StudentAge + "]";
	}
	
	
}

