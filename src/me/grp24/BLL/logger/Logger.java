package me.grp24.BLL.logger;

import me.grp24.BLL.ACQ.ISensor;
import me.grp24.BLL.Measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Logger {
	private static Logger INSTANCE;

	// Map<buildingName, Map<sensorName, measures>>
	private Map<String, Map<String, List<Measurement>>> log;

	private Logger() {
		log = new HashMap<>();
	}

	public boolean addBuilding(String name) {
		if(!log.containsKey(name)) {
			log.put(name, new HashMap<>());
			return true;
		}

		return false;
	}

	public boolean removeBuilding(String name) {
		if(log.containsKey(name)) {
			log.remove(name);
			return true;
		}

		return false;
	}

	public boolean addSensor(String buildingName, ISensor sensor) {
		if(log.containsKey(buildingName)) {
			if(!log.get(buildingName).containsKey(sensor.getName())) {
				log.get(buildingName).put(sensor.getName(), sensor.getMeasurements());
				return true;
			}
		}

		return false;
	}

	public boolean removeSensor(String buildingName, String sensorName) {
		if(log.containsKey(buildingName)) {
			if(log.get(buildingName).containsKey(sensorName)) {
				log.get(buildingName).remove(sensorName);
				return true;
			}
		}

		return false;
	}

	public static Logger getInstance() {
		if(INSTANCE == null) INSTANCE = new Logger();
		return INSTANCE;
	}
}