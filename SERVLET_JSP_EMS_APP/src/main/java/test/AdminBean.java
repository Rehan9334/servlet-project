package test;
import java.io.*;

@SuppressWarnings("serial")
public class AdminBean implements Serializable 
{
 private String uname,pword,fname,lname,city,emailId;
 private Long phone;
 
 public AdminBean() {}

public String getUname() {
	return uname;
}

public void setUname(String uname) {
	this.uname = uname;
}

public String getPword() {
	return pword;
}

public void setPword(String pword) {
	this.pword = pword;
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

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public Long getPhone() {
	return phone;
}

public void setPhone(Long phone) {
	this.phone = phone;
}
 
 
}
