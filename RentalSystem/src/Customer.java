
public class Customer 
{
  private int cid;
  private String name,pass,address;
  private long phone;
  private String gender;
  private String aptype;
  private String rtype;
  
  
  public String getAptype() {
	return aptype;
}
  
public void setAptype(String aptype) {
	this.aptype = aptype;
}

public String getRtype() {
	return rtype;
}

public void setRtype(String rtype) {
	this.rtype = rtype;
}

  

public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
@Override
public String toString() {
	return "Customer [cid=" + cid + ", name=" + name + ", pass=" + pass + ", address=" + address + ", phone=" + phone
			+ ", gender=" + gender + ", aptype=" + aptype + ", rtype=" + rtype + "]";
}

}
