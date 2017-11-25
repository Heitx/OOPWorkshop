package me.grp24.BLL;

import me.grp24.BLL.ACQ.ISensor;
import me.grp24.BLL.ACQ.Sensor;
import me.grp24.BLL.ACQ.Business;
import me.grp24.BLL.ACQ.Temperature;
import me.grp24.BLL.logger.Logger;
import me.grp24.BLL.sensor.CO2Sensor;
import me.grp24.BLL.sensor.SelectedSensor;
import me.grp24.BLL.sensor.TempSensor;

import java.util.*;

public class BusinessFacade implements Business {
	Map<String, Building> buildings;

	Logger logger = Logger.getInstance();

	public BusinessFacade() {
		buildings = new HashMap<>();
	}

	@Override
	public Map<String, Building> getBuildings() {
		return buildings;
	}

	@Override
	public boolean addBuilding(String name, Location location) {
		if(!buildings.containsKey(name)) {
			buildings.put(name, new Building(name, location));
			return true;
		}

		return false;
	}

	@Override
	public boolean removeBuilding(String name) {
		if(buildings.containsKey(name)) {
			buildings.remove(name);
			return true;
		}

		return false;
	}

	@Override
	public boolean addSensor(String buildingName, String name, SelectedSensor sensor) {
		if(sensor.getUnit() != null) {
			if(buildings.containsKey(buildingName)) {
				if(!buildings.get(buildingName).getSensors().containsKey(name)) {
					ISensor isensor = null;

					if(sensor.getSensor() == Sensor.TEMPERATUR.getId()) {
						isensor = new TempSensor(name, Temperature.valueOf(sensor.getUnit()));
					} else if(sensor.getSensor() == Sensor.CO2.getId()) {
						isensor = new CO2Sensor(name);
					}

					buildings.get(buildingName).getSensors().put(name, isensor);

					return true;
				}
			}
		}

		return false;
	}

	@Override
	public boolean removeSensor(String buildingName, String name) {
		if(buildings.containsKey(buildingName)) {
			if(buildings.get(buildingName).getSensors().containsKey(name)) {
				buildings.get(buildingName).getSensors().remove(name);

				return true;
			}
		}

		return false;
	}
}
