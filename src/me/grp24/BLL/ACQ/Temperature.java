package me.grp24.BLL.ACQ;

public enum Temperature {
	CELSIUS("CELSIUS", "\u2103"), FAHRENHEIT("FAHRENHEIT", "\u2109"), KELVIN("KELVIN", "\u212A");

	private String name;
	private String unit;

	Temperature(String name, String unit) {
		this.name = name;
		this.unit = unit;
	}

	public String getName() {
		return name;
	}

	public String getUnit() {
		return unit;
	}
}
