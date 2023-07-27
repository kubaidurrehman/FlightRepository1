package Spring.Boot.FlightReservation.Entity;

import javax.persistence.Entity;

@Entity
public class Passenger  extends AbstractEntity {

	private String first_Name;
	private String last_Name;
	private String middle_Name;
	private String phoneNo;
	private String email;
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
	 * @return the middle_Name
	 */
	public String getMiddle_Name() {
		return middle_Name;
	}
	/**
	 * @param middle_Name the middle_Name to set
	 */
	public void setMiddle_Name(String middle_Name) {
		this.middle_Name = middle_Name;
	}
	/**
	 * @return the phoneNo
	 */
	public String getPhoneNo() {
		return phoneNo;
	}
	/**
	 * @param phoneNo the phoneNo to set
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
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
	@Override
	public String toString() {
		return "Passenger [first_Name=" + first_Name + ", last_Name=" + last_Name + ", middle_Name=" + middle_Name
				+ ", phoneNo=" + phoneNo + ", email=" + email + "]";
	}
	
	
	
}
