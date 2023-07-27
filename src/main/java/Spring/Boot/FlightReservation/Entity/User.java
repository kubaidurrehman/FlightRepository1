package Spring.Boot.FlightReservation.Entity;

import javax.persistence.Entity;

@Entity
public class User extends AbstractEntity {

	private String first_Name;
	private String last_Name;
	private String email;
	private String password;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the first_Name
	 */
	public String getFirst_Name() {
		return first_Name;
	}

	/**
	 * @param first_Name the first_Name to set
	 */
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	/**
	 * @return the last_Name
	 */
	public String getLast_Name() {
		return last_Name;
	}

	/**
	 * @param last_Name the last_Name to set
	 */
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [first_Name=" + first_Name + ", last_Name=" + last_Name + ", email=" + email + ", password="
				+ password + "]";
	}

}
