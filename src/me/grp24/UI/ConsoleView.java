package me.grp24.UI;

import me.grp24.BLL.ACQ.*;
import me.grp24.BLL.Building;
import me.grp24.BLL.Location;
import me.grp24.BLL.sensor.SelectedSensor;

public class ConsoleView implements GUI {
	private Business business;

	@Override
	public void injectBusiness(Business business) {
		this.business = business;
	}

	@Override
	public void startApplication() {
		business.addBuilding("SDU", new Location("Niels Bohrs Alle", "Denmark"));
		business.addBuilding("SDU 2", new Location("Niels Bohrs Alle", "Denmark"));

		SelectedSensor selSensor = new SelectedSensor(Sensor.CO2.getId(), Sensor.CO2.getUnits()[0]);
		business.addSensor("SDU", "CO2 Sensor 1", selSensor);

		for(Building b : business.getBuildings().values()) {
			System.out.println(b.getName());

			for(ISensor sensor : b.getSensors().values()) {
				System.out.println(sensor.getName());
			}
		}
	}
}
