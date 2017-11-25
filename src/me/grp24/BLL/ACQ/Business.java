package me.grp24.BLL.ACQ;

import me.grp24.BLL.Building;
import me.grp24.BLL.Location;

import java.util.Map;

public interface Business {
	Map<String, Building> getBuildings();
	boolean addBuilding(String name, Location location);
	boolean removeBuilding(String name);
	boolean addSensor(String buildingName, String name, SensorType type);
	boolean removeSensor(String buildingName, String name);
}
