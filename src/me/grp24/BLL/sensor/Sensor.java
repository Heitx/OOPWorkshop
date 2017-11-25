package me.grp24.BLL.sensor;

import me.grp24.BLL.ACQ.ISensor;
import me.grp24.BLL.Measurement;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Sensor implements ISensor {
	private String name;
	private String unit;
	private List<Measurement> measurements;

	@Override
	public String getName() {
		return name;
	}

	Sensor(String name, String unit) {
		this.name = name;
		this.unit = unit;
		measurements = new ArrayList<>();
	}

	@Override
	public List<Measurement> getMeasurements() {
		return measurements;
	}

	@Override
	public String getUnit() {
		return unit;
	}

	@Override
	public Measurement getMeasure(double value) {
		Measurement m = new Measurement(value, new Date());
		getMeasurements().add(m);
		return m;
	}
}
