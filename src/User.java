
public class User {

	private Long id;
	private String fullName;
	private String password;
	private String email;
	
	
	
	public User(Long id, String fullName, String password, String email) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.password = password;
		this.email=email;
	
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public void setId(Long id) {
		this.id = id;
	}




	public String getFullName() {
		return fullName;
	}




	public void setFullName(String fullName) {
		this.fullName = fullName;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public Long getId() {
		return id;
	}





	@Override
	  public String toString() {
	    return "User{" +
	           "id=" + id +
	           ", fullName='" + fullName + '\'' +
	            ", email= " + email+
	           '}' + '\n';
	  }




	
}
