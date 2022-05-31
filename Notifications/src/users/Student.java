package users;

public class Student {
	String name;
	int id;
	String email;
	String phoneNumber;
	
	
	
	public Student(String name, int iD, String email, String phoneNumber) {
		super();
		this.name = name;
		this.id = iD;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int iD) {
		this.id = iD;
	}
	
	
	public void notifyStudent(String message) {
		// do some stuff
	}
	
}
