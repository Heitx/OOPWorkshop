package me.grp24.BLL;

import java.util.Date;

public class Measurement {
	double data;
	Date timestamp;

	public Measurement(double data, Date timestamp) {
		this.data = data;
		this.timestamp = timestamp;
	}

	public double getData() {
		return data;
	}

	public void setData(double data) {
		this.data = data;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
}
