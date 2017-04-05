package tilesample.user;

public class User {
	// form:hidden - hidden value
	Integer id;

	// form:input - textbox
	String name;

	// form:input - textbox
	String email;

	// form:textarea - textarea
	String address;

	// form:input - password
	String password;

	// form:input - password
	String confirmPassword;

	// form:radiobutton - radio button
	String sex;

	public boolean isNew() {
		return (this.id == null);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address
				+ ", password=" + password + ", confirmPassword=" + confirmPassword
				+ ", sex=" + sex + "]" + isNew();
	}
}
