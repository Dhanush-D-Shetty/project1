package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity()
public class KssebSignup {
	
	
	@Id
	private String emailId;
	private String name;
	private String pwd;
	private long ph_no;
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public long getPh_no() {
		return ph_no;
	}
	public void setPh_no(long ph_no) {
		this.ph_no = ph_no;
	}
	
}
