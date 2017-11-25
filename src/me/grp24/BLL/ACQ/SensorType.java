package me.grp24.BLL.ACQ;

public class SensorType {
	public static final int TEMP_SENSOR = 0;
	public static final int CO2_SENSOR = 1;

	private int type;
	private String unit;

	public SensorType(int type, String unit) {
		this.type = type;
		this.unit = unit;
	}

	public int getType() {
		return type;
	}

	public String getUnit() {
		return unit;
	}
}
