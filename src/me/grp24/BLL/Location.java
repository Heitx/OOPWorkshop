package me.grp24.BLL;

public class Location {
	String longitude;
	String latitude;
	String address;
	String country;


	public Location(String address, String country) {
		this.address = address;
		this.country = country;
	}

	public Location(String longitude, String latitude, String address, String country) {
		this(address, country);
		this.longitude = longitude;
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
