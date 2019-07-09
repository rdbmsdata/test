/**
 * 
 */
package spring.oshift.model;

import java.io.Serializable;

/**
 * @author Ranjan Dutta
 *
 */
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fname;
	private String lname;
	private String address;

	public User() {
		this.fname = "default";
		this.lname = "default";
		this.address = "default";
	}

	public User(String firstName, String lastName, String address) {
		this.address = address;
		this.fname = firstName;
		this.lname = lastName;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
