package user;

import java.util.Date;

public class User {
	private Integer Id;
	private String name;
	private Date birthdate;
	
	//default override constructor
	protected User() {
		
	}
	//constructor 
	public User(Integer id, String name, Date birthdate) {
		super();
		Id = id;
		this.name = name;
		this.birthdate = birthdate;
	}
	// getters and setters
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + ", birthdate=" + birthdate + "]";
	}
	
	

}
