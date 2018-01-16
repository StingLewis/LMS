package cn.niit.lms.login;

public class User {
	private int uid;
	private String uname;
	private String role;
	private String phone;
	private String pwd;
	private String email;
	private boolean gender;
	private String address;
	private String dob;

	public int getUid() {
		return uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "User{" + "uname=" + uname + ", role=" + role + ", phone=" + phone + ", email=" + email + ", pwd=" + pwd
				+ ", gender=" + gender + ", address=" + address + ", dob=" + dob + '}';
	}
}
