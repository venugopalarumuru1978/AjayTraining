package person.model;

/*
CREATE TABLE `person` (
  `pid` int NOT NULL AUTO_INCREMENT,
  `personNam` varchar(20) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `phone` varchar(10) DEFAULT NULL,
  `pswd` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`pid`)
)
 */

public class Person {

	private int pid;
	private String pname;
	private String email, phone, pswd;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
}
