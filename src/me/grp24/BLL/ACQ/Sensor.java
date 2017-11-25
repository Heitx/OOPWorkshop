package me.grp24.BLL.ACQ;

public enum Sensor {
	TEMPERATUR(0, "Temperatur Sensor", new String[] {
			Temperature.CELSIUS.getName(),
			Temperature.FAHRENHEIT.getName(),
			Temperature.KELVIN.getName()
	}),
	CO2(1, "CO2 Sensor", new String[] {
			"PPM^2"
	});

	private int id;
	private String name;
	private String[] units;

	Sensor(int id, String name, String[] units) {
		this.id = id;
		this.name = name;
		this.units = units;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String[] getUnits() {
		return units;
	}
}
