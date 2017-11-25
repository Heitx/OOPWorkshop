package me.grp24.BLL.sensor;

import me.grp24.BLL.ACQ.Temperature;

public class TempSensor extends Sensor {
	public TempSensor(String name, Temperature temperature) {
		super(name, temperature.getUnit());
	}
}
