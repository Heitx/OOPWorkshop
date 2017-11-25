package me.grp24.BLL;

import me.grp24.BLL.ACQ.ISensor;
import me.grp24.BLL.logger.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Building {
	private Map<String, ISensor> sensors;
	private String name;
	private Location location;

	public Building(String name, Location location) {
		this.name = name;
		this.location = location;

		sensors = new HashMap<>();
	}

	public Map<String, ISensor> getSensors() {
		return sensors;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public void addSensor(ISensor sensor) {
		sensors.put(sensor.getName(), sensor);
		Logger.getInstance().addSensor(this.name, sensor);
	}

	public void removeSensor(ISensor sensor) {
		sensors.remove(sensor.getName());
	}
}
