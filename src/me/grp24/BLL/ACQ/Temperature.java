package me.grp24.BLL.ACQ;

public enum Temperature {
	// TODO: maybe change to id based, so the index gets the correct unit
	// METHOD: create a static hashmap and place them all inside to begin with,
	// then create a static function to obtain by index.
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
