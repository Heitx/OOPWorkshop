package me.grp24.BLL.sensor;

public class SelectedSensor {
	private int sensor;
	private String unit;

	public SelectedSensor(int sensor, String unit) {
		this.sensor = sensor;
		this.unit = unit;
	}

	public int getSensor() {
		return sensor;
	}

	public void setSensor(int sensor) {
		this.sensor = sensor;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
}
