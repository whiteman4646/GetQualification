package dto;

public class Student {
	private int id;
	private String name;
	private String namektkn;
	private String password;
	private String gender;
	private String email;
	private String department;
	private String course;

	public Student(){

	}

	public Student(int id, String name, String namektkn, String password, String gender, String email,
			String department, String course) {
		super();
		this.id = id;
		this.name = name;
		this.namektkn = namektkn;
		this.password = password;
		this.gender = gender;
		this.email = email;
		this.department = department;
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNamektkn() {
		return namektkn;
	}

	public void setNamektkn(String namektkn) {
		this.namektkn = namektkn;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

}