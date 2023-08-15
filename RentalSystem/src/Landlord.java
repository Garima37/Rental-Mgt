
public class Landlord 
{
      private int lid;
      private String name,password,address,aptype,amenities,furnished,rtype;
      private float sdeposit, rent;
      public float getSdeposit() {
		return sdeposit;
	}
	public void setSdeposit(float sdeposit) {
		this.sdeposit = sdeposit;
	}
	public float getRent() {
		return rent;
	}
	public void setRent(float rent) {
		this.rent = rent;
	}
	public String getRtype() {
		return rtype;
	}
	public void setRtype(String rtype) {
		this.rtype = rtype;
	}
	public String getFurnished() {
		return furnished;
	}
	public void setFurnished(String furnished) {
		this.furnished = furnished;
	}
	public String getAmenities() {
		return amenities;
	}
	public void setAmenities(String amenities) {
		this.amenities = amenities;
	}

	private long phone;
      
	public String getAptype() {
		return aptype;
	}
	public void setAptype(String aptype) {
		this.aptype = aptype;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	
	@Override
	public String toString() {
		return "Landlord [lid=" + lid + ", name=" + name + ", password=" + password + ", address=" + address
				+ ", aptype=" + aptype + ", amenities=" + amenities + ", furnished=" + furnished + ", rtype=" + rtype
				+ ", sdeposit=" + sdeposit + ", rent=" + rent + ", phone=" + phone + "]";
	}
	
	
      
	
	
      
}
